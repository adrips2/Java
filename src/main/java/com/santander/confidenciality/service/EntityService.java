package com.santander.confidenciality.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.confidenciality.domain.CondifencialityRequest;
import com.santander.confidenciality.domain.InputTransactionXX0H;
import com.santander.confidenciality.domain.OutputTransactionXX0H;
import com.santander.serenity.banksphere.data.partenon.autoconfigure.core.PartenonAction;
import com.santander.serenity.banksphere.data.partenon.autoconfigure.core.PartenonConnectOperations;
import com.santander.serenity.banksphere.data.partenon.autoconfigure.exceptions.PartenonArchitecturalException;

@Service
public class EntityService {

	@Autowired
	PartenonConnectOperations partenonConnectOperations;

	/**
	 * parseInput
	 * 
	 * @param request
	 * @return
	 */
	private InputTransactionXX0H parseInput(CondifencialityRequest request) {
	
		if (request!=null) {
			InputTransactionXX0H input = new InputTransactionXX0H();
			input.getKvcocdca().add(request.getCdcanalp());
			input.getKvcocent().add(request.getCentr());
			input.getKvcocdop().add(request.getCoddocuOp());
			input.getKvcocoop().add(new BigDecimal(request.getCodpersOp()));
			input.getKvcocodt().add(request.getCodtec());
			input.getKvcoempr().add(request.getEmpre());
			input.getKvcofecc().add(request.getFeccons());
			input.getKvcofunc().add(request.getFuncsgs());
			input.getKvcoinop().add(request.getIndnivacOp());
			input.getKvcoindp().add(request.getIndpsbp());
			input.getKvcoopbn().add(request.getOpban());
			input.getKvcoopba().add(request.getOpbas());
			input.getKvcoopci().add(request.getOpcion());
			input.getKvcosubo().add(request.getSubopcion());
			input.getKvcoswsc().add(request.getSwSgscen());
			input.getKvcoswsg().add(request.getSwSgscta());
			input.getKvcoswss().add(request.getSwSgsps());
			input.getKvcotipc().add(request.getTipcto());
			input.getKvcotipn().add(request.getTipintegr());
			input.getKvcotiti().add(request.getTipintTitu());
			input.getKvcotipi().add(request.getTipoint());
			input.getKvcotiop().add(request.getTipopersOp());
			input.getKvcotipo().add(request.getTipoval());
			input.getKvcogesa().add("");
			input.getKvcogest().add("");
			if (request.getContrato()!=null) {
				for(int i=0;i<request.getContrato().size();i++) {
					if (i>0) {
						input.getKvcocdca().add(request.getCdcanalp());
						input.getKvcocent().add(request.getCentr());
						input.getKvcocdop().add(request.getCoddocuOp());
						input.getKvcocoop().add(new BigDecimal(request.getCodpersOp()));
						input.getKvcocodt().add(request.getCodtec());
						input.getKvcoempr().add(request.getEmpre());
						input.getKvcofecc().add(request.getFeccons());
						input.getKvcofunc().add(request.getFuncsgs());
						input.getKvcoinop().add(request.getIndnivacOp());
						input.getKvcoindp().add(request.getIndpsbp());
						input.getKvcoopbn().add(request.getOpban());
						input.getKvcoopba().add(request.getOpbas());
						input.getKvcoopci().add(request.getOpcion());
						input.getKvcosubo().add(request.getSubopcion());
						input.getKvcoswsc().add(request.getSwSgscen());
						input.getKvcoswsg().add(request.getSwSgscta());
						input.getKvcoswss().add(request.getSwSgsps());
						input.getKvcotipc().add(request.getTipcto());
						input.getKvcotipn().add(request.getTipintegr());
						input.getKvcotiti().add(request.getTipintTitu());
						input.getKvcotipi().add(request.getTipoint());
						input.getKvcotiop().add(request.getTipopersOp());
						input.getKvcotipo().add(request.getTipoval());
						input.getKvcogesa().add("");
						input.getKvcogest().add("");
					}
					input.getKvcoatri().add("");
					input.getKvcosubt().add("");
					input.getKvcotpro().add("");
					input.getKvcoint1().add("");
					input.getKvcocot1().add(new BigDecimal(0));
					input.getKvcotit1().add("");
					input.getKvcoidco().add("");
					input.getKvcoidpr().add("");
					input.getKvcoidce().add("");
					input.getKvcoidem().add("");
				}
			} else {
				input.getKvcoatri().add("");
				input.getKvcosubt().add("");
				input.getKvcotpro().add("");
				input.getKvcoint1().add("");
				input.getKvcocdt1().add("");
				input.getKvcocot1().add(new BigDecimal(0));
				input.getKvcotit1().add("");
				input.getKvcoidco().add("");
				input.getKvcoidpr().add("");
				input.getKvcoidce().add("");
				input.getKvcoidem().add("");
			}
			return input;
		}
		return null;
	}
	
	/**
	 * Execution of XX0H Partenon transaction to get the entity name.
	 * 
	 * @param entity
	 *            the data that will be used to build the EntityFilter object to
	 *            send in the body message to Partenon.
	 * 
	 * @return the entity data returned by Partenon.
	 */
	public OutputTransactionXX0H getEntity(CondifencialityRequest request, String tokenJWT) {

		PartenonAction partenonAction = new PartenonAction.PartenonActionBuilder()
				.setTokenJWT(tokenJWT)
				.build();
		try {	
			return partenonConnectOperations.executeTrx(partenonAction, this.parseInput(request), OutputTransactionXX0H.class);
		}catch (PartenonArchitecturalException archExcep) {
			//throw new Ins(archExcep.getAdditionalInfo().get(KeyResponseHeaders.RESOLTEXTCODE));
		}
		return null;
	}
}
