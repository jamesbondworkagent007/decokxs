package com.okinc.business.defi.wallet;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.amplifyframework.ui.liveness.state.FreshnessState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.mlkit.common.MlKitException;
import com.ibm.icu.text.DateFormat;
import com.just.agentweb.DefaultChromeClient;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C13754dXa;
import o.C16235egB;
import o.C16236egC;
import o.C16241egH;
import o.C16242egI;
import o.C16244egK;
import o.C16248egO;
import o.C16249egP;
import o.C16252egS;
import o.C16255egV;
import o.C16284egy;
import o.C16287ehA;
import o.C16289ehC;
import o.C16291ehE;
import o.C16294ehH;
import o.C16299ehM;
import o.C16300ehN;
import o.C16303ehQ;
import o.C16304ehR;
import o.C16306ehT;
import o.C16307ehU;
import o.C16310ehX;
import o.C16312ehZ;
import o.C16315ehc;
import o.C16316ehd;
import o.C16319ehg;
import o.C16322ehj;
import o.C16323ehk;
import o.C16326ehn;
import o.C16329ehq;
import o.C16332eht;
import o.C16334ehv;
import o.C16336ehx;
import o.C16337ehy;
import o.C16343eiD;
import o.C16346eiG;
import o.C16347eiH;
import o.C16349eiJ;
import o.C16350eiK;
import o.C16353eiN;
import o.C16356eiQ;
import o.C16358eiS;
import o.C16359eiT;
import o.C16360eiU;
import o.C16364eiY;
import o.C16368eic;
import o.C16371eif;
import o.C16372eig;
import o.C16374eii;
import o.C16376eik;
import o.C16379ein;
import o.C16382eiq;
import o.C16385eit;
import o.C16386eiu;
import o.C16387eiv;
import o.C16389eix;
import o.C16393ejA;
import o.C16394ejB;
import o.C16399ejG;
import o.C16401ejI;
import o.C16402ejJ;
import o.C16406ejN;
import o.C16407ejO;
import o.C16412ejT;
import o.C16414ejV;
import o.C16416ejX;
import o.C16418ejZ;
import o.C16419eja;
import o.C16420ejb;
import o.C16422ejd;
import o.C16425ejg;
import o.C16426ejh;
import o.C16429ejk;
import o.C16431ejm;
import o.C16439eju;
import o.C16440ejv;
import o.C16441ejw;
import o.C16447ekB;
import o.C16448ekC;
import o.C16450ekE;
import o.C16452ekG;
import o.C16455ekJ;
import o.C16456ekK;
import o.C16457ekL;
import o.C16459ekN;
import o.C16463ekR;
import o.C16464ekS;
import o.C16465ekT;
import o.C16467ekV;
import o.C16469ekX;
import o.C16470ekY;
import o.C16476eke;
import o.C16477ekf;
import o.C16481ekj;
import o.C16492eku;
import o.C16493ekv;
import o.C16499elA;
import o.C16503elE;
import o.C16504elF;
import o.C16505elG;
import o.C16510elL;
import o.C16512elN;
import o.C16514elP;
import o.C16515elQ;
import o.C16520elV;
import o.C16523elY;
import o.C16527elc;
import o.C16531elg;
import o.C16532elh;
import o.C16537elm;
import o.C16540elp;
import o.C16543els;
import o.C16548elx;
import o.C16553emB;
import o.C16559emH;
import o.C16560emI;
import o.C16562emK;
import o.C16564emM;
import o.C16566emO;
import o.C16567emP;
import o.C16571emT;
import o.C16574emW;
import o.C16576emY;
import o.C16578ema;
import o.C16582eme;
import o.C16583emf;
import o.C16585emh;
import o.C16589eml;
import o.C16594emq;
import o.C16598emu;
import o.C16603emz;
import o.C16606enB;
import o.C16608enD;
import o.C16610enF;
import o.C16615enK;
import o.C16617enM;
import o.C16619enO;
import o.C16622enR;
import o.C16627enW;
import o.C16628enX;
import o.C16632enb;
import o.C16634end;
import o.C16635ene;
import o.C16637eng;
import o.C16642enl;
import o.C16643enm;
import o.C16645eno;
import o.C16648enr;
import o.C16650ent;
import o.C16656enz;
import o.C16660eoC;
import o.C16661eoD;
import o.C16662eoE;
import o.C16663eoF;
import o.C16665eoH;
import o.C16668eoK;
import o.C16670eoM;
import o.C16672eoO;
import o.C16673eoP;
import o.C16676eoS;
import o.C16678eoU;
import o.C16679eoV;
import o.C16680eoW;
import o.C16695eol;
import o.C16697eon;
import o.C16701eor;
import o.C16703eot;
import o.C16705eov;
import o.C16707eox;
import o.C16716epF;
import o.C16720epJ;
import o.C16721epK;
import o.C16722epL;
import o.C16726epP;
import o.C16727epQ;
import o.C16729epS;
import o.C16738epb;
import o.C16743epg;
import o.C16744eph;
import o.C16747epk;
import o.C16750epn;
import o.C16752epp;
import o.C16755eps;
import o.C16756ept;
import o.C16758epv;
import o.C16764eqA;
import o.C16767eqD;
import o.C16769eqF;
import o.C16770eqG;
import o.C16773eqJ;
import o.C16776eqM;
import o.C16778eqO;
import o.C16781eqR;
import o.C16782eqS;
import o.C16786eqW;
import o.C16787eqX;
import o.C16796eqg;
import o.C16800eqk;
import o.C16803eqn;
import o.C16805eqp;
import o.C16811eqv;
import o.C16815eqz;
import o.C16817erA;
import o.C16819erC;
import o.C16820erD;
import o.C16824erH;
import o.C16829erM;
import o.C16830erN;
import o.C16832erP;
import o.C16833erQ;
import o.C16837erU;
import o.C16842erZ;
import o.C16846erd;
import o.C16847ere;
import o.C16850erh;
import o.C16851eri;
import o.C16852erj;
import o.C16853erk;
import o.C16856ern;
import o.C16859erq;
import o.C16860err;
import o.C16862ert;
import o.C16863eru;
import o.C16866erx;
import o.C16878esI;
import o.C16880esK;
import o.C16882esM;
import o.C16886esQ;
import o.C16887esR;
import o.C16888esS;
import o.C16889esT;
import o.C16895esZ;
import o.C16897esb;
import o.C16898esc;
import o.C16901esf;
import o.C16903esh;
import o.C16906esk;
import o.C16907esl;
import o.C16913esr;
import o.C16919esx;
import o.C16923etA;
import o.C16926etD;
import o.C16928etF;
import o.C16932etJ;
import o.C16933etK;
import o.C16935etM;
import o.C16937etO;
import o.C16938etP;
import o.C16940etR;
import o.C16943etU;
import o.C16946etX;
import o.C16947etY;
import o.C16950etb;
import o.C16953ete;
import o.C16956eth;
import o.C16957eti;
import o.C16959etk;
import o.C16961etm;
import o.C16963eto;
import o.C16967ets;
import o.C16968ett;
import o.C16969etu;
import o.C16970etv;
import o.C16979euD;
import o.C16981euF;
import o.C16983euH;
import o.C16984euI;
import o.C16985euJ;
import o.C16989euN;
import o.C16990euO;
import o.C16995euT;
import o.C16999euX;
import o.C17004euc;
import o.C17005eud;
import o.C17007euf;
import o.C17009euh;
import o.C17011euj;
import o.C17014eum;
import o.C17016euo;
import o.C17020eus;
import o.C17021eut;
import o.C17022euu;
import o.C17033evE;
import o.C17035evG;
import o.C17037evI;
import o.C17041evM;
import o.C17042evN;
import o.C17046evR;
import o.C17049evU;
import o.C17051evW;
import o.C17053evY;
import o.C17056evb;
import o.C17060evf;
import o.C17061evg;
import o.C17062evh;
import o.C17063evi;
import o.C17066evl;
import o.C17069evo;
import o.C17072evr;
import o.C17073evs;
import o.C17074evt;
import o.C17077evw;
import o.C17080evz;
import o.C17083ewB;
import o.C17085ewD;
import o.C17087ewF;
import o.C17091ewJ;
import o.C17096ewO;
import o.C17097ewP;
import o.C17100ewS;
import o.C17101ewT;
import o.C17104ewW;
import o.C17107ewZ;
import o.C17112ewe;
import o.C17113ewf;
import o.C17126ews;
import o.C17128ewu;
import o.C17129ewv;
import o.C17131ewx;
import o.C17163exc;
import o.C17166exf;
import o.C17181exu;
import o.C17186exz;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(322);
        copydefault = sparseIntArray;
        sparseIntArray.put(C13754dXa.TaskDescription.copydefault, 1);
        sparseIntArray.put(C13754dXa.TaskDescription.OLrzqt, 2);
        sparseIntArray.put(C13754dXa.TaskDescription.EZpvd, 3);
        sparseIntArray.put(C13754dXa.TaskDescription.KWHzl, 4);
        sparseIntArray.put(C13754dXa.TaskDescription.gEmmrt, 5);
        sparseIntArray.put(C13754dXa.TaskDescription.AYXKKw, 6);
        sparseIntArray.put(C13754dXa.TaskDescription.AhwBna, 7);
        sparseIntArray.put(C13754dXa.TaskDescription.valueOf, 8);
        sparseIntArray.put(C13754dXa.TaskDescription.values, 9);
        sparseIntArray.put(C13754dXa.TaskDescription.fARcdN, 10);
        sparseIntArray.put(C13754dXa.TaskDescription.uzCIH, 11);
        sparseIntArray.put(C13754dXa.TaskDescription.iwGUEr, 12);
        sparseIntArray.put(C13754dXa.TaskDescription.hDKMBd, 13);
        sparseIntArray.put(C13754dXa.TaskDescription.getFieldNames, 14);
        sparseIntArray.put(C13754dXa.TaskDescription.zLjUOn, 15);
        sparseIntArray.put(C13754dXa.TaskDescription.AubY, 16);
        sparseIntArray.put(C13754dXa.TaskDescription.zsXlph, 17);
        sparseIntArray.put(C13754dXa.TaskDescription.wlaJM, 18);
        sparseIntArray.put(C13754dXa.TaskDescription.zuBGHE, 19);
        sparseIntArray.put(C13754dXa.TaskDescription.gHZMYf, 20);
        sparseIntArray.put(C13754dXa.TaskDescription.AxsJAY, 21);
        sparseIntArray.put(C13754dXa.TaskDescription.sSMYrx, 22);
        sparseIntArray.put(C13754dXa.TaskDescription.AwvSrB, 23);
        sparseIntArray.put(C13754dXa.TaskDescription.QKVWgx, 24);
        sparseIntArray.put(C13754dXa.TaskDescription.QOLQEE, 25);
        sparseIntArray.put(C13754dXa.TaskDescription.DTwDnp, 26);
        sparseIntArray.put(C13754dXa.TaskDescription.QfsBiF, 27);
        sparseIntArray.put(C13754dXa.TaskDescription.QbewEr, 28);
        sparseIntArray.put(C13754dXa.TaskDescription.RJOkX, 29);
        sparseIntArray.put(C13754dXa.TaskDescription.QVAiDq, 30);
        sparseIntArray.put(C13754dXa.TaskDescription.RcXXUw, 31);
        sparseIntArray.put(C13754dXa.TaskDescription.djSkpj, 32);
        sparseIntArray.put(C13754dXa.TaskDescription.dNCPSb, 33);
        sparseIntArray.put(C13754dXa.TaskDescription.aKErDB, 34);
        sparseIntArray.put(C13754dXa.TaskDescription.dxcTrN, 35);
        sparseIntArray.put(C13754dXa.TaskDescription.fZBcTu, 36);
        sparseIntArray.put(C13754dXa.TaskDescription.dvKsVJ, 37);
        sparseIntArray.put(C13754dXa.TaskDescription.flVtFt, 38);
        sparseIntArray.put(C13754dXa.TaskDescription.gasjUx, 39);
        sparseIntArray.put(C13754dXa.TaskDescription.giSNqX, 40);
        sparseIntArray.put(C13754dXa.TaskDescription.hUfVAv, 41);
        sparseIntArray.put(C13754dXa.TaskDescription.gkJEwt, 42);
        sparseIntArray.put(C13754dXa.TaskDescription.iRxXKY, 43);
        sparseIntArray.put(C13754dXa.TaskDescription.RlQdEF, 44);
        sparseIntArray.put(C13754dXa.TaskDescription.AxsJAYsNCnLh, 45);
        sparseIntArray.put(C13754dXa.TaskDescription.QKudOq, 46);
        sparseIntArray.put(C13754dXa.TaskDescription.accept, 47);
        sparseIntArray.put(C13754dXa.TaskDescription.DarRvM, 48);
        sparseIntArray.put(C13754dXa.TaskDescription.ODWQjV, 49);
        sparseIntArray.put(C13754dXa.TaskDescription.DCJXGO, 50);
        sparseIntArray.put(C13754dXa.TaskDescription.DXXBbs, 51);
        sparseIntArray.put(C13754dXa.TaskDescription.ffGIBT, 52);
        sparseIntArray.put(C13754dXa.TaskDescription.DCUTEI, 53);
        sparseIntArray.put(C13754dXa.TaskDescription.getPostValueLengthLimit, 54);
        sparseIntArray.put(C13754dXa.TaskDescription.OuxcSI, 55);
        sparseIntArray.put(C13754dXa.TaskDescription.zuWLRA, 56);
        sparseIntArray.put(C13754dXa.TaskDescription.QkdxfA, 57);
        sparseIntArray.put(C13754dXa.TaskDescription.RKDWNf, 58);
        sparseIntArray.put(C13754dXa.TaskDescription.OBJEWx, 59);
        sparseIntArray.put(C13754dXa.TaskDescription.dmfpNf, 60);
        sparseIntArray.put(C13754dXa.TaskDescription.gwTjWJ, 61);
        sparseIntArray.put(C13754dXa.TaskDescription.ODXsMY, 62);
        sparseIntArray.put(C13754dXa.TaskDescription.OFhtUX, 63);
        sparseIntArray.put(C13754dXa.TaskDescription.QVsKAR, 64);
        sparseIntArray.put(C13754dXa.TaskDescription.OJuSTm, 65);
        sparseIntArray.put(C13754dXa.TaskDescription.QwvEab, 66);
        sparseIntArray.put(C13754dXa.TaskDescription.dUDNAs, 67);
        sparseIntArray.put(C13754dXa.TaskDescription.aUsmxb, 68);
        sparseIntArray.put(C13754dXa.TaskDescription.USBtdM, 69);
        sparseIntArray.put(C13754dXa.TaskDescription.UlJrfe, 70);
        sparseIntArray.put(C13754dXa.TaskDescription.fdOvFl, 71);
        sparseIntArray.put(C13754dXa.TaskDescription.igXuih, 72);
        sparseIntArray.put(C13754dXa.TaskDescription.fjfviF, 73);
        sparseIntArray.put(C13754dXa.TaskDescription.spnCvw, 74);
        sparseIntArray.put(C13754dXa.TaskDescription.call, 75);
        sparseIntArray.put(C13754dXa.TaskDescription.DCUTEIddSDPG, 76);
        sparseIntArray.put(C13754dXa.TaskDescription.KDccX, 77);
        sparseIntArray.put(C13754dXa.TaskDescription.DcqEDu, 78);
        sparseIntArray.put(C13754dXa.TaskDescription.DWgRXt, 79);
        sparseIntArray.put(C13754dXa.TaskDescription.DaRZkR, 80);
        sparseIntArray.put(C13754dXa.TaskDescription.DNMMPQ, 81);
        sparseIntArray.put(C13754dXa.TaskDescription.OTwTPd, 82);
        sparseIntArray.put(C13754dXa.TaskDescription.QXDzTk, 83);
        sparseIntArray.put(C13754dXa.TaskDescription.QDqgQU, 84);
        sparseIntArray.put(C13754dXa.TaskDescription.RVsVBY, 85);
        sparseIntArray.put(C13754dXa.TaskDescription.RXzakW, 86);
        sparseIntArray.put(C13754dXa.TaskDescription.Ufzxmz, 87);
        sparseIntArray.put(C13754dXa.TaskDescription.ULRxlR, 88);
        sparseIntArray.put(C13754dXa.TaskDescription.TarCU, 89);
        sparseIntArray.put(C13754dXa.TaskDescription.UhxbNG, 90);
        sparseIntArray.put(C13754dXa.TaskDescription.aHXSQp, 91);
        sparseIntArray.put(C13754dXa.TaskDescription.alsFma, 92);
        sparseIntArray.put(C13754dXa.TaskDescription.UscePu, 93);
        sparseIntArray.put(C13754dXa.TaskDescription.aJFbMH, 94);
        sparseIntArray.put(C13754dXa.TaskDescription.akftKQ, 95);
        sparseIntArray.put(C13754dXa.TaskDescription.fXHmeK, 96);
        sparseIntArray.put(C13754dXa.TaskDescription.apNbdB, 97);
        sparseIntArray.put(C13754dXa.TaskDescription.gSBher, 98);
        sparseIntArray.put(C13754dXa.TaskDescription.hlkKmr, 99);
        sparseIntArray.put(C13754dXa.TaskDescription.hvKCwS, 100);
        sparseIntArray.put(C13754dXa.TaskDescription.sVXHln, 101);
        sparseIntArray.put(C13754dXa.TaskDescription.zKcAg, 102);
        sparseIntArray.put(C13754dXa.TaskDescription.tIwhY, 103);
        sparseIntArray.put(C13754dXa.TaskDescription.zOIQXb, 104);
        sparseIntArray.put(C13754dXa.TaskDescription.zhUgOk, 105);
        sparseIntArray.put(C13754dXa.TaskDescription.getPriority, 106);
        sparseIntArray.put(C13754dXa.TaskDescription.DGUQLIOvDItG, 107);
        sparseIntArray.put(C13754dXa.TaskDescription.DGUQLIDGUQLI, 108);
        sparseIntArray.put(C13754dXa.TaskDescription.getLabel, 109);
        sparseIntArray.put(C13754dXa.TaskDescription.fBE, WalletImportError.ERROR_CODE_AA_CREATE_KEY);
        sparseIntArray.put(C13754dXa.TaskDescription.DIIpTV, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY);
        sparseIntArray.put(C13754dXa.TaskDescription.DUUtXg, WalletImportError.ERROR_CODE_AA_EXIST);
        sparseIntArray.put(C13754dXa.TaskDescription.DSiOMJ, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST);
        sparseIntArray.put(C13754dXa.TaskDescription.DGUQLIhJrIAr, 114);
        sparseIntArray.put(C13754dXa.TaskDescription.awiJhF, 115);
        sparseIntArray.put(C13754dXa.TaskDescription.dzCpvv, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
        sparseIntArray.put(C13754dXa.TaskDescription.YqksP, 117);
        sparseIntArray.put(C13754dXa.TaskDescription.DKtBnz, 118);
        sparseIntArray.put(C13754dXa.TaskDescription.fGQ, 119);
        sparseIntArray.put(C13754dXa.TaskDescription.DLGVGj, 120);
        sparseIntArray.put(C13754dXa.TaskDescription.DrNnAm, 121);
        sparseIntArray.put(C13754dXa.TaskDescription.DPHsZd, 122);
        sparseIntArray.put(C13754dXa.TaskDescription.DPHNDa, 123);
        sparseIntArray.put(C13754dXa.TaskDescription.geLlBI, 124);
        sparseIntArray.put(C13754dXa.TaskDescription.Swccd, 125);
        sparseIntArray.put(C13754dXa.TaskDescription.reset, WebSocketProtocol.PAYLOAD_SHORT);
        sparseIntArray.put(C13754dXa.TaskDescription.zLAIeZ, 127);
        sparseIntArray.put(C13754dXa.TaskDescription.DQzvGN, 128);
        sparseIntArray.put(C13754dXa.TaskDescription.gdmIOq, 129);
        sparseIntArray.put(C13754dXa.TaskDescription.DQzvGNdrmXxu, 130);
        sparseIntArray.put(C13754dXa.TaskDescription.isReflectionWorking, DateFormat.RELATIVE_SHORT);
        sparseIntArray.put(C13754dXa.TaskDescription.fXYAwm, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.DQzvGNdrmXxudrmXxu, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJK, 134);
        sparseIntArray.put(C13754dXa.TaskDescription.DTeKQX, 135);
        sparseIntArray.put(C13754dXa.TaskDescription.RIuxYh, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.RbVjfb, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.RZNAhV, 138);
        sparseIntArray.put(C13754dXa.TaskDescription.RqmePg, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.ggKfIT, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.invokespecialROgMPW, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.invokespecialDaTmkG, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.iqMDAV, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.invokespecialDPHOMC, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.invokespecialRtjmuc, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.invokespecialaKhcqp, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.invokespecialhlXVux, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.invokespecialsiEkQe, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.DaTmkG, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.atDTRm, 150);
        sparseIntArray.put(C13754dXa.TaskDescription.dIjzlO, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.deregisterUser, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.hlXVux, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.init, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.hOMIpD, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C13754dXa.TaskDescription.processStrongAuthMessage, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.profile, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.scanPackages, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJKDCKfqP, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJKDCKfqPDCfLja, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.fmB, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.DMb, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.onComplete, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJKDDUqPf, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.sbu, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJKDGTeJD, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.sendBehavioSecData, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.cancel, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJKOmnske, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJKDcMfJK, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.sCB, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.jh, 172);
        sparseIntArray.put(C13754dXa.TaskDescription.getStatusCode, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.fcfzuX, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJKdMCrTj, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.fbC, CipherSuite.TLS_PSK_WITH_NULL_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.DcMfJKfNUfqk, CipherSuite.TLS_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.getAdvertisingId, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.DlABUU, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.abAflu, 180);
        sparseIntArray.put(C13754dXa.TaskDescription.DxnCrt, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.DwQSDd, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.DzkRMH, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.fiXcQa, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.gGNlxh, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(C13754dXa.TaskDescription.hNurIN, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.DFbvW, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.FQMcgE, 188);
        sparseIntArray.put(C13754dXa.TaskDescription.dPkBzA, 189);
        sparseIntArray.put(C13754dXa.TaskDescription.gqOnQv, 190);
        sparseIntArray.put(C13754dXa.TaskDescription.FQMcgEfQMcgE, 191);
        sparseIntArray.put(C13754dXa.TaskDescription.zEHIKV, 192);
        sparseIntArray.put(C13754dXa.TaskDescription.zDGrpR, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.clearRegistrations, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.sIqKDg, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.FQNKFG, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.v, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C13754dXa.TaskDescription.DuXjdv, 198);
        sparseIntArray.put(C13754dXa.TaskDescription.NRYds, 199);
        sparseIntArray.put(C13754dXa.TaskDescription.UJEglR, 200);
        sparseIntArray.put(C13754dXa.TaskDescription.fMBJsc, 201);
        sparseIntArray.put(C13754dXa.TaskDescription.hbZCHz, 202);
        sparseIntArray.put(C13754dXa.TaskDescription.gbIfDn, 203);
        sparseIntArray.put(C13754dXa.TaskDescription.FhERFw, 204);
        sparseIntArray.put(C13754dXa.TaskDescription.Dfm, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
        sparseIntArray.put(C13754dXa.TaskDescription.sYcwUD, 206);
        sparseIntArray.put(C13754dXa.TaskDescription.GCXiNH, 207);
        sparseIntArray.put(C13754dXa.TaskDescription.DRGLNw, 208);
        sparseIntArray.put(C13754dXa.TaskDescription.fsw, 209);
        sparseIntArray.put(C13754dXa.TaskDescription.Dfv, 210);
        sparseIntArray.put(C13754dXa.TaskDescription.ORWKdN, 211);
        sparseIntArray.put(C13754dXa.TaskDescription.fTEjYi, com.flyco.tablayout.BuildConfig.VERSION_CODE);
        sparseIntArray.put(C13754dXa.TaskDescription.GGlJim, 213);
        sparseIntArray.put(C13754dXa.TaskDescription.dbUqJD, me.relex.circleindicator.BuildConfig.VERSION_CODE);
        sparseIntArray.put(C13754dXa.TaskDescription.GLcwwN, 215);
        sparseIntArray.put(C13754dXa.TaskDescription.aQtmcU, 216);
        sparseIntArray.put(C13754dXa.TaskDescription.QnnRaN, 217);
        sparseIntArray.put(C13754dXa.TaskDescription.OrsvgJ, 218);
        sparseIntArray.put(C13754dXa.TaskDescription.QiTXOm, 219);
        sparseIntArray.put(C13754dXa.TaskDescription.RFmUsE, 220);
        sparseIntArray.put(C13754dXa.TaskDescription.RLmrWm, 221);
        sparseIntArray.put(C13754dXa.TaskDescription.sRzUNh, 222);
        sparseIntArray.put(C13754dXa.TaskDescription.getValue, 223);
        sparseIntArray.put(C13754dXa.TaskDescription.zXhzOT, 224);
        sparseIntArray.put(C13754dXa.TaskDescription.GcnicV, 225);
        sparseIntArray.put(C13754dXa.TaskDescription.GQzpsZgQzpsZ, 226);
        sparseIntArray.put(C13754dXa.TaskDescription.fQQVvf, 227);
        sparseIntArray.put(C13754dXa.TaskDescription.RckOJh, 228);
        sparseIntArray.put(C13754dXa.TaskDescription.DXd, FreshnessState.FIRST_SCENE_ALPHA);
        sparseIntArray.put(C13754dXa.TaskDescription.hKJZrr, 230);
        sparseIntArray.put(C13754dXa.TaskDescription.resume, 231);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPHhYHK, 232);
        sparseIntArray.put(C13754dXa.TaskDescription.hcetpZ, 233);
        sparseIntArray.put(C13754dXa.TaskDescription.iLWfRf, 234);
        sparseIntArray.put(C13754dXa.TaskDescription.OxbLUn, 235);
        sparseIntArray.put(C13754dXa.TaskDescription.DeEinT, 236);
        sparseIntArray.put(C13754dXa.TaskDescription.dSJNDS, 237);
        sparseIntArray.put(C13754dXa.TaskDescription.Qsauvs, 238);
        sparseIntArray.put(C13754dXa.TaskDescription.hwkNQP, 239);
        sparseIntArray.put(C13754dXa.TaskDescription.putInt, PsExtractor.VIDEO_STREAM_MASK);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPOZOJIj, 241);
        sparseIntArray.put(C13754dXa.TaskDescription.fDu, 242);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPOKBmQNaCIdOM, 243);
        sparseIntArray.put(C13754dXa.TaskDescription.DjwCMv, 244);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPOKBmQN, 245);
        sparseIntArray.put(C13754dXa.TaskDescription.QsIRgs, 246);
        sparseIntArray.put(C13754dXa.TaskDescription.QfZsXX, 247);
        sparseIntArray.put(C13754dXa.TaskDescription.QOjuYg, 248);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPQPAeHI, 249);
        sparseIntArray.put(C13754dXa.TaskDescription.iLAtSv, 250);
        sparseIntArray.put(C13754dXa.TaskDescription.ONJgbh, 251);
        sparseIntArray.put(C13754dXa.TaskDescription.itxZVF, 252);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPQdUnVm, 253);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPRAkuRW, 254);
        sparseIntArray.put(C13754dXa.TaskDescription.gCNefq, 255);
        sparseIntArray.put(C13754dXa.TaskDescription.RWIpjU, 256);
        sparseIntArray.put(C13754dXa.TaskDescription.RSmiaq, 257);
        sparseIntArray.put(C13754dXa.TaskDescription.ORmwhf, 258);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPRGtXKC, 259);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPURsaBn, 260);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPRGtXKCRGtXKC, 261);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPRGtXKCDKRTZD, 262);
        sparseIntArray.put(C13754dXa.TaskDescription.getSerial, 263);
        sparseIntArray.put(C13754dXa.TaskDescription.BVXAa, 264);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPUUMfbK, 265);
        sparseIntArray.put(C13754dXa.TaskDescription.ikIEnW, 266);
        sparseIntArray.put(C13754dXa.TaskDescription.QSAYLr, 267);
        sparseIntArray.put(C13754dXa.TaskDescription.dNxZaP, 268);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPdNQGVJ, 269);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPdIKEqB, SubsamplingScaleImageView.ORIENTATION_270);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPfvRMlC, 271);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPfrwjPh, 272);
        sparseIntArray.put(C13754dXa.TaskDescription.gLWkOL, 273);
        sparseIntArray.put(C13754dXa.TaskDescription.dpErvT, 274);
        sparseIntArray.put(C13754dXa.TaskDescription.iOIMNp, 275);
        sparseIntArray.put(C13754dXa.TaskDescription.sanrWj, 276);
        sparseIntArray.put(C13754dXa.TaskDescription.xxhdY, 277);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPhFGucI, 278);
        sparseIntArray.put(C13754dXa.TaskDescription.izFvvl, 279);
        sparseIntArray.put(C13754dXa.TaskDescription.HJWChPzRXNTw, 280);
        sparseIntArray.put(C13754dXa.TaskDescription.DGgkXd, 281);
        sparseIntArray.put(C13754dXa.TaskDescription.fzHEvu, 282);
        sparseIntArray.put(C13754dXa.TaskDescription.sEAkxl, 283);
        sparseIntArray.put(C13754dXa.TaskDescription.nriSR, 284);
        sparseIntArray.put(C13754dXa.TaskDescription.HrFqwD, 285);
        sparseIntArray.put(C13754dXa.TaskDescription.onLocationChanged, 286);
        sparseIntArray.put(C13754dXa.TaskDescription.HrMTQN, 287);
        sparseIntArray.put(C13754dXa.TaskDescription.onProviderDisabled, 288);
        sparseIntArray.put(C13754dXa.TaskDescription.onStatusChanged, 289);
        sparseIntArray.put(C13754dXa.TaskDescription.DzOuPm, 290);
        sparseIntArray.put(C13754dXa.TaskDescription.QOeQqh, 291);
        sparseIntArray.put(C13754dXa.TaskDescription.adwzgZ, 292);
        sparseIntArray.put(C13754dXa.TaskDescription.DPVBvL, 293);
        sparseIntArray.put(C13754dXa.TaskDescription.OKSWiw, 294);
        sparseIntArray.put(C13754dXa.TaskDescription.apLTlu, 295);
        sparseIntArray.put(C13754dXa.TaskDescription.OCdtug, 296);
        sparseIntArray.put(C13754dXa.TaskDescription.aWJMta, 297);
        sparseIntArray.put(C13754dXa.TaskDescription.gwwzsY, 298);
        sparseIntArray.put(C13754dXa.TaskDescription.IYdWPz, 299);
        sparseIntArray.put(C13754dXa.TaskDescription.sEcTXd, 300);
        sparseIntArray.put(C13754dXa.TaskDescription.icKaHr, 301);
        sparseIntArray.put(C13754dXa.TaskDescription.hpmliR, 302);
        sparseIntArray.put(C13754dXa.TaskDescription.aWuQzD, 303);
        sparseIntArray.put(C13754dXa.TaskDescription.dYepVG, 304);
        sparseIntArray.put(C13754dXa.TaskDescription.zdxASf, 305);
        sparseIntArray.put(C13754dXa.TaskDescription.OGitdB, 306);
        sparseIntArray.put(C13754dXa.TaskDescription.fGT, 307);
        sparseIntArray.put(C13754dXa.TaskDescription.getConnectivityMgr, 308);
        sparseIntArray.put(C13754dXa.TaskDescription.OHsvZP, 309);
        sparseIntArray.put(C13754dXa.TaskDescription.FF, 310);
        sparseIntArray.put(C13754dXa.TaskDescription.OAUGar, 311);
        sparseIntArray.put(C13754dXa.TaskDescription.QYNZmZ, 312);
        sparseIntArray.put(C13754dXa.TaskDescription.RidNCX, 313);
        sparseIntArray.put(C13754dXa.TaskDescription.OeawrHOeawrH, 314);
        sparseIntArray.put(C13754dXa.TaskDescription.dkJJWw, 315);
        sparseIntArray.put(C13754dXa.TaskDescription.OqHLSf, TypedValues.AttributesType.TYPE_PATH_ROTATE);
        sparseIntArray.put(C13754dXa.TaskDescription.gCiISl, TypedValues.AttributesType.TYPE_EASING);
        sparseIntArray.put(C13754dXa.TaskDescription.DDDCac, TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        sparseIntArray.put(C13754dXa.TaskDescription.UJpkuA, 319);
        sparseIntArray.put(C13754dXa.TaskDescription.OmYuqg, 320);
        sparseIntArray.put(C13754dXa.TaskDescription.sJPPOI, 321);
        sparseIntArray.put(C13754dXa.TaskDescription.OqhRBMiKdSzF, 322);
    }

    public final ViewDataBinding EZpvd(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_add_custom_network_0".equals(obj)) {
                    return new C16284egy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_add_custom_network is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_approve_detail_0".equals(obj)) {
                    return new C16236egC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_approve_detail is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_approve_risky_detail_0".equals(obj)) {
                    return new C16235egB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_approve_risky_detail is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_backup_wallet_animation_tip_0".equals(obj)) {
                    return new C16242egI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_backup_wallet_animation_tip is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_backup_wallet_list_0".equals(obj)) {
                    return new C16244egK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_backup_wallet_list is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_bind_cefi_select_wallet_0".equals(obj)) {
                    return new C16241egH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bind_cefi_select_wallet is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_brc20_send_0".equals(obj)) {
                    return new C16248egO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_brc20_send is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_btc_address_format_aggregation_0".equals(obj)) {
                    return new C16249egP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_btc_address_format_aggregation is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_coin_detail_0".equals(obj)) {
                    return new C16252egS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_coin_detail is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_custom_network_0".equals(obj)) {
                    return new C16255egV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_custom_network is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_debug_export_nostr_0".equals(obj)) {
                    return new C16316ehd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_debug_export_nostr is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_decode_transaction_0".equals(obj)) {
                    return new C16315ehc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_decode_transaction is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_defi_coin_info_0".equals(obj)) {
                    return new C16319ehg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_coin_info is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_defi_forgot_password_tip_0".equals(obj)) {
                    return new C16322ehj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_forgot_password_tip is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_defi_hd_wallet_cloud_backup_result_0".equals(obj)) {
                    return new C16323ehk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_hd_wallet_cloud_backup_result is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_defi_wallet_account_address_0".equals(obj)) {
                    return new C16326ehn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_account_address is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_defi_wallet_account_list_0".equals(obj)) {
                    return new C16332eht(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_account_list is invalid. Received: " + obj);
            case 18:
                if ("layout/activity_defi_wallet_batch_create_account_0".equals(obj)) {
                    return new C16334ehv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_batch_create_account is invalid. Received: " + obj);
            case 19:
                if ("layout/activity_defi_wallet_batch_create_account_animation_0".equals(obj)) {
                    return new C16329ehq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_batch_create_account_animation is invalid. Received: " + obj);
            case 20:
                if ("layout/activity_defi_wallet_bind_smart_account_information_0".equals(obj)) {
                    return new C16336ehx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_bind_smart_account_information is invalid. Received: " + obj);
            case 21:
                if ("layout/activity_defi_wallet_connected_list_0".equals(obj)) {
                    return new C16337ehy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_connected_list is invalid. Received: " + obj);
            case 22:
                if ("layout/activity_defi_wallet_custom_tx_detail_transaction_item_0".equals(obj)) {
                    return new C16287ehA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_custom_tx_detail_transaction_item is invalid. Received: " + obj);
            case 23:
                if ("layout/activity_defi_wallet_detail_0".equals(obj)) {
                    return new C16289ehC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_detail is invalid. Received: " + obj);
            case 24:
                if ("layout/activity_defi_wallet_pnl_token_0".equals(obj)) {
                    return new C16291ehE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_pnl_token is invalid. Received: " + obj);
            case 25:
                if ("layout/activity_defi_wallet_set_google_drive_password_0".equals(obj)) {
                    return new C16294ehH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_set_google_drive_password is invalid. Received: " + obj);
            case 26:
                if ("layout/activity_defi_wallet_set_password_0".equals(obj)) {
                    return new C16300ehN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_set_password is invalid. Received: " + obj);
            case 27:
                if ("layout/activity_defi_wallet_transfer_common_0".equals(obj)) {
                    return new C16299ehM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_transfer_common is invalid. Received: " + obj);
            case 28:
                if ("layout/activity_defi_wallet_tx_detail_0".equals(obj)) {
                    return new C16304ehR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_tx_detail is invalid. Received: " + obj);
            case 29:
                if ("layout/activity_defi_wallet_verify_google_drive_password_0".equals(obj)) {
                    return new C16303ehQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_defi_wallet_verify_google_drive_password is invalid. Received: " + obj);
            case 30:
                if ("layout/activity_eip7702_onboarding_0".equals(obj)) {
                    return new C16307ehU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_eip7702_onboarding is invalid. Received: " + obj);
            case 31:
                if ("layout/activity_eos_account_0".equals(obj)) {
                    return new C16306ehT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_eos_account is invalid. Received: " + obj);
            case 32:
                if ("layout/activity_escape_mpc_wallet_account_list_0".equals(obj)) {
                    return new C16310ehX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_escape_mpc_wallet_account_list is invalid. Received: " + obj);
            case 33:
                if ("layout/activity_escape_urgent_enter_0".equals(obj)) {
                    return new C16312ehZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_escape_urgent_enter is invalid. Received: " + obj);
            case 34:
                if ("layout/activity_first_backup_wallet_tip_0".equals(obj)) {
                    return new C16368eic(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_first_backup_wallet_tip is invalid. Received: " + obj);
            case 35:
                if ("layout/activity_hardware_wallet_bluetooth_device_matching_0".equals(obj)) {
                    return new C16371eif(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_hardware_wallet_bluetooth_device_matching is invalid. Received: " + obj);
            case 36:
                if ("layout/activity_hardware_wallet_bluetooth_error_0".equals(obj)) {
                    return new C16372eig(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_hardware_wallet_bluetooth_error is invalid. Received: " + obj);
            case 37:
                if ("layout/activity_hardware_wallet_bluetooth_scan_0".equals(obj)) {
                    return new C16376eik(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_hardware_wallet_bluetooth_scan is invalid. Received: " + obj);
            case 38:
                if ("layout/activity_hardware_wallet_evm_network_0".equals(obj)) {
                    return new C16374eii(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_hardware_wallet_evm_network is invalid. Received: " + obj);
            case 39:
                if ("layout/activity_hardware_wallet_select_address_0".equals(obj)) {
                    return new C16382eiq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_hardware_wallet_select_address is invalid. Received: " + obj);
            case 40:
                if ("layout/activity_hardware_wallet_select_connect_type_0".equals(obj)) {
                    return new C16379ein(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_hardware_wallet_select_connect_type is invalid. Received: " + obj);
            case 41:
                if ("layout/activity_hardware_wallet_select_network_0".equals(obj)) {
                    return new C16387eiv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_hardware_wallet_select_network is invalid. Received: " + obj);
            case 42:
                if ("layout/activity_icloud_list_0".equals(obj)) {
                    return new C16386eiu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_icloud_list is invalid. Received: " + obj);
            case 43:
                if ("layout/activity_icloud_network_list_0".equals(obj)) {
                    return new C16385eit(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_icloud_network_list is invalid. Received: " + obj);
            case 44:
                if ("layout/activity_keystone_select_account_0".equals(obj)) {
                    return new C16389eix(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_keystone_select_account is invalid. Received: " + obj);
            case 45:
                if ("layout/activity_mpc_wallet_backup_tip_0".equals(obj)) {
                    return new C16343eiD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_mpc_wallet_backup_tip is invalid. Received: " + obj);
            case 46:
                if ("layout/activity_mpcscan_result_0".equals(obj)) {
                    return new C16346eiG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_mpcscan_result is invalid. Received: " + obj);
            case 47:
                if ("layout/activity_mpcwallet_qrcode_0".equals(obj)) {
                    return new C16350eiK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_mpcwallet_qrcode is invalid. Received: " + obj);
            case 48:
                if ("layout/activity_multi_transfer_input_memo_0".equals(obj)) {
                    return new C16347eiH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_multi_transfer_input_memo is invalid. Received: " + obj);
            case 49:
                if ("layout/activity_new_defi_wallet_history_0".equals(obj)) {
                    return new C16349eiJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_defi_wallet_history is invalid. Received: " + obj);
            case 50:
                if ("layout/activity_okw_add_custom_chain_0".equals(obj)) {
                    return new C16356eiQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_okw_add_custom_chain is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding copydefault(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/activity_okw_add_custom_chain_tokens_0".equals(obj)) {
                    return new C16353eiN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_okw_add_custom_chain_tokens is invalid. Received: " + obj);
            case 52:
                if ("layout/activity_okw_multi_transfer_result_0".equals(obj)) {
                    return new C16359eiT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_okw_multi_transfer_result is invalid. Received: " + obj);
            case 53:
                if ("layout/activity_phrase_and_private_key_input_password_0".equals(obj)) {
                    return new C16358eiS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_phrase_and_private_key_input_password is invalid. Received: " + obj);
            case 54:
                if ("layout/activity_profile_asset_tx_detail_0".equals(obj)) {
                    return new C16360eiU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_profile_asset_tx_detail is invalid. Received: " + obj);
            case 55:
                if ("layout/activity_profile_portfolio_details_0".equals(obj)) {
                    return new C16419eja(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_profile_portfolio_details is invalid. Received: " + obj);
            case 56:
                if ("layout/activity_re_new_enable_0".equals(obj)) {
                    return new C16364eiY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_re_new_enable is invalid. Received: " + obj);
            case 57:
                if ("layout/activity_receive_coin_qr_code_0".equals(obj)) {
                    return new C16420ejb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_receive_coin_qr_code is invalid. Received: " + obj);
            case 58:
                if ("layout/activity_securit_model_0".equals(obj)) {
                    return new C16422ejd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_securit_model is invalid. Received: " + obj);
            case 59:
                if ("layout/activity_select_coin_0".equals(obj)) {
                    return new C16426ejh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_coin is invalid. Received: " + obj);
            case 60:
                if ("layout/activity_select_withdrawal_coin_0".equals(obj)) {
                    return new C16425ejg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_withdrawal_coin is invalid. Received: " + obj);
            case 61:
                if ("layout/activity_select_withdrawal_network_0".equals(obj)) {
                    return new C16429ejk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_select_withdrawal_network is invalid. Received: " + obj);
            case 62:
                if ("layout/activity_transaction_add_custom_network_0".equals(obj)) {
                    return new C16431ejm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_transaction_add_custom_network is invalid. Received: " + obj);
            case 63:
                if ("layout/activity_transaction_add_token_0".equals(obj)) {
                    return new C16439eju(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_transaction_add_token is invalid. Received: " + obj);
            case 64:
                if ("layout/activity_wallet_debug_list_0".equals(obj)) {
                    return new C16440ejv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_debug_list is invalid. Received: " + obj);
            case 65:
                if ("layout/activity_wallet_edit_0".equals(obj)) {
                    return new C16441ejw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_edit is invalid. Received: " + obj);
            case 66:
                if ("layout/activity_wallet_manage_0".equals(obj)) {
                    return new C16393ejA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_manage is invalid. Received: " + obj);
            case 67:
                if ("layout/activity_wallet_mine_0".equals(obj)) {
                    return new C16394ejB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_mine is invalid. Received: " + obj);
            case 68:
                if ("layout/activity_wallet_mpc_backup_privatekey_0".equals(obj)) {
                    return new C16402ejJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_mpc_backup_privatekey is invalid. Received: " + obj);
            case 69:
                if ("layout/activity_wallet_mpc_escape_list_0".equals(obj)) {
                    return new C16401ejI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_mpc_escape_list is invalid. Received: " + obj);
            case 70:
                if ("layout/activity_wallet_multi_transfer_input_address_0".equals(obj)) {
                    return new C16399ejG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_multi_transfer_input_address is invalid. Received: " + obj);
            case 71:
                if ("layout/activity_wallet_multi_transfer_interval_0".equals(obj)) {
                    return new C16407ejO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_multi_transfer_interval is invalid. Received: " + obj);
            case 72:
                if ("layout/activity_wallet_password_0".equals(obj)) {
                    return new C16406ejN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_password is invalid. Received: " + obj);
            case 73:
                if ("layout/activity_wallet_recently_removed_coin_0".equals(obj)) {
                    return new C16412ejT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_wallet_recently_removed_coin is invalid. Received: " + obj);
            case 74:
                if ("layout/address_book_layout_network_selection_bottom_sheet_0".equals(obj)) {
                    return new C16414ejV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for address_book_layout_network_selection_bottom_sheet is invalid. Received: " + obj);
            case 75:
                if ("layout/appbar_select_coin_0".equals(obj)) {
                    return new C16416ejX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for appbar_select_coin is invalid. Received: " + obj);
            case 76:
                if ("layout/bottom_sheet_bind_add_wallet_guide_0".equals(obj)) {
                    return new C16418ejZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_bind_add_wallet_guide is invalid. Received: " + obj);
            case 77:
                if ("layout/bottom_sheet_bind_redirect_0".equals(obj)) {
                    return new C16477ekf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_bind_redirect is invalid. Received: " + obj);
            case 78:
                if ("layout/bottom_sheet_bind_select_okx_app_0".equals(obj)) {
                    return new C16476eke(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_bind_select_okx_app is invalid. Received: " + obj);
            case 79:
                if ("layout/bottom_sheet_wallet_bind_confirm_0".equals(obj)) {
                    return new C16481ekj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_wallet_bind_confirm is invalid. Received: " + obj);
            case 80:
                if ("layout/dfragment_address_format_content_default_0".equals(obj)) {
                    return new C16492eku(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_address_format_content_default is invalid. Received: " + obj);
            case 81:
                if ("layout/dfragment_address_format_item_default_0".equals(obj)) {
                    return new C16493ekv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_address_format_item_default is invalid. Received: " + obj);
            case 82:
                if ("layout/dfragment_btc_address_aggregation_normal_item_0".equals(obj)) {
                    return new C16447ekB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_btc_address_aggregation_normal_item is invalid. Received: " + obj);
            case 83:
                if ("layout/dfragment_btc_address_format_aggregation_content_0".equals(obj)) {
                    return new C16448ekC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_btc_address_format_aggregation_content is invalid. Received: " + obj);
            case 84:
                if ("layout/dfragment_cancel_tx_0".equals(obj)) {
                    return new C16452ekG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_cancel_tx is invalid. Received: " + obj);
            case 85:
                if ("layout/dfragment_defi_bottom_sheet_sub_tx_base_0".equals(obj)) {
                    return new C16450ekE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_defi_bottom_sheet_sub_tx_base is invalid. Received: " + obj);
            case 86:
                if ("layout/dfragment_defi_create_wallet_loading_0".equals(obj)) {
                    return new C16455ekJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_defi_create_wallet_loading is invalid. Received: " + obj);
            case 87:
                if ("layout/dfragment_exchange_account_0".equals(obj)) {
                    return new C16456ekK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_exchange_account is invalid. Received: " + obj);
            case 88:
                if ("layout/dfragment_mpc_escape_backup_success_0".equals(obj)) {
                    return new C16457ekL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_mpc_escape_backup_success is invalid. Received: " + obj);
            case 89:
                if ("layout/dfragment_mpc_escape_success_item_0".equals(obj)) {
                    return new C16459ekN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_mpc_escape_success_item is invalid. Received: " + obj);
            case 90:
                if ("layout/dfragment_profile_filter_activity_0".equals(obj)) {
                    return new C16463ekR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_profile_filter_activity is invalid. Received: " + obj);
            case 91:
                if ("layout/dfragment_profile_filter_risky_token_0".equals(obj)) {
                    return new C16467ekV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_profile_filter_risky_token is invalid. Received: " + obj);
            case 92:
                if ("layout/dfragment_speed_up_tx_0".equals(obj)) {
                    return new C16464ekS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_speed_up_tx is invalid. Received: " + obj);
            case 93:
                if ("layout/dfragment_speed_up_tx_content_0".equals(obj)) {
                    return new C16465ekT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_speed_up_tx_content is invalid. Received: " + obj);
            case 94:
                if ("layout/dfragment_speed_up_tx_header_0".equals(obj)) {
                    return new C16470ekY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_speed_up_tx_header is invalid. Received: " + obj);
            case 95:
                if ("layout/dfragment_speed_up_tx_item_0".equals(obj)) {
                    return new C16469ekX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_speed_up_tx_item is invalid. Received: " + obj);
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                if ("layout/dialog_finger_print_verify_0".equals(obj)) {
                    return new C16527elc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_finger_print_verify is invalid. Received: " + obj);
            case 97:
                if ("layout/dialog_fragment_aa_rechange_tips_0".equals(obj)) {
                    return new C16531elg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_aa_rechange_tips is invalid. Received: " + obj);
            case 98:
                if ("layout/dialog_fragment_chain_update_0".equals(obj)) {
                    return new C16532elh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_chain_update is invalid. Received: " + obj);
            case 99:
                if ("layout/dialog_fragment_multipl_rpc_url_choose_0".equals(obj)) {
                    return new C16537elm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_multipl_rpc_url_choose is invalid. Received: " + obj);
            case 100:
                if ("layout/dialog_fragment_smart_wallet_chain_info_0".equals(obj)) {
                    return new C16540elp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_smart_wallet_chain_info is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding KWHzl(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 101:
                if ("layout/dialog_fragment_switch_currency_0".equals(obj)) {
                    return new C16543els(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_switch_currency is invalid. Received: " + obj);
            case 102:
                if ("layout/fg_wallet_kline_0".equals(obj)) {
                    return new C16499elA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fg_wallet_kline is invalid. Received: " + obj);
            case 103:
                if ("layout/fragment_aa_network_fee_0".equals(obj)) {
                    return new C16548elx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_aa_network_fee is invalid. Received: " + obj);
            case 104:
                if ("layout/fragment_aa_network_fee_select_crypto_0".equals(obj)) {
                    return new C16503elE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_aa_network_fee_select_crypto is invalid. Received: " + obj);
            case 105:
                if ("layout/fragment_approve_coin_amt_0".equals(obj)) {
                    return new C16504elF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_approve_coin_amt is invalid. Received: " + obj);
            case 106:
                if ("layout/fragment_approve_malicious_risky_0".equals(obj)) {
                    return new C16505elG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_approve_malicious_risky is invalid. Received: " + obj);
            case 107:
                if ("layout/fragment_brc20_transfer_0".equals(obj)) {
                    return new C16510elL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_brc20_transfer is invalid. Received: " + obj);
            case 108:
                if ("layout/fragment_btc_asset_tip_0".equals(obj)) {
                    return new C16512elN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_btc_asset_tip is invalid. Received: " + obj);
            case 109:
                if ("layout/fragment_chain_update_coin_detail_0".equals(obj)) {
                    return new C16514elP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_chain_update_coin_detail is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_AA_CREATE_KEY /* 110 */:
                if ("layout/fragment_choose_network_dialog_0".equals(obj)) {
                    return new C16515elQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_choose_network_dialog is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY /* 111 */:
                if ("layout/fragment_coin_detail_empty_0".equals(obj)) {
                    return new C16520elV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coin_detail_empty is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_AA_EXIST /* 112 */:
                if ("layout/fragment_coin_detail_new_0".equals(obj)) {
                    return new C16523elY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coin_detail_new is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST /* 113 */:
                if ("layout/fragment_coin_detail_profile_asset_0".equals(obj)) {
                    return new C16582eme(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coin_detail_profile_asset is invalid. Received: " + obj);
            case 114:
                if ("layout/fragment_coin_overview_0".equals(obj)) {
                    return new C16578ema(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coin_overview is invalid. Received: " + obj);
            case 115:
                if ("layout/fragment_custom_coin_detail_0".equals(obj)) {
                    return new C16583emf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_coin_detail is invalid. Received: " + obj);
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                if ("layout/fragment_defi_approve_manager_0".equals(obj)) {
                    return new C16585emh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_defi_approve_manager is invalid. Received: " + obj);
            case 117:
                if ("layout/fragment_defi_choose_escape_cloud_type_0".equals(obj)) {
                    return new C16589eml(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_defi_choose_escape_cloud_type is invalid. Received: " + obj);
            case 118:
                if ("layout/fragment_defi_wallet_multi_select_receive_address_0".equals(obj)) {
                    return new C16594emq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_defi_wallet_multi_select_receive_address is invalid. Received: " + obj);
            case 119:
                if ("layout/fragment_defi_wallet_multi_select_send_address_0".equals(obj)) {
                    return new C16598emu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_defi_wallet_multi_select_send_address is invalid. Received: " + obj);
            case 120:
                if ("layout/fragment_defi_wallet_profile_asset_detail_0".equals(obj)) {
                    return new C16553emB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_defi_wallet_profile_asset_detail is invalid. Received: " + obj);
            case 121:
                if ("layout/fragment_dialog_aa_free_gas_tips_0".equals(obj)) {
                    return new C16603emz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dialog_aa_free_gas_tips is invalid. Received: " + obj);
            case 122:
                if ("layout/fragment_dialog_change_evm_derive_address_layout_0".equals(obj)) {
                    return new C16560emI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dialog_change_evm_derive_address_layout is invalid. Received: " + obj);
            case 123:
                if ("layout/fragment_dialog_repeat_order_tip_0".equals(obj)) {
                    return new C16559emH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dialog_repeat_order_tip is invalid. Received: " + obj);
            case 124:
                if ("layout/fragment_hardware_wallet_bluetooth_confirm_send_0".equals(obj)) {
                    return new C16564emM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hardware_wallet_bluetooth_confirm_send is invalid. Received: " + obj);
            case 125:
                if ("layout/fragment_invest_utxo_confirmation_0".equals(obj)) {
                    return new C16562emK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_invest_utxo_confirmation is invalid. Received: " + obj);
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                if ("layout/fragment_layover_trade_dialog_0".equals(obj)) {
                    return new C16567emP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_layover_trade_dialog is invalid. Received: " + obj);
            case 127:
                if ("layout/fragment_mpc_restore_0".equals(obj)) {
                    return new C16566emO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_mpc_restore is invalid. Received: " + obj);
            case 128:
                if ("layout/fragment_multi_coin_approve_0".equals(obj)) {
                    return new C16571emT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_multi_coin_approve is invalid. Received: " + obj);
            case 129:
                if ("layout/fragment_multi_transfer_set_amount_0".equals(obj)) {
                    return new C16574emW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_multi_transfer_set_amount is invalid. Received: " + obj);
            case 130:
                if ("layout/fragment_multi_transfer_set_interval_0".equals(obj)) {
                    return new C16576emY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_multi_transfer_set_interval is invalid. Received: " + obj);
            case DateFormat.RELATIVE_SHORT /* 131 */:
                if ("layout/fragment_my_wallets_0".equals(obj)) {
                    return new C16632enb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_my_wallets is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                if ("layout/fragment_network_fee_0".equals(obj)) {
                    return new C16634end(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_network_fee is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                if ("layout/fragment_okw_escape_bind_account_detail_0".equals(obj)) {
                    return new C16635ene(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_okw_escape_bind_account_detail is invalid. Received: " + obj);
            case 134:
                if ("layout/fragment_okw_escape_bind_account_list_0".equals(obj)) {
                    return new C16637eng(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_okw_escape_bind_account_list is invalid. Received: " + obj);
            case 135:
                if ("layout/fragment_okw_set_approve_amount_0".equals(obj)) {
                    return new C16643enm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_okw_set_approve_amount is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                if ("layout/fragment_okw_transaction_0".equals(obj)) {
                    return new C16642enl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_okw_transaction is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                if ("layout/fragment_receive_coin_qr_code_0".equals(obj)) {
                    return new C16648enr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_receive_coin_qr_code is invalid. Received: " + obj);
            case 138:
                if ("layout/fragment_recover_over_limit_0".equals(obj)) {
                    return new C16645eno(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recover_over_limit is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                if ("layout/fragment_select_coin_0".equals(obj)) {
                    return new C16650ent(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_select_coin is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                if ("layout/fragment_select_coin_search_0".equals(obj)) {
                    return new C16606enB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_select_coin_search is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                if ("layout/fragment_set_amount_base_0".equals(obj)) {
                    return new C16656enz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_set_amount_base is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                if ("layout/fragment_sign_dapp_0".equals(obj)) {
                    return new C16610enF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sign_dapp is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                if ("layout/fragment_similar_address_tip_0".equals(obj)) {
                    return new C16608enD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_similar_address_tip is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /* 144 */:
                if ("layout/fragment_simple_btc_address_0".equals(obj)) {
                    return new C16615enK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_simple_btc_address is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                if ("layout/fragment_transfer_select_coin_0".equals(obj)) {
                    return new C16617enM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_transfer_select_coin is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                if ("layout/fragment_types_select_0".equals(obj)) {
                    return new C16619enO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_types_select is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                if ("layout/fragment_wallet_account_address_0".equals(obj)) {
                    return new C16622enR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_wallet_account_address is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA /* 148 */:
                if ("layout/fragment_wallet_manage_list_new_0".equals(obj)) {
                    return new C16627enW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_wallet_manage_list_new is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA /* 149 */:
                if ("layout/fragment_wallet_recently_removed_coin_0".equals(obj)) {
                    return new C16628enX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_wallet_recently_removed_coin is invalid. Received: " + obj);
            case 150:
                if ("layout/fragment_wallet_tee_service_upgrade_0".equals(obj)) {
                    return new C16697eon(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_wallet_tee_service_upgrade is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding OLrzqt(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA /* 151 */:
                if ("layout/fragment_wallet_trade_history_0".equals(obj)) {
                    return new C16695eol(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_wallet_trade_history is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                if ("layout/item_add_new_network_0".equals(obj)) {
                    return new C16701eor(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_add_new_network is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA /* 153 */:
                if ("layout/item_all_chain_0".equals(obj)) {
                    return new C16703eot(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_all_chain is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA /* 154 */:
                if ("layout/item_approve_manager_0".equals(obj)) {
                    return new C16705eov(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_approve_manager is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                if ("layout/item_approve_risky_token_0".equals(obj)) {
                    return new C16707eox(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_approve_risky_token is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                if ("layout/item_approve_risky_token_group_0".equals(obj)) {
                    return new C16660eoC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_approve_risky_token_group is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                if ("layout/item_approve_token_0".equals(obj)) {
                    return new C16661eoD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_approve_token is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 /* 158 */:
                if ("layout/item_approve_token_group_0".equals(obj)) {
                    return new C16662eoE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_approve_token_group is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 /* 159 */:
                if ("layout/item_brc_data_0".equals(obj)) {
                    return new C16663eoF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_brc_data is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                if ("layout/item_brc_inscribe_0".equals(obj)) {
                    return new C16665eoH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_brc_inscribe is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                if ("layout/item_btc_multi_sign_0".equals(obj)) {
                    return new C16670eoM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_btc_multi_sign is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                if ("layout/item_btc_utx_info_0".equals(obj)) {
                    return new C16672eoO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_btc_utx_info is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                if ("layout/item_btc_xrc_asset_info_0".equals(obj)) {
                    return new C16668eoK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_btc_xrc_asset_info is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                if ("layout/item_change_evm_derive_address_layout_0".equals(obj)) {
                    return new C16673eoP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_change_evm_derive_address_layout is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                if ("layout/item_chart_status_error_0".equals(obj)) {
                    return new C16676eoS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chart_status_error is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 /* 166 */:
                if ("layout/item_chart_status_loading_0".equals(obj)) {
                    return new C16679eoV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_chart_status_loading is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 /* 167 */:
                if ("layout/item_cloud_backup_address_0".equals(obj)) {
                    return new C16678eoU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_cloud_backup_address is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                if ("layout/item_cloud_backup_address_evm_0".equals(obj)) {
                    return new C16680eoW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_cloud_backup_address_evm is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                if ("layout/item_coin_overview_0".equals(obj)) {
                    return new C16738epb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_coin_overview is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                if ("layout/item_coin_tx_history_0".equals(obj)) {
                    return new C16743epg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_coin_tx_history is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                if ("layout/item_coin_tx_history_header_0".equals(obj)) {
                    return new C16744eph(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_coin_tx_history_header is invalid. Received: " + obj);
            case 172:
                if ("layout/item_coin_tx_history_pending_0".equals(obj)) {
                    return new C16750epn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_coin_tx_history_pending is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                if ("layout/item_common_head_0".equals(obj)) {
                    return new C16747epk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_common_head is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                if ("layout/item_custom_select_network_0".equals(obj)) {
                    return new C16752epp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_custom_select_network is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                if ("layout/item_debug_nostr_divider_0".equals(obj)) {
                    return new C16755eps(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_debug_nostr_divider is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
                if ("layout/item_debug_nostr_root_wallet_0".equals(obj)) {
                    return new C16756ept(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_debug_nostr_root_wallet is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                if ("layout/item_debug_nostr_wallet_0".equals(obj)) {
                    return new C16758epv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_debug_nostr_wallet is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                if ("layout/item_defi_edit_wallet_name_0".equals(obj)) {
                    return new C16716epF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_edit_wallet_name is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                if ("layout/item_defi_home_crypto_read_article_0".equals(obj)) {
                    return new C16720epJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_home_crypto_read_article is invalid. Received: " + obj);
            case 180:
                if ("layout/item_defi_home_nft_collection_0".equals(obj)) {
                    return new C16722epL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_home_nft_collection is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                if ("layout/item_defi_home_wallet_0".equals(obj)) {
                    return new C16721epK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_home_wallet is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                if ("layout/item_defi_home_wallet_escape_bind_entrance_0".equals(obj)) {
                    return new C16727epQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_home_wallet_escape_bind_entrance is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                if ("layout/item_defi_home_wallet_hidden_asset_header_0".equals(obj)) {
                    return new C16726epP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_home_wallet_hidden_asset_header is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                if ("layout/item_defi_home_yield_0".equals(obj)) {
                    return new C16729epS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_home_yield is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                if ("layout/item_defi_root_wallet_backup_0".equals(obj)) {
                    return new C16796eqg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_root_wallet_backup is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                if ("layout/item_defi_select_network_for_wallet_0".equals(obj)) {
                    return new C16800eqk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_defi_select_network_for_wallet is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                if ("layout/item_eip_7702_network_0".equals(obj)) {
                    return new C16803eqn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_eip_7702_network is invalid. Received: " + obj);
            case 188:
                if ("layout/item_faq_0".equals(obj)) {
                    return new C16805eqp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_faq is invalid. Received: " + obj);
            case 189:
                if ("layout/item_hardware_evm_network_0".equals(obj)) {
                    return new C16811eqv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_hardware_evm_network is invalid. Received: " + obj);
            case 190:
                if ("layout/item_hardware_expand_collapse_0".equals(obj)) {
                    return new C16815eqz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_hardware_expand_collapse is invalid. Received: " + obj);
            case 191:
                if ("layout/item_hidden_asset_0".equals(obj)) {
                    return new C16764eqA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_hidden_asset is invalid. Received: " + obj);
            case 192:
                if ("layout/item_inputs_outputs_utxo_info_0".equals(obj)) {
                    return new C16769eqF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_inputs_outputs_utxo_info is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                if ("layout/item_inputs_outputs_xrc_asset_info_0".equals(obj)) {
                    return new C16767eqD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_inputs_outputs_xrc_asset_info is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                if ("layout/item_invest_utxo_confirmation_token_info_0".equals(obj)) {
                    return new C16770eqG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_utxo_confirmation_token_info is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                if ("layout/item_invest_utxo_confirmation_token_nft_info_0".equals(obj)) {
                    return new C16773eqJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_utxo_confirmation_token_nft_info is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                if ("layout/item_keystone_select_account_0".equals(obj)) {
                    return new C16778eqO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_keystone_select_account is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                if ("layout/item_keystone_select_account_header_0".equals(obj)) {
                    return new C16776eqM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_keystone_select_account_header is invalid. Received: " + obj);
            case 198:
                if ("layout/item_multi_select_send_account_0".equals(obj)) {
                    return new C16781eqR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_multi_select_send_account is invalid. Received: " + obj);
            case 199:
                if ("layout/item_multi_send_board_0".equals(obj)) {
                    return new C16782eqS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_multi_send_board is invalid. Received: " + obj);
            case 200:
                if ("layout/item_multi_send_board_question_0".equals(obj)) {
                    return new C16786eqW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_multi_send_board_question is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding AEQbTJ(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 201:
                if ("layout/item_multi_transfer_result_0".equals(obj)) {
                    return new C16787eqX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_multi_transfer_result is invalid. Received: " + obj);
            case 202:
                if ("layout/item_my_wallet_major_0".equals(obj)) {
                    return new C16847ere(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_my_wallet_major is invalid. Received: " + obj);
            case 203:
                if ("layout/item_network_fee_0".equals(obj)) {
                    return new C16846erd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_network_fee is invalid. Received: " + obj);
            case 204:
                if ("layout/item_network_fee_custom_0".equals(obj)) {
                    return new C16852erj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_network_fee_custom is invalid. Received: " + obj);
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                if ("layout/item_network_fee_select_crypto_0".equals(obj)) {
                    return new C16850erh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_network_fee_select_crypto is invalid. Received: " + obj);
            case 206:
                if ("layout/item_nft_collection_item_0".equals(obj)) {
                    return new C16851eri(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_nft_collection_item is invalid. Received: " + obj);
            case 207:
                if ("layout/item_nft_history_0".equals(obj)) {
                    return new C16853erk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_nft_history is invalid. Received: " + obj);
            case 208:
                if ("layout/item_okw_escape_bind_account_asset_0".equals(obj)) {
                    return new C16856ern(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_okw_escape_bind_account_asset is invalid. Received: " + obj);
            case 209:
                if ("layout/item_okw_escape_bind_account_list_0".equals(obj)) {
                    return new C16859erq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_okw_escape_bind_account_list is invalid. Received: " + obj);
            case 210:
                if ("layout/item_one_img_0".equals(obj)) {
                    return new C16860err(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_one_img is invalid. Received: " + obj);
            case 211:
                if ("layout/item_one_img_pending_0".equals(obj)) {
                    return new C16862ert(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_one_img_pending is invalid. Received: " + obj);
            case com.flyco.tablayout.BuildConfig.VERSION_CODE /* 212 */:
                if ("layout/item_one_key_select_account_0".equals(obj)) {
                    return new C16866erx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_one_key_select_account is invalid. Received: " + obj);
            case 213:
                if ("layout/item_pending_0".equals(obj)) {
                    return new C16863eru(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pending is invalid. Received: " + obj);
            case me.relex.circleindicator.BuildConfig.VERSION_CODE /* 214 */:
                if ("layout/item_profile_asset_coin_tx_history_0".equals(obj)) {
                    return new C16817erA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_profile_asset_coin_tx_history is invalid. Received: " + obj);
            case 215:
                if ("layout/item_profile_asset_coin_tx_history_pending_0".equals(obj)) {
                    return new C16820erD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_profile_asset_coin_tx_history_pending is invalid. Received: " + obj);
            case 216:
                if ("layout/item_quick_copy_address_0".equals(obj)) {
                    return new C16819erC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_quick_copy_address is invalid. Received: " + obj);
            case 217:
                if ("layout/item_select_coin_0".equals(obj)) {
                    return new C16824erH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_select_coin is invalid. Received: " + obj);
            case 218:
                if ("layout/item_select_coin_divider_0".equals(obj)) {
                    return new C16829erM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_select_coin_divider is invalid. Received: " + obj);
            case 219:
                if ("layout/item_select_coin_entrance_0".equals(obj)) {
                    return new C16830erN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_select_coin_entrance is invalid. Received: " + obj);
            case 220:
                if ("layout/item_select_coin_search_0".equals(obj)) {
                    return new C16832erP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_select_coin_search is invalid. Received: " + obj);
            case 221:
                if ("layout/item_select_coin_title_0".equals(obj)) {
                    return new C16833erQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_select_coin_title is invalid. Received: " + obj);
            case 222:
                if ("layout/item_solana_transfer_network_fee_0".equals(obj)) {
                    return new C16837erU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_solana_transfer_network_fee is invalid. Received: " + obj);
            case 223:
                if ("layout/item_tee_time_selection_bottom_sheet_0".equals(obj)) {
                    return new C16897esb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_tee_time_selection_bottom_sheet is invalid. Received: " + obj);
            case 224:
                if ("layout/item_three_img_0".equals(obj)) {
                    return new C16842erZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_three_img is invalid. Received: " + obj);
            case 225:
                if ("layout/item_total_container_layout_0".equals(obj)) {
                    return new C16898esc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_total_container_layout is invalid. Received: " + obj);
            case 226:
                if ("layout/item_trade_history_header_0".equals(obj)) {
                    return new C16901esf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_trade_history_header is invalid. Received: " + obj);
            case 227:
                if ("layout/item_transfer_coin_from_exchange_header_0".equals(obj)) {
                    return new C16903esh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_transfer_coin_from_exchange_header is invalid. Received: " + obj);
            case 228:
                if ("layout/item_transfer_input_memo_0".equals(obj)) {
                    return new C16906esk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_transfer_input_memo is invalid. Received: " + obj);
            case FreshnessState.FIRST_SCENE_ALPHA /* 229 */:
                if ("layout/item_transfer_select_coin_0".equals(obj)) {
                    return new C16907esl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_transfer_select_coin is invalid. Received: " + obj);
            case 230:
                if ("layout/item_two_img_0".equals(obj)) {
                    return new C16913esr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_two_img is invalid. Received: " + obj);
            case 231:
                if ("layout/item_wallet_debug_setting_0".equals(obj)) {
                    return new C16919esx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_wallet_debug_setting is invalid. Received: " + obj);
            case 232:
                if ("layout/item_withdrawal_select_coin_0".equals(obj)) {
                    return new C16878esI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_withdrawal_select_coin is invalid. Received: " + obj);
            case 233:
                if ("layout/item_withdrawal_select_network_0".equals(obj)) {
                    return new C16880esK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_withdrawal_select_network is invalid. Received: " + obj);
            case 234:
                if ("layout/kys_risk_tip_0".equals(obj)) {
                    return new C16882esM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for kys_risk_tip is invalid. Received: " + obj);
            case 235:
                if ("layout/layout_aa_wallet_info_0".equals(obj)) {
                    return new C16886esQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_aa_wallet_info is invalid. Received: " + obj);
            case 236:
                if ("layout/layout_batch_create_account_count_0".equals(obj)) {
                    return new C16888esS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_batch_create_account_count is invalid. Received: " + obj);
            case 237:
                if ("layout/layout_btc_utxo_more_input_0".equals(obj)) {
                    return new C16887esR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_btc_utxo_more_input is invalid. Received: " + obj);
            case 238:
                if ("layout/layout_btc_xrc_input_output_0".equals(obj)) {
                    return new C16889esT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_btc_xrc_input_output is invalid. Received: " + obj);
            case 239:
                if ("layout/layout_dapp_interaction_address_0".equals(obj)) {
                    return new C16895esZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_interaction_address is invalid. Received: " + obj);
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                if ("layout/layout_dapp_interaction_approved_amount_0".equals(obj)) {
                    return new C16950etb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_interaction_approved_amount is invalid. Received: " + obj);
            case 241:
                if ("layout/layout_dapp_interaction_btn_layout_0".equals(obj)) {
                    return new C16953ete(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_interaction_btn_layout is invalid. Received: " + obj);
            case 242:
                if ("layout/layout_dapp_interaction_data_0".equals(obj)) {
                    return new C16956eth(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_interaction_data is invalid. Received: " + obj);
            case 243:
                if ("layout/layout_dapp_interaction_network_0".equals(obj)) {
                    return new C16959etk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_interaction_network is invalid. Received: " + obj);
            case 244:
                if ("layout/layout_dapp_interaction_network_fee_0".equals(obj)) {
                    return new C16957eti(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_interaction_network_fee is invalid. Received: " + obj);
            case 245:
                if ("layout/layout_dapp_interaction_top_0".equals(obj)) {
                    return new C16961etm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_interaction_top is invalid. Received: " + obj);
            case 246:
                if ("layout/layout_dapp_interaction_wallet_0".equals(obj)) {
                    return new C16963eto(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_interaction_wallet is invalid. Received: " + obj);
            case 247:
                if ("layout/layout_dapp_network_info_bottomsheet_0".equals(obj)) {
                    return new C16968ett(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_network_info_bottomsheet is invalid. Received: " + obj);
            case 248:
                if ("layout/layout_defi_approve_risky_banner_0".equals(obj)) {
                    return new C16969etu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_approve_risky_banner is invalid. Received: " + obj);
            case 249:
                if ("layout/layout_defi_asset_allocation_view_0".equals(obj)) {
                    return new C16967ets(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_defi_asset_allocation_view is invalid. Received: " + obj);
            case 250:
                if ("layout/layout_defi_history_select_chain_header_0".equals(obj)) {
                    return new C16970etv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_history_select_chain_header is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding AhwBna(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 251:
                if ("layout/layout_defi_home_yield_coins_0".equals(obj)) {
                    return new C16926etD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_home_yield_coins is invalid. Received: " + obj);
            case 252:
                if ("layout/layout_defi_profile_pnl_analysis_0".equals(obj)) {
                    return new C16923etA(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_defi_profile_pnl_analysis is invalid. Received: " + obj);
            case 253:
                if ("layout/layout_defi_profile_pnl_chart_0".equals(obj)) {
                    return new C16928etF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_profile_pnl_chart is invalid. Received: " + obj);
            case 254:
                if ("layout/layout_defi_profile_pnl_transactions_0".equals(obj)) {
                    return new C16932etJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_profile_pnl_transactions is invalid. Received: " + obj);
            case 255:
                if ("layout/layout_defi_profile_pnl_volume_0".equals(obj)) {
                    return new C16935etM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_profile_pnl_volume is invalid. Received: " + obj);
            case 256:
                if ("layout/layout_defi_profile_pnl_win_rate_0".equals(obj)) {
                    return new C16933etK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_profile_pnl_win_rate is invalid. Received: " + obj);
            case 257:
                if ("layout/layout_defi_set_fingerprint_0".equals(obj)) {
                    return new C16937etO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_set_fingerprint is invalid. Received: " + obj);
            case 258:
                if ("layout/layout_defi_usdg_result_activity_0".equals(obj)) {
                    return new C16940etR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_usdg_result_activity is invalid. Received: " + obj);
            case 259:
                if ("layout/layout_defi_wallet_multi_select_receive_address_activity_0".equals(obj)) {
                    return new C16938etP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_wallet_multi_select_receive_address_activity is invalid. Received: " + obj);
            case 260:
                if ("layout/layout_defi_wallet_multi_select_send_address_activity_0".equals(obj)) {
                    return new C16946etX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_wallet_multi_select_send_address_activity is invalid. Received: " + obj);
            case 261:
                if ("layout/layout_defi_wallet_multi_send_board_activity_0".equals(obj)) {
                    return new C16947etY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_wallet_multi_send_board_activity is invalid. Received: " + obj);
            case 262:
                if ("layout/layout_defi_wallet_multi_send_board_fragment_0".equals(obj)) {
                    return new C16943etU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_wallet_multi_send_board_fragment is invalid. Received: " + obj);
            case 263:
                if ("layout/layout_defi_wallet_on_board_question_activity_0".equals(obj)) {
                    return new C17004euc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_wallet_on_board_question_activity is invalid. Received: " + obj);
            case 264:
                if ("layout/layout_defi_wallet_usdg_onboard_activity_0".equals(obj)) {
                    return new C17005eud(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_defi_wallet_usdg_onboard_activity is invalid. Received: " + obj);
            case 265:
                if ("layout/layout_escape_cedefi_access_activity_0".equals(obj)) {
                    return new C17009euh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_escape_cedefi_access_activity is invalid. Received: " + obj);
            case 266:
                if ("layout/layout_escape_cedefi_confirm_activity_0".equals(obj)) {
                    return new C17007euf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_escape_cedefi_confirm_activity is invalid. Received: " + obj);
            case 267:
                if ("layout/layout_escape_cedefi_confirm_wallet_activity_0".equals(obj)) {
                    return new C17014eum(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_escape_cedefi_confirm_wallet_activity is invalid. Received: " + obj);
            case 268:
                if ("layout/layout_escape_cedefi_list_activity_0".equals(obj)) {
                    return new C17011euj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_escape_cedefi_list_activity is invalid. Received: " + obj);
            case 269:
                if ("layout/layout_faq_section_0".equals(obj)) {
                    return new C17020eus(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_faq_section is invalid. Received: " + obj);
            case SubsamplingScaleImageView.ORIENTATION_270 /* 270 */:
                if ("layout/layout_hardware_wallet_bluetooth_guide_0".equals(obj)) {
                    return new C17016euo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_hardware_wallet_bluetooth_guide is invalid. Received: " + obj);
            case 271:
                if ("layout/layout_inputs_outputs_detail_0".equals(obj)) {
                    return new C17022euu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_inputs_outputs_detail is invalid. Received: " + obj);
            case 272:
                if ("layout/layout_inputs_outputs_more_0".equals(obj)) {
                    return new C17021eut(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_inputs_outputs_more is invalid. Received: " + obj);
            case 273:
                if ("layout/layout_investment_details_0".equals(obj)) {
                    return new C16981euF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_investment_details is invalid. Received: " + obj);
            case 274:
                if ("layout/layout_item_defi_wallet_tx_detail_address_copy_0".equals(obj)) {
                    return new C16983euH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_defi_wallet_tx_detail_address_copy is invalid. Received: " + obj);
            case 275:
                if ("layout/layout_item_defi_wallet_tx_detail_content_apporved_amount_0".equals(obj)) {
                    return new C16979euD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_defi_wallet_tx_detail_content_apporved_amount is invalid. Received: " + obj);
            case 276:
                if ("layout/layout_item_defi_wallet_tx_detail_content_copy_0".equals(obj)) {
                    return new C16985euJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_defi_wallet_tx_detail_content_copy is invalid. Received: " + obj);
            case 277:
                if ("layout/layout_item_defi_wallet_tx_detail_content_detail_0".equals(obj)) {
                    return new C16984euI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_defi_wallet_tx_detail_content_detail is invalid. Received: " + obj);
            case 278:
                if ("layout/layout_item_defi_wallet_tx_detail_content_network_fee_0".equals(obj)) {
                    return new C16990euO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_defi_wallet_tx_detail_content_network_fee is invalid. Received: " + obj);
            case 279:
                if ("layout/layout_item_defi_wallet_tx_detail_content_normal_0".equals(obj)) {
                    return new C16989euN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_defi_wallet_tx_detail_content_normal is invalid. Received: " + obj);
            case 280:
                if ("layout/layout_item_multi_coin_approve_0".equals(obj)) {
                    return new C16995euT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_multi_coin_approve is invalid. Received: " + obj);
            case 281:
                if ("layout/layout_item_tx_detail_include_assets_0".equals(obj)) {
                    return new C16999euX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_tx_detail_include_assets is invalid. Received: " + obj);
            case 282:
                if ("layout/layout_item_tx_detail_plus_place_holder_0".equals(obj)) {
                    return new C17056evb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_tx_detail_plus_place_holder is invalid. Received: " + obj);
            case 283:
                if ("layout/layout_item_tx_detail_top_coin_0".equals(obj)) {
                    return new C17061evg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_tx_detail_top_coin is invalid. Received: " + obj);
            case 284:
                if ("layout/layout_item_tx_detail_top_coin_authorization_0".equals(obj)) {
                    return new C17060evf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_tx_detail_top_coin_authorization is invalid. Received: " + obj);
            case 285:
                if ("layout/layout_item_tx_detail_top_dapp_0".equals(obj)) {
                    return new C17063evi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_tx_detail_top_dapp is invalid. Received: " + obj);
            case 286:
                if ("layout/layout_item_tx_detail_top_nft_0".equals(obj)) {
                    return new C17062evh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_tx_detail_top_nft is invalid. Received: " + obj);
            case 287:
                if ("layout/layout_item_tx_detail_top_nft_authorization_0".equals(obj)) {
                    return new C17066evl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_tx_detail_top_nft_authorization is invalid. Received: " + obj);
            case 288:
                if ("layout/layout_multi_select_send_address_item_0".equals(obj)) {
                    return new C17069evo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_multi_select_send_address_item is invalid. Received: " + obj);
            case 289:
                if ("layout/layout_multi_sign_list_0".equals(obj)) {
                    return new C17072evr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_multi_sign_list is invalid. Received: " + obj);
            case 290:
                if ("layout/layout_multi_transfer_result_0".equals(obj)) {
                    return new C17073evs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_multi_transfer_result is invalid. Received: " + obj);
            case 291:
                if ("layout/layout_network_fees_0".equals(obj)) {
                    return new C17074evt(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_network_fees is invalid. Received: " + obj);
            case 292:
                if ("layout/layout_recover_cedefi_access_activity_0".equals(obj)) {
                    return new C17077evw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_recover_cedefi_access_activity is invalid. Received: " + obj);
            case 293:
                if ("layout/layout_recover_cedefi_wallet_detail_activity_0".equals(obj)) {
                    return new C17080evz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_recover_cedefi_wallet_detail_activity is invalid. Received: " + obj);
            case 294:
                if ("layout/layout_send_coin_fee_custom_item_0".equals(obj)) {
                    return new C17033evE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_send_coin_fee_custom_item is invalid. Received: " + obj);
            case 295:
                if ("layout/layout_tee_time_selection_bottom_sheet_0".equals(obj)) {
                    return new C17035evG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_tee_time_selection_bottom_sheet is invalid. Received: " + obj);
            case 296:
                if ("layout/layout_transaction_detail_send_editable_data_new_0".equals(obj)) {
                    return new C17037evI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_transaction_detail_send_editable_data_new is invalid. Received: " + obj);
            case 297:
                if ("layout/layout_transaction_memo_new_0".equals(obj)) {
                    return new C17041evM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_transaction_memo_new is invalid. Received: " + obj);
            case 298:
                if ("layout/layout_transaction_reminder_0".equals(obj)) {
                    return new C17042evN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_transaction_reminder is invalid. Received: " + obj);
            case 299:
                if ("layout/layout_transfer_pay_with_coin_0".equals(obj)) {
                    return new C17049evU(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_transfer_pay_with_coin is invalid. Received: " + obj);
            case 300:
                if ("layout/layout_tx_detail_assets_expand_0".equals(obj)) {
                    return new C17046evR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_tx_detail_assets_expand is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding gEmmrt(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 301:
                if ("layout/layout_tx_detail_include_assets_0".equals(obj)) {
                    return new C17053evY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_tx_detail_include_assets is invalid. Received: " + obj);
            case 302:
                if ("layout/layout_usdg_rewards_0".equals(obj)) {
                    return new C17051evW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_usdg_rewards is invalid. Received: " + obj);
            case 303:
                if ("layout/layout_view_memo_read_only_0".equals(obj)) {
                    return new C17112ewe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_view_memo_read_only is invalid. Received: " + obj);
            case 304:
                if ("layout/layout_wallet_tx_detail_address_list_copy_0".equals(obj)) {
                    return new C17113ewf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_wallet_tx_detail_address_list_copy is invalid. Received: " + obj);
            case 305:
                if ("layout/view_coin_current_price_ratio_0".equals(obj)) {
                    return new C17126ews(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_coin_current_price_ratio is invalid. Received: " + obj);
            case 306:
                if ("layout/view_coin_detail_current_price_0".equals(obj)) {
                    return new C17128ewu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_coin_detail_current_price is invalid. Received: " + obj);
            case 307:
                if ("layout/view_coin_detail_header_0".equals(obj)) {
                    return new C17131ewx(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_coin_detail_header is invalid. Received: " + obj);
            case 308:
                if ("layout/view_coin_detail_trade_pnl_0".equals(obj)) {
                    return new C17129ewv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_coin_detail_trade_pnl is invalid. Received: " + obj);
            case 309:
                if ("layout/view_dapp_interaction_item_fee_0".equals(obj)) {
                    return new C17083ewB(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_dapp_interaction_item_fee is invalid. Received: " + obj);
            case 310:
                if ("layout/view_defi_history_view_more_layout_0".equals(obj)) {
                    return new C17085ewD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_defi_history_view_more_layout is invalid. Received: " + obj);
            case 311:
                if ("layout/view_defi_loading_layout_0".equals(obj)) {
                    return new C17087ewF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_defi_loading_layout is invalid. Received: " + obj);
            case 312:
                if ("layout/view_defi_withdrawal_loading_layout_0".equals(obj)) {
                    return new C17091ewJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_defi_withdrawal_loading_layout is invalid. Received: " + obj);
            case 313:
                if ("layout/view_exchange_assets_title_item_0".equals(obj)) {
                    return new C17096ewO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_exchange_assets_title_item is invalid. Received: " + obj);
            case 314:
                if ("layout/view_exchange_not_any_crypto_or_network_0".equals(obj)) {
                    return new C17097ewP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_exchange_not_any_crypto_or_network is invalid. Received: " + obj);
            case 315:
                if ("layout/view_home_chart_status_0".equals(obj)) {
                    return new C17100ewS(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_home_chart_status is invalid. Received: " + obj);
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                if ("layout/view_home_expand_kline_0".equals(obj)) {
                    return new C17101ewT(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_home_expand_kline is invalid. Received: " + obj);
            case TypedValues.AttributesType.TYPE_EASING /* 317 */:
                if ("layout/view_search_bar_0".equals(obj)) {
                    return new C17104ewW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_search_bar is invalid. Received: " + obj);
            case TypedValues.AttributesType.TYPE_PIVOT_TARGET /* 318 */:
                if ("layout/view_wallet_load_fail_0".equals(obj)) {
                    return new C17107ewZ(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_wallet_load_fail is invalid. Received: " + obj);
            case 319:
                if ("layout/view_wallet_no_data_0".equals(obj)) {
                    return new C17163exc(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_wallet_no_data is invalid. Received: " + obj);
            case 320:
                if ("layout/view_wallet_pnl_list_0".equals(obj)) {
                    return new C17166exf(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_wallet_pnl_list is invalid. Received: " + obj);
            case 321:
                if ("layout/wallet_preferences_normal_item_0".equals(obj)) {
                    return new C17181exu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for wallet_preferences_normal_item is invalid. Received: " + obj);
            case 322:
                if ("layout/wallet_security_item_switch_view_0".equals(obj)) {
                    return new C17186exz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for wallet_security_item_switch_view is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = copydefault.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch ((i2 - 1) / 50) {
            case 0:
                return EZpvd(dataBindingComponent, view, i2, tag);
            case 1:
                return copydefault(dataBindingComponent, view, i2, tag);
            case 2:
                return KWHzl(dataBindingComponent, view, i2, tag);
            case 3:
                return OLrzqt(dataBindingComponent, view, i2, tag);
            case 4:
                return AEQbTJ(dataBindingComponent, view, i2, tag);
            case 5:
                return AhwBna(dataBindingComponent, view, i2, tag);
            case 6:
                return gEmmrt(dataBindingComponent, view, i2, tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr == null || viewArr.length == 0 || (i2 = copydefault.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 249) {
            if ("layout/layout_defi_asset_allocation_view_0".equals(tag)) {
                return new C16967ets(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for layout_defi_asset_allocation_view is invalid. Received: " + tag);
        }
        if (i2 == 252) {
            if ("layout/layout_defi_profile_pnl_analysis_0".equals(tag)) {
                return new C16923etA(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for layout_defi_profile_pnl_analysis is invalid. Received: " + tag);
        }
        if (i2 == 291) {
            if ("layout/layout_network_fees_0".equals(tag)) {
                return new C17074evt(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for layout_network_fees is invalid. Received: " + tag);
        }
        if (i2 == 299) {
            if ("layout/layout_transfer_pay_with_coin_0".equals(tag)) {
                return new C17049evU(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for layout_transfer_pay_with_coin is invalid. Received: " + tag);
        }
        if (i2 == 307) {
            if ("layout/view_coin_detail_header_0".equals(tag)) {
                return new C17131ewx(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_coin_detail_header is invalid. Received: " + tag);
        }
        if (i2 == 309) {
            if ("layout/view_dapp_interaction_item_fee_0".equals(tag)) {
                return new C17083ewB(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_dapp_interaction_item_fee is invalid. Received: " + tag);
        }
        if (i2 == 315) {
            if ("layout/view_home_chart_status_0".equals(tag)) {
                return new C17100ewS(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_home_chart_status is invalid. Received: " + tag);
        }
        if (i2 == 316) {
            if ("layout/view_home_expand_kline_0".equals(tag)) {
                return new C17101ewT(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_home_expand_kline is invalid. Received: " + tag);
        }
        switch (i2) {
            case TypedValues.AttributesType.TYPE_PIVOT_TARGET /* 318 */:
                if ("layout/view_wallet_load_fail_0".equals(tag)) {
                    return new C17107ewZ(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for view_wallet_load_fail is invalid. Received: " + tag);
            case 319:
                if ("layout/view_wallet_no_data_0".equals(tag)) {
                    return new C17163exc(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for view_wallet_no_data is invalid. Received: " + tag);
            case 320:
                if ("layout/view_wallet_pnl_list_0".equals(tag)) {
                    return new C17166exf(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for view_wallet_pnl_list is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = Activity.AEQbTJ.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Application.EZpvd.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.chart.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3.security.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class Application {
        public static final SparseArray<String> EZpvd;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(29);
            EZpvd = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "addressFormatCheck");
            sparseArray.put(3, "addressStrRes");
            sparseArray.put(4, "addressUtils");
            sparseArray.put(5, "baseData");
            sparseArray.put(6, "coinBean");
            sparseArray.put(7, "dataHolder");
            sparseArray.put(8, "divider");
            sparseArray.put(9, EopTrackEvent.KEY_ENTRANCE);
            sparseArray.put(10, "faqItem");
            sparseArray.put(11, "hiddenBean");
            sparseArray.put(12, "imageTypes");
            sparseArray.put(13, "isChecked");
            sparseArray.put(14, "item");
            sparseArray.put(15, "itemData");
            sparseArray.put(16, "keystoneAccountInfo");
            sparseArray.put(17, "label");
            sparseArray.put(18, "leftButton");
            sparseArray.put(19, "model");
            sparseArray.put(20, "privateKeyInfo");
            sparseArray.put(21, "rightButton");
            sparseArray.put(22, "selectCoinTitle");
            sparseArray.put(23, "showCloseButton");
            sparseArray.put(24, "singelButton");
            sparseArray.put(25, "title");
            sparseArray.put(26, "totalValueStrRes");
            sparseArray.put(27, "txPendingData");
            sparseArray.put(28, "viewModel");
        }
    }

    public static class Activity {
        public static final HashMap<String, Integer> AEQbTJ;

        private Activity() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(322);
            AEQbTJ = map;
            map.put("layout/activity_add_custom_network_0", Integer.valueOf(C13754dXa.TaskDescription.copydefault));
            map.put("layout/activity_approve_detail_0", Integer.valueOf(C13754dXa.TaskDescription.OLrzqt));
            map.put("layout/activity_approve_risky_detail_0", Integer.valueOf(C13754dXa.TaskDescription.EZpvd));
            map.put("layout/activity_backup_wallet_animation_tip_0", Integer.valueOf(C13754dXa.TaskDescription.KWHzl));
            map.put("layout/activity_backup_wallet_list_0", Integer.valueOf(C13754dXa.TaskDescription.gEmmrt));
            map.put("layout/activity_bind_cefi_select_wallet_0", Integer.valueOf(C13754dXa.TaskDescription.AYXKKw));
            map.put("layout/activity_brc20_send_0", Integer.valueOf(C13754dXa.TaskDescription.AhwBna));
            map.put("layout/activity_btc_address_format_aggregation_0", Integer.valueOf(C13754dXa.TaskDescription.valueOf));
            map.put("layout/activity_coin_detail_0", Integer.valueOf(C13754dXa.TaskDescription.values));
            map.put("layout/activity_custom_network_0", Integer.valueOf(C13754dXa.TaskDescription.fARcdN));
            map.put("layout/activity_debug_export_nostr_0", Integer.valueOf(C13754dXa.TaskDescription.uzCIH));
            map.put("layout/activity_decode_transaction_0", Integer.valueOf(C13754dXa.TaskDescription.iwGUEr));
            map.put("layout/activity_defi_coin_info_0", Integer.valueOf(C13754dXa.TaskDescription.hDKMBd));
            map.put("layout/activity_defi_forgot_password_tip_0", Integer.valueOf(C13754dXa.TaskDescription.getFieldNames));
            map.put("layout/activity_defi_hd_wallet_cloud_backup_result_0", Integer.valueOf(C13754dXa.TaskDescription.zLjUOn));
            map.put("layout/activity_defi_wallet_account_address_0", Integer.valueOf(C13754dXa.TaskDescription.AubY));
            map.put("layout/activity_defi_wallet_account_list_0", Integer.valueOf(C13754dXa.TaskDescription.zsXlph));
            map.put("layout/activity_defi_wallet_batch_create_account_0", Integer.valueOf(C13754dXa.TaskDescription.wlaJM));
            map.put("layout/activity_defi_wallet_batch_create_account_animation_0", Integer.valueOf(C13754dXa.TaskDescription.zuBGHE));
            map.put("layout/activity_defi_wallet_bind_smart_account_information_0", Integer.valueOf(C13754dXa.TaskDescription.gHZMYf));
            map.put("layout/activity_defi_wallet_connected_list_0", Integer.valueOf(C13754dXa.TaskDescription.AxsJAY));
            map.put("layout/activity_defi_wallet_custom_tx_detail_transaction_item_0", Integer.valueOf(C13754dXa.TaskDescription.sSMYrx));
            map.put("layout/activity_defi_wallet_detail_0", Integer.valueOf(C13754dXa.TaskDescription.AwvSrB));
            map.put("layout/activity_defi_wallet_pnl_token_0", Integer.valueOf(C13754dXa.TaskDescription.QKVWgx));
            map.put("layout/activity_defi_wallet_set_google_drive_password_0", Integer.valueOf(C13754dXa.TaskDescription.QOLQEE));
            map.put("layout/activity_defi_wallet_set_password_0", Integer.valueOf(C13754dXa.TaskDescription.DTwDnp));
            map.put("layout/activity_defi_wallet_transfer_common_0", Integer.valueOf(C13754dXa.TaskDescription.QfsBiF));
            map.put("layout/activity_defi_wallet_tx_detail_0", Integer.valueOf(C13754dXa.TaskDescription.QbewEr));
            map.put("layout/activity_defi_wallet_verify_google_drive_password_0", Integer.valueOf(C13754dXa.TaskDescription.RJOkX));
            map.put("layout/activity_eip7702_onboarding_0", Integer.valueOf(C13754dXa.TaskDescription.QVAiDq));
            map.put("layout/activity_eos_account_0", Integer.valueOf(C13754dXa.TaskDescription.RcXXUw));
            map.put("layout/activity_escape_mpc_wallet_account_list_0", Integer.valueOf(C13754dXa.TaskDescription.djSkpj));
            map.put("layout/activity_escape_urgent_enter_0", Integer.valueOf(C13754dXa.TaskDescription.dNCPSb));
            map.put("layout/activity_first_backup_wallet_tip_0", Integer.valueOf(C13754dXa.TaskDescription.aKErDB));
            map.put("layout/activity_hardware_wallet_bluetooth_device_matching_0", Integer.valueOf(C13754dXa.TaskDescription.dxcTrN));
            map.put("layout/activity_hardware_wallet_bluetooth_error_0", Integer.valueOf(C13754dXa.TaskDescription.fZBcTu));
            map.put("layout/activity_hardware_wallet_bluetooth_scan_0", Integer.valueOf(C13754dXa.TaskDescription.dvKsVJ));
            map.put("layout/activity_hardware_wallet_evm_network_0", Integer.valueOf(C13754dXa.TaskDescription.flVtFt));
            map.put("layout/activity_hardware_wallet_select_address_0", Integer.valueOf(C13754dXa.TaskDescription.gasjUx));
            map.put("layout/activity_hardware_wallet_select_connect_type_0", Integer.valueOf(C13754dXa.TaskDescription.giSNqX));
            map.put("layout/activity_hardware_wallet_select_network_0", Integer.valueOf(C13754dXa.TaskDescription.hUfVAv));
            map.put("layout/activity_icloud_list_0", Integer.valueOf(C13754dXa.TaskDescription.gkJEwt));
            map.put("layout/activity_icloud_network_list_0", Integer.valueOf(C13754dXa.TaskDescription.iRxXKY));
            map.put("layout/activity_keystone_select_account_0", Integer.valueOf(C13754dXa.TaskDescription.RlQdEF));
            map.put("layout/activity_mpc_wallet_backup_tip_0", Integer.valueOf(C13754dXa.TaskDescription.AxsJAYsNCnLh));
            map.put("layout/activity_mpcscan_result_0", Integer.valueOf(C13754dXa.TaskDescription.QKudOq));
            map.put("layout/activity_mpcwallet_qrcode_0", Integer.valueOf(C13754dXa.TaskDescription.accept));
            map.put("layout/activity_multi_transfer_input_memo_0", Integer.valueOf(C13754dXa.TaskDescription.DarRvM));
            map.put("layout/activity_new_defi_wallet_history_0", Integer.valueOf(C13754dXa.TaskDescription.ODWQjV));
            map.put("layout/activity_okw_add_custom_chain_0", Integer.valueOf(C13754dXa.TaskDescription.DCJXGO));
            map.put("layout/activity_okw_add_custom_chain_tokens_0", Integer.valueOf(C13754dXa.TaskDescription.DXXBbs));
            map.put("layout/activity_okw_multi_transfer_result_0", Integer.valueOf(C13754dXa.TaskDescription.ffGIBT));
            map.put("layout/activity_phrase_and_private_key_input_password_0", Integer.valueOf(C13754dXa.TaskDescription.DCUTEI));
            map.put("layout/activity_profile_asset_tx_detail_0", Integer.valueOf(C13754dXa.TaskDescription.getPostValueLengthLimit));
            map.put("layout/activity_profile_portfolio_details_0", Integer.valueOf(C13754dXa.TaskDescription.OuxcSI));
            map.put("layout/activity_re_new_enable_0", Integer.valueOf(C13754dXa.TaskDescription.zuWLRA));
            map.put("layout/activity_receive_coin_qr_code_0", Integer.valueOf(C13754dXa.TaskDescription.QkdxfA));
            map.put("layout/activity_securit_model_0", Integer.valueOf(C13754dXa.TaskDescription.RKDWNf));
            map.put("layout/activity_select_coin_0", Integer.valueOf(C13754dXa.TaskDescription.OBJEWx));
            map.put("layout/activity_select_withdrawal_coin_0", Integer.valueOf(C13754dXa.TaskDescription.dmfpNf));
            map.put("layout/activity_select_withdrawal_network_0", Integer.valueOf(C13754dXa.TaskDescription.gwTjWJ));
            map.put("layout/activity_transaction_add_custom_network_0", Integer.valueOf(C13754dXa.TaskDescription.ODXsMY));
            map.put("layout/activity_transaction_add_token_0", Integer.valueOf(C13754dXa.TaskDescription.OFhtUX));
            map.put("layout/activity_wallet_debug_list_0", Integer.valueOf(C13754dXa.TaskDescription.QVsKAR));
            map.put("layout/activity_wallet_edit_0", Integer.valueOf(C13754dXa.TaskDescription.OJuSTm));
            map.put("layout/activity_wallet_manage_0", Integer.valueOf(C13754dXa.TaskDescription.QwvEab));
            map.put("layout/activity_wallet_mine_0", Integer.valueOf(C13754dXa.TaskDescription.dUDNAs));
            map.put("layout/activity_wallet_mpc_backup_privatekey_0", Integer.valueOf(C13754dXa.TaskDescription.aUsmxb));
            map.put("layout/activity_wallet_mpc_escape_list_0", Integer.valueOf(C13754dXa.TaskDescription.USBtdM));
            map.put("layout/activity_wallet_multi_transfer_input_address_0", Integer.valueOf(C13754dXa.TaskDescription.UlJrfe));
            map.put("layout/activity_wallet_multi_transfer_interval_0", Integer.valueOf(C13754dXa.TaskDescription.fdOvFl));
            map.put("layout/activity_wallet_password_0", Integer.valueOf(C13754dXa.TaskDescription.igXuih));
            map.put("layout/activity_wallet_recently_removed_coin_0", Integer.valueOf(C13754dXa.TaskDescription.fjfviF));
            map.put("layout/address_book_layout_network_selection_bottom_sheet_0", Integer.valueOf(C13754dXa.TaskDescription.spnCvw));
            map.put("layout/appbar_select_coin_0", Integer.valueOf(C13754dXa.TaskDescription.call));
            map.put("layout/bottom_sheet_bind_add_wallet_guide_0", Integer.valueOf(C13754dXa.TaskDescription.DCUTEIddSDPG));
            map.put("layout/bottom_sheet_bind_redirect_0", Integer.valueOf(C13754dXa.TaskDescription.KDccX));
            map.put("layout/bottom_sheet_bind_select_okx_app_0", Integer.valueOf(C13754dXa.TaskDescription.DcqEDu));
            map.put("layout/bottom_sheet_wallet_bind_confirm_0", Integer.valueOf(C13754dXa.TaskDescription.DWgRXt));
            map.put("layout/dfragment_address_format_content_default_0", Integer.valueOf(C13754dXa.TaskDescription.DaRZkR));
            map.put("layout/dfragment_address_format_item_default_0", Integer.valueOf(C13754dXa.TaskDescription.DNMMPQ));
            map.put("layout/dfragment_btc_address_aggregation_normal_item_0", Integer.valueOf(C13754dXa.TaskDescription.OTwTPd));
            map.put("layout/dfragment_btc_address_format_aggregation_content_0", Integer.valueOf(C13754dXa.TaskDescription.QXDzTk));
            map.put("layout/dfragment_cancel_tx_0", Integer.valueOf(C13754dXa.TaskDescription.QDqgQU));
            map.put("layout/dfragment_defi_bottom_sheet_sub_tx_base_0", Integer.valueOf(C13754dXa.TaskDescription.RVsVBY));
            map.put("layout/dfragment_defi_create_wallet_loading_0", Integer.valueOf(C13754dXa.TaskDescription.RXzakW));
            map.put("layout/dfragment_exchange_account_0", Integer.valueOf(C13754dXa.TaskDescription.Ufzxmz));
            map.put("layout/dfragment_mpc_escape_backup_success_0", Integer.valueOf(C13754dXa.TaskDescription.ULRxlR));
            map.put("layout/dfragment_mpc_escape_success_item_0", Integer.valueOf(C13754dXa.TaskDescription.TarCU));
            map.put("layout/dfragment_profile_filter_activity_0", Integer.valueOf(C13754dXa.TaskDescription.UhxbNG));
            map.put("layout/dfragment_profile_filter_risky_token_0", Integer.valueOf(C13754dXa.TaskDescription.aHXSQp));
            map.put("layout/dfragment_speed_up_tx_0", Integer.valueOf(C13754dXa.TaskDescription.alsFma));
            map.put("layout/dfragment_speed_up_tx_content_0", Integer.valueOf(C13754dXa.TaskDescription.UscePu));
            map.put("layout/dfragment_speed_up_tx_header_0", Integer.valueOf(C13754dXa.TaskDescription.aJFbMH));
            map.put("layout/dfragment_speed_up_tx_item_0", Integer.valueOf(C13754dXa.TaskDescription.akftKQ));
            map.put("layout/dialog_finger_print_verify_0", Integer.valueOf(C13754dXa.TaskDescription.fXHmeK));
            map.put("layout/dialog_fragment_aa_rechange_tips_0", Integer.valueOf(C13754dXa.TaskDescription.apNbdB));
            map.put("layout/dialog_fragment_chain_update_0", Integer.valueOf(C13754dXa.TaskDescription.gSBher));
            map.put("layout/dialog_fragment_multipl_rpc_url_choose_0", Integer.valueOf(C13754dXa.TaskDescription.hlkKmr));
            map.put("layout/dialog_fragment_smart_wallet_chain_info_0", Integer.valueOf(C13754dXa.TaskDescription.hvKCwS));
            map.put("layout/dialog_fragment_switch_currency_0", Integer.valueOf(C13754dXa.TaskDescription.sVXHln));
            map.put("layout/fg_wallet_kline_0", Integer.valueOf(C13754dXa.TaskDescription.zKcAg));
            map.put("layout/fragment_aa_network_fee_0", Integer.valueOf(C13754dXa.TaskDescription.tIwhY));
            map.put("layout/fragment_aa_network_fee_select_crypto_0", Integer.valueOf(C13754dXa.TaskDescription.zOIQXb));
            map.put("layout/fragment_approve_coin_amt_0", Integer.valueOf(C13754dXa.TaskDescription.zhUgOk));
            map.put("layout/fragment_approve_malicious_risky_0", Integer.valueOf(C13754dXa.TaskDescription.getPriority));
            map.put("layout/fragment_brc20_transfer_0", Integer.valueOf(C13754dXa.TaskDescription.DGUQLIOvDItG));
            map.put("layout/fragment_btc_asset_tip_0", Integer.valueOf(C13754dXa.TaskDescription.DGUQLIDGUQLI));
            map.put("layout/fragment_chain_update_coin_detail_0", Integer.valueOf(C13754dXa.TaskDescription.getLabel));
            map.put("layout/fragment_choose_network_dialog_0", Integer.valueOf(C13754dXa.TaskDescription.fBE));
            map.put("layout/fragment_coin_detail_empty_0", Integer.valueOf(C13754dXa.TaskDescription.DIIpTV));
            map.put("layout/fragment_coin_detail_new_0", Integer.valueOf(C13754dXa.TaskDescription.DUUtXg));
            map.put("layout/fragment_coin_detail_profile_asset_0", Integer.valueOf(C13754dXa.TaskDescription.DSiOMJ));
            map.put("layout/fragment_coin_overview_0", Integer.valueOf(C13754dXa.TaskDescription.DGUQLIhJrIAr));
            map.put("layout/fragment_custom_coin_detail_0", Integer.valueOf(C13754dXa.TaskDescription.awiJhF));
            map.put("layout/fragment_defi_approve_manager_0", Integer.valueOf(C13754dXa.TaskDescription.dzCpvv));
            map.put("layout/fragment_defi_choose_escape_cloud_type_0", Integer.valueOf(C13754dXa.TaskDescription.YqksP));
            map.put("layout/fragment_defi_wallet_multi_select_receive_address_0", Integer.valueOf(C13754dXa.TaskDescription.DKtBnz));
            map.put("layout/fragment_defi_wallet_multi_select_send_address_0", Integer.valueOf(C13754dXa.TaskDescription.fGQ));
            map.put("layout/fragment_defi_wallet_profile_asset_detail_0", Integer.valueOf(C13754dXa.TaskDescription.DLGVGj));
            map.put("layout/fragment_dialog_aa_free_gas_tips_0", Integer.valueOf(C13754dXa.TaskDescription.DrNnAm));
            map.put("layout/fragment_dialog_change_evm_derive_address_layout_0", Integer.valueOf(C13754dXa.TaskDescription.DPHsZd));
            map.put("layout/fragment_dialog_repeat_order_tip_0", Integer.valueOf(C13754dXa.TaskDescription.DPHNDa));
            map.put("layout/fragment_hardware_wallet_bluetooth_confirm_send_0", Integer.valueOf(C13754dXa.TaskDescription.geLlBI));
            map.put("layout/fragment_invest_utxo_confirmation_0", Integer.valueOf(C13754dXa.TaskDescription.Swccd));
            map.put("layout/fragment_layover_trade_dialog_0", Integer.valueOf(C13754dXa.TaskDescription.reset));
            map.put("layout/fragment_mpc_restore_0", Integer.valueOf(C13754dXa.TaskDescription.zLAIeZ));
            map.put("layout/fragment_multi_coin_approve_0", Integer.valueOf(C13754dXa.TaskDescription.DQzvGN));
            map.put("layout/fragment_multi_transfer_set_amount_0", Integer.valueOf(C13754dXa.TaskDescription.gdmIOq));
            map.put("layout/fragment_multi_transfer_set_interval_0", Integer.valueOf(C13754dXa.TaskDescription.DQzvGNdrmXxu));
            map.put("layout/fragment_my_wallets_0", Integer.valueOf(C13754dXa.TaskDescription.isReflectionWorking));
            map.put("layout/fragment_network_fee_0", Integer.valueOf(C13754dXa.TaskDescription.fXYAwm));
            map.put("layout/fragment_okw_escape_bind_account_detail_0", Integer.valueOf(C13754dXa.TaskDescription.DQzvGNdrmXxudrmXxu));
            map.put("layout/fragment_okw_escape_bind_account_list_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJK));
            map.put("layout/fragment_okw_set_approve_amount_0", Integer.valueOf(C13754dXa.TaskDescription.DTeKQX));
            map.put("layout/fragment_okw_transaction_0", Integer.valueOf(C13754dXa.TaskDescription.RIuxYh));
            map.put("layout/fragment_receive_coin_qr_code_0", Integer.valueOf(C13754dXa.TaskDescription.RbVjfb));
            map.put("layout/fragment_recover_over_limit_0", Integer.valueOf(C13754dXa.TaskDescription.RZNAhV));
            map.put("layout/fragment_select_coin_0", Integer.valueOf(C13754dXa.TaskDescription.RqmePg));
            map.put("layout/fragment_select_coin_search_0", Integer.valueOf(C13754dXa.TaskDescription.ggKfIT));
            map.put("layout/fragment_set_amount_base_0", Integer.valueOf(C13754dXa.TaskDescription.invokespecialROgMPW));
            map.put("layout/fragment_sign_dapp_0", Integer.valueOf(C13754dXa.TaskDescription.invokespecialDaTmkG));
            map.put("layout/fragment_similar_address_tip_0", Integer.valueOf(C13754dXa.TaskDescription.iqMDAV));
            map.put("layout/fragment_simple_btc_address_0", Integer.valueOf(C13754dXa.TaskDescription.invokespecialDPHOMC));
            map.put("layout/fragment_transfer_select_coin_0", Integer.valueOf(C13754dXa.TaskDescription.invokespecialRtjmuc));
            map.put("layout/fragment_types_select_0", Integer.valueOf(C13754dXa.TaskDescription.invokespecialaKhcqp));
            map.put("layout/fragment_wallet_account_address_0", Integer.valueOf(C13754dXa.TaskDescription.invokespecialhlXVux));
            map.put("layout/fragment_wallet_manage_list_new_0", Integer.valueOf(C13754dXa.TaskDescription.invokespecialsiEkQe));
            map.put("layout/fragment_wallet_recently_removed_coin_0", Integer.valueOf(C13754dXa.TaskDescription.DaTmkG));
            map.put("layout/fragment_wallet_tee_service_upgrade_0", Integer.valueOf(C13754dXa.TaskDescription.atDTRm));
            map.put("layout/fragment_wallet_trade_history_0", Integer.valueOf(C13754dXa.TaskDescription.dIjzlO));
            map.put("layout/item_add_new_network_0", Integer.valueOf(C13754dXa.TaskDescription.deregisterUser));
            map.put("layout/item_all_chain_0", Integer.valueOf(C13754dXa.TaskDescription.hlXVux));
            map.put("layout/item_approve_manager_0", Integer.valueOf(C13754dXa.TaskDescription.init));
            map.put("layout/item_approve_risky_token_0", Integer.valueOf(C13754dXa.TaskDescription.hOMIpD));
            map.put("layout/item_approve_risky_token_group_0", Integer.valueOf(C13754dXa.TaskDescription.processStrongAuthMessage));
            map.put("layout/item_approve_token_0", Integer.valueOf(C13754dXa.TaskDescription.profile));
            map.put("layout/item_approve_token_group_0", Integer.valueOf(C13754dXa.TaskDescription.scanPackages));
            map.put("layout/item_brc_data_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJKDCKfqP));
            map.put("layout/item_brc_inscribe_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJKDCKfqPDCfLja));
            map.put("layout/item_btc_multi_sign_0", Integer.valueOf(C13754dXa.TaskDescription.fmB));
            map.put("layout/item_btc_utx_info_0", Integer.valueOf(C13754dXa.TaskDescription.DMb));
            map.put("layout/item_btc_xrc_asset_info_0", Integer.valueOf(C13754dXa.TaskDescription.onComplete));
            map.put("layout/item_change_evm_derive_address_layout_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJKDDUqPf));
            map.put("layout/item_chart_status_error_0", Integer.valueOf(C13754dXa.TaskDescription.sbu));
            map.put("layout/item_chart_status_loading_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJKDGTeJD));
            map.put("layout/item_cloud_backup_address_0", Integer.valueOf(C13754dXa.TaskDescription.sendBehavioSecData));
            map.put("layout/item_cloud_backup_address_evm_0", Integer.valueOf(C13754dXa.TaskDescription.cancel));
            map.put("layout/item_coin_overview_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJKOmnske));
            map.put("layout/item_coin_tx_history_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJKDcMfJK));
            map.put("layout/item_coin_tx_history_header_0", Integer.valueOf(C13754dXa.TaskDescription.sCB));
            map.put("layout/item_coin_tx_history_pending_0", Integer.valueOf(C13754dXa.TaskDescription.jh));
            map.put("layout/item_common_head_0", Integer.valueOf(C13754dXa.TaskDescription.getStatusCode));
            map.put("layout/item_custom_select_network_0", Integer.valueOf(C13754dXa.TaskDescription.fcfzuX));
            map.put("layout/item_debug_nostr_divider_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJKdMCrTj));
            map.put("layout/item_debug_nostr_root_wallet_0", Integer.valueOf(C13754dXa.TaskDescription.fbC));
            map.put("layout/item_debug_nostr_wallet_0", Integer.valueOf(C13754dXa.TaskDescription.DcMfJKfNUfqk));
            map.put("layout/item_defi_edit_wallet_name_0", Integer.valueOf(C13754dXa.TaskDescription.getAdvertisingId));
            map.put("layout/item_defi_home_crypto_read_article_0", Integer.valueOf(C13754dXa.TaskDescription.DlABUU));
            map.put("layout/item_defi_home_nft_collection_0", Integer.valueOf(C13754dXa.TaskDescription.abAflu));
            map.put("layout/item_defi_home_wallet_0", Integer.valueOf(C13754dXa.TaskDescription.DxnCrt));
            map.put("layout/item_defi_home_wallet_escape_bind_entrance_0", Integer.valueOf(C13754dXa.TaskDescription.DwQSDd));
            map.put("layout/item_defi_home_wallet_hidden_asset_header_0", Integer.valueOf(C13754dXa.TaskDescription.DzkRMH));
            map.put("layout/item_defi_home_yield_0", Integer.valueOf(C13754dXa.TaskDescription.fiXcQa));
            map.put("layout/item_defi_root_wallet_backup_0", Integer.valueOf(C13754dXa.TaskDescription.gGNlxh));
            map.put("layout/item_defi_select_network_for_wallet_0", Integer.valueOf(C13754dXa.TaskDescription.hNurIN));
            map.put("layout/item_eip_7702_network_0", Integer.valueOf(C13754dXa.TaskDescription.DFbvW));
            map.put("layout/item_faq_0", Integer.valueOf(C13754dXa.TaskDescription.FQMcgE));
            map.put("layout/item_hardware_evm_network_0", Integer.valueOf(C13754dXa.TaskDescription.dPkBzA));
            map.put("layout/item_hardware_expand_collapse_0", Integer.valueOf(C13754dXa.TaskDescription.gqOnQv));
            map.put("layout/item_hidden_asset_0", Integer.valueOf(C13754dXa.TaskDescription.FQMcgEfQMcgE));
            map.put("layout/item_inputs_outputs_utxo_info_0", Integer.valueOf(C13754dXa.TaskDescription.zEHIKV));
            map.put("layout/item_inputs_outputs_xrc_asset_info_0", Integer.valueOf(C13754dXa.TaskDescription.zDGrpR));
            map.put("layout/item_invest_utxo_confirmation_token_info_0", Integer.valueOf(C13754dXa.TaskDescription.clearRegistrations));
            map.put("layout/item_invest_utxo_confirmation_token_nft_info_0", Integer.valueOf(C13754dXa.TaskDescription.sIqKDg));
            map.put("layout/item_keystone_select_account_0", Integer.valueOf(C13754dXa.TaskDescription.FQNKFG));
            map.put("layout/item_keystone_select_account_header_0", Integer.valueOf(C13754dXa.TaskDescription.v));
            map.put("layout/item_multi_select_send_account_0", Integer.valueOf(C13754dXa.TaskDescription.DuXjdv));
            map.put("layout/item_multi_send_board_0", Integer.valueOf(C13754dXa.TaskDescription.NRYds));
            map.put("layout/item_multi_send_board_question_0", Integer.valueOf(C13754dXa.TaskDescription.UJEglR));
            map.put("layout/item_multi_transfer_result_0", Integer.valueOf(C13754dXa.TaskDescription.fMBJsc));
            map.put("layout/item_my_wallet_major_0", Integer.valueOf(C13754dXa.TaskDescription.hbZCHz));
            map.put("layout/item_network_fee_0", Integer.valueOf(C13754dXa.TaskDescription.gbIfDn));
            map.put("layout/item_network_fee_custom_0", Integer.valueOf(C13754dXa.TaskDescription.FhERFw));
            map.put("layout/item_network_fee_select_crypto_0", Integer.valueOf(C13754dXa.TaskDescription.Dfm));
            map.put("layout/item_nft_collection_item_0", Integer.valueOf(C13754dXa.TaskDescription.sYcwUD));
            map.put("layout/item_nft_history_0", Integer.valueOf(C13754dXa.TaskDescription.GCXiNH));
            map.put("layout/item_okw_escape_bind_account_asset_0", Integer.valueOf(C13754dXa.TaskDescription.DRGLNw));
            map.put("layout/item_okw_escape_bind_account_list_0", Integer.valueOf(C13754dXa.TaskDescription.fsw));
            map.put("layout/item_one_img_0", Integer.valueOf(C13754dXa.TaskDescription.Dfv));
            map.put("layout/item_one_img_pending_0", Integer.valueOf(C13754dXa.TaskDescription.ORWKdN));
            map.put("layout/item_one_key_select_account_0", Integer.valueOf(C13754dXa.TaskDescription.fTEjYi));
            map.put("layout/item_pending_0", Integer.valueOf(C13754dXa.TaskDescription.GGlJim));
            map.put("layout/item_profile_asset_coin_tx_history_0", Integer.valueOf(C13754dXa.TaskDescription.dbUqJD));
            map.put("layout/item_profile_asset_coin_tx_history_pending_0", Integer.valueOf(C13754dXa.TaskDescription.GLcwwN));
            map.put("layout/item_quick_copy_address_0", Integer.valueOf(C13754dXa.TaskDescription.aQtmcU));
            map.put("layout/item_select_coin_0", Integer.valueOf(C13754dXa.TaskDescription.QnnRaN));
            map.put("layout/item_select_coin_divider_0", Integer.valueOf(C13754dXa.TaskDescription.OrsvgJ));
            map.put("layout/item_select_coin_entrance_0", Integer.valueOf(C13754dXa.TaskDescription.QiTXOm));
            map.put("layout/item_select_coin_search_0", Integer.valueOf(C13754dXa.TaskDescription.RFmUsE));
            map.put("layout/item_select_coin_title_0", Integer.valueOf(C13754dXa.TaskDescription.RLmrWm));
            map.put("layout/item_solana_transfer_network_fee_0", Integer.valueOf(C13754dXa.TaskDescription.sRzUNh));
            map.put("layout/item_tee_time_selection_bottom_sheet_0", Integer.valueOf(C13754dXa.TaskDescription.getValue));
            map.put("layout/item_three_img_0", Integer.valueOf(C13754dXa.TaskDescription.zXhzOT));
            map.put("layout/item_total_container_layout_0", Integer.valueOf(C13754dXa.TaskDescription.GcnicV));
            map.put("layout/item_trade_history_header_0", Integer.valueOf(C13754dXa.TaskDescription.GQzpsZgQzpsZ));
            map.put("layout/item_transfer_coin_from_exchange_header_0", Integer.valueOf(C13754dXa.TaskDescription.fQQVvf));
            map.put("layout/item_transfer_input_memo_0", Integer.valueOf(C13754dXa.TaskDescription.RckOJh));
            map.put("layout/item_transfer_select_coin_0", Integer.valueOf(C13754dXa.TaskDescription.DXd));
            map.put("layout/item_two_img_0", Integer.valueOf(C13754dXa.TaskDescription.hKJZrr));
            map.put("layout/item_wallet_debug_setting_0", Integer.valueOf(C13754dXa.TaskDescription.resume));
            map.put("layout/item_withdrawal_select_coin_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPHhYHK));
            map.put("layout/item_withdrawal_select_network_0", Integer.valueOf(C13754dXa.TaskDescription.hcetpZ));
            map.put("layout/kys_risk_tip_0", Integer.valueOf(C13754dXa.TaskDescription.iLWfRf));
            map.put("layout/layout_aa_wallet_info_0", Integer.valueOf(C13754dXa.TaskDescription.OxbLUn));
            map.put("layout/layout_batch_create_account_count_0", Integer.valueOf(C13754dXa.TaskDescription.DeEinT));
            map.put("layout/layout_btc_utxo_more_input_0", Integer.valueOf(C13754dXa.TaskDescription.dSJNDS));
            map.put("layout/layout_btc_xrc_input_output_0", Integer.valueOf(C13754dXa.TaskDescription.Qsauvs));
            map.put("layout/layout_dapp_interaction_address_0", Integer.valueOf(C13754dXa.TaskDescription.hwkNQP));
            map.put("layout/layout_dapp_interaction_approved_amount_0", Integer.valueOf(C13754dXa.TaskDescription.putInt));
            map.put("layout/layout_dapp_interaction_btn_layout_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPOZOJIj));
            map.put("layout/layout_dapp_interaction_data_0", Integer.valueOf(C13754dXa.TaskDescription.fDu));
            map.put("layout/layout_dapp_interaction_network_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPOKBmQNaCIdOM));
            map.put("layout/layout_dapp_interaction_network_fee_0", Integer.valueOf(C13754dXa.TaskDescription.DjwCMv));
            map.put("layout/layout_dapp_interaction_top_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPOKBmQN));
            map.put("layout/layout_dapp_interaction_wallet_0", Integer.valueOf(C13754dXa.TaskDescription.QsIRgs));
            map.put("layout/layout_dapp_network_info_bottomsheet_0", Integer.valueOf(C13754dXa.TaskDescription.QfZsXX));
            map.put("layout/layout_defi_approve_risky_banner_0", Integer.valueOf(C13754dXa.TaskDescription.QOjuYg));
            map.put("layout/layout_defi_asset_allocation_view_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPQPAeHI));
            map.put("layout/layout_defi_history_select_chain_header_0", Integer.valueOf(C13754dXa.TaskDescription.iLAtSv));
            map.put("layout/layout_defi_home_yield_coins_0", Integer.valueOf(C13754dXa.TaskDescription.ONJgbh));
            map.put("layout/layout_defi_profile_pnl_analysis_0", Integer.valueOf(C13754dXa.TaskDescription.itxZVF));
            map.put("layout/layout_defi_profile_pnl_chart_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPQdUnVm));
            map.put("layout/layout_defi_profile_pnl_transactions_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPRAkuRW));
            map.put("layout/layout_defi_profile_pnl_volume_0", Integer.valueOf(C13754dXa.TaskDescription.gCNefq));
            map.put("layout/layout_defi_profile_pnl_win_rate_0", Integer.valueOf(C13754dXa.TaskDescription.RWIpjU));
            map.put("layout/layout_defi_set_fingerprint_0", Integer.valueOf(C13754dXa.TaskDescription.RSmiaq));
            map.put("layout/layout_defi_usdg_result_activity_0", Integer.valueOf(C13754dXa.TaskDescription.ORmwhf));
            map.put("layout/layout_defi_wallet_multi_select_receive_address_activity_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPRGtXKC));
            map.put("layout/layout_defi_wallet_multi_select_send_address_activity_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPURsaBn));
            map.put("layout/layout_defi_wallet_multi_send_board_activity_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPRGtXKCRGtXKC));
            map.put("layout/layout_defi_wallet_multi_send_board_fragment_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPRGtXKCDKRTZD));
            map.put("layout/layout_defi_wallet_on_board_question_activity_0", Integer.valueOf(C13754dXa.TaskDescription.getSerial));
            map.put("layout/layout_defi_wallet_usdg_onboard_activity_0", Integer.valueOf(C13754dXa.TaskDescription.BVXAa));
            map.put("layout/layout_escape_cedefi_access_activity_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPUUMfbK));
            map.put("layout/layout_escape_cedefi_confirm_activity_0", Integer.valueOf(C13754dXa.TaskDescription.ikIEnW));
            map.put("layout/layout_escape_cedefi_confirm_wallet_activity_0", Integer.valueOf(C13754dXa.TaskDescription.QSAYLr));
            map.put("layout/layout_escape_cedefi_list_activity_0", Integer.valueOf(C13754dXa.TaskDescription.dNxZaP));
            map.put("layout/layout_faq_section_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPdNQGVJ));
            map.put("layout/layout_hardware_wallet_bluetooth_guide_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPdIKEqB));
            map.put("layout/layout_inputs_outputs_detail_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPfvRMlC));
            map.put("layout/layout_inputs_outputs_more_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPfrwjPh));
            map.put("layout/layout_investment_details_0", Integer.valueOf(C13754dXa.TaskDescription.gLWkOL));
            map.put("layout/layout_item_defi_wallet_tx_detail_address_copy_0", Integer.valueOf(C13754dXa.TaskDescription.dpErvT));
            map.put("layout/layout_item_defi_wallet_tx_detail_content_apporved_amount_0", Integer.valueOf(C13754dXa.TaskDescription.iOIMNp));
            map.put("layout/layout_item_defi_wallet_tx_detail_content_copy_0", Integer.valueOf(C13754dXa.TaskDescription.sanrWj));
            map.put("layout/layout_item_defi_wallet_tx_detail_content_detail_0", Integer.valueOf(C13754dXa.TaskDescription.xxhdY));
            map.put("layout/layout_item_defi_wallet_tx_detail_content_network_fee_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPhFGucI));
            map.put("layout/layout_item_defi_wallet_tx_detail_content_normal_0", Integer.valueOf(C13754dXa.TaskDescription.izFvvl));
            map.put("layout/layout_item_multi_coin_approve_0", Integer.valueOf(C13754dXa.TaskDescription.HJWChPzRXNTw));
            map.put("layout/layout_item_tx_detail_include_assets_0", Integer.valueOf(C13754dXa.TaskDescription.DGgkXd));
            map.put("layout/layout_item_tx_detail_plus_place_holder_0", Integer.valueOf(C13754dXa.TaskDescription.fzHEvu));
            map.put("layout/layout_item_tx_detail_top_coin_0", Integer.valueOf(C13754dXa.TaskDescription.sEAkxl));
            map.put("layout/layout_item_tx_detail_top_coin_authorization_0", Integer.valueOf(C13754dXa.TaskDescription.nriSR));
            map.put("layout/layout_item_tx_detail_top_dapp_0", Integer.valueOf(C13754dXa.TaskDescription.HrFqwD));
            map.put("layout/layout_item_tx_detail_top_nft_0", Integer.valueOf(C13754dXa.TaskDescription.onLocationChanged));
            map.put("layout/layout_item_tx_detail_top_nft_authorization_0", Integer.valueOf(C13754dXa.TaskDescription.HrMTQN));
            map.put("layout/layout_multi_select_send_address_item_0", Integer.valueOf(C13754dXa.TaskDescription.onProviderDisabled));
            map.put("layout/layout_multi_sign_list_0", Integer.valueOf(C13754dXa.TaskDescription.onStatusChanged));
            map.put("layout/layout_multi_transfer_result_0", Integer.valueOf(C13754dXa.TaskDescription.DzOuPm));
            map.put("layout/layout_network_fees_0", Integer.valueOf(C13754dXa.TaskDescription.QOeQqh));
            map.put("layout/layout_recover_cedefi_access_activity_0", Integer.valueOf(C13754dXa.TaskDescription.adwzgZ));
            map.put("layout/layout_recover_cedefi_wallet_detail_activity_0", Integer.valueOf(C13754dXa.TaskDescription.DPVBvL));
            map.put("layout/layout_send_coin_fee_custom_item_0", Integer.valueOf(C13754dXa.TaskDescription.OKSWiw));
            map.put("layout/layout_tee_time_selection_bottom_sheet_0", Integer.valueOf(C13754dXa.TaskDescription.apLTlu));
            map.put("layout/layout_transaction_detail_send_editable_data_new_0", Integer.valueOf(C13754dXa.TaskDescription.OCdtug));
            map.put("layout/layout_transaction_memo_new_0", Integer.valueOf(C13754dXa.TaskDescription.aWJMta));
            map.put("layout/layout_transaction_reminder_0", Integer.valueOf(C13754dXa.TaskDescription.gwwzsY));
            map.put("layout/layout_transfer_pay_with_coin_0", Integer.valueOf(C13754dXa.TaskDescription.IYdWPz));
            map.put("layout/layout_tx_detail_assets_expand_0", Integer.valueOf(C13754dXa.TaskDescription.sEcTXd));
            map.put("layout/layout_tx_detail_include_assets_0", Integer.valueOf(C13754dXa.TaskDescription.icKaHr));
            map.put("layout/layout_usdg_rewards_0", Integer.valueOf(C13754dXa.TaskDescription.hpmliR));
            map.put("layout/layout_view_memo_read_only_0", Integer.valueOf(C13754dXa.TaskDescription.aWuQzD));
            map.put("layout/layout_wallet_tx_detail_address_list_copy_0", Integer.valueOf(C13754dXa.TaskDescription.dYepVG));
            map.put("layout/view_coin_current_price_ratio_0", Integer.valueOf(C13754dXa.TaskDescription.zdxASf));
            map.put("layout/view_coin_detail_current_price_0", Integer.valueOf(C13754dXa.TaskDescription.OGitdB));
            map.put("layout/view_coin_detail_header_0", Integer.valueOf(C13754dXa.TaskDescription.fGT));
            map.put("layout/view_coin_detail_trade_pnl_0", Integer.valueOf(C13754dXa.TaskDescription.getConnectivityMgr));
            map.put("layout/view_dapp_interaction_item_fee_0", Integer.valueOf(C13754dXa.TaskDescription.OHsvZP));
            map.put("layout/view_defi_history_view_more_layout_0", Integer.valueOf(C13754dXa.TaskDescription.FF));
            map.put("layout/view_defi_loading_layout_0", Integer.valueOf(C13754dXa.TaskDescription.OAUGar));
            map.put("layout/view_defi_withdrawal_loading_layout_0", Integer.valueOf(C13754dXa.TaskDescription.QYNZmZ));
            map.put("layout/view_exchange_assets_title_item_0", Integer.valueOf(C13754dXa.TaskDescription.RidNCX));
            map.put("layout/view_exchange_not_any_crypto_or_network_0", Integer.valueOf(C13754dXa.TaskDescription.OeawrHOeawrH));
            map.put("layout/view_home_chart_status_0", Integer.valueOf(C13754dXa.TaskDescription.dkJJWw));
            map.put("layout/view_home_expand_kline_0", Integer.valueOf(C13754dXa.TaskDescription.OqHLSf));
            map.put("layout/view_search_bar_0", Integer.valueOf(C13754dXa.TaskDescription.gCiISl));
            map.put("layout/view_wallet_load_fail_0", Integer.valueOf(C13754dXa.TaskDescription.DDDCac));
            map.put("layout/view_wallet_no_data_0", Integer.valueOf(C13754dXa.TaskDescription.UJpkuA));
            map.put("layout/view_wallet_pnl_list_0", Integer.valueOf(C13754dXa.TaskDescription.OmYuqg));
            map.put("layout/wallet_preferences_normal_item_0", Integer.valueOf(C13754dXa.TaskDescription.sJPPOI));
            map.put("layout/wallet_security_item_switch_view_0", Integer.valueOf(C13754dXa.TaskDescription.OqhRBMiKdSzF));
        }
    }
}
