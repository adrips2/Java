package com.santander.confidenciality.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.santander.serenity.banksphere.data.partenon.autoconfigure.config.PartenonBean;
import com.santander.serenity.banksphere.data.partenon.autoconfigure.config.PartenonField;

@PartenonBean(transaction="XX0H", operation="0", version="00001")
public class InputTransactionXX0H {

	//INPUT DATA
	
	//String(3)
	@PartenonField("KVCOATRI")
	public List<String> kvcoatri;
	
	//String(3)
	@PartenonField("KVCOCDCA")
	public List<String> kvcocdca;
	
	//String(12)
	@PartenonField("KVCOCDOP")
	public List<String> kvcocdop;
	
	//String(12)
	@PartenonField("KVCOCDT1")
	public List<String> kvcocdt1;
	
	//String(4)
	@PartenonField("KVCOCENT")
	public List<String> kvcocent;
	
	//String(2)
	@PartenonField("KVCOCODT")
	public List<String> kvcocodt;
	
	//BigDecimal(9, 0)
	@PartenonField("KVCOCOOP")
	public List<BigDecimal> kvcocoop;
	
	//BigDecimal(9, 0)
	@PartenonField("KVCOCOT1")
	public List<BigDecimal> kvcocot1;
	
	//String(4)
	@PartenonField("KVCOEMPR")
	public List<String> kvcoempr;
	
	//String(10)
	@PartenonField("KVCOFECC")
	public List<String> kvcofecc;
	
	//String(8)
	@PartenonField("KVCOFUNC")
	public List<String> kvcofunc;
	
	//String(3)
	@PartenonField("KVCOGESA")
	public List<String> kvcogesa;
	
	//String(1)
	@PartenonField("KVCOGEST")
	public List<String> kvcogest;
	
	//String(4)
	@PartenonField("KVCOIDCE")
	public List<String> kvcoidce;
	
	//String(7)
	@PartenonField("KVCOIDCO")
	public List<String> kvcoidco;
	
	//String(4)
	@PartenonField("KVCOIDEM")
	public List<String> kvcoidem;
	
	//String(3)
	@PartenonField("KVCOIDPR")
	public List<String> kvcoidpr;
	
	//String(1)
	@PartenonField("KVCOINDP")
	public List<String> kvcoindp;
	
	//String(2)
	@PartenonField("KVCOINOP")
	public List<String> kvcoinop;
	
	//String(2)
	@PartenonField("KVCOINT1")
	public List<String> kvcoint1;
	
	//String(3)
	@PartenonField("KVCOOPBA")
	public List<String> kvcoopba;
	
	//String(3)
	@PartenonField("KVCOOPBN")
	public List<String> kvcoopbn;
	
	//String(2)
	@PartenonField("KVCOOPCI")
	public List<String> kvcoopci;
	
	//String(2)
	@PartenonField("KVCOSUBO")
	public List<String> kvcosubo;
	
	//String(3)
	@PartenonField("KVCOSUBT")
	public List<String> kvcosubt;
	
	//String(1)
	@PartenonField("KVCOSWSC")
	public List<String> kvcoswsc;
	
	//String(1)
	@PartenonField("KVCOSWSG")
	public List<String> kvcoswsg;
	
	//String(1)
	@PartenonField("KVCOSWSS")
	public List<String> kvcoswss;
	
	//String(1)
	@PartenonField("KVCOTIOP")
	public List<String> kvcotiop;
	
	//String(1)
	@PartenonField("KVCOTIPC")
	public List<String> kvcotipc;
	
	//String(1)
	@PartenonField("KVCOTIPI")
	public List<String> kvcotipi;
	
	//String(1)
	@PartenonField("KVCOTIPN")
	public List<String> kvcotipn;
	
	//String(2)
	@PartenonField("KVCOTIPO")
	public List<String> kvcotipo;
	
	//String(2)
	@PartenonField("KVCOTITI")
	public List<String> kvcotiti;
	
	//String(1)
	@PartenonField("KVCOTIT1")
	public List<String> kvcotit1;
	
	//String(3)
	@PartenonField("KVCOTPRO")
	public List<String> kvcotpro;

	public InputTransactionXX0H() {
		this.kvcoopci = new ArrayList<>();
		this.kvcosubo = new ArrayList<>();
		this.kvcotipo = new ArrayList<>();
		this.kvcotipc = new ArrayList<>();
		this.kvcoidem = new ArrayList<>();
		this.kvcoidce = new ArrayList<>();
		this.kvcoidpr = new ArrayList<>();
		this.kvcoidco = new ArrayList<>();
		this.kvcofecc = new ArrayList<>();
		this.kvcocdca = new ArrayList<>();
		this.kvcotipi = new ArrayList<>();
		this.kvcotiop = new ArrayList<>();
		this.kvcocoop = new ArrayList<>();
		this.kvcocdop = new ArrayList<>();
		this.kvcoinop = new ArrayList<>();
		this.kvcotit1 = new ArrayList<>();
		this.kvcocot1 = new ArrayList<>();
		this.kvcocdt1 = new ArrayList<>();
		this.kvcoint1 = new ArrayList<>();
		this.kvcoempr = new ArrayList<>();
		this.kvcocent = new ArrayList<>();
		this.kvcocodt = new ArrayList<>();
		this.kvcotpro = new ArrayList<>();
		this.kvcosubt = new ArrayList<>();
		this.kvcoatri = new ArrayList<>();
		this.kvcofunc = new ArrayList<>();
		this.kvcoopba = new ArrayList<>();
		this.kvcoopbn = new ArrayList<>();
		this.kvcoswsg = new ArrayList<>();
		this.kvcoswss = new ArrayList<>();
		this.kvcoswsc = new ArrayList<>();
		this.kvcotiti = new ArrayList<>();
		this.kvcoindp = new ArrayList<>();
		this.kvcotipn = new ArrayList<>();
		this.kvcogest = new ArrayList<>();
		this.kvcogesa = new ArrayList<>();
	} 
	
	public List<String> getKvcoatri() {
		return kvcoatri;
	}

	public void setKvcoatri(List<String> kvcoatri) {
		this.kvcoatri = kvcoatri;
	}

	public List<String> getKvcocdca() {
		return kvcocdca;
	}

	public void setKvcocdca(List<String> kvcocdca) {
		this.kvcocdca = kvcocdca;
	}

	public List<String> getKvcocdop() {
		return kvcocdop;
	}

	public void setKvcocdop(List<String> kvcocdop) {
		this.kvcocdop = kvcocdop;
	}

	public List<String> getKvcocdt1() {
		return kvcocdt1;
	}

	public void setKvcocdt1(List<String> kvcocdt1) {
		this.kvcocdt1 = kvcocdt1;
	}

	public List<String> getKvcocent() {
		return kvcocent;
	}

	public void setKvcocent(List<String> kvcocent) {
		this.kvcocent = kvcocent;
	}

	public List<String> getKvcocodt() {
		return kvcocodt;
	}

	public void setKvcocodt(List<String> kvcocodt) {
		this.kvcocodt = kvcocodt;
	}

	public List<BigDecimal> getKvcocoop() {
		return kvcocoop;
	}

	public void setKvcocoop(List<BigDecimal> kvcocoop) {
		this.kvcocoop = kvcocoop;
	}

	public List<BigDecimal> getKvcocot1() {
		return kvcocot1;
	}

	public void setKvcocot1(List<BigDecimal> kvcocot1) {
		this.kvcocot1 = kvcocot1;
	}

	public List<String> getKvcoempr() {
		return kvcoempr;
	}

	public void setKvcoempr(List<String> kvcoempr) {
		this.kvcoempr = kvcoempr;
	}

	public List<String> getKvcofecc() {
		return kvcofecc;
	}

	public void setKvcofecc(List<String> kvcofecc) {
		this.kvcofecc = kvcofecc;
	}

	public List<String> getKvcofunc() {
		return kvcofunc;
	}

	public void setKvcofunc(List<String> kvcofunc) {
		this.kvcofunc = kvcofunc;
	}

	public List<String> getKvcogesa() {
		return kvcogesa;
	}

	public void setKvcogesa(List<String> kvcogesa) {
		this.kvcogesa = kvcogesa;
	}

	public List<String> getKvcogest() {
		return kvcogest;
	}

	public void setKvcogest(List<String> kvcogest) {
		this.kvcogest = kvcogest;
	}

	public List<String> getKvcoidce() {
		return kvcoidce;
	}

	public void setKvcoidce(List<String> kvcoidce) {
		this.kvcoidce = kvcoidce;
	}

	public List<String> getKvcoidco() {
		return kvcoidco;
	}

	public void setKvcoidco(List<String> kvcoidco) {
		this.kvcoidco = kvcoidco;
	}

	public List<String> getKvcoidem() {
		return kvcoidem;
	}

	public void setKvcoidem(List<String> kvcoidem) {
		this.kvcoidem = kvcoidem;
	}

	public List<String> getKvcoidpr() {
		return kvcoidpr;
	}

	public void setKvcoidpr(List<String> kvcoidpr) {
		this.kvcoidpr = kvcoidpr;
	}

	public List<String> getKvcoindp() {
		return kvcoindp;
	}

	public void setKvcoindp(List<String> kvcoindp) {
		this.kvcoindp = kvcoindp;
	}

	public List<String> getKvcoinop() {
		return kvcoinop;
	}

	public void setKvcoinop(List<String> kvcoinop) {
		this.kvcoinop = kvcoinop;
	}

	public List<String> getKvcoint1() {
		return kvcoint1;
	}

	public void setKvcoint1(List<String> kvcoint1) {
		this.kvcoint1 = kvcoint1;
	}

	public List<String> getKvcoopba() {
		return kvcoopba;
	}

	public void setKvcoopba(List<String> kvcoopba) {
		this.kvcoopba = kvcoopba;
	}

	public List<String> getKvcoopbn() {
		return kvcoopbn;
	}

	public void setKvcoopbn(List<String> kvcoopbn) {
		this.kvcoopbn = kvcoopbn;
	}

	public List<String> getKvcoopci() {
		return kvcoopci;
	}

	public void setKvcoopci(List<String> kvcoopci) {
		this.kvcoopci = kvcoopci;
	}

	public List<String> getKvcosubo() {
		return kvcosubo;
	}

	public void setKvcosubo(List<String> kvcosubo) {
		this.kvcosubo = kvcosubo;
	}

	public List<String> getKvcosubt() {
		return kvcosubt;
	}

	public void setKvcosubt(List<String> kvcosubt) {
		this.kvcosubt = kvcosubt;
	}

	public List<String> getKvcoswsc() {
		return kvcoswsc;
	}

	public void setKvcoswsc(List<String> kvcoswsc) {
		this.kvcoswsc = kvcoswsc;
	}

	public List<String> getKvcoswsg() {
		return kvcoswsg;
	}

	public void setKvcoswsg(List<String> kvcoswsg) {
		this.kvcoswsg = kvcoswsg;
	}

	public List<String> getKvcoswss() {
		return kvcoswss;
	}

	public void setKvcoswss(List<String> kvcoswss) {
		this.kvcoswss = kvcoswss;
	}

	public List<String> getKvcotiop() {
		return kvcotiop;
	}

	public void setKvcotiop(List<String> kvcotiop) {
		this.kvcotiop = kvcotiop;
	}

	public List<String> getKvcotipc() {
		return kvcotipc;
	}

	public void setKvcotipc(List<String> kvcotipc) {
		this.kvcotipc = kvcotipc;
	}

	public List<String> getKvcotipi() {
		return kvcotipi;
	}

	public void setKvcotipi(List<String> kvcotipi) {
		this.kvcotipi = kvcotipi;
	}

	public List<String> getKvcotipn() {
		return kvcotipn;
	}

	public void setKvcotipn(List<String> kvcotipn) {
		this.kvcotipn = kvcotipn;
	}

	public List<String> getKvcotipo() {
		return kvcotipo;
	}

	public void setKvcotipo(List<String> kvcotipo) {
		this.kvcotipo = kvcotipo;
	}

	public List<String> getKvcotiti() {
		return kvcotiti;
	}

	public void setKvcotiti(List<String> kvcotiti) {
		this.kvcotiti = kvcotiti;
	}

	public List<String> getKvcotit1() {
		return kvcotit1;
	}

	public void setKvcotit1(List<String> kvcotit1) {
		this.kvcotit1 = kvcotit1;
	}

	public List<String> getKvcotpro() {
		return kvcotpro;
	}

	public void setKvcotpro(List<String> kvcotpro) {
		this.kvcotpro = kvcotpro;
	}
}