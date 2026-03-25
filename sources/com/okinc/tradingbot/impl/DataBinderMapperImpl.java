package com.okinc.tradingbot.impl;

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
import com.google.android.gms.wallet.WalletConstants;
import com.google.mlkit.common.MlKitException;
import com.ibm.icu.text.DateFormat;
import com.just.agentweb.DefaultChromeClient;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C48033uCm;
import o.C48294uMd;
import o.C48295uMe;
import o.C48297uMg;
import o.C48300uMj;
import o.C48302uMl;
import o.C48303uMm;
import o.C48308uMr;
import o.C48311uMu;
import o.C48314uMx;
import o.C48316uMz;
import o.C48319uNb;
import o.C48322uNe;
import o.C48325uNh;
import o.C48331uNn;
import o.C48333uNp;
import o.C48335uNr;
import o.C48347uOc;
import o.C48352uOh;
import o.C48354uOj;
import o.C48355uOk;
import o.C48358uOn;
import o.C48360uOp;
import o.C48363uOs;
import o.C48364uOt;
import o.C48367uOw;
import o.C48369uOy;
import o.C48375uPd;
import o.C48376uPe;
import o.C48377uPf;
import o.C48378uPg;
import o.C48382uPk;
import o.C48384uPm;
import o.C48385uPn;
import o.C48386uPo;
import o.C48389uPr;
import o.C48392uPu;
import o.C48393uPv;
import o.C48397uPz;
import o.C48401uQc;
import o.C48404uQf;
import o.C48406uQh;
import o.C48407uQi;
import o.C48408uQj;
import o.C48411uQm;
import o.C48414uQp;
import o.C48415uQq;
import o.C48416uQr;
import o.C48420uQv;
import o.C48421uQw;
import o.C48424uQz;
import o.C48430uRc;
import o.C48433uRf;
import o.C48434uRg;
import o.C48436uRi;
import o.C48437uRj;
import o.C48442uRo;
import o.C48444uRq;
import o.C48446uRs;
import o.C48449uRv;
import o.C48450uRw;
import o.C48456uSb;
import o.C48459uSe;
import o.C48461uSg;
import o.C48463uSi;
import o.C48465uSk;
import o.C48466uSl;
import o.C48470uSp;
import o.C48474uSt;
import o.C48476uSv;
import o.C48479uSy;
import o.C48480uSz;
import o.C48482uTa;
import o.C48485uTd;
import o.C48487uTf;
import o.C48488uTg;
import o.C48490uTi;
import o.C48492uTk;
import o.C48495uTn;
import o.C48497uTp;
import o.C48501uTt;
import o.C48503uTv;
import o.C48506uTy;
import o.C48509uUa;
import o.C48510uUb;
import o.C48511uUc;
import o.C48512uUd;
import o.C48516uUh;
import o.C48519uUk;
import o.C48520uUl;
import o.C48521uUm;
import o.C48522uUn;
import o.C48525uUq;
import o.C48529uUu;
import o.C48531uUw;
import o.C48532uUx;
import o.C48534uUz;
import o.C48537uVb;
import o.C48538uVc;
import o.C48539uVd;
import o.C48542uVg;
import o.C48544uVi;
import o.C48545uVj;
import o.C48546uVk;
import o.C48549uVn;
import o.C48551uVp;
import o.C48552uVq;
import o.C48555uVt;
import o.C48556uVu;
import o.C48558uVw;
import o.C48560uVy;
import o.C48564uWb;
import o.C48567uWe;
import o.C48572uWj;
import o.C48573uWk;
import o.C48574uWl;
import o.C48576uWn;
import o.C48577uWo;
import o.C48580uWr;
import o.C48583uWu;
import o.C48584uWv;
import o.C48586uWx;
import o.C48588uWz;
import o.C48590uXa;
import o.C48593uXd;
import o.C48594uXe;
import o.C48598uXi;
import o.C48599uXj;
import o.C48600uXk;
import o.C48602uXm;
import o.C48603uXn;
import o.C48606uXq;
import o.C48609uXt;
import o.C48612uXw;
import o.C48613uXx;
import o.C48617uYa;
import o.C48620uYd;
import o.C48622uYf;
import o.C48623uYg;
import o.C48625uYi;
import o.C48627uYk;
import o.C48630uYn;
import o.C48631uYo;
import o.C48633uYq;
import o.C48635uYs;
import o.C48636uYt;
import o.C48642uYz;
import o.C48644uZa;
import o.C48646uZc;
import o.C48649uZf;
import o.C48650uZg;
import o.C48652uZi;
import o.C48656uZm;
import o.C48657uZn;
import o.C48660uZq;
import o.C48661uZr;
import o.C48666uZw;
import o.C48667uZx;
import o.C48668uZy;
import o.C50756vaE;
import o.C50757vaF;
import o.C50759vaH;
import o.C50760vaI;
import o.C50761vaJ;
import o.C50768vaQ;
import o.C50769vaR;
import o.C50770vaS;
import o.C50771vaT;
import o.C50772vaU;
import o.C50777vaZ;
import o.C50780vac;
import o.C50781vad;
import o.C50782vae;
import o.C50786vai;
import o.C50789val;
import o.C50790vam;
import o.C50791van;
import o.C50795var;
import o.C50796vas;
import o.C50797vat;
import o.C50799vav;
import o.C50800vaw;
import o.C50802vay;
import o.C50803vaz;
import o.C50805vbA;
import o.C50806vbB;
import o.C50809vbE;
import o.C50812vbH;
import o.C50814vbJ;
import o.C50815vbK;
import o.C50818vbN;
import o.C50821vbQ;
import o.C50825vbU;
import o.C50829vbY;
import o.C50830vbZ;
import o.C50832vbb;
import o.C50836vbf;
import o.C50837vbg;
import o.C50838vbh;
import o.C50839vbi;
import o.C50841vbk;
import o.C50843vbm;
import o.C50846vbp;
import o.C50848vbr;
import o.C50849vbs;
import o.C50852vbv;
import o.C50854vbx;
import o.C50858vcA;
import o.C50859vcB;
import o.C50861vcD;
import o.C50864vcG;
import o.C50866vcI;
import o.C50867vcJ;
import o.C50870vcM;
import o.C50871vcN;
import o.C50875vcR;
import o.C50876vcS;
import o.C50877vcT;
import o.C50878vcU;
import o.C50883vcZ;
import o.C50885vcb;
import o.C50887vcd;
import o.C50888vce;
import o.C50889vcf;
import o.C50892vci;
import o.C50896vcm;
import o.C50897vcn;
import o.C50901vcr;
import o.C50902vcs;
import o.C50903vct;
import o.C50904vcu;
import o.C50906vcw;
import o.C50911vdA;
import o.C50915vdE;
import o.C50916vdF;
import o.C50918vdH;
import o.C50920vdJ;
import o.C50923vdM;
import o.C50924vdN;
import o.C50926vdP;
import o.C50931vdU;
import o.C50932vdV;
import o.C50934vdX;
import o.C50935vdY;
import o.C50938vdb;
import o.C50943vdg;
import o.C50946vdj;
import o.C50948vdl;
import o.C50952vdp;
import o.C50953vdq;
import o.C50954vdr;
import o.C50958vdv;
import o.C50959vdw;
import o.C50960vdx;
import o.C50962vdz;
import o.C50990vea;
import o.C50992vec;
import o.C50993ved;
import o.C50997veh;
import o.C50998vei;
import o.uMA;
import o.uMP;
import o.uMT;
import o.uMU;
import o.uMY;
import o.uMZ;
import o.uNA;
import o.uNC;
import o.uNE;
import o.uNI;
import o.uNS;
import o.uNY;
import o.uNZ;
import o.uOB;
import o.uOD;
import o.uOF;
import o.uOH;
import o.uOJ;
import o.uOK;
import o.uOM;
import o.uON;
import o.uOR;
import o.uOU;
import o.uOV;
import o.uOX;
import o.uOY;
import o.uPA;
import o.uPB;
import o.uPE;
import o.uPF;
import o.uPJ;
import o.uPM;
import o.uPN;
import o.uPP;
import o.uPT;
import o.uPU;
import o.uPW;
import o.uPY;
import o.uPZ;
import o.uQE;
import o.uQF;
import o.uQI;
import o.uQJ;
import o.uQK;
import o.uQP;
import o.uQQ;
import o.uQS;
import o.uQU;
import o.uQY;
import o.uQZ;
import o.uRD;
import o.uRF;
import o.uRG;
import o.uRH;
import o.uRN;
import o.uRS;
import o.uRT;
import o.uRV;
import o.uRW;
import o.uRZ;
import o.uSA;
import o.uSB;
import o.uSE;
import o.uSM;
import o.uSV;
import o.uSZ;
import o.uTA;
import o.uTB;
import o.uTD;
import o.uTG;
import o.uTH;
import o.uTK;
import o.uTL;
import o.uTM;
import o.uTN;
import o.uTR;
import o.uTT;
import o.uTV;
import o.uTY;
import o.uUA;
import o.uUC;
import o.uUF;
import o.uUG;
import o.uUI;
import o.uUK;
import o.uUM;
import o.uUR;
import o.uUS;
import o.uUT;
import o.uUU;
import o.uUW;
import o.uVB;
import o.uVD;
import o.uVF;
import o.uVH;
import o.uVJ;
import o.uVM;
import o.uVO;
import o.uVP;
import o.uVR;
import o.uVT;
import o.uVU;
import o.uVY;
import o.uVZ;
import o.uWC;
import o.uWD;
import o.uWE;
import o.uWG;
import o.uWJ;
import o.uWL;
import o.uWO;
import o.uWR;
import o.uWS;
import o.uWT;
import o.uWV;
import o.uWY;
import o.uXA;
import o.uXC;
import o.uXD;
import o.uXG;
import o.uXH;
import o.uXJ;
import o.uXK;
import o.uXN;
import o.uXP;
import o.uXQ;
import o.uXV;
import o.uXW;
import o.uXX;
import o.uXZ;
import o.uYA;
import o.uYC;
import o.uYF;
import o.uYG;
import o.uYH;
import o.uYJ;
import o.uYN;
import o.uYO;
import o.uYP;
import o.uYR;
import o.uYU;
import o.uYY;
import o.uYZ;
import o.uZA;
import o.uZE;
import o.uZF;
import o.uZG;
import o.uZI;
import o.uZL;
import o.uZN;
import o.uZQ;
import o.uZR;
import o.uZT;
import o.uZU;
import o.uZV;
import o.uZZ;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE);
        copydefault = sparseIntArray;
        sparseIntArray.put(C48033uCm.Activity.KWHzl, 1);
        sparseIntArray.put(C48033uCm.Activity.AEQbTJ, 2);
        sparseIntArray.put(C48033uCm.Activity.EZpvd, 3);
        sparseIntArray.put(C48033uCm.Activity.OLrzqt, 4);
        sparseIntArray.put(C48033uCm.Activity.copydefault, 5);
        sparseIntArray.put(C48033uCm.Activity.gEmmrt, 6);
        sparseIntArray.put(C48033uCm.Activity.AhwBna, 7);
        sparseIntArray.put(C48033uCm.Activity.DbNXlk, 8);
        sparseIntArray.put(C48033uCm.Activity.values, 9);
        sparseIntArray.put(C48033uCm.Activity.AkhnZx, 10);
        sparseIntArray.put(C48033uCm.Activity.fetchVPNInfo, 11);
        sparseIntArray.put(C48033uCm.Activity.zsXlph, 12);
        sparseIntArray.put(C48033uCm.Activity.gHZMYf, 13);
        sparseIntArray.put(C48033uCm.Activity.sSMYrx, 14);
        sparseIntArray.put(C48033uCm.Activity.AwvSrB, 15);
        sparseIntArray.put(C48033uCm.Activity.zuBGHE, 16);
        sparseIntArray.put(C48033uCm.Activity.OcIXYQ, 17);
        sparseIntArray.put(C48033uCm.Activity.QKVWgx, 18);
        sparseIntArray.put(C48033uCm.Activity.QbewEr, 19);
        sparseIntArray.put(C48033uCm.Activity.aKErDB, 20);
        sparseIntArray.put(C48033uCm.Activity.RcXXUw, 21);
        sparseIntArray.put(C48033uCm.Activity.dvKsVJ, 22);
        sparseIntArray.put(C48033uCm.Activity.flVtFt, 23);
        sparseIntArray.put(C48033uCm.Activity.iZzfmt, 24);
        sparseIntArray.put(C48033uCm.Activity.hUfVAv, 25);
        sparseIntArray.put(C48033uCm.Activity.iRxXKY, 26);
        sparseIntArray.put(C48033uCm.Activity.AxsJAYsNCnLh, 27);
        sparseIntArray.put(C48033uCm.Activity.zuWLRA, 28);
        sparseIntArray.put(C48033uCm.Activity.getPostValueLengthLimit, 29);
        sparseIntArray.put(C48033uCm.Activity.ffGIBT, 30);
        sparseIntArray.put(C48033uCm.Activity.QSBOWP, 31);
        sparseIntArray.put(C48033uCm.Activity.RKDWNf, 32);
        sparseIntArray.put(C48033uCm.Activity.RdAHlO, 33);
        sparseIntArray.put(C48033uCm.Activity.dmfpNf, 34);
        sparseIntArray.put(C48033uCm.Activity.gwTjWJ, 35);
        sparseIntArray.put(C48033uCm.Activity.hrNTAI, 36);
        sparseIntArray.put(C48033uCm.Activity.OFhtUX, 37);
        sparseIntArray.put(C48033uCm.Activity.ODXsMY, 38);
        sparseIntArray.put(C48033uCm.Activity.DLWbHP, 39);
        sparseIntArray.put(C48033uCm.Activity.OJuSTm, 40);
        sparseIntArray.put(C48033uCm.Activity.QVsKAR, 41);
        sparseIntArray.put(C48033uCm.Activity.aUsmxb, 42);
        sparseIntArray.put(C48033uCm.Activity.QwvEab, 43);
        sparseIntArray.put(C48033uCm.Activity.USBtdM, 44);
        sparseIntArray.put(C48033uCm.Activity.dUDNAs, 45);
        sparseIntArray.put(C48033uCm.Activity.UlJrfe, 46);
        sparseIntArray.put(C48033uCm.Activity.fjfviF, 47);
        sparseIntArray.put(C48033uCm.Activity.fERRXa, 48);
        sparseIntArray.put(C48033uCm.Activity.igXuih, 49);
        sparseIntArray.put(C48033uCm.Activity.htlTjW, 50);
        sparseIntArray.put(C48033uCm.Activity.fdOvFl, 51);
        sparseIntArray.put(C48033uCm.Activity.Dmq, 52);
        sparseIntArray.put(C48033uCm.Activity.spnCvw, 53);
        sparseIntArray.put(C48033uCm.Activity.ixgjPv, 54);
        sparseIntArray.put(C48033uCm.Activity.DCUTEIdCUTEI, 55);
        sparseIntArray.put(C48033uCm.Activity.zblBkD, 56);
        sparseIntArray.put(C48033uCm.Activity.run, 57);
        sparseIntArray.put(C48033uCm.Activity.DCUTEIddSDPG, 58);
        sparseIntArray.put(C48033uCm.Activity.call, 59);
        sparseIntArray.put(C48033uCm.Activity.WS, 60);
        sparseIntArray.put(C48033uCm.Activity.DGOPHZ, 61);
        sparseIntArray.put(C48033uCm.Activity.DcqEDu, 62);
        sparseIntArray.put(C48033uCm.Activity.KDccX, 63);
        sparseIntArray.put(C48033uCm.Activity.UrRBLY, 64);
        sparseIntArray.put(C48033uCm.Activity.fHqPtx, 65);
        sparseIntArray.put(C48033uCm.Activity.heceqZ, 66);
        sparseIntArray.put(C48033uCm.Activity.DGOPHZDGOPHZ, 67);
        sparseIntArray.put(C48033uCm.Activity.hCLrkq, 68);
        sparseIntArray.put(C48033uCm.Activity.DGUQLI, 69);
        sparseIntArray.put(C48033uCm.Activity.DsrFlB, 70);
        sparseIntArray.put(C48033uCm.Activity.DaRZkR, 71);
        sparseIntArray.put(C48033uCm.Activity.DNMMPQ, 72);
        sparseIntArray.put(C48033uCm.Activity.OTwTPd, 73);
        sparseIntArray.put(C48033uCm.Activity.RVsVBY, 74);
        sparseIntArray.put(C48033uCm.Activity.QXDzTk, 75);
        sparseIntArray.put(C48033uCm.Activity.QIZEnU, 76);
        sparseIntArray.put(C48033uCm.Activity.QDqgQU, 77);
        sparseIntArray.put(C48033uCm.Activity.RKcVTr, 78);
        sparseIntArray.put(C48033uCm.Activity.Ufzxmz, 79);
        sparseIntArray.put(C48033uCm.Activity.ULRxlR, 80);
        sparseIntArray.put(C48033uCm.Activity.RXzakW, 81);
        sparseIntArray.put(C48033uCm.Activity.TarCU, 82);
        sparseIntArray.put(C48033uCm.Activity.UhxbNG, 83);
        sparseIntArray.put(C48033uCm.Activity.alsFma, 84);
        sparseIntArray.put(C48033uCm.Activity.aJFbMH, 85);
        sparseIntArray.put(C48033uCm.Activity.akftKQ, 86);
        sparseIntArray.put(C48033uCm.Activity.UscePu, 87);
        sparseIntArray.put(C48033uCm.Activity.aHXSQp, 88);
        sparseIntArray.put(C48033uCm.Activity.dLBcXg, 89);
        sparseIntArray.put(C48033uCm.Activity.gmHjFq, 90);
        sparseIntArray.put(C48033uCm.Activity.fsSxsn, 91);
        sparseIntArray.put(C48033uCm.Activity.hlkKmr, 92);
        sparseIntArray.put(C48033uCm.Activity.gSBher, 93);
        sparseIntArray.put(C48033uCm.Activity.gUEfcq, 94);
        sparseIntArray.put(C48033uCm.Activity.sVXHln, 95);
        sparseIntArray.put(C48033uCm.Activity.iPSTqm, 96);
        sparseIntArray.put(C48033uCm.Activity.hvKCwS, 97);
        sparseIntArray.put(C48033uCm.Activity.swzYdv, 98);
        sparseIntArray.put(C48033uCm.Activity.zDUObI, 99);
        sparseIntArray.put(C48033uCm.Activity.tIwhY, 100);
        sparseIntArray.put(C48033uCm.Activity.vLaW, 101);
        sparseIntArray.put(C48033uCm.Activity.zAEkPU, 102);
        sparseIntArray.put(C48033uCm.Activity.zOIQXb, 103);
        sparseIntArray.put(C48033uCm.Activity.zqTOFw, 104);
        sparseIntArray.put(C48033uCm.Activity.zlvcHA, 105);
        sparseIntArray.put(C48033uCm.Activity.DGUQLIDGUQLI, 106);
        sparseIntArray.put(C48033uCm.Activity.getLabel, 107);
        sparseIntArray.put(C48033uCm.Activity.zSsVtY, 108);
        sparseIntArray.put(C48033uCm.Activity.DGUQLIekVPG, 109);
        sparseIntArray.put(C48033uCm.Activity.DUUtXg, WalletImportError.ERROR_CODE_AA_CREATE_KEY);
        sparseIntArray.put(C48033uCm.Activity.YqksP, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY);
        sparseIntArray.put(C48033uCm.Activity.awiJhF, WalletImportError.ERROR_CODE_AA_EXIST);
        sparseIntArray.put(C48033uCm.Activity.frkDMe, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST);
        sparseIntArray.put(C48033uCm.Activity.hrjNmC, 114);
        sparseIntArray.put(C48033uCm.Activity.fGQ, 115);
        sparseIntArray.put(C48033uCm.Activity.DKtBnz, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
        sparseIntArray.put(C48033uCm.Activity.DPHNDa, 117);
        sparseIntArray.put(C48033uCm.Activity.DrNnAm, 118);
        sparseIntArray.put(C48033uCm.Activity.DPHsZd, 119);
        sparseIntArray.put(C48033uCm.Activity.aJZHYI, 120);
        sparseIntArray.put(C48033uCm.Activity.DPhTBN, 121);
        sparseIntArray.put(C48033uCm.Activity.RAQtXZ, 122);
        sparseIntArray.put(C48033uCm.Activity.geLlBI, 123);
        sparseIntArray.put(C48033uCm.Activity.zLAIeZ, 124);
        sparseIntArray.put(C48033uCm.Activity.reset, 125);
        sparseIntArray.put(C48033uCm.Activity.ihnvzI, WebSocketProtocol.PAYLOAD_SHORT);
        sparseIntArray.put(C48033uCm.Activity.isReflectionWorking, 127);
        sparseIntArray.put(C48033uCm.Activity.DcMfJK, 128);
        sparseIntArray.put(C48033uCm.Activity.DTeKQX, 129);
        sparseIntArray.put(C48033uCm.Activity.RTWSvT, 130);
        sparseIntArray.put(C48033uCm.Activity.iHkeWl, DateFormat.RELATIVE_SHORT);
        sparseIntArray.put(C48033uCm.Activity.UccSpe, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.ggKfIT, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.invokespecialROgMPW, 134);
        sparseIntArray.put(C48033uCm.Activity.invokespecialgBtXYZ, 135);
        sparseIntArray.put(C48033uCm.Activity.DaTmkG, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.RuDPQV, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.YFmri, 138);
        sparseIntArray.put(C48033uCm.Activity.aGOrKO, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.atDTRm, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.aKhcqp, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.gBtXYZ, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA);
        sparseIntArray.put(C48033uCm.Activity.getUserContextRegisteredStatus, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.dzkkkq, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.hOMIpD, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.processStrongAuthMessage, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA);
        sparseIntArray.put(C48033uCm.Activity.pauseLocationServices, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.hlXVux, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.scanPackages, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.profile, 150);
        sparseIntArray.put(C48033uCm.Activity.siEkQe, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.zpGcln, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKDCKfqP, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKDCKfqPDCfLja, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.DMb, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA);
        sparseIntArray.put(C48033uCm.Activity.fmB, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C48033uCm.Activity.onComplete, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKDDUqPf, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKDGTeJD, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.cancel, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C48033uCm.Activity.stopBehavioSecDataCollection, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.sendBehavioSecData, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKDSqxTE, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.getSessionID, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKDcMfJK, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKOmnske, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DsL, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.jh, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C48033uCm.Activity.sCB, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKdMCrTj, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(C48033uCm.Activity.fcfzuX, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.fbC, 172);
        sparseIntArray.put(C48033uCm.Activity.getStatusCode, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKRKUgwx, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKfbSiEC, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(C48033uCm.Activity.Hx, CipherSuite.TLS_PSK_WITH_NULL_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKfNLfdT, CipherSuite.TLS_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKffREWX, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKfNUfqk, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKsgNvtZ, 180);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKfwDlxl, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKsfEqpH, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.XW, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKgMxgjU, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
        sparseIntArray.put(C48033uCm.Activity.bindToGooglePlayService, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(C48033uCm.Activity.getAdvertisingId, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DfrfUJ, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DcMfJKsuEgdN, 188);
        sparseIntArray.put(C48033uCm.Activity.DlABUU, 189);
        sparseIntArray.put(C48033uCm.Activity.glVQsU, 190);
        sparseIntArray.put(C48033uCm.Activity.DlmWDR, 191);
        sparseIntArray.put(C48033uCm.Activity.DxnCrt, 192);
        sparseIntArray.put(C48033uCm.Activity.DwQSDd, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.abAflu, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.QFTsTN, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.DDjfYY, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.iUnTnt, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(C48033uCm.Activity.fiXcQa, 198);
        sparseIntArray.put(C48033uCm.Activity.DzkRMH, 199);
        sparseIntArray.put(C48033uCm.Activity.QWpYiD, 200);
        sparseIntArray.put(C48033uCm.Activity.QKDJJA, 201);
        sparseIntArray.put(C48033uCm.Activity.jNexW, 202);
        sparseIntArray.put(C48033uCm.Activity.DGGHxk, 203);
        sparseIntArray.put(C48033uCm.Activity.ExKek, 204);
        sparseIntArray.put(C48033uCm.Activity.gsvlRV, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
        sparseIntArray.put(C48033uCm.Activity.fVjYLc, 206);
        sparseIntArray.put(C48033uCm.Activity.gGNlxh, 207);
        sparseIntArray.put(C48033uCm.Activity.dbwnZN, 208);
        sparseIntArray.put(C48033uCm.Activity.QslYrK, 209);
        sparseIntArray.put(C48033uCm.Activity.gCZUJG, 210);
        sparseIntArray.put(C48033uCm.Activity.hdpuIA, 211);
        sparseIntArray.put(C48033uCm.Activity.FHvxmb, com.flyco.tablayout.BuildConfig.VERSION_CODE);
        sparseIntArray.put(C48033uCm.Activity.hNurIN, 213);
        sparseIntArray.put(C48033uCm.Activity.gkZNMa, me.relex.circleindicator.BuildConfig.VERSION_CODE);
        sparseIntArray.put(C48033uCm.Activity.OEgNct, 215);
        sparseIntArray.put(C48033uCm.Activity.apAOXX, 216);
        sparseIntArray.put(C48033uCm.Activity.DztXDE, 217);
        sparseIntArray.put(C48033uCm.Activity.OijiEz, 218);
        sparseIntArray.put(C48033uCm.Activity.dPkBzA, 219);
        sparseIntArray.put(C48033uCm.Activity.gqOnQv, 220);
        sparseIntArray.put(C48033uCm.Activity.Dap, 221);
        sparseIntArray.put(C48033uCm.Activity.zEHIKV, 222);
        sparseIntArray.put(C48033uCm.Activity.FQMcgEfQMcgE, 223);
        sparseIntArray.put(C48033uCm.Activity.svhCHd, 224);
        sparseIntArray.put(C48033uCm.Activity.zDGrpR, 225);
        sparseIntArray.put(C48033uCm.Activity.v, 226);
        sparseIntArray.put(C48033uCm.Activity.sIqKDg, 227);
        sparseIntArray.put(C48033uCm.Activity.setPageName, 228);
        sparseIntArray.put(C48033uCm.Activity.FYtjSf, FreshnessState.FIRST_SCENE_ALPHA);
        sparseIntArray.put(C48033uCm.Activity.fdt, 230);
        sparseIntArray.put(C48033uCm.Activity.FSMca, 231);
        sparseIntArray.put(C48033uCm.Activity.UJEglR, 232);
        sparseIntArray.put(C48033uCm.Activity.dlRikr, 233);
        sparseIntArray.put(C48033uCm.Activity.GFUIi, 234);
        sparseIntArray.put(C48033uCm.Activity.DuXjdv, 235);
        sparseIntArray.put(C48033uCm.Activity.NRYds, 236);
        sparseIntArray.put(C48033uCm.Activity.fMBJsc, 237);
        sparseIntArray.put(C48033uCm.Activity.hbZCHz, 238);
        sparseIntArray.put(C48033uCm.Activity.sVvuFk, 239);
        sparseIntArray.put(C48033uCm.Activity.gbIfDn, PsExtractor.VIDEO_STREAM_MASK);
        sparseIntArray.put(C48033uCm.Activity.gVEiQJ, 241);
        sparseIntArray.put(C48033uCm.Activity.FhERFw, 242);
        sparseIntArray.put(C48033uCm.Activity.GCXiNH, 243);
        sparseIntArray.put(C48033uCm.Activity.sYcwUD, 244);
        sparseIntArray.put(C48033uCm.Activity.DRGLNw, 245);
        sparseIntArray.put(C48033uCm.Activity.Dfm, 246);
        sparseIntArray.put(C48033uCm.Activity.fTEjYi, 247);
        sparseIntArray.put(C48033uCm.Activity.GGlJim, 248);
        sparseIntArray.put(C48033uCm.Activity.Dfv, 249);
        sparseIntArray.put(C48033uCm.Activity.dbUqJD, 250);
        sparseIntArray.put(C48033uCm.Activity.OAhWiU, 251);
        sparseIntArray.put(C48033uCm.Activity.GPCHlQ, 252);
        sparseIntArray.put(C48033uCm.Activity.GLcwwN, 253);
        sparseIntArray.put(C48033uCm.Activity.aQtmcU, 254);
        sparseIntArray.put(C48033uCm.Activity.sILrnl, 255);
        sparseIntArray.put(C48033uCm.Activity.zeUYeG, 256);
        sparseIntArray.put(C48033uCm.Activity.GQzpsZ, 257);
        sparseIntArray.put(C48033uCm.Activity.OzhFjl, 258);
        sparseIntArray.put(C48033uCm.Activity.DBAlnt, 259);
        sparseIntArray.put(C48033uCm.Activity.QnnRaN, 260);
        sparseIntArray.put(C48033uCm.Activity.OrsvgJ, 261);
        sparseIntArray.put(C48033uCm.Activity.DQnQnb, 262);
        sparseIntArray.put(C48033uCm.Activity.QiTXOm, 263);
        sparseIntArray.put(C48033uCm.Activity.OgHfcT, 264);
        sparseIntArray.put(C48033uCm.Activity.RXdAnZ, 265);
        sparseIntArray.put(C48033uCm.Activity.RLmrWm, 266);
        sparseIntArray.put(C48033uCm.Activity.drbYRJ, 267);
        sparseIntArray.put(C48033uCm.Activity.gAnGwV, 268);
        sparseIntArray.put(C48033uCm.Activity.zFtALg, 269);
        sparseIntArray.put(C48033uCm.Activity.pXZxY, SubsamplingScaleImageView.ORIENTATION_270);
        sparseIntArray.put(C48033uCm.Activity.inahnb, 271);
        sparseIntArray.put(C48033uCm.Activity.hGuIrQ, 272);
        sparseIntArray.put(C48033uCm.Activity.sRzUNh, 273);
        sparseIntArray.put(C48033uCm.Activity.GQzpsZgQzpsZ, 274);
        sparseIntArray.put(C48033uCm.Activity.zXhzOT, 275);
        sparseIntArray.put(C48033uCm.Activity.getValue, 276);
        sparseIntArray.put(C48033uCm.Activity.RckOJh, 277);
        sparseIntArray.put(C48033uCm.Activity.DXd, 278);
        sparseIntArray.put(C48033uCm.Activity.fQQVvf, 279);
        sparseIntArray.put(C48033uCm.Activity.GhqvEQ, 280);
        sparseIntArray.put(C48033uCm.Activity.hKJZrr, 281);
        sparseIntArray.put(C48033uCm.Activity.OStAOF, 282);
        sparseIntArray.put(C48033uCm.Activity.zzJhsT, 283);
        sparseIntArray.put(C48033uCm.Activity.hgxRZI, 284);
        sparseIntArray.put(C48033uCm.Activity.GiPPlL, 285);
        sparseIntArray.put(C48033uCm.Activity.idLUrz, 286);
        sparseIntArray.put(C48033uCm.Activity.RcvFxC, 287);
        sparseIntArray.put(C48033uCm.Activity.config, 288);
        sparseIntArray.put(C48033uCm.Activity.RihMUf, 289);
        sparseIntArray.put(C48033uCm.Activity.getLocation, 290);
        sparseIntArray.put(C48033uCm.Activity.fhUrPt, 291);
        sparseIntArray.put(C48033uCm.Activity.unregister, 292);
        sparseIntArray.put(C48033uCm.Activity.GqbzPL, 293);
        sparseIntArray.put(C48033uCm.Activity.Dff, 294);
        sparseIntArray.put(C48033uCm.Activity.fZc, 295);
        sparseIntArray.put(C48033uCm.Activity.HJWChPDXdlte, 296);
        sparseIntArray.put(C48033uCm.Activity.RhjxDW, 297);
        sparseIntArray.put(C48033uCm.Activity.aappFQ, 298);
        sparseIntArray.put(C48033uCm.Activity.dXcUrg, 299);
        sparseIntArray.put(C48033uCm.Activity.hcetpZ, 300);
        sparseIntArray.put(C48033uCm.Activity.iLWfRf, 301);
        sparseIntArray.put(C48033uCm.Activity.gdLjtZ, 302);
        sparseIntArray.put(C48033uCm.Activity.HJWChPHhYHK, 303);
        sparseIntArray.put(C48033uCm.Activity.DeEinT, 304);
        sparseIntArray.put(C48033uCm.Activity.OxbLUn, 305);
        sparseIntArray.put(C48033uCm.Activity.Qsauvs, 306);
        sparseIntArray.put(C48033uCm.Activity.DVmcag, 307);
        sparseIntArray.put(C48033uCm.Activity.dSJNDS, 308);
        sparseIntArray.put(C48033uCm.Activity.putInt, 309);
        sparseIntArray.put(C48033uCm.Activity.hwkNQP, 310);
        sparseIntArray.put(C48033uCm.Activity.gFTCsA, 311);
        sparseIntArray.put(C48033uCm.Activity.sZqaRl, 312);
        sparseIntArray.put(C48033uCm.Activity.fAklCm, 313);
        sparseIntArray.put(C48033uCm.Activity.HJWChPOKBmQN, 314);
        sparseIntArray.put(C48033uCm.Activity.HJWChPOKBmQNaCIdOM, 315);
        sparseIntArray.put(C48033uCm.Activity.HJWChPOZOJIj, TypedValues.AttributesType.TYPE_PATH_ROTATE);
        sparseIntArray.put(C48033uCm.Activity.DjwCMv, TypedValues.AttributesType.TYPE_EASING);
        sparseIntArray.put(C48033uCm.Activity.fDu, TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        sparseIntArray.put(C48033uCm.Activity.QfZsXX, 319);
        sparseIntArray.put(C48033uCm.Activity.HJWChPQPAeHI, 320);
        sparseIntArray.put(C48033uCm.Activity.iLAtSv, 321);
        sparseIntArray.put(C48033uCm.Activity.QsIRgs, 322);
        sparseIntArray.put(C48033uCm.Activity.QOjuYg, 323);
        sparseIntArray.put(C48033uCm.Activity.itxZVF, 324);
        sparseIntArray.put(C48033uCm.Activity.ONJgbh, 325);
        sparseIntArray.put(C48033uCm.Activity.iWlNch, 326);
        sparseIntArray.put(C48033uCm.Activity.HJWChPQdUnVm, 327);
        sparseIntArray.put(C48033uCm.Activity.ibnZAm, 328);
        sparseIntArray.put(C48033uCm.Activity.RSmiaq, 329);
        sparseIntArray.put(C48033uCm.Activity.HJWChPRAkuRW, 330);
        sparseIntArray.put(C48033uCm.Activity.gCNefq, 331);
        sparseIntArray.put(C48033uCm.Activity.RWIpjU, 332);
        sparseIntArray.put(C48033uCm.Activity.HJWChPRGtXKC, 333);
        sparseIntArray.put(C48033uCm.Activity.HJWChPURsaBn, 334);
        sparseIntArray.put(C48033uCm.Activity.HJWChPRGtXKCRGtXKC, 335);
        sparseIntArray.put(C48033uCm.Activity.ikIEnW, 336);
        sparseIntArray.put(C48033uCm.Activity.HJWChPUUMfbK, 337);
        sparseIntArray.put(C48033uCm.Activity.DuR, 338);
        sparseIntArray.put(C48033uCm.Activity.BVXAa, 339);
        sparseIntArray.put(C48033uCm.Activity.HJWChPdIKEqB, 340);
        sparseIntArray.put(C48033uCm.Activity.HJWChPfvRMlC, 341);
        sparseIntArray.put(C48033uCm.Activity.RZMhtF, 342);
        sparseIntArray.put(C48033uCm.Activity.dpErvT, 343);
        sparseIntArray.put(C48033uCm.Activity.hfeTOA, 344);
        sparseIntArray.put(C48033uCm.Activity.iOIMNp, 345);
        sparseIntArray.put(C48033uCm.Activity.iRgjgR, 346);
        sparseIntArray.put(C48033uCm.Activity.gLWkOL, 347);
        sparseIntArray.put(C48033uCm.Activity.izFvvl, 348);
        sparseIntArray.put(C48033uCm.Activity.xxhdY, 349);
        sparseIntArray.put(C48033uCm.Activity.ilfrrN, 350);
        sparseIntArray.put(C48033uCm.Activity.aBDePw, 351);
        sparseIntArray.put(C48033uCm.Activity.DzCpqu, 352);
        sparseIntArray.put(C48033uCm.Activity.HJWChPiaHEvk, 353);
        sparseIntArray.put(C48033uCm.Activity.HJWChPzRXNTw, 354);
        sparseIntArray.put(C48033uCm.Activity.OqCbbx, 355);
        sparseIntArray.put(C48033uCm.Activity.DGgkXd, 356);
        sparseIntArray.put(C48033uCm.Activity.DpxfQh, 357);
        sparseIntArray.put(C48033uCm.Activity.geAOna, 358);
        sparseIntArray.put(C48033uCm.Activity.fzHEvu, 359);
        sparseIntArray.put(C48033uCm.Activity.DsfknC, 360);
        sparseIntArray.put(C48033uCm.Activity.apLTlu, 361);
        sparseIntArray.put(C48033uCm.Activity.OCdtug, 362);
        sparseIntArray.put(C48033uCm.Activity.DtnWsU, 363);
        sparseIntArray.put(C48033uCm.Activity.sEcTXd, 364);
        sparseIntArray.put(C48033uCm.Activity.iMXFZQ, 365);
        sparseIntArray.put(C48033uCm.Activity.icKaHr, 366);
        sparseIntArray.put(C48033uCm.Activity.jFiva, 367);
        sparseIntArray.put(C48033uCm.Activity.fJk, 368);
        sparseIntArray.put(C48033uCm.Activity.QzqeNH, 369);
        sparseIntArray.put(C48033uCm.Activity.OAjjVP, 370);
        sparseIntArray.put(C48033uCm.Activity.aWuQzD, 371);
        sparseIntArray.put(C48033uCm.Activity.dYepVG, 372);
        sparseIntArray.put(C48033uCm.Activity.seuMaA, 373);
        sparseIntArray.put(C48033uCm.Activity.adevsa, 374);
        sparseIntArray.put(C48033uCm.Activity.OFqMGB, 375);
        sparseIntArray.put(C48033uCm.Activity.OGitdB, 376);
        sparseIntArray.put(C48033uCm.Activity.zdxASf, 377);
        sparseIntArray.put(C48033uCm.Activity.fGT, 378);
        sparseIntArray.put(C48033uCm.Activity.OHsvZP, 379);
        sparseIntArray.put(C48033uCm.Activity.ORrpqH, 380);
        sparseIntArray.put(C48033uCm.Activity.dGrqPl, 381);
        sparseIntArray.put(C48033uCm.Activity.uLLnq, 382);
        sparseIntArray.put(C48033uCm.Activity.gZKUVK, 383);
        sparseIntArray.put(C48033uCm.Activity.FF, MLKEMEngine.KyberPolyBytes);
        sparseIntArray.put(C48033uCm.Activity.OUcgGI, 385);
        sparseIntArray.put(C48033uCm.Activity.OAUGar, 386);
        sparseIntArray.put(C48033uCm.Activity.QYNZmZ, 387);
        sparseIntArray.put(C48033uCm.Activity.OeawrHOeawrH, 388);
        sparseIntArray.put(C48033uCm.Activity.OqHLSf, 389);
        sparseIntArray.put(C48033uCm.Activity.fmdvVn, 390);
        sparseIntArray.put(C48033uCm.Activity.dkJJWw, 391);
        sparseIntArray.put(C48033uCm.Activity.gCiISl, 392);
        sparseIntArray.put(C48033uCm.Activity.OhcwxsRkSIEV, 393);
        sparseIntArray.put(C48033uCm.Activity.OmYuqg, 394);
        sparseIntArray.put(C48033uCm.Activity.compare, 395);
        sparseIntArray.put(C48033uCm.Activity.UJpkuA, 396);
        sparseIntArray.put(C48033uCm.Activity.DcNNRp, 397);
        sparseIntArray.put(C48033uCm.Activity.RIKbBf, 398);
        sparseIntArray.put(C48033uCm.Activity.OEsIKP, 399);
        sparseIntArray.put(C48033uCm.Activity.QhYuFg, 400);
        sparseIntArray.put(C48033uCm.Activity.gqESXP, 401);
        sparseIntArray.put(C48033uCm.Activity.aChkwz, 402);
        sparseIntArray.put(C48033uCm.Activity.fGsPTM, 403);
        sparseIntArray.put(C48033uCm.Activity.dtVxwd, 404);
        sparseIntArray.put(C48033uCm.Activity.isScanInProgress, 405);
        sparseIntArray.put(C48033uCm.Activity.sVaiLC, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED);
        sparseIntArray.put(C48033uCm.Activity.sJPPOI, 407);
        sparseIntArray.put(C48033uCm.Activity.isInitInProgress, 408);
        sparseIntArray.put(C48033uCm.Activity.vqBjd, 409);
        sparseIntArray.put(C48033uCm.Activity.OqhRBM, WalletConstants.ERROR_CODE_INVALID_TRANSACTION);
        sparseIntArray.put(C48033uCm.Activity.zHQtTQ, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE);
        sparseIntArray.put(C48033uCm.Activity.DDjgSw, 412);
        sparseIntArray.put(C48033uCm.Activity.OtZEmZ, WalletConstants.ERROR_CODE_UNKNOWN);
        sparseIntArray.put(C48033uCm.Activity.OtRJxF, WalletConstants.ERROR_CODE_ILLEGAL_CALLER);
        sparseIntArray.put(C48033uCm.Activity.zEkrwr, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE);
    }

    private final ViewDataBinding OLrzqt(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_bot_document_details_layout_0".equals(obj)) {
                    return new C48297uMg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bot_document_details_layout is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_bot_lead_history_strategys_0".equals(obj)) {
                    return new C48294uMd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bot_lead_history_strategys is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_bot_lead_strategys_0".equals(obj)) {
                    return new C48295uMe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bot_lead_strategys is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_bot_order_kline_0".equals(obj)) {
                    return new C48302uMl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bot_order_kline is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_bot_trade_0".equals(obj)) {
                    return new C48300uMj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bot_trade is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_market_place_my_bot_0".equals(obj)) {
                    return new C48303uMm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_market_place_my_bot is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_market_place_param_detail4_0".equals(obj)) {
                    return new C48308uMr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_market_place_param_detail4 is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_my_bot_shell_0".equals(obj)) {
                    return new C48311uMu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_my_bot_shell is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_search_strategy_layout_0".equals(obj)) {
                    return new uMA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_search_strategy_layout is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_smart_iceberg_start_trigger_0".equals(obj)) {
                    return new C48316uMz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_smart_iceberg_start_trigger is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_tactics_details_0".equals(obj)) {
                    return new C48314uMx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_tactics_details is invalid. Received: " + obj);
            case 12:
                if ("layout/bot_auto_earn_stking_profit_fragment_0".equals(obj)) {
                    return new uMP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_auto_earn_stking_profit_fragment is invalid. Received: " + obj);
            case 13:
                if ("layout/bot_dialog_contract_quick_order_0".equals(obj)) {
                    return new uMT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_dialog_contract_quick_order is invalid. Received: " + obj);
            case 14:
                if ("layout/bot_dialog_contract_quick_order_container_0".equals(obj)) {
                    return new uMU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_dialog_contract_quick_order_container is invalid. Received: " + obj);
            case 15:
                if ("layout/bot_dialog_contract_range_quick_order_0".equals(obj)) {
                    return new uMZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_dialog_contract_range_quick_order is invalid. Received: " + obj);
            case 16:
                if ("layout/bot_dialog_dcd_recommend_0".equals(obj)) {
                    return new uMY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_dialog_dcd_recommend is invalid. Received: " + obj);
            case 17:
                if ("layout/bot_dialog_spot_quick_order_0".equals(obj)) {
                    return new C48322uNe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_dialog_spot_quick_order is invalid. Received: " + obj);
            case 18:
                if ("layout/bot_dialog_spot_range_quick_order_0".equals(obj)) {
                    return new C48319uNb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_dialog_spot_range_quick_order is invalid. Received: " + obj);
            case 19:
                if ("layout/bot_fragment_bot_guide_spot_grid_0".equals(obj)) {
                    return new C48325uNh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_fragment_bot_guide_spot_grid is invalid. Received: " + obj);
            case 20:
                if ("layout/bot_guide_banner_common_amt_view_0".equals(obj)) {
                    return new C48331uNn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_guide_banner_common_amt_view is invalid. Received: " + obj);
            case 21:
                if ("layout/bot_layout_dca_add_pos_bottom_sheet_0".equals(obj)) {
                    return new C48335uNr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_layout_dca_add_pos_bottom_sheet is invalid. Received: " + obj);
            case 22:
                if ("layout/bot_list_bottom_operator_bar_0".equals(obj)) {
                    return new C48333uNp(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for bot_list_bottom_operator_bar is invalid. Received: " + obj);
            case 23:
                if ("layout/bot_spot_dca_dialog_trigger_rsi_0".equals(obj)) {
                    return new uNC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_spot_dca_dialog_trigger_rsi is invalid. Received: " + obj);
            case 24:
                if ("layout/bot_spot_dca_edit_confirm_dialog_0".equals(obj)) {
                    return new uNA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_spot_dca_edit_confirm_dialog is invalid. Received: " + obj);
            case 25:
                if ("layout/bot_spot_dca_edit_start_condition_0".equals(obj)) {
                    return new uNE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_spot_dca_edit_start_condition is invalid. Received: " + obj);
            case 26:
                if ("layout/bot_spot_dca_modify_parameters_0".equals(obj)) {
                    return new uNI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bot_spot_dca_modify_parameters is invalid. Received: " + obj);
            case 27:
                if ("layout/dca_history_fragment_0".equals(obj)) {
                    return new uNS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dca_history_fragment is invalid. Received: " + obj);
            case 28:
                if ("layout/dfragment_grid_record_detail_content_0".equals(obj)) {
                    return new C48347uOc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_grid_record_detail_content is invalid. Received: " + obj);
            case 29:
                if ("layout/dfragment_signal_bot_create_instids_0".equals(obj)) {
                    return new uNZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_signal_bot_create_instids is invalid. Received: " + obj);
            case 30:
                if ("layout/dfragment_signal_bot_edit_instids_0".equals(obj)) {
                    return new uNY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_signal_bot_edit_instids is invalid. Received: " + obj);
            case 31:
                if ("layout/dfragment_signal_bot_instids_0".equals(obj)) {
                    return new C48352uOh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_signal_bot_instids is invalid. Received: " + obj);
            case 32:
                if ("layout/dialog_bot_order_failed_0".equals(obj)) {
                    return new C48354uOj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_bot_order_failed is invalid. Received: " + obj);
            case 33:
                if ("layout/dialog_copy_tradingview_info_0".equals(obj)) {
                    return new C48355uOk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_copy_tradingview_info is invalid. Received: " + obj);
            case 34:
                if ("layout/dialog_tradingview_info_guide_0".equals(obj)) {
                    return new C48358uOn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_tradingview_info_guide is invalid. Received: " + obj);
            case 35:
                if ("layout/dialog_use_quote_tips_0".equals(obj)) {
                    return new C48360uOp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_use_quote_tips is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_ai_recommend_0".equals(obj)) {
                    return new C48363uOs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_ai_recommend is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_arbitrage_content_0".equals(obj)) {
                    return new C48367uOw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_arbitrage_content is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_arbitrage_search_root_0".equals(obj)) {
                    return new C48364uOt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_arbitrage_search_root is invalid. Received: " + obj);
            case 39:
                if ("layout/fragment_arbitrage_set_price_0".equals(obj)) {
                    return new uOB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_arbitrage_set_price is invalid. Received: " + obj);
            case 40:
                if ("layout/fragment_auto_earn_profit_list_0".equals(obj)) {
                    return new C48369uOy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_auto_earn_profit_list is invalid. Received: " + obj);
            case 41:
                if ("layout/fragment_benefit_details_0".equals(obj)) {
                    return new uOF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_benefit_details is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_bot_auto_bot_earn_staking_education_0".equals(obj)) {
                    return new uOD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_auto_bot_earn_staking_education is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_bot_auto_earn_education_0".equals(obj)) {
                    return new uOJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_auto_earn_education is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_bot_guide_banner_order_dialog_0".equals(obj)) {
                    return new uOK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_guide_banner_order_dialog is invalid. Received: " + obj);
            case 45:
                if ("layout/fragment_bot_kline_layout_0".equals(obj)) {
                    return new uOH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_kline_layout is invalid. Received: " + obj);
            case 46:
                if ("layout/fragment_bot_kline_lua_layout_0".equals(obj)) {
                    return new uON(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_kline_lua_layout is invalid. Received: " + obj);
            case 47:
                if ("layout/fragment_bot_lead_signalbot_0".equals(obj)) {
                    return new uOM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_signalbot is invalid. Received: " + obj);
            case 48:
                if ("layout/fragment_bot_lead_signalbot_settlement_0".equals(obj)) {
                    return new uOU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_signalbot_settlement is invalid. Received: " + obj);
            case 49:
                if ("layout/fragment_bot_lead_signalbot_state_page_0".equals(obj)) {
                    return new uOV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_signalbot_state_page is invalid. Received: " + obj);
            case 50:
                if ("layout/fragment_bot_lead_signalbot_user_0".equals(obj)) {
                    return new uOR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_signalbot_user is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding copydefault(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/fragment_bot_lead_strategy_0".equals(obj)) {
                    return new uOX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_strategy is invalid. Received: " + obj);
            case 52:
                if ("layout/fragment_bot_lead_trade_overview_0".equals(obj)) {
                    return new uOY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_trade_overview is invalid. Received: " + obj);
            case 53:
                if ("layout/fragment_bot_lead_user_0".equals(obj)) {
                    return new C48375uPd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_user is invalid. Received: " + obj);
            case 54:
                if ("layout/fragment_bot_lead_user_order_history_0".equals(obj)) {
                    return new C48377uPf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_user_order_history is invalid. Received: " + obj);
            case 55:
                if ("layout/fragment_bot_lead_user_order_pending_0".equals(obj)) {
                    return new C48376uPe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_lead_user_order_pending is invalid. Received: " + obj);
            case 56:
                if ("layout/fragment_bot_list_sort_panel_0".equals(obj)) {
                    return new C48382uPk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_list_sort_panel is invalid. Received: " + obj);
            case 57:
                if ("layout/fragment_bot_market_place_0".equals(obj)) {
                    return new C48378uPg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_market_place is invalid. Received: " + obj);
            case 58:
                if ("layout/fragment_bot_order_confirm_0".equals(obj)) {
                    return new C48386uPo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_order_confirm is invalid. Received: " + obj);
            case 59:
                if ("layout/fragment_bot_recurring_price_range_layout_0".equals(obj)) {
                    return new C48384uPm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_recurring_price_range_layout is invalid. Received: " + obj);
            case 60:
                if ("layout/fragment_bot_selected_0".equals(obj)) {
                    return new C48385uPn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_selected is invalid. Received: " + obj);
            case 61:
                if ("layout/fragment_bot_trade_container_0".equals(obj)) {
                    return new C48392uPu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_trade_container is invalid. Received: " + obj);
            case 62:
                if ("layout/fragment_coin_filter_search_0".equals(obj)) {
                    return new C48389uPr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coin_filter_search is invalid. Received: " + obj);
            case 63:
                if ("layout/fragment_contract_dca_reinvestment_0".equals(obj)) {
                    return new C48393uPv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_dca_reinvestment is invalid. Received: " + obj);
            case 64:
                if ("layout/fragment_contract_grid_add_investment_dialog_0".equals(obj)) {
                    return new C48397uPz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_grid_add_investment_dialog is invalid. Received: " + obj);
            case 65:
                if ("layout/fragment_contract_grid_pending_order_0".equals(obj)) {
                    return new uPE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_grid_pending_order is invalid. Received: " + obj);
            case 66:
                if ("layout/fragment_contract_grid_sync_params_dialog_0".equals(obj)) {
                    return new uPA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_grid_sync_params_dialog is invalid. Received: " + obj);
            case 67:
                if ("layout/fragment_earn_calculation_bottom_sheet_0".equals(obj)) {
                    return new uPB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_earn_calculation_bottom_sheet is invalid. Received: " + obj);
            case 68:
                if ("layout/fragment_grid_explained_0".equals(obj)) {
                    return new uPF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_grid_explained is invalid. Received: " + obj);
            case 69:
                if ("layout/fragment_grid_pending_order_0".equals(obj)) {
                    return new uPJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_grid_pending_order is invalid. Received: " + obj);
            case 70:
                if ("layout/fragment_home_bot_square_0".equals(obj)) {
                    return new uPN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_bot_square is invalid. Received: " + obj);
            case 71:
                if ("layout/fragment_home_signal_list_0".equals(obj)) {
                    return new uPM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_signal_list is invalid. Received: " + obj);
            case 72:
                if ("layout/fragment_home_signal_square_0".equals(obj)) {
                    return new uPT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_signal_square is invalid. Received: " + obj);
            case 73:
                if ("layout/fragment_home_strategy_list_0".equals(obj)) {
                    return new uPP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home_strategy_list is invalid. Received: " + obj);
            case 74:
                if ("layout/fragment_manually_grid_0".equals(obj)) {
                    return new uPW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_manually_grid is invalid. Received: " + obj);
            case 75:
                if ("layout/fragment_market_place_0".equals(obj)) {
                    return new uPU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_market_place is invalid. Received: " + obj);
            case 76:
                if ("layout/fragment_market_place_copy_confirm_0".equals(obj)) {
                    return new uPY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_market_place_copy_confirm is invalid. Received: " + obj);
            case 77:
                if ("layout/fragment_market_place_copy_create_order_0".equals(obj)) {
                    return new uPZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_market_place_copy_create_order is invalid. Received: " + obj);
            case 78:
                if ("layout/fragment_more_operator_dialog_0".equals(obj)) {
                    return new C48401uQc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_more_operator_dialog is invalid. Received: " + obj);
            case 79:
                if ("layout/fragment_no_close_open_orders_0".equals(obj)) {
                    return new C48407uQi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_no_close_open_orders is invalid. Received: " + obj);
            case 80:
                if ("layout/fragment_no_close_position_container_0".equals(obj)) {
                    return new C48404uQf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_no_close_position_container is invalid. Received: " + obj);
            case 81:
                if ("layout/fragment_no_close_position_history_0".equals(obj)) {
                    return new C48406uQh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_no_close_position_history is invalid. Received: " + obj);
            case 82:
                if ("layout/fragment_recurring_coin_ratio_0".equals(obj)) {
                    return new C48408uQj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recurring_coin_ratio is invalid. Received: " + obj);
            case 83:
                if ("layout/fragment_recurring_cycle_step2_0".equals(obj)) {
                    return new C48411uQm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recurring_cycle_step2 is invalid. Received: " + obj);
            case 84:
                if ("layout/fragment_recurring_select_coin_0".equals(obj)) {
                    return new C48414uQp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recurring_select_coin is invalid. Received: " + obj);
            case 85:
                if ("layout/fragment_signal_bot_entry_options_select_0".equals(obj)) {
                    return new C48416uQr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_signal_bot_entry_options_select is invalid. Received: " + obj);
            case 86:
                if ("layout/fragment_signal_bot_exit_options_select_0".equals(obj)) {
                    return new C48415uQq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_signal_bot_exit_options_select is invalid. Received: " + obj);
            case 87:
                if ("layout/fragment_signal_bot_explained_content_0".equals(obj)) {
                    return new C48421uQw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_signal_bot_explained_content is invalid. Received: " + obj);
            case 88:
                if ("layout/fragment_signal_bot_order_type_selet_0".equals(obj)) {
                    return new C48420uQv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_signal_bot_order_type_selet is invalid. Received: " + obj);
            case 89:
                if ("layout/fragment_signal_total_orders_0".equals(obj)) {
                    return new C48424uQz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_signal_total_orders is invalid. Received: " + obj);
            case 90:
                if ("layout/fragment_smart_arbi_arbitrage_apy_dialog_0".equals(obj)) {
                    return new uQF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_smart_arbi_arbitrage_apy_dialog is invalid. Received: " + obj);
            case 91:
                if ("layout/fragment_smart_arbi_preview_position_0".equals(obj)) {
                    return new uQE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_smart_arbi_preview_position is invalid. Received: " + obj);
            case 92:
                if ("layout/fragment_smart_arbi_preview_profit_loss_0".equals(obj)) {
                    return new uQK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_smart_arbi_preview_profit_loss is invalid. Received: " + obj);
            case 93:
                if ("layout/fragment_smart_iceberg_0".equals(obj)) {
                    return new uQI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_smart_iceberg is invalid. Received: " + obj);
            case 94:
                if ("layout/fragment_smart_portfolio_0".equals(obj)) {
                    return new uQJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_smart_portfolio is invalid. Received: " + obj);
            case 95:
                if ("layout/fragment_styles_and_filters_0".equals(obj)) {
                    return new uQP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_styles_and_filters is invalid. Received: " + obj);
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                if ("layout/fragment_tactics_contract_grid_manually_0".equals(obj)) {
                    return new uQQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_tactics_contract_grid_manually is invalid. Received: " + obj);
            case 97:
                if ("layout/fragment_tactics_information_0".equals(obj)) {
                    return new uQU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_tactics_information is invalid. Received: " + obj);
            case 98:
                if ("layout/fragment_tactics_normal_information_0".equals(obj)) {
                    return new uQS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_tactics_normal_information is invalid. Received: " + obj);
            case 99:
                if ("layout/fragment_tactics_recurring_new_0".equals(obj)) {
                    return new uQZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_tactics_recurring_new is invalid. Received: " + obj);
            case 100:
                if ("layout/fragment_tactics_signal_bot_create_0".equals(obj)) {
                    return new uQY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_tactics_signal_bot_create is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding AEQbTJ(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 101:
                if ("layout/fragment_transaction_record_order_0".equals(obj)) {
                    return new C48433uRf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_transaction_record_order is invalid. Received: " + obj);
            case 102:
                if ("layout/fragment_transaction_record_order_contract_grid_0".equals(obj)) {
                    return new C48430uRc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_transaction_record_order_contract_grid is invalid. Received: " + obj);
            case 103:
                if ("layout/fragment_twap_0".equals(obj)) {
                    return new C48434uRg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_twap is invalid. Received: " + obj);
            case 104:
                if ("layout/item_bot_lead_signal_bot_settlement_0".equals(obj)) {
                    return new C48436uRi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bot_lead_signal_bot_settlement is invalid. Received: " + obj);
            case 105:
                if ("layout/item_bot_lead_signal_bot_vertical_info_0".equals(obj)) {
                    return new C48437uRj(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for item_bot_lead_signal_bot_vertical_info is invalid. Received: " + obj);
            case 106:
                if ("layout/item_bot_lead_unpublish_signal_bot_0".equals(obj)) {
                    return new C48444uRq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bot_lead_unpublish_signal_bot is invalid. Received: " + obj);
            case 107:
                if ("layout/item_bot_position_history_0".equals(obj)) {
                    return new C48442uRo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bot_position_history is invalid. Received: " + obj);
            case 108:
                if ("layout/item_more_operator_common_function_0".equals(obj)) {
                    return new C48449uRv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_more_operator_common_function is invalid. Received: " + obj);
            case 109:
                if ("layout/item_more_operator_layout_0".equals(obj)) {
                    return new C48446uRs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_more_operator_layout is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_AA_CREATE_KEY /* 110 */:
                if ("layout/item_recurring_cycle_step2_0".equals(obj)) {
                    return new C48450uRw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_recurring_cycle_step2 is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY /* 111 */:
                if ("layout/item_spread_trade_argitrage_0".equals(obj)) {
                    return new uRD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_spread_trade_argitrage is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_AA_EXIST /* 112 */:
                if ("layout/item_stop_strategy_0".equals(obj)) {
                    return new uRF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_stop_strategy is invalid. Received: " + obj);
            case WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST /* 113 */:
                if ("layout/item_strategy_arbitrage_list_0".equals(obj)) {
                    return new uRH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_strategy_arbitrage_list is invalid. Received: " + obj);
            case 114:
                if ("layout/item_strategy_order_confirm_0".equals(obj)) {
                    return new uRG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_strategy_order_confirm is invalid. Received: " + obj);
            case 115:
                if ("layout/layout_bot_lead_profit_share_detail_0".equals(obj)) {
                    return new uRN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_bot_lead_profit_share_detail is invalid. Received: " + obj);
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                if ("layout/layout_bot_loss_insurance_explain_dialog_0".equals(obj)) {
                    return new uRS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_bot_loss_insurance_explain_dialog is invalid. Received: " + obj);
            case 117:
                if ("layout/layout_bot_loss_insurance_label_0".equals(obj)) {
                    return new uRT(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_bot_loss_insurance_label is invalid. Received: " + obj);
            case 118:
                if ("layout/layout_bot_loss_insurance_tag_0".equals(obj)) {
                    return new uRV(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_bot_loss_insurance_tag is invalid. Received: " + obj);
            case 119:
                if ("layout/layout_bottom_button_view_0".equals(obj)) {
                    return new uRW(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_bottom_button_view is invalid. Received: " + obj);
            case 120:
                if ("layout/layout_close_position_bottom_sheet_0".equals(obj)) {
                    return new uRZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_close_position_bottom_sheet is invalid. Received: " + obj);
            case 121:
                if ("layout/layout_detail_parameter_fragment_0".equals(obj)) {
                    return new C48456uSb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_detail_parameter_fragment is invalid. Received: " + obj);
            case 122:
                if ("layout/layout_filter_and_sort_bar_0".equals(obj)) {
                    return new C48459uSe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_filter_and_sort_bar is invalid. Received: " + obj);
            case 123:
                if ("layout/layout_grid_bot_stop_fragment_0".equals(obj)) {
                    return new C48463uSi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_grid_bot_stop_fragment is invalid. Received: " + obj);
            case 124:
                if ("layout/layout_recurring_ok_tag_0".equals(obj)) {
                    return new C48461uSg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_recurring_ok_tag is invalid. Received: " + obj);
            case 125:
                if ("layout/layout_signal_bot_type_view_0".equals(obj)) {
                    return new C48465uSk(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_signal_bot_type_view is invalid. Received: " + obj);
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                if ("layout/layout_smart_recommend_item_0".equals(obj)) {
                    return new C48466uSl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_smart_recommend_item is invalid. Received: " + obj);
            case 127:
                if ("layout/llm_order_fragment_0".equals(obj)) {
                    return new C48474uSt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for llm_order_fragment is invalid. Received: " + obj);
            case 128:
                if ("layout/market_place_common_amt_view_0".equals(obj)) {
                    return new C48470uSp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for market_place_common_amt_view is invalid. Received: " + obj);
            case 129:
                if ("layout/market_place_contract_grid_amt_view_0".equals(obj)) {
                    return new C48476uSv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for market_place_contract_grid_amt_view is invalid. Received: " + obj);
            case 130:
                if ("layout/market_place_copy_param_item_price_range_0".equals(obj)) {
                    return new C48479uSy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for market_place_copy_param_item_price_range is invalid. Received: " + obj);
            case DateFormat.RELATIVE_SHORT /* 131 */:
                if ("layout/market_place_recurring_amt_view_0".equals(obj)) {
                    return new uSB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for market_place_recurring_amt_view is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                if ("layout/market_place_smart_portfolio_amt_view_0".equals(obj)) {
                    return new uSA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for market_place_smart_portfolio_amt_view is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                if ("layout/market_place_spot_dca_amt_view_0".equals(obj)) {
                    return new C48480uSz(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for market_place_spot_dca_amt_view is invalid. Received: " + obj);
            case 134:
                if ("layout/overview_fragment_0".equals(obj)) {
                    return new uSE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for overview_fragment is invalid. Received: " + obj);
            case 135:
                if ("layout/signal_multi_coin_select_fragment_0".equals(obj)) {
                    return new uSM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for signal_multi_coin_select_fragment is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                if ("layout/smart_arbitrage_advanced_setting_view_0".equals(obj)) {
                    return new uSV(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for smart_arbitrage_advanced_setting_view is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                if ("layout/smart_arbitrage_manual_fragment_0".equals(obj)) {
                    return new uSZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for smart_arbitrage_manual_fragment is invalid. Received: " + obj);
            case 138:
                if ("layout/spot_dca_explain_fragment_0".equals(obj)) {
                    return new C48482uTa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for spot_dca_explain_fragment is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                if ("layout/tactics_available_item_text_layout_0".equals(obj)) {
                    return new C48488uTg(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for tactics_available_item_text_layout is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                if ("layout/tactics_information_coin_stack_item_0".equals(obj)) {
                    return new C48485uTd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for tactics_information_coin_stack_item is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                if ("layout/tactics_information_tv_item_0".equals(obj)) {
                    return new C48487uTf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for tactics_information_tv_item is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                if ("layout/tactics_recurring_price_range_item_0".equals(obj)) {
                    return new C48492uTk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for tactics_recurring_price_range_item is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                if ("layout/tactics_tips_dialog_tv_item_0".equals(obj)) {
                    return new C48490uTi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for tactics_tips_dialog_tv_item is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /* 144 */:
                if ("layout/trade_ai_recommend_item_layout_0".equals(obj)) {
                    return new C48495uTn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ai_recommend_item_layout is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                if ("layout/trade_arbitrage_switch_margin_mode_layout_0".equals(obj)) {
                    return new C48497uTp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_arbitrage_switch_margin_mode_layout is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                if ("layout/trade_bot_contract_grid_switch_direction_view_0".equals(obj)) {
                    return new C48503uTv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_bot_contract_grid_switch_direction_view is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                if ("layout/trade_bot_switch_direction_view_0".equals(obj)) {
                    return new C48501uTt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_bot_switch_direction_view is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA /* 148 */:
                if ("layout/trade_contract_grid_edit_param_dialog_0".equals(obj)) {
                    return new C48506uTy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_contract_grid_edit_param_dialog is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA /* 149 */:
                if ("layout/trade_grid_edit_param_dialog_0".equals(obj)) {
                    return new uTA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_grid_edit_param_dialog is invalid. Received: " + obj);
            case 150:
                if ("layout/trade_impl_activity_bot_guide_spot_grid_0".equals(obj)) {
                    return new uTB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_activity_bot_guide_spot_grid is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding djBIcL(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA /* 151 */:
                if ("layout/trade_impl_activity_condition_setting_0".equals(obj)) {
                    return new uTG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_activity_condition_setting is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                if ("layout/trade_impl_activity_contract_dca_auto_margin_0".equals(obj)) {
                    return new uTD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_activity_contract_dca_auto_margin is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA /* 153 */:
                if ("layout/trade_impl_activity_contract_grid_rsi_setting_0".equals(obj)) {
                    return new uTL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_activity_contract_grid_rsi_setting is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA /* 154 */:
                if ("layout/trade_impl_activity_grid_rsi_setting_0".equals(obj)) {
                    return new uTH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_activity_grid_rsi_setting is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                if ("layout/trade_impl_activity_signal_bot_copy_detail_0".equals(obj)) {
                    return new uTK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_activity_signal_bot_copy_detail is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                if ("layout/trade_impl_activity_signal_bot_profit_0".equals(obj)) {
                    return new uTN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_activity_signal_bot_profit is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                if ("layout/trade_impl_activity_signal_bot_trigger_0".equals(obj)) {
                    return new uTM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_activity_signal_bot_trigger is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 /* 158 */:
                if ("layout/trade_impl_bot_guide_smart_portfolio_desc_0".equals(obj)) {
                    return new uTT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_bot_guide_smart_portfolio_desc is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 /* 159 */:
                if ("layout/trade_impl_chat_community_item_0".equals(obj)) {
                    return new uTV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_chat_community_item is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                if ("layout/trade_impl_contract_dca_advanced_layout_0".equals(obj)) {
                    return new uTR(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_contract_dca_advanced_layout is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                if ("layout/trade_impl_contract_dca_append_condition_dialog_0".equals(obj)) {
                    return new C48509uUa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_contract_dca_append_condition_dialog is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                if ("layout/trade_impl_contract_dca_stop_loss_dialog_0".equals(obj)) {
                    return new uTY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_contract_dca_stop_loss_dialog is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                if ("layout/trade_impl_contract_grid_edit_confirm_dialog_0".equals(obj)) {
                    return new C48511uUc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_contract_grid_edit_confirm_dialog is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                if ("layout/trade_impl_customer_and_community_item_0".equals(obj)) {
                    return new C48510uUb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_customer_and_community_item is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                if ("layout/trade_impl_dcd_advanced_product_match_0".equals(obj)) {
                    return new C48512uUd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dcd_advanced_product_match is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 /* 166 */:
                if ("layout/trade_impl_dcd_advanced_setting_layout_0".equals(obj)) {
                    return new C48519uUk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dcd_advanced_setting_layout is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 /* 167 */:
                if ("layout/trade_impl_dcd_principle_explain_dialog_0".equals(obj)) {
                    return new C48516uUh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dcd_principle_explain_dialog is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                if ("layout/trade_impl_dfragment_stop_bot_0".equals(obj)) {
                    return new C48520uUl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dfragment_stop_bot is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                if ("layout/trade_impl_dialog_contract_ai_order_0".equals(obj)) {
                    return new C48521uUm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dialog_contract_ai_order is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                if ("layout/trade_impl_dialog_contract_dca_add_order_0".equals(obj)) {
                    return new C48522uUn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dialog_contract_dca_add_order is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                if ("layout/trade_impl_dialog_contract_dca_ai_order_0".equals(obj)) {
                    return new C48529uUu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dialog_contract_dca_ai_order is invalid. Received: " + obj);
            case 172:
                if ("layout/trade_impl_dialog_spot_ai_order_0".equals(obj)) {
                    return new C48525uUq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dialog_spot_ai_order is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                if ("layout/trade_impl_dialog_spot_dca_ai_order_0".equals(obj)) {
                    return new C48532uUx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_dialog_spot_dca_ai_order is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                if ("layout/trade_impl_explain_chart_best_price_0".equals(obj)) {
                    return new C48531uUw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_chart_best_price is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                if ("layout/trade_impl_explain_chart_better_price_0".equals(obj)) {
                    return new C48534uUz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_chart_better_price is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
                if ("layout/trade_impl_explain_chart_fast_deal_0".equals(obj)) {
                    return new uUC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_chart_fast_deal is invalid. Received: " + obj);
            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                if ("layout/trade_impl_explain_start_and_build_0".equals(obj)) {
                    return new uUA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_start_and_build is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                if ("layout/trade_impl_explain_stop_and_sell_0".equals(obj)) {
                    return new uUG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_stop_and_sell is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                if ("layout/trade_impl_explain_tp_sl_0".equals(obj)) {
                    return new uUF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_tp_sl is invalid. Received: " + obj);
            case 180:
                if ("layout/trade_impl_explain_trailing_chart_classify_0".equals(obj)) {
                    return new uUI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_trailing_chart_classify is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                if ("layout/trade_impl_explain_trailing_down_chart_0".equals(obj)) {
                    return new uUM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_trailing_down_chart is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                if ("layout/trade_impl_explain_trailing_grid_0".equals(obj)) {
                    return new uUK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_trailing_grid is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                if ("layout/trade_impl_explain_trailing_up_chart_0".equals(obj)) {
                    return new uUR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_trailing_up_chart is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                if ("layout/trade_impl_explain_trigger_condition_0".equals(obj)) {
                    return new uUT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explain_trigger_condition is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                if ("layout/trade_impl_explained_dialog_0".equals(obj)) {
                    return new uUS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_explained_dialog is invalid. Received: " + obj);
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                if ("layout/trade_impl_fragment_bot_category_0".equals(obj)) {
                    return new uUW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_bot_category is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                if ("layout/trade_impl_fragment_bot_guide_contract_dca_0".equals(obj)) {
                    return new uUU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_bot_guide_contract_dca is invalid. Received: " + obj);
            case 188:
                if ("layout/trade_impl_fragment_bot_guide_contract_grid_0".equals(obj)) {
                    return new C48539uVd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_bot_guide_contract_grid is invalid. Received: " + obj);
            case 189:
                if ("layout/trade_impl_fragment_bot_guide_smart_portfolio_0".equals(obj)) {
                    return new C48537uVb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_bot_guide_smart_portfolio is invalid. Received: " + obj);
            case 190:
                if ("layout/trade_impl_fragment_bot_home_selected_0".equals(obj)) {
                    return new C48538uVc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_bot_home_selected is invalid. Received: " + obj);
            case 191:
                if ("layout/trade_impl_fragment_bot_nmp_0".equals(obj)) {
                    return new C48542uVg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_bot_nmp is invalid. Received: " + obj);
            case 192:
                if ("layout/trade_impl_fragment_history_event_0".equals(obj)) {
                    return new C48544uVi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_history_event is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                if ("layout/trade_impl_fragment_history_positions_0".equals(obj)) {
                    return new C48545uVj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_history_positions is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                if ("layout/trade_impl_fragment_mp_bot_category_0".equals(obj)) {
                    return new C48546uVk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_mp_bot_category is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                if ("layout/trade_impl_fragment_my_bot_and_signal_0".equals(obj)) {
                    return new C48549uVn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_my_bot_and_signal is invalid. Received: " + obj);
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                if ("layout/trade_impl_fragment_my_bot_assets_chart_0".equals(obj)) {
                    return new C48552uVq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_my_bot_assets_chart is invalid. Received: " + obj);
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                if ("layout/trade_impl_fragment_nmp_bot_square_0".equals(obj)) {
                    return new C48551uVp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_nmp_bot_square is invalid. Received: " + obj);
            case 198:
                if ("layout/trade_impl_fragment_nmp_signal_square_0".equals(obj)) {
                    return new C48558uVw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_nmp_signal_square is invalid. Received: " + obj);
            case 199:
                if ("layout/trade_impl_fragment_signal_bot_orders_0".equals(obj)) {
                    return new C48555uVt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_signal_bot_orders is invalid. Received: " + obj);
            case 200:
                if ("layout/trade_impl_fragment_signal_bot_position_0".equals(obj)) {
                    return new C48556uVu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_signal_bot_position is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding AYXKKw(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 201:
                if ("layout/trade_impl_fragment_signal_create_bot_0".equals(obj)) {
                    return new C48560uVy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_signal_create_bot is invalid. Received: " + obj);
            case 202:
                if ("layout/trade_impl_fragment_signal_subs_confirm_0".equals(obj)) {
                    return new uVB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_signal_subs_confirm is invalid. Received: " + obj);
            case 203:
                if ("layout/trade_impl_fragment_signal_subs_selected_0".equals(obj)) {
                    return new uVH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_signal_subs_selected is invalid. Received: " + obj);
            case 204:
                if ("layout/trade_impl_fragment_single_coin_select_0".equals(obj)) {
                    return new uVD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_fragment_single_coin_select is invalid. Received: " + obj);
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                if ("layout/trade_impl_future_grid_advanced_layout_0".equals(obj)) {
                    return new uVF(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_future_grid_advanced_layout is invalid. Received: " + obj);
            case 206:
                if ("layout/trade_impl_grid_edit_confirm_dialog_0".equals(obj)) {
                    return new uVJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_grid_edit_confirm_dialog is invalid. Received: " + obj);
            case 207:
                if ("layout/trade_impl_grid_futures_grid_slippage_control_dialog_0".equals(obj)) {
                    return new uVM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_grid_futures_grid_slippage_control_dialog is invalid. Received: " + obj);
            case 208:
                if ("layout/trade_impl_grid_mode_explain_dialog_0".equals(obj)) {
                    return new uVR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_grid_mode_explain_dialog is invalid. Received: " + obj);
            case 209:
                if ("layout/trade_impl_grid_mode_item_view_0".equals(obj)) {
                    return new uVO(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_grid_mode_item_view is invalid. Received: " + obj);
            case 210:
                if ("layout/trade_impl_grid_smart_arbitrage_open_position_cond_dialog_0".equals(obj)) {
                    return new uVP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_grid_smart_arbitrage_open_position_cond_dialog is invalid. Received: " + obj);
            case 211:
                if ("layout/trade_impl_grid_tp_sl_dialog_0".equals(obj)) {
                    return new uVT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_grid_tp_sl_dialog is invalid. Received: " + obj);
            case com.flyco.tablayout.BuildConfig.VERSION_CODE /* 212 */:
                if ("layout/trade_impl_grid_tp_sl_dialog2_0".equals(obj)) {
                    return new uVU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_grid_tp_sl_dialog2 is invalid. Received: " + obj);
            case 213:
                if ("layout/trade_impl_history_position_item_0".equals(obj)) {
                    return new uVY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_history_position_item is invalid. Received: " + obj);
            case me.relex.circleindicator.BuildConfig.VERSION_CODE /* 214 */:
                if ("layout/trade_impl_inner_item_view_0".equals(obj)) {
                    return new C48564uWb(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_inner_item_view is invalid. Received: " + obj);
            case 215:
                if ("layout/trade_impl_item_signal_subscribe_0".equals(obj)) {
                    return new uVZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_item_signal_subscribe is invalid. Received: " + obj);
            case 216:
                if ("layout/trade_impl_item_switch_button_view_0".equals(obj)) {
                    return new C48567uWe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_item_switch_button_view is invalid. Received: " + obj);
            case 217:
                if ("layout/trade_impl_mp_bot_copy_trader_view_0".equals(obj)) {
                    return new C48572uWj(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_mp_bot_copy_trader_view is invalid. Received: " + obj);
            case 218:
                if ("layout/trade_impl_mp_bot_copy_win_rate_view_0".equals(obj)) {
                    return new C48573uWk(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_mp_bot_copy_win_rate_view is invalid. Received: " + obj);
            case 219:
                if ("layout/trade_impl_mp_home_create_bot_couple_layout_0".equals(obj)) {
                    return new C48574uWl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_mp_home_create_bot_couple_layout is invalid. Received: " + obj);
            case 220:
                if ("layout/trade_impl_mp_home_create_bot_layout_0".equals(obj)) {
                    return new C48576uWn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_mp_home_create_bot_layout is invalid. Received: " + obj);
            case 221:
                if ("layout/trade_impl_mp_home_create_bot_multi_layout_0".equals(obj)) {
                    return new C48577uWo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_mp_home_create_bot_multi_layout is invalid. Received: " + obj);
            case 222:
                if ("layout/trade_impl_mp_spot_grid_amt_view_0".equals(obj)) {
                    return new C48583uWu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_mp_spot_grid_amt_view is invalid. Received: " + obj);
            case 223:
                if ("layout/trade_impl_my_bot_asset_select_press_view_0".equals(obj)) {
                    return new C48580uWr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_my_bot_asset_select_press_view is invalid. Received: " + obj);
            case 224:
                if ("layout/trade_impl_my_bot_asset_status_loading_view_0".equals(obj)) {
                    return new C48584uWv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_my_bot_asset_status_loading_view is invalid. Received: " + obj);
            case 225:
                if ("layout/trade_impl_my_bot_asset_status_view_0".equals(obj)) {
                    return new C48588uWz(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_my_bot_asset_status_view is invalid. Received: " + obj);
            case 226:
                if ("layout/trade_impl_my_bot_item_asset_select_view_0".equals(obj)) {
                    return new C48586uWx(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_my_bot_item_asset_select_view is invalid. Received: " + obj);
            case 227:
                if ("layout/trade_impl_nmp_bot_suqare_guide_item_0".equals(obj)) {
                    return new uWE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_nmp_bot_suqare_guide_item is invalid. Received: " + obj);
            case 228:
                if ("layout/trade_impl_nmp_bot_suqare_marquee_container_0".equals(obj)) {
                    return new uWD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_nmp_bot_suqare_marquee_container is invalid. Received: " + obj);
            case FreshnessState.FIRST_SCENE_ALPHA /* 229 */:
                if ("layout/trade_impl_nmp_bot_suqare_vertical_container_0".equals(obj)) {
                    return new uWC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_nmp_bot_suqare_vertical_container is invalid. Received: " + obj);
            case 230:
                if ("layout/trade_impl_recurring_advanced_layout_0".equals(obj)) {
                    return new uWG(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_recurring_advanced_layout is invalid. Received: " + obj);
            case 231:
                if ("layout/trade_impl_rsi_settings_layout_0".equals(obj)) {
                    return new uWJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_rsi_settings_layout is invalid. Received: " + obj);
            case 232:
                if ("layout/trade_impl_signal_bot_advanced_layout_0".equals(obj)) {
                    return new uWO(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_signal_bot_advanced_layout is invalid. Received: " + obj);
            case 233:
                if ("layout/trade_impl_signal_bot_dialog_manual_order_0".equals(obj)) {
                    return new uWL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_signal_bot_dialog_manual_order is invalid. Received: " + obj);
            case 234:
                if ("layout/trade_impl_signal_bot_sign_intro_dialog_0".equals(obj)) {
                    return new uWT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_signal_bot_sign_intro_dialog is invalid. Received: " + obj);
            case 235:
                if ("layout/trade_impl_signal_bot_sign_select_dialog_0".equals(obj)) {
                    return new uWS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_signal_bot_sign_select_dialog is invalid. Received: " + obj);
            case 236:
                if ("layout/trade_impl_signal_bot_update_dialog_0".equals(obj)) {
                    return new uWR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_signal_bot_update_dialog is invalid. Received: " + obj);
            case 237:
                if ("layout/trade_impl_signal_order_item_0".equals(obj)) {
                    return new uWV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_signal_order_item is invalid. Received: " + obj);
            case 238:
                if ("layout/trade_impl_signal_position_item_0".equals(obj)) {
                    return new uWY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_signal_position_item is invalid. Received: " + obj);
            case 239:
                if ("layout/trade_impl_smart_arbitrage_cal_cost_layout_0".equals(obj)) {
                    return new C48594uXe(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_smart_arbitrage_cal_cost_layout is invalid. Received: " + obj);
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                if ("layout/trade_impl_smart_arbitrage_sub_info_0".equals(obj)) {
                    return new C48593uXd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_smart_arbitrage_sub_info is invalid. Received: " + obj);
            case 241:
                if ("layout/trade_impl_smart_iceberg_explain_0".equals(obj)) {
                    return new C48590uXa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_smart_iceberg_explain is invalid. Received: " + obj);
            case 242:
                if ("layout/trade_impl_smart_iceberg_explain_order_favorite_0".equals(obj)) {
                    return new C48599uXj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_smart_iceberg_explain_order_favorite is invalid. Received: " + obj);
            case 243:
                if ("layout/trade_impl_smart_iceberg_grid_advanced_layout_0".equals(obj)) {
                    return new C48598uXi(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_smart_iceberg_grid_advanced_layout is invalid. Received: " + obj);
            case 244:
                if ("layout/trade_impl_smart_iceberg_limit_price_dialog_0".equals(obj)) {
                    return new C48603uXn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_smart_iceberg_limit_price_dialog is invalid. Received: " + obj);
            case 245:
                if ("layout/trade_impl_spot_dca_advanced_layout_0".equals(obj)) {
                    return new C48602uXm(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_spot_dca_advanced_layout is invalid. Received: " + obj);
            case 246:
                if ("layout/trade_impl_spot_dca_append_condition_dialog_0".equals(obj)) {
                    return new C48600uXk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_spot_dca_append_condition_dialog is invalid. Received: " + obj);
            case 247:
                if ("layout/trade_impl_spot_dca_stop_loss_modify_dialog_0".equals(obj)) {
                    return new C48606uXq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_spot_dca_stop_loss_modify_dialog is invalid. Received: " + obj);
            case 248:
                if ("layout/trade_impl_spot_grid_explain_stop_and_sell_0".equals(obj)) {
                    return new C48609uXt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_spot_grid_explain_stop_and_sell is invalid. Received: " + obj);
            case 249:
                if ("layout/trade_impl_spot_grid_reserve_funds_tips_dialog_0".equals(obj)) {
                    return new C48612uXw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_spot_grid_reserve_funds_tips_dialog is invalid. Received: " + obj);
            case 250:
                if ("layout/trade_impl_trade_twap_modify_layout_0".equals(obj)) {
                    return new C48613uXx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_trade_twap_modify_layout is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding valueOf(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 251:
                if ("layout/trade_impl_trailing_dialog_0".equals(obj)) {
                    return new uXC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_trailing_dialog is invalid. Received: " + obj);
            case 252:
                if ("layout/trade_impl_view_advance_item_switch_0".equals(obj)) {
                    return new uXA(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_advance_item_switch is invalid. Received: " + obj);
            case 253:
                if ("layout/trade_impl_view_bot_category_0".equals(obj)) {
                    return new uXD(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_bot_category is invalid. Received: " + obj);
            case 254:
                if ("layout/trade_impl_view_bot_category_card_0".equals(obj)) {
                    return new uXG(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_bot_category_card is invalid. Received: " + obj);
            case 255:
                if ("layout/trade_impl_view_bot_category_single_card_0".equals(obj)) {
                    return new uXH(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_bot_category_single_card is invalid. Received: " + obj);
            case 256:
                if ("layout/trade_impl_view_bot_guide_header_0".equals(obj)) {
                    return new uXK(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_header is invalid. Received: " + obj);
            case 257:
                if ("layout/trade_impl_view_bot_guide_loss_insurance_0".equals(obj)) {
                    return new uXN(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_loss_insurance is invalid. Received: " + obj);
            case 258:
                if ("layout/trade_impl_view_bot_guide_new_header_0".equals(obj)) {
                    return new uXJ(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_new_header is invalid. Received: " + obj);
            case 259:
                if ("layout/trade_impl_view_bot_guide_teach_0".equals(obj)) {
                    return new uXP(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_teach is invalid. Received: " + obj);
            case 260:
                if ("layout/trade_impl_view_bot_guide_top_details_0".equals(obj)) {
                    return new uXQ(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_top_details is invalid. Received: " + obj);
            case 261:
                if ("layout/trade_impl_view_coin_distribution_0".equals(obj)) {
                    return new uXW(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_coin_distribution is invalid. Received: " + obj);
            case 262:
                if ("layout/trade_impl_view_dcd_pnl_chart_0".equals(obj)) {
                    return new uXV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_dcd_pnl_chart is invalid. Received: " + obj);
            case 263:
                if ("layout/trade_impl_view_expand_helper_label_0".equals(obj)) {
                    return new uXX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_expand_helper_label is invalid. Received: " + obj);
            case 264:
                if ("layout/trade_impl_view_history_event_item_0".equals(obj)) {
                    return new uXZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_history_event_item is invalid. Received: " + obj);
            case 265:
                if ("layout/trade_impl_view_mp_bot_guide_0".equals(obj)) {
                    return new C48617uYa(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_mp_bot_guide is invalid. Received: " + obj);
            case 266:
                if ("layout/trade_impl_view_mp_category_child_0".equals(obj)) {
                    return new C48623uYg(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_mp_category_child is invalid. Received: " + obj);
            case 267:
                if ("layout/trade_impl_view_mp_category_parent_0".equals(obj)) {
                    return new C48622uYf(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_mp_category_parent is invalid. Received: " + obj);
            case 268:
                if ("layout/trade_impl_view_select_input_twice_0".equals(obj)) {
                    return new C48620uYd(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_select_input_twice is invalid. Received: " + obj);
            case 269:
                if ("layout/trade_impl_view_select_rsi_input_0".equals(obj)) {
                    return new C48627uYk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_select_rsi_input is invalid. Received: " + obj);
            case SubsamplingScaleImageView.ORIENTATION_270 /* 270 */:
                if ("layout/trade_impl_view_signal_bot_detail_header_0".equals(obj)) {
                    return new C48625uYi(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_signal_bot_detail_header is invalid. Received: " + obj);
            case 271:
                if ("layout/trade_impl_view_signal_bot_profit_0".equals(obj)) {
                    return new C48631uYo(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_signal_bot_profit is invalid. Received: " + obj);
            case 272:
                if ("layout/trade_impl_view_signal_bot_trigger_0".equals(obj)) {
                    return new C48630uYn(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_signal_bot_trigger is invalid. Received: " + obj);
            case 273:
                if ("layout/trade_impl_view_signal_trigger_item_0".equals(obj)) {
                    return new C48633uYq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_signal_trigger_item is invalid. Received: " + obj);
            case 274:
                if ("layout/trade_impl_view_sort_profit_item_0".equals(obj)) {
                    return new C48636uYt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_sort_profit_item is invalid. Received: " + obj);
            case 275:
                if ("layout/trade_impl_view_terms_checkbox_0".equals(obj)) {
                    return new C48635uYs(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_impl_view_terms_checkbox is invalid. Received: " + obj);
            case 276:
                if ("layout/trade_imple_market_place_contract_dca_amt_view_0".equals(obj)) {
                    return new uYA(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_imple_market_place_contract_dca_amt_view is invalid. Received: " + obj);
            case 277:
                if ("layout/trade_smart_arbi_stop_confirm_dialog_0".equals(obj)) {
                    return new C48642uYz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_smart_arbi_stop_confirm_dialog is invalid. Received: " + obj);
            case 278:
                if ("layout/trade_ui_activity_bot_copy_success_0".equals(obj)) {
                    return new uYC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_bot_copy_success is invalid. Received: " + obj);
            case 279:
                if ("layout/trade_ui_activity_bot_lead_success_0".equals(obj)) {
                    return new uYG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_bot_lead_success is invalid. Received: " + obj);
            case 280:
                if ("layout/trade_ui_activity_bot_signal_publish_0".equals(obj)) {
                    return new uYF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_bot_signal_publish is invalid. Received: " + obj);
            case 281:
                if ("layout/trade_ui_activity_contract_dca_start_condition_0".equals(obj)) {
                    return new uYJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_contract_dca_start_condition is invalid. Received: " + obj);
            case 282:
                if ("layout/trade_ui_activity_contract_dca_stop_condition_0".equals(obj)) {
                    return new uYH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_contract_dca_stop_condition is invalid. Received: " + obj);
            case 283:
                if ("layout/trade_ui_activity_contract_dca_trigger_rsi_0".equals(obj)) {
                    return new uYO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_contract_dca_trigger_rsi is invalid. Received: " + obj);
            case 284:
                if ("layout/trade_ui_activity_dcd_product_detail_0".equals(obj)) {
                    return new uYN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_dcd_product_detail is invalid. Received: " + obj);
            case 285:
                if ("layout/trade_ui_activity_dcd_product_list_0".equals(obj)) {
                    return new uYP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_dcd_product_list is invalid. Received: " + obj);
            case 286:
                if ("layout/trade_ui_activity_signal_bot_create_sign_0".equals(obj)) {
                    return new uYU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_signal_bot_create_sign is invalid. Received: " + obj);
            case 287:
                if ("layout/trade_ui_activity_spot_dca_start_condition_0".equals(obj)) {
                    return new uYR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_spot_dca_start_condition is invalid. Received: " + obj);
            case 288:
                if ("layout/trade_ui_activity_spot_dca_trigger_rsi_0".equals(obj)) {
                    return new C48644uZa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_activity_spot_dca_trigger_rsi is invalid. Received: " + obj);
            case 289:
                if ("layout/trade_ui_bot_item_switch_view_0".equals(obj)) {
                    return new uYY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_bot_item_switch_view is invalid. Received: " + obj);
            case 290:
                if ("layout/trade_ui_bot_mp_recommend_item_0".equals(obj)) {
                    return new uYZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_bot_mp_recommend_item is invalid. Received: " + obj);
            case 291:
                if ("layout/trade_ui_bot_mp_view_more_0".equals(obj)) {
                    return new C48649uZf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_bot_mp_view_more is invalid. Received: " + obj);
            case 292:
                if ("layout/trade_ui_bot_recurring_price_range_item_0".equals(obj)) {
                    return new C48646uZc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_bot_recurring_price_range_item is invalid. Received: " + obj);
            case 293:
                if ("layout/trade_ui_child_order_fragment_list_0".equals(obj)) {
                    return new C48652uZi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_child_order_fragment_list is invalid. Received: " + obj);
            case 294:
                if ("layout/trade_ui_contract_grid_close_pos_fg_0".equals(obj)) {
                    return new C48650uZg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_contract_grid_close_pos_fg is invalid. Received: " + obj);
            case 295:
                if ("layout/trade_ui_contract_grid_related_pos_fg_0".equals(obj)) {
                    return new C48656uZm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_contract_grid_related_pos_fg is invalid. Received: " + obj);
            case 296:
                if ("layout/trade_ui_dialog_adjustment_contract_margin_content_0".equals(obj)) {
                    return new C48657uZn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_adjustment_contract_margin_content is invalid. Received: " + obj);
            case 297:
                if ("layout/trade_ui_dialog_bot_guide_0".equals(obj)) {
                    return new C48661uZr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_bot_guide is invalid. Received: " + obj);
            case 298:
                if ("layout/trade_ui_dialog_contract_dca_adjust_margin_0".equals(obj)) {
                    return new C48660uZq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_contract_dca_adjust_margin is invalid. Received: " + obj);
            case 299:
                if ("layout/trade_ui_dialog_contract_dca_make_order_confirm_content_0".equals(obj)) {
                    return new C48668uZy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_contract_dca_make_order_confirm_content is invalid. Received: " + obj);
            case 300:
                if ("layout/trade_ui_dialog_contract_dca_modify_tp_0".equals(obj)) {
                    return new C48667uZx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_contract_dca_modify_tp is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding gEmmrt(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 301:
                if ("layout/trade_ui_dialog_dcd_disclaimer_0".equals(obj)) {
                    return new C48666uZw(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_dcd_disclaimer is invalid. Received: " + obj);
            case 302:
                if ("layout/trade_ui_dialog_home_strategy_filter_content_0".equals(obj)) {
                    return new uZE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_home_strategy_filter_content is invalid. Received: " + obj);
            case 303:
                if ("layout/trade_ui_dialog_signal_bot_data_0".equals(obj)) {
                    return new uZA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_signal_bot_data is invalid. Received: " + obj);
            case 304:
                if ("layout/trade_ui_dialog_smart_arbitrage_container_preview_0".equals(obj)) {
                    return new uZF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_smart_arbitrage_container_preview is invalid. Received: " + obj);
            case 305:
                if ("layout/trade_ui_dialog_smart_arbitrage_liq_price_rate_0".equals(obj)) {
                    return new uZI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_smart_arbitrage_liq_price_rate is invalid. Received: " + obj);
            case 306:
                if ("layout/trade_ui_dialog_smart_arbitrage_select_coin_0".equals(obj)) {
                    return new uZG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_smart_arbitrage_select_coin is invalid. Received: " + obj);
            case 307:
                if ("layout/trade_ui_dialog_smart_iceberg_rsi_modify_0".equals(obj)) {
                    return new uZL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_smart_iceberg_rsi_modify is invalid. Received: " + obj);
            case 308:
                if ("layout/trade_ui_dialog_smart_intro_0".equals(obj)) {
                    return new uZN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_smart_intro is invalid. Received: " + obj);
            case 309:
                if ("layout/trade_ui_dialog_smart_invest_detail_0".equals(obj)) {
                    return new uZQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_smart_invest_detail is invalid. Received: " + obj);
            case 310:
                if ("layout/trade_ui_dialog_smart_recommend_0".equals(obj)) {
                    return new uZT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_smart_recommend is invalid. Received: " + obj);
            case 311:
                if ("layout/trade_ui_dialog_spot_dca_make_order_confirm_content_0".equals(obj)) {
                    return new uZR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_spot_dca_make_order_confirm_content is invalid. Received: " + obj);
            case 312:
                if ("layout/trade_ui_dialog_titlebar_line_0".equals(obj)) {
                    return new uZV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_titlebar_line is invalid. Received: " + obj);
            case 313:
                if ("layout/trade_ui_fragemt_tactics_list_container_0".equals(obj)) {
                    return new uZU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragemt_tactics_list_container is invalid. Received: " + obj);
            case 314:
                if ("layout/trade_ui_fragment_arbitrage_depth_0".equals(obj)) {
                    return new C50780vac(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_arbitrage_depth is invalid. Received: " + obj);
            case 315:
                if ("layout/trade_ui_fragment_bot_guide_content_0".equals(obj)) {
                    return new C50781vad(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_bot_guide_content is invalid. Received: " + obj);
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                if ("layout/trade_ui_fragment_contract_dca_manual_0".equals(obj)) {
                    return new uZZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_contract_dca_manual is invalid. Received: " + obj);
            case TypedValues.AttributesType.TYPE_EASING /* 317 */:
                if ("layout/trade_ui_fragment_dcd_arbitrage_record_0".equals(obj)) {
                    return new C50786vai(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_dcd_arbitrage_record is invalid. Received: " + obj);
            case TypedValues.AttributesType.TYPE_PIVOT_TARGET /* 318 */:
                if ("layout/trade_ui_fragment_dcd_create_0".equals(obj)) {
                    return new C50782vae(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_dcd_create is invalid. Received: " + obj);
            case 319:
                if ("layout/trade_ui_fragment_dcd_manual_create_0".equals(obj)) {
                    return new C50789val(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_dcd_manual_create is invalid. Received: " + obj);
            case 320:
                if ("layout/trade_ui_fragment_market_place_featured_0".equals(obj)) {
                    return new C50790vam(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_market_place_featured is invalid. Received: " + obj);
            case 321:
                if ("layout/trade_ui_fragment_market_place_ongoing_list_0".equals(obj)) {
                    return new C50791van(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_market_place_ongoing_list is invalid. Received: " + obj);
            case 322:
                if ("layout/trade_ui_fragment_my_bot_history_order_list_0".equals(obj)) {
                    return new C50796vas(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_my_bot_history_order_list is invalid. Received: " + obj);
            case 323:
                if ("layout/trade_ui_fragment_my_bot_list_0".equals(obj)) {
                    return new C50795var(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_my_bot_list is invalid. Received: " + obj);
            case 324:
                if ("layout/trade_ui_fragment_my_bot_order_list_0".equals(obj)) {
                    return new C50800vaw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_my_bot_order_list is invalid. Received: " + obj);
            case 325:
                if ("layout/trade_ui_fragment_my_bot_signal_list_0".equals(obj)) {
                    return new C50797vat(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_my_bot_signal_list is invalid. Received: " + obj);
            case 326:
                if ("layout/trade_ui_fragment_signal_bot_sign_action_0".equals(obj)) {
                    return new C50799vav(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_signal_bot_sign_action is invalid. Received: " + obj);
            case 327:
                if ("layout/trade_ui_fragment_signal_bot_sign_params_content_0".equals(obj)) {
                    return new C50802vay(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_signal_bot_sign_params_content is invalid. Received: " + obj);
            case 328:
                if ("layout/trade_ui_fragment_signal_bot_trades_0".equals(obj)) {
                    return new C50803vaz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_signal_bot_trades is invalid. Received: " + obj);
            case 329:
                if ("layout/trade_ui_fragment_spot_dca_manual_0".equals(obj)) {
                    return new C50759vaH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_spot_dca_manual is invalid. Received: " + obj);
            case 330:
                if ("layout/trade_ui_fragment_tactics_all_list_container2_0".equals(obj)) {
                    return new C50757vaF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_tactics_all_list_container2 is invalid. Received: " + obj);
            case 331:
                if ("layout/trade_ui_fragment_tactics_list_0".equals(obj)) {
                    return new C50756vaE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_tactics_list is invalid. Received: " + obj);
            case 332:
                if ("layout/trade_ui_fragment_tactics_list_container_0".equals(obj)) {
                    return new C50761vaJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_fragment_tactics_list_container is invalid. Received: " + obj);
            case 333:
                if ("layout/trade_ui_home_strategy_filter_select_item_0".equals(obj)) {
                    return new C50760vaI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_home_strategy_filter_select_item is invalid. Received: " + obj);
            case 334:
                if ("layout/trade_ui_item_bot_detail_dcd_profit_chart_0".equals(obj)) {
                    return new C50768vaQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_bot_detail_dcd_profit_chart is invalid. Received: " + obj);
            case 335:
                if ("layout/trade_ui_item_chip_selection_0".equals(obj)) {
                    return new C50769vaR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_chip_selection is invalid. Received: " + obj);
            case 336:
                if ("layout/trade_ui_item_dcd_arb_record_0".equals(obj)) {
                    return new C50770vaS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_dcd_arb_record is invalid. Received: " + obj);
            case 337:
                if ("layout/trade_ui_item_dcd_arb_record_insided_0".equals(obj)) {
                    return new C50771vaT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_dcd_arb_record_insided is invalid. Received: " + obj);
            case 338:
                if ("layout/trade_ui_item_dcd_product_0".equals(obj)) {
                    return new C50772vaU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_dcd_product is invalid. Received: " + obj);
            case 339:
                if ("layout/trade_ui_item_fund_rate_trade_arbitrage_0".equals(obj)) {
                    return new C50777vaZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_fund_rate_trade_arbitrage is invalid. Received: " + obj);
            case 340:
                if ("layout/trade_ui_item_home_signal_list_0".equals(obj)) {
                    return new C50832vbb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_home_signal_list is invalid. Received: " + obj);
            case 341:
                if ("layout/trade_ui_item_signal_bot_sign_select_0".equals(obj)) {
                    return new C50836vbf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_signal_bot_sign_select is invalid. Received: " + obj);
            case 342:
                if ("layout/trade_ui_item_smart_arbitrage_binder_0".equals(obj)) {
                    return new C50837vbg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_item_smart_arbitrage_binder is invalid. Received: " + obj);
            case 343:
                if ("layout/trade_ui_makret_place_home_top_view_normal_0".equals(obj)) {
                    return new C50841vbk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_makret_place_home_top_view_normal is invalid. Received: " + obj);
            case 344:
                if ("layout/trade_ui_makret_place_home_top_view_trader_0".equals(obj)) {
                    return new C50839vbi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_makret_place_home_top_view_trader is invalid. Received: " + obj);
            case 345:
                if ("layout/trade_ui_market_place_featured_content_item_0".equals(obj)) {
                    return new C50838vbh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_market_place_featured_content_item is invalid. Received: " + obj);
            case 346:
                if ("layout/trade_ui_market_place_featured_create_item_0".equals(obj)) {
                    return new C50846vbp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_market_place_featured_create_item is invalid. Received: " + obj);
            case 347:
                if ("layout/trade_ui_market_place_featured_title_item_0".equals(obj)) {
                    return new C50843vbm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_market_place_featured_title_item is invalid. Received: " + obj);
            case 348:
                if ("layout/trade_ui_market_place_home_create_strategy_list_item_0".equals(obj)) {
                    return new C50849vbs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_market_place_home_create_strategy_list_item is invalid. Received: " + obj);
            case 349:
                if ("layout/trade_ui_market_place_home_top_view_0".equals(obj)) {
                    return new C50848vbr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_market_place_home_top_view is invalid. Received: " + obj);
            case 350:
                if ("layout/trade_ui_my_bot_signal_item_view_0".equals(obj)) {
                    return new C50852vbv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_my_bot_signal_item_view is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding KWHzl(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 351:
                if ("layout/trade_ui_signal_bot_create_sign_step1_0".equals(obj)) {
                    return new C50854vbx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_signal_bot_create_sign_step1 is invalid. Received: " + obj);
            case 352:
                if ("layout/trade_ui_signal_bot_create_sign_step2_0".equals(obj)) {
                    return new C50805vbA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_signal_bot_create_sign_step2 is invalid. Received: " + obj);
            case 353:
                if ("layout/trade_ui_signal_bot_edit_view_0".equals(obj)) {
                    return new C50809vbE(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_signal_bot_edit_view is invalid. Received: " + obj);
            case 354:
                if ("layout/trade_ui_signal_bot_explain_content_item_0".equals(obj)) {
                    return new C50806vbB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_signal_bot_explain_content_item is invalid. Received: " + obj);
            case 355:
                if ("layout/trade_ui_signal_bot_explain_title_item_0".equals(obj)) {
                    return new C50812vbH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_signal_bot_explain_title_item is invalid. Received: " + obj);
            case 356:
                if ("layout/trade_ui_signal_bot_guide_view_0".equals(obj)) {
                    return new C50814vbJ(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_signal_bot_guide_view is invalid. Received: " + obj);
            case 357:
                if ("layout/trade_ui_signal_coin_pair_item_0".equals(obj)) {
                    return new C50815vbK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_signal_coin_pair_item is invalid. Received: " + obj);
            case 358:
                if ("layout/trade_ui_signal_coin_pair_sub_title_item_0".equals(obj)) {
                    return new C50818vbN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_signal_coin_pair_sub_title_item is invalid. Received: " + obj);
            case 359:
                if ("layout/trade_ui_tactic_tips_list_0".equals(obj)) {
                    return new C50825vbU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_tactic_tips_list is invalid. Received: " + obj);
            case 360:
                if ("layout/trade_ui_tactics_rec_info_detail_item_0".equals(obj)) {
                    return new C50821vbQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_tactics_rec_info_detail_item is invalid. Received: " + obj);
            case 361:
                if ("layout/trade_ui_view_arbitrage_smart_guide_0".equals(obj)) {
                    return new C50830vbZ(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_arbitrage_smart_guide is invalid. Received: " + obj);
            case 362:
                if ("layout/trade_ui_view_bot_signal_cost_setting_0".equals(obj)) {
                    return new C50829vbY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_bot_signal_cost_setting is invalid. Received: " + obj);
            case 363:
                if ("layout/trade_ui_view_bot_signal_trading_pair_select_0".equals(obj)) {
                    return new C50885vcb(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_bot_signal_trading_pair_select is invalid. Received: " + obj);
            case 364:
                if ("layout/trade_ui_view_contract_grid_slippage_percent_input_0".equals(obj)) {
                    return new C50887vcd(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_contract_grid_slippage_percent_input is invalid. Received: " + obj);
            case 365:
                if ("layout/trade_ui_view_dcd_basic_create_button_0".equals(obj)) {
                    return new C50888vce(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_dcd_basic_create_button is invalid. Received: " + obj);
            case 366:
                if ("layout/trade_ui_view_dcd_product_detail_header_0".equals(obj)) {
                    return new C50892vci(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_dcd_product_detail_header is invalid. Received: " + obj);
            case 367:
                if ("layout/trade_ui_view_dcd_product_detail_invest_0".equals(obj)) {
                    return new C50889vcf(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_dcd_product_detail_invest is invalid. Received: " + obj);
            case 368:
                if ("layout/trade_ui_view_dcd_product_detail_tp_mode_0".equals(obj)) {
                    return new C50896vcm(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_dcd_product_detail_tp_mode is invalid. Received: " + obj);
            case 369:
                if ("layout/trade_ui_view_selection_item_0".equals(obj)) {
                    return new C50897vcn(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_selection_item is invalid. Received: " + obj);
            case 370:
                if ("layout/trade_ui_view_smart_arb_pnl_chart_0".equals(obj)) {
                    return new C50903vct(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_smart_arb_pnl_chart is invalid. Received: " + obj);
            case 371:
                if ("layout/trade_ui_view_smart_arbitrage_cal_staking_apy_0".equals(obj)) {
                    return new C50901vcr(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_smart_arbitrage_cal_staking_apy is invalid. Received: " + obj);
            case 372:
                if ("layout/trade_ui_view_smart_arbitrage_inst_info_0".equals(obj)) {
                    return new C50902vcs(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for trade_ui_view_smart_arbitrage_inst_info is invalid. Received: " + obj);
            case 373:
                if ("layout/trade_ui_withdraw_prifits_fg_0".equals(obj)) {
                    return new C50906vcw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_withdraw_prifits_fg is invalid. Received: " + obj);
            case 374:
                if ("layout/view_arbitrage_balance_0".equals(obj)) {
                    return new C50904vcu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_arbitrage_balance is invalid. Received: " + obj);
            case 375:
                if ("layout/view_arbitrage_coin_select_0".equals(obj)) {
                    return new C50861vcD(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_arbitrage_coin_select is invalid. Received: " + obj);
            case 376:
                if ("layout/view_arbitrage_price_0".equals(obj)) {
                    return new C50858vcA(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_arbitrage_price is invalid. Received: " + obj);
            case 377:
                if ("layout/view_arbitrage_trade_depth_0".equals(obj)) {
                    return new C50859vcB(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_arbitrage_trade_depth is invalid. Received: " + obj);
            case 378:
                if ("layout/view_bot_grid_tp_sl_group_0".equals(obj)) {
                    return new C50866vcI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_bot_grid_tp_sl_group is invalid. Received: " + obj);
            case 379:
                if ("layout/view_bot_grid_tp_sl_group2_0".equals(obj)) {
                    return new C50864vcG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_bot_grid_tp_sl_group2 is invalid. Received: " + obj);
            case 380:
                if ("layout/view_bot_networ_error_0".equals(obj)) {
                    return new C50871vcN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_bot_networ_error is invalid. Received: " + obj);
            case 381:
                if ("layout/view_bot_profit_sharing_setting_0".equals(obj)) {
                    return new C50870vcM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_bot_profit_sharing_setting is invalid. Received: " + obj);
            case 382:
                if ("layout/view_bot_trade_header_0".equals(obj)) {
                    return new C50867vcJ(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_bot_trade_header is invalid. Received: " + obj);
            case 383:
                if ("layout/view_bot_trade_toolbar_0".equals(obj)) {
                    return new C50875vcR(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_bot_trade_toolbar is invalid. Received: " + obj);
            case MLKEMEngine.KyberPolyBytes /* 384 */:
                if ("layout/view_coin_balance_0".equals(obj)) {
                    return new C50876vcS(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_coin_balance is invalid. Received: " + obj);
            case 385:
                if ("layout/view_coin_pair_item_0".equals(obj)) {
                    return new C50878vcU(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_coin_pair_item is invalid. Received: " + obj);
            case 386:
                if ("layout/view_coin_pairs_0".equals(obj)) {
                    return new C50877vcT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_coin_pairs is invalid. Received: " + obj);
            case 387:
                if ("layout/view_contract_grid_deal_record_benefit_item_0".equals(obj)) {
                    return new C50883vcZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_contract_grid_deal_record_benefit_item is invalid. Received: " + obj);
            case 388:
                if ("layout/view_distribute_item_0".equals(obj)) {
                    return new C50938vdb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_distribute_item is invalid. Received: " + obj);
            case 389:
                if ("layout/view_invest_detail_item_0".equals(obj)) {
                    return new C50943vdg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_invest_detail_item is invalid. Received: " + obj);
            case 390:
                if ("layout/view_market_place_copy_divider_view_0".equals(obj)) {
                    return new C50948vdl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_market_place_copy_divider_view is invalid. Received: " + obj);
            case 391:
                if ("layout/view_market_place_copy_profit_view_0".equals(obj)) {
                    return new C50946vdj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_market_place_copy_profit_view is invalid. Received: " + obj);
            case 392:
                if ("layout/view_market_place_toolbar_0".equals(obj)) {
                    return new C50952vdp(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_market_place_toolbar is invalid. Received: " + obj);
            case 393:
                if ("layout/view_pie_distribute_0".equals(obj)) {
                    return new C50953vdq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_pie_distribute is invalid. Received: " + obj);
            case 394:
                if ("layout/view_recurring_coin_config_0".equals(obj)) {
                    return new C50954vdr(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_recurring_coin_config is invalid. Received: " + obj);
            case 395:
                if ("layout/view_recurring_coin_config_item_0".equals(obj)) {
                    return new C50958vdv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_recurring_coin_config_item is invalid. Received: " + obj);
            case 396:
                if ("layout/view_recurring_new_amount_0".equals(obj)) {
                    return new C50959vdw(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_recurring_new_amount is invalid. Received: " + obj);
            case 397:
                if ("layout/view_recurring_select_coin_item_0".equals(obj)) {
                    return new C50911vdA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_recurring_select_coin_item is invalid. Received: " + obj);
            case 398:
                if ("layout/view_sheet_recurring_coin_config_0".equals(obj)) {
                    return new C50962vdz(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_sheet_recurring_coin_config is invalid. Received: " + obj);
            case 399:
                if ("layout/view_signal_bot_advance_item_select_0".equals(obj)) {
                    return new C50960vdx(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_signal_bot_advance_item_select is invalid. Received: " + obj);
            case 400:
                if ("layout/view_signal_bot_button_tab_0".equals(obj)) {
                    return new C50915vdE(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_signal_bot_button_tab is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding EZpvd(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 401:
                if ("layout/view_signal_bot_set_fixed_amt_0".equals(obj)) {
                    return new C50916vdF(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_signal_bot_set_fixed_amt is invalid. Received: " + obj);
            case 402:
                if ("layout/view_signal_bot_set_percent_0".equals(obj)) {
                    return new C50920vdJ(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_signal_bot_set_percent is invalid. Received: " + obj);
            case 403:
                if ("layout/view_signal_bot_set_tp_sl_0".equals(obj)) {
                    return new C50918vdH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_signal_bot_set_tp_sl is invalid. Received: " + obj);
            case 404:
                if ("layout/view_simple_borrow_balance_0".equals(obj)) {
                    return new C50926vdP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_simple_borrow_balance is invalid. Received: " + obj);
            case 405:
                if ("layout/view_smart_iceberg_input_panel_0".equals(obj)) {
                    return new C50923vdM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_smart_iceberg_input_panel is invalid. Received: " + obj);
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                if ("layout/view_smart_iceberg_trade_footer_0".equals(obj)) {
                    return new C50924vdN(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_smart_iceberg_trade_footer is invalid. Received: " + obj);
            case 407:
                if ("layout/view_smart_recommend_0".equals(obj)) {
                    return new C50931vdU(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_smart_recommend is invalid. Received: " + obj);
            case 408:
                if ("layout/view_smart_recommend_item_0".equals(obj)) {
                    return new C50932vdV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_smart_recommend_item is invalid. Received: " + obj);
            case 409:
                if ("layout/view_strategy_order_confirm_tp_sl_view_0".equals(obj)) {
                    return new C50935vdY(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_strategy_order_confirm_tp_sl_view is invalid. Received: " + obj);
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                if ("layout/view_strategy_ticker_0".equals(obj)) {
                    return new C50990vea(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_strategy_ticker is invalid. Received: " + obj);
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                if ("layout/view_tactics_profit_chart_view_0".equals(obj)) {
                    return new C50934vdX(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_tactics_profit_chart_view is invalid. Received: " + obj);
            case 412:
                if ("layout/view_trade_dialog_footer_0".equals(obj)) {
                    return new C50993ved(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_trade_dialog_footer is invalid. Received: " + obj);
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                if ("layout/view_trade_footer_0".equals(obj)) {
                    return new C50998vei(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_trade_footer is invalid. Received: " + obj);
            case WalletConstants.ERROR_CODE_ILLEGAL_CALLER /* 414 */:
                if ("layout/view_trade_footer_ava_0".equals(obj)) {
                    return new C50992vec(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_trade_footer_ava is invalid. Received: " + obj);
            case WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE /* 415 */:
                if ("layout/view_twap_input_panel_0".equals(obj)) {
                    return new C50997veh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_twap_input_panel is invalid. Received: " + obj);
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
                return OLrzqt(dataBindingComponent, view, i2, tag);
            case 1:
                return copydefault(dataBindingComponent, view, i2, tag);
            case 2:
                return AEQbTJ(dataBindingComponent, view, i2, tag);
            case 3:
                return djBIcL(dataBindingComponent, view, i2, tag);
            case 4:
                return AYXKKw(dataBindingComponent, view, i2, tag);
            case 5:
                return valueOf(dataBindingComponent, view, i2, tag);
            case 6:
                return gEmmrt(dataBindingComponent, view, i2, tag);
            case 7:
                return KWHzl(dataBindingComponent, view, i2, tag);
            case 8:
                return EZpvd(dataBindingComponent, view, i2, tag);
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
        if (i2 == 217) {
            if ("layout/trade_impl_mp_bot_copy_trader_view_0".equals(tag)) {
                return new C48572uWj(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for trade_impl_mp_bot_copy_trader_view is invalid. Received: " + tag);
        }
        if (i2 == 218) {
            if ("layout/trade_impl_mp_bot_copy_win_rate_view_0".equals(tag)) {
                return new C48573uWk(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for trade_impl_mp_bot_copy_win_rate_view is invalid. Received: " + tag);
        }
        if (i2 == 225) {
            if ("layout/trade_impl_my_bot_asset_status_view_0".equals(tag)) {
                return new C48588uWz(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for trade_impl_my_bot_asset_status_view is invalid. Received: " + tag);
        }
        if (i2 == 226) {
            if ("layout/trade_impl_my_bot_item_asset_select_view_0".equals(tag)) {
                return new C48586uWx(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for trade_impl_my_bot_item_asset_select_view is invalid. Received: " + tag);
        }
        if (i2 == 275) {
            if ("layout/trade_impl_view_terms_checkbox_0".equals(tag)) {
                return new C48635uYs(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for trade_impl_view_terms_checkbox is invalid. Received: " + tag);
        }
        if (i2 == 276) {
            if ("layout/trade_imple_market_place_contract_dca_amt_view_0".equals(tag)) {
                return new uYA(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for trade_imple_market_place_contract_dca_amt_view is invalid. Received: " + tag);
        }
        if (i2 == 406) {
            if ("layout/view_smart_iceberg_trade_footer_0".equals(tag)) {
                return new C50924vdN(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_smart_iceberg_trade_footer is invalid. Received: " + tag);
        }
        if (i2 != 407) {
            switch (i2) {
                case 22:
                    if ("layout/bot_list_bottom_operator_bar_0".equals(tag)) {
                        return new C48333uNp(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for bot_list_bottom_operator_bar is invalid. Received: " + tag);
                case 105:
                    if ("layout/item_bot_lead_signal_bot_vertical_info_0".equals(tag)) {
                        return new C48437uRj(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for item_bot_lead_signal_bot_vertical_info is invalid. Received: " + tag);
                case 125:
                    if ("layout/layout_signal_bot_type_view_0".equals(tag)) {
                        return new C48465uSk(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for layout_signal_bot_type_view is invalid. Received: " + tag);
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                    if ("layout/market_place_spot_dca_amt_view_0".equals(tag)) {
                        return new C48480uSz(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for market_place_spot_dca_amt_view is invalid. Received: " + tag);
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                    if ("layout/smart_arbitrage_advanced_setting_view_0".equals(tag)) {
                        return new uSV(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for smart_arbitrage_advanced_setting_view is invalid. Received: " + tag);
                case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                    if ("layout/tactics_available_item_text_layout_0".equals(tag)) {
                        return new C48488uTg(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for tactics_available_item_text_layout is invalid. Received: " + tag);
                case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                    if ("layout/trade_impl_contract_dca_advanced_layout_0".equals(tag)) {
                        return new uTR(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_contract_dca_advanced_layout is invalid. Received: " + tag);
                case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                    if ("layout/trade_impl_future_grid_advanced_layout_0".equals(tag)) {
                        return new uVF(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_future_grid_advanced_layout is invalid. Received: " + tag);
                case 209:
                    if ("layout/trade_impl_grid_mode_item_view_0".equals(tag)) {
                        return new uVO(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_grid_mode_item_view is invalid. Received: " + tag);
                case me.relex.circleindicator.BuildConfig.VERSION_CODE /* 214 */:
                    if ("layout/trade_impl_inner_item_view_0".equals(tag)) {
                        return new C48564uWb(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_inner_item_view is invalid. Received: " + tag);
                case 230:
                    if ("layout/trade_impl_recurring_advanced_layout_0".equals(tag)) {
                        return new uWG(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_recurring_advanced_layout is invalid. Received: " + tag);
                case 232:
                    if ("layout/trade_impl_signal_bot_advanced_layout_0".equals(tag)) {
                        return new uWO(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_signal_bot_advanced_layout is invalid. Received: " + tag);
                case 239:
                    if ("layout/trade_impl_smart_arbitrage_cal_cost_layout_0".equals(tag)) {
                        return new C48594uXe(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_smart_arbitrage_cal_cost_layout is invalid. Received: " + tag);
                case 243:
                    if ("layout/trade_impl_smart_iceberg_grid_advanced_layout_0".equals(tag)) {
                        return new C48598uXi(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_smart_iceberg_grid_advanced_layout is invalid. Received: " + tag);
                case 245:
                    if ("layout/trade_impl_spot_dca_advanced_layout_0".equals(tag)) {
                        return new C48602uXm(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_impl_spot_dca_advanced_layout is invalid. Received: " + tag);
                case 301:
                    if ("layout/trade_ui_dialog_dcd_disclaimer_0".equals(tag)) {
                        return new C48666uZw(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_ui_dialog_dcd_disclaimer is invalid. Received: " + tag);
                case 353:
                    if ("layout/trade_ui_signal_bot_edit_view_0".equals(tag)) {
                        return new C50809vbE(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_ui_signal_bot_edit_view is invalid. Received: " + tag);
                case 356:
                    if ("layout/trade_ui_signal_bot_guide_view_0".equals(tag)) {
                        return new C50814vbJ(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_ui_signal_bot_guide_view is invalid. Received: " + tag);
                case 361:
                    if ("layout/trade_ui_view_arbitrage_smart_guide_0".equals(tag)) {
                        return new C50830vbZ(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for trade_ui_view_arbitrage_smart_guide is invalid. Received: " + tag);
                case 392:
                    if ("layout/view_market_place_toolbar_0".equals(tag)) {
                        return new C50952vdp(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for view_market_place_toolbar is invalid. Received: " + tag);
                case 394:
                    if ("layout/view_recurring_coin_config_0".equals(tag)) {
                        return new C50954vdr(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for view_recurring_coin_config is invalid. Received: " + tag);
                case 396:
                    if ("layout/view_recurring_new_amount_0".equals(tag)) {
                        return new C50959vdw(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for view_recurring_new_amount is invalid. Received: " + tag);
                case 409:
                    if ("layout/view_strategy_order_confirm_tp_sl_view_0".equals(tag)) {
                        return new C50935vdY(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for view_strategy_order_confirm_tp_sl_view is invalid. Received: " + tag);
                case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                    if ("layout/view_tactics_profit_chart_view_0".equals(tag)) {
                        return new C50934vdX(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for view_tactics_profit_chart_view is invalid. Received: " + tag);
                case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                    if ("layout/view_trade_footer_0".equals(tag)) {
                        return new C50998vei(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for view_trade_footer is invalid. Received: " + tag);
                default:
                    switch (i2) {
                        case 252:
                            if ("layout/trade_impl_view_advance_item_switch_0".equals(tag)) {
                                return new uXA(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_advance_item_switch is invalid. Received: " + tag);
                        case 253:
                            if ("layout/trade_impl_view_bot_category_0".equals(tag)) {
                                return new uXD(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_bot_category is invalid. Received: " + tag);
                        case 254:
                            if ("layout/trade_impl_view_bot_category_card_0".equals(tag)) {
                                return new uXG(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_bot_category_card is invalid. Received: " + tag);
                        case 255:
                            if ("layout/trade_impl_view_bot_category_single_card_0".equals(tag)) {
                                return new uXH(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_bot_category_single_card is invalid. Received: " + tag);
                        case 256:
                            if ("layout/trade_impl_view_bot_guide_header_0".equals(tag)) {
                                return new uXK(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_header is invalid. Received: " + tag);
                        case 257:
                            if ("layout/trade_impl_view_bot_guide_loss_insurance_0".equals(tag)) {
                                return new uXN(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_loss_insurance is invalid. Received: " + tag);
                        case 258:
                            if ("layout/trade_impl_view_bot_guide_new_header_0".equals(tag)) {
                                return new uXJ(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_new_header is invalid. Received: " + tag);
                        case 259:
                            if ("layout/trade_impl_view_bot_guide_teach_0".equals(tag)) {
                                return new uXP(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_teach is invalid. Received: " + tag);
                        case 260:
                            if ("layout/trade_impl_view_bot_guide_top_details_0".equals(tag)) {
                                return new uXQ(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_bot_guide_top_details is invalid. Received: " + tag);
                        case 261:
                            if ("layout/trade_impl_view_coin_distribution_0".equals(tag)) {
                                return new uXW(dataBindingComponent, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for trade_impl_view_coin_distribution is invalid. Received: " + tag);
                        default:
                            switch (i2) {
                                case 398:
                                    if ("layout/view_sheet_recurring_coin_config_0".equals(tag)) {
                                        return new C50962vdz(dataBindingComponent, viewArr);
                                    }
                                    throw new IllegalArgumentException("The tag for view_sheet_recurring_coin_config is invalid. Received: " + tag);
                                case 399:
                                    if ("layout/view_signal_bot_advance_item_select_0".equals(tag)) {
                                        return new C50960vdx(dataBindingComponent, viewArr);
                                    }
                                    throw new IllegalArgumentException("The tag for view_signal_bot_advance_item_select is invalid. Received: " + tag);
                                case 400:
                                    if ("layout/view_signal_bot_button_tab_0".equals(tag)) {
                                        return new C50915vdE(dataBindingComponent, viewArr);
                                    }
                                    throw new IllegalArgumentException("The tag for view_signal_bot_button_tab is invalid. Received: " + tag);
                                case 401:
                                    if ("layout/view_signal_bot_set_fixed_amt_0".equals(tag)) {
                                        return new C50916vdF(dataBindingComponent, viewArr);
                                    }
                                    throw new IllegalArgumentException("The tag for view_signal_bot_set_fixed_amt is invalid. Received: " + tag);
                                case 402:
                                    if ("layout/view_signal_bot_set_percent_0".equals(tag)) {
                                        return new C50920vdJ(dataBindingComponent, viewArr);
                                    }
                                    throw new IllegalArgumentException("The tag for view_signal_bot_set_percent is invalid. Received: " + tag);
                                default:
                                    switch (i2) {
                                        case 117:
                                            if ("layout/layout_bot_loss_insurance_label_0".equals(tag)) {
                                                return new uRT(dataBindingComponent, viewArr);
                                            }
                                            throw new IllegalArgumentException("The tag for layout_bot_loss_insurance_label is invalid. Received: " + tag);
                                        case 118:
                                            if ("layout/layout_bot_loss_insurance_tag_0".equals(tag)) {
                                                return new uRV(dataBindingComponent, viewArr);
                                            }
                                            throw new IllegalArgumentException("The tag for layout_bot_loss_insurance_tag is invalid. Received: " + tag);
                                        case 119:
                                            if ("layout/layout_bottom_button_view_0".equals(tag)) {
                                                return new uRW(dataBindingComponent, viewArr);
                                            }
                                            throw new IllegalArgumentException("The tag for layout_bottom_button_view is invalid. Received: " + tag);
                                        default:
                                            switch (i2) {
                                                case 265:
                                                    if ("layout/trade_impl_view_mp_bot_guide_0".equals(tag)) {
                                                        return new C48617uYa(dataBindingComponent, viewArr);
                                                    }
                                                    throw new IllegalArgumentException("The tag for trade_impl_view_mp_bot_guide is invalid. Received: " + tag);
                                                case 266:
                                                    if ("layout/trade_impl_view_mp_category_child_0".equals(tag)) {
                                                        return new C48623uYg(dataBindingComponent, viewArr);
                                                    }
                                                    throw new IllegalArgumentException("The tag for trade_impl_view_mp_category_child is invalid. Received: " + tag);
                                                case 267:
                                                    if ("layout/trade_impl_view_mp_category_parent_0".equals(tag)) {
                                                        return new C48622uYf(dataBindingComponent, viewArr);
                                                    }
                                                    throw new IllegalArgumentException("The tag for trade_impl_view_mp_category_parent is invalid. Received: " + tag);
                                                case 268:
                                                    if ("layout/trade_impl_view_select_input_twice_0".equals(tag)) {
                                                        return new C48620uYd(dataBindingComponent, viewArr);
                                                    }
                                                    throw new IllegalArgumentException("The tag for trade_impl_view_select_input_twice is invalid. Received: " + tag);
                                                default:
                                                    switch (i2) {
                                                        case SubsamplingScaleImageView.ORIENTATION_270 /* 270 */:
                                                            if ("layout/trade_impl_view_signal_bot_detail_header_0".equals(tag)) {
                                                                return new C48625uYi(dataBindingComponent, viewArr);
                                                            }
                                                            throw new IllegalArgumentException("The tag for trade_impl_view_signal_bot_detail_header is invalid. Received: " + tag);
                                                        case 271:
                                                            if ("layout/trade_impl_view_signal_bot_profit_0".equals(tag)) {
                                                                return new C48631uYo(dataBindingComponent, viewArr);
                                                            }
                                                            throw new IllegalArgumentException("The tag for trade_impl_view_signal_bot_profit is invalid. Received: " + tag);
                                                        case 272:
                                                            if ("layout/trade_impl_view_signal_bot_trigger_0".equals(tag)) {
                                                                return new C48630uYn(dataBindingComponent, viewArr);
                                                            }
                                                            throw new IllegalArgumentException("The tag for trade_impl_view_signal_bot_trigger is invalid. Received: " + tag);
                                                        default:
                                                            switch (i2) {
                                                                case 363:
                                                                    if ("layout/trade_ui_view_bot_signal_trading_pair_select_0".equals(tag)) {
                                                                        return new C50885vcb(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_bot_signal_trading_pair_select is invalid. Received: " + tag);
                                                                case 364:
                                                                    if ("layout/trade_ui_view_contract_grid_slippage_percent_input_0".equals(tag)) {
                                                                        return new C50887vcd(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_contract_grid_slippage_percent_input is invalid. Received: " + tag);
                                                                case 365:
                                                                    if ("layout/trade_ui_view_dcd_basic_create_button_0".equals(tag)) {
                                                                        return new C50888vce(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_dcd_basic_create_button is invalid. Received: " + tag);
                                                                case 366:
                                                                    if ("layout/trade_ui_view_dcd_product_detail_header_0".equals(tag)) {
                                                                        return new C50892vci(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_dcd_product_detail_header is invalid. Received: " + tag);
                                                                case 367:
                                                                    if ("layout/trade_ui_view_dcd_product_detail_invest_0".equals(tag)) {
                                                                        return new C50889vcf(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_dcd_product_detail_invest is invalid. Received: " + tag);
                                                                case 368:
                                                                    if ("layout/trade_ui_view_dcd_product_detail_tp_mode_0".equals(tag)) {
                                                                        return new C50896vcm(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_dcd_product_detail_tp_mode is invalid. Received: " + tag);
                                                                case 369:
                                                                    if ("layout/trade_ui_view_selection_item_0".equals(tag)) {
                                                                        return new C50897vcn(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_selection_item is invalid. Received: " + tag);
                                                                case 370:
                                                                    if ("layout/trade_ui_view_smart_arb_pnl_chart_0".equals(tag)) {
                                                                        return new C50903vct(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_smart_arb_pnl_chart is invalid. Received: " + tag);
                                                                case 371:
                                                                    if ("layout/trade_ui_view_smart_arbitrage_cal_staking_apy_0".equals(tag)) {
                                                                        return new C50901vcr(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_smart_arbitrage_cal_staking_apy is invalid. Received: " + tag);
                                                                case 372:
                                                                    if ("layout/trade_ui_view_smart_arbitrage_inst_info_0".equals(tag)) {
                                                                        return new C50902vcs(dataBindingComponent, viewArr);
                                                                    }
                                                                    throw new IllegalArgumentException("The tag for trade_ui_view_smart_arbitrage_inst_info is invalid. Received: " + tag);
                                                                default:
                                                                    switch (i2) {
                                                                        case 375:
                                                                            if ("layout/view_arbitrage_coin_select_0".equals(tag)) {
                                                                                return new C50861vcD(dataBindingComponent, viewArr);
                                                                            }
                                                                            throw new IllegalArgumentException("The tag for view_arbitrage_coin_select is invalid. Received: " + tag);
                                                                        case 376:
                                                                            if ("layout/view_arbitrage_price_0".equals(tag)) {
                                                                                return new C50858vcA(dataBindingComponent, viewArr);
                                                                            }
                                                                            throw new IllegalArgumentException("The tag for view_arbitrage_price is invalid. Received: " + tag);
                                                                        case 377:
                                                                            if ("layout/view_arbitrage_trade_depth_0".equals(tag)) {
                                                                                return new C50859vcB(dataBindingComponent, viewArr);
                                                                            }
                                                                            throw new IllegalArgumentException("The tag for view_arbitrage_trade_depth is invalid. Received: " + tag);
                                                                        default:
                                                                            switch (i2) {
                                                                                case 382:
                                                                                    if ("layout/view_bot_trade_header_0".equals(tag)) {
                                                                                        return new C50867vcJ(dataBindingComponent, viewArr);
                                                                                    }
                                                                                    throw new IllegalArgumentException("The tag for view_bot_trade_header is invalid. Received: " + tag);
                                                                                case 383:
                                                                                    if ("layout/view_bot_trade_toolbar_0".equals(tag)) {
                                                                                        return new C50875vcR(dataBindingComponent, viewArr);
                                                                                    }
                                                                                    throw new IllegalArgumentException("The tag for view_bot_trade_toolbar is invalid. Received: " + tag);
                                                                                case MLKEMEngine.KyberPolyBytes /* 384 */:
                                                                                    if ("layout/view_coin_balance_0".equals(tag)) {
                                                                                        return new C50876vcS(dataBindingComponent, viewArr);
                                                                                    }
                                                                                    throw new IllegalArgumentException("The tag for view_coin_balance is invalid. Received: " + tag);
                                                                                case 385:
                                                                                    if ("layout/view_coin_pair_item_0".equals(tag)) {
                                                                                        return new C50878vcU(dataBindingComponent, viewArr);
                                                                                    }
                                                                                    throw new IllegalArgumentException("The tag for view_coin_pair_item is invalid. Received: " + tag);
                                                                                default:
                                                                                    return null;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        if ("layout/view_smart_recommend_0".equals(tag)) {
            return new C50931vdU(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException("The tag for view_smart_recommend is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = Application.EZpvd.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return TaskDescription.KWHzl.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(15);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oksearch.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.tradeuilib.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.gallery.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class TaskDescription {
        public static final SparseArray<String> KWHzl;

        private TaskDescription() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(24);
            KWHzl = sparseArray;
            sparseArray.put(1, "FundingRateArbitrageData");
            sparseArray.put(2, "SpreadArbitrageData");
            sparseArray.put(0, "_all");
            sparseArray.put(3, "actionBarOverlay");
            sparseArray.put(4, "balanceViewModel");
            sparseArray.put(5, "dataHolder");
            sparseArray.put(6, "fromCRActivity");
            sparseArray.put(7, "imageTypes");
            sparseArray.put(8, "isFoldArrowVisible");
            sparseArray.put(9, "item");
            sparseArray.put(10, "itemBean");
            sparseArray.put(11, "itemData");
            sparseArray.put(12, "label");
            sparseArray.put(13, "leftButton");
            sparseArray.put(14, "model");
            sparseArray.put(15, "rightButton");
            sparseArray.put(16, "showAssets");
            sparseArray.put(17, "showCloseButton");
            sparseArray.put(18, "showHeader");
            sparseArray.put(19, "showNoNetwork");
            sparseArray.put(20, "showTabs");
            sparseArray.put(21, "singelButton");
            sparseArray.put(22, "title");
            sparseArray.put(23, "viewModel");
        }
    }

    public static class Application {
        public static final HashMap<String, Integer> EZpvd;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE);
            EZpvd = map;
            map.put("layout/activity_bot_document_details_layout_0", Integer.valueOf(C48033uCm.Activity.KWHzl));
            map.put("layout/activity_bot_lead_history_strategys_0", Integer.valueOf(C48033uCm.Activity.AEQbTJ));
            map.put("layout/activity_bot_lead_strategys_0", Integer.valueOf(C48033uCm.Activity.EZpvd));
            map.put("layout/activity_bot_order_kline_0", Integer.valueOf(C48033uCm.Activity.OLrzqt));
            map.put("layout/activity_bot_trade_0", Integer.valueOf(C48033uCm.Activity.copydefault));
            map.put("layout/activity_market_place_my_bot_0", Integer.valueOf(C48033uCm.Activity.gEmmrt));
            map.put("layout/activity_market_place_param_detail4_0", Integer.valueOf(C48033uCm.Activity.AhwBna));
            map.put("layout/activity_my_bot_shell_0", Integer.valueOf(C48033uCm.Activity.DbNXlk));
            map.put("layout/activity_search_strategy_layout_0", Integer.valueOf(C48033uCm.Activity.values));
            map.put("layout/activity_smart_iceberg_start_trigger_0", Integer.valueOf(C48033uCm.Activity.AkhnZx));
            map.put("layout/activity_tactics_details_0", Integer.valueOf(C48033uCm.Activity.fetchVPNInfo));
            map.put("layout/bot_auto_earn_stking_profit_fragment_0", Integer.valueOf(C48033uCm.Activity.zsXlph));
            map.put("layout/bot_dialog_contract_quick_order_0", Integer.valueOf(C48033uCm.Activity.gHZMYf));
            map.put("layout/bot_dialog_contract_quick_order_container_0", Integer.valueOf(C48033uCm.Activity.sSMYrx));
            map.put("layout/bot_dialog_contract_range_quick_order_0", Integer.valueOf(C48033uCm.Activity.AwvSrB));
            map.put("layout/bot_dialog_dcd_recommend_0", Integer.valueOf(C48033uCm.Activity.zuBGHE));
            map.put("layout/bot_dialog_spot_quick_order_0", Integer.valueOf(C48033uCm.Activity.OcIXYQ));
            map.put("layout/bot_dialog_spot_range_quick_order_0", Integer.valueOf(C48033uCm.Activity.QKVWgx));
            map.put("layout/bot_fragment_bot_guide_spot_grid_0", Integer.valueOf(C48033uCm.Activity.QbewEr));
            map.put("layout/bot_guide_banner_common_amt_view_0", Integer.valueOf(C48033uCm.Activity.aKErDB));
            map.put("layout/bot_layout_dca_add_pos_bottom_sheet_0", Integer.valueOf(C48033uCm.Activity.RcXXUw));
            map.put("layout/bot_list_bottom_operator_bar_0", Integer.valueOf(C48033uCm.Activity.dvKsVJ));
            map.put("layout/bot_spot_dca_dialog_trigger_rsi_0", Integer.valueOf(C48033uCm.Activity.flVtFt));
            map.put("layout/bot_spot_dca_edit_confirm_dialog_0", Integer.valueOf(C48033uCm.Activity.iZzfmt));
            map.put("layout/bot_spot_dca_edit_start_condition_0", Integer.valueOf(C48033uCm.Activity.hUfVAv));
            map.put("layout/bot_spot_dca_modify_parameters_0", Integer.valueOf(C48033uCm.Activity.iRxXKY));
            map.put("layout/dca_history_fragment_0", Integer.valueOf(C48033uCm.Activity.AxsJAYsNCnLh));
            map.put("layout/dfragment_grid_record_detail_content_0", Integer.valueOf(C48033uCm.Activity.zuWLRA));
            map.put("layout/dfragment_signal_bot_create_instids_0", Integer.valueOf(C48033uCm.Activity.getPostValueLengthLimit));
            map.put("layout/dfragment_signal_bot_edit_instids_0", Integer.valueOf(C48033uCm.Activity.ffGIBT));
            map.put("layout/dfragment_signal_bot_instids_0", Integer.valueOf(C48033uCm.Activity.QSBOWP));
            map.put("layout/dialog_bot_order_failed_0", Integer.valueOf(C48033uCm.Activity.RKDWNf));
            map.put("layout/dialog_copy_tradingview_info_0", Integer.valueOf(C48033uCm.Activity.RdAHlO));
            map.put("layout/dialog_tradingview_info_guide_0", Integer.valueOf(C48033uCm.Activity.dmfpNf));
            map.put("layout/dialog_use_quote_tips_0", Integer.valueOf(C48033uCm.Activity.gwTjWJ));
            map.put("layout/fragment_ai_recommend_0", Integer.valueOf(C48033uCm.Activity.hrNTAI));
            map.put("layout/fragment_arbitrage_content_0", Integer.valueOf(C48033uCm.Activity.OFhtUX));
            map.put("layout/fragment_arbitrage_search_root_0", Integer.valueOf(C48033uCm.Activity.ODXsMY));
            map.put("layout/fragment_arbitrage_set_price_0", Integer.valueOf(C48033uCm.Activity.DLWbHP));
            map.put("layout/fragment_auto_earn_profit_list_0", Integer.valueOf(C48033uCm.Activity.OJuSTm));
            map.put("layout/fragment_benefit_details_0", Integer.valueOf(C48033uCm.Activity.QVsKAR));
            map.put("layout/fragment_bot_auto_bot_earn_staking_education_0", Integer.valueOf(C48033uCm.Activity.aUsmxb));
            map.put("layout/fragment_bot_auto_earn_education_0", Integer.valueOf(C48033uCm.Activity.QwvEab));
            map.put("layout/fragment_bot_guide_banner_order_dialog_0", Integer.valueOf(C48033uCm.Activity.USBtdM));
            map.put("layout/fragment_bot_kline_layout_0", Integer.valueOf(C48033uCm.Activity.dUDNAs));
            map.put("layout/fragment_bot_kline_lua_layout_0", Integer.valueOf(C48033uCm.Activity.UlJrfe));
            map.put("layout/fragment_bot_lead_signalbot_0", Integer.valueOf(C48033uCm.Activity.fjfviF));
            map.put("layout/fragment_bot_lead_signalbot_settlement_0", Integer.valueOf(C48033uCm.Activity.fERRXa));
            map.put("layout/fragment_bot_lead_signalbot_state_page_0", Integer.valueOf(C48033uCm.Activity.igXuih));
            map.put("layout/fragment_bot_lead_signalbot_user_0", Integer.valueOf(C48033uCm.Activity.htlTjW));
            map.put("layout/fragment_bot_lead_strategy_0", Integer.valueOf(C48033uCm.Activity.fdOvFl));
            map.put("layout/fragment_bot_lead_trade_overview_0", Integer.valueOf(C48033uCm.Activity.Dmq));
            map.put("layout/fragment_bot_lead_user_0", Integer.valueOf(C48033uCm.Activity.spnCvw));
            map.put("layout/fragment_bot_lead_user_order_history_0", Integer.valueOf(C48033uCm.Activity.ixgjPv));
            map.put("layout/fragment_bot_lead_user_order_pending_0", Integer.valueOf(C48033uCm.Activity.DCUTEIdCUTEI));
            map.put("layout/fragment_bot_list_sort_panel_0", Integer.valueOf(C48033uCm.Activity.zblBkD));
            map.put("layout/fragment_bot_market_place_0", Integer.valueOf(C48033uCm.Activity.run));
            map.put("layout/fragment_bot_order_confirm_0", Integer.valueOf(C48033uCm.Activity.DCUTEIddSDPG));
            map.put("layout/fragment_bot_recurring_price_range_layout_0", Integer.valueOf(C48033uCm.Activity.call));
            map.put("layout/fragment_bot_selected_0", Integer.valueOf(C48033uCm.Activity.WS));
            map.put("layout/fragment_bot_trade_container_0", Integer.valueOf(C48033uCm.Activity.DGOPHZ));
            map.put("layout/fragment_coin_filter_search_0", Integer.valueOf(C48033uCm.Activity.DcqEDu));
            map.put("layout/fragment_contract_dca_reinvestment_0", Integer.valueOf(C48033uCm.Activity.KDccX));
            map.put("layout/fragment_contract_grid_add_investment_dialog_0", Integer.valueOf(C48033uCm.Activity.UrRBLY));
            map.put("layout/fragment_contract_grid_pending_order_0", Integer.valueOf(C48033uCm.Activity.fHqPtx));
            map.put("layout/fragment_contract_grid_sync_params_dialog_0", Integer.valueOf(C48033uCm.Activity.heceqZ));
            map.put("layout/fragment_earn_calculation_bottom_sheet_0", Integer.valueOf(C48033uCm.Activity.DGOPHZDGOPHZ));
            map.put("layout/fragment_grid_explained_0", Integer.valueOf(C48033uCm.Activity.hCLrkq));
            map.put("layout/fragment_grid_pending_order_0", Integer.valueOf(C48033uCm.Activity.DGUQLI));
            map.put("layout/fragment_home_bot_square_0", Integer.valueOf(C48033uCm.Activity.DsrFlB));
            map.put("layout/fragment_home_signal_list_0", Integer.valueOf(C48033uCm.Activity.DaRZkR));
            map.put("layout/fragment_home_signal_square_0", Integer.valueOf(C48033uCm.Activity.DNMMPQ));
            map.put("layout/fragment_home_strategy_list_0", Integer.valueOf(C48033uCm.Activity.OTwTPd));
            map.put("layout/fragment_manually_grid_0", Integer.valueOf(C48033uCm.Activity.RVsVBY));
            map.put("layout/fragment_market_place_0", Integer.valueOf(C48033uCm.Activity.QXDzTk));
            map.put("layout/fragment_market_place_copy_confirm_0", Integer.valueOf(C48033uCm.Activity.QIZEnU));
            map.put("layout/fragment_market_place_copy_create_order_0", Integer.valueOf(C48033uCm.Activity.QDqgQU));
            map.put("layout/fragment_more_operator_dialog_0", Integer.valueOf(C48033uCm.Activity.RKcVTr));
            map.put("layout/fragment_no_close_open_orders_0", Integer.valueOf(C48033uCm.Activity.Ufzxmz));
            map.put("layout/fragment_no_close_position_container_0", Integer.valueOf(C48033uCm.Activity.ULRxlR));
            map.put("layout/fragment_no_close_position_history_0", Integer.valueOf(C48033uCm.Activity.RXzakW));
            map.put("layout/fragment_recurring_coin_ratio_0", Integer.valueOf(C48033uCm.Activity.TarCU));
            map.put("layout/fragment_recurring_cycle_step2_0", Integer.valueOf(C48033uCm.Activity.UhxbNG));
            map.put("layout/fragment_recurring_select_coin_0", Integer.valueOf(C48033uCm.Activity.alsFma));
            map.put("layout/fragment_signal_bot_entry_options_select_0", Integer.valueOf(C48033uCm.Activity.aJFbMH));
            map.put("layout/fragment_signal_bot_exit_options_select_0", Integer.valueOf(C48033uCm.Activity.akftKQ));
            map.put("layout/fragment_signal_bot_explained_content_0", Integer.valueOf(C48033uCm.Activity.UscePu));
            map.put("layout/fragment_signal_bot_order_type_selet_0", Integer.valueOf(C48033uCm.Activity.aHXSQp));
            map.put("layout/fragment_signal_total_orders_0", Integer.valueOf(C48033uCm.Activity.dLBcXg));
            map.put("layout/fragment_smart_arbi_arbitrage_apy_dialog_0", Integer.valueOf(C48033uCm.Activity.gmHjFq));
            map.put("layout/fragment_smart_arbi_preview_position_0", Integer.valueOf(C48033uCm.Activity.fsSxsn));
            map.put("layout/fragment_smart_arbi_preview_profit_loss_0", Integer.valueOf(C48033uCm.Activity.hlkKmr));
            map.put("layout/fragment_smart_iceberg_0", Integer.valueOf(C48033uCm.Activity.gSBher));
            map.put("layout/fragment_smart_portfolio_0", Integer.valueOf(C48033uCm.Activity.gUEfcq));
            map.put("layout/fragment_styles_and_filters_0", Integer.valueOf(C48033uCm.Activity.sVXHln));
            map.put("layout/fragment_tactics_contract_grid_manually_0", Integer.valueOf(C48033uCm.Activity.iPSTqm));
            map.put("layout/fragment_tactics_information_0", Integer.valueOf(C48033uCm.Activity.hvKCwS));
            map.put("layout/fragment_tactics_normal_information_0", Integer.valueOf(C48033uCm.Activity.swzYdv));
            map.put("layout/fragment_tactics_recurring_new_0", Integer.valueOf(C48033uCm.Activity.zDUObI));
            map.put("layout/fragment_tactics_signal_bot_create_0", Integer.valueOf(C48033uCm.Activity.tIwhY));
            map.put("layout/fragment_transaction_record_order_0", Integer.valueOf(C48033uCm.Activity.vLaW));
            map.put("layout/fragment_transaction_record_order_contract_grid_0", Integer.valueOf(C48033uCm.Activity.zAEkPU));
            map.put("layout/fragment_twap_0", Integer.valueOf(C48033uCm.Activity.zOIQXb));
            map.put("layout/item_bot_lead_signal_bot_settlement_0", Integer.valueOf(C48033uCm.Activity.zqTOFw));
            map.put("layout/item_bot_lead_signal_bot_vertical_info_0", Integer.valueOf(C48033uCm.Activity.zlvcHA));
            map.put("layout/item_bot_lead_unpublish_signal_bot_0", Integer.valueOf(C48033uCm.Activity.DGUQLIDGUQLI));
            map.put("layout/item_bot_position_history_0", Integer.valueOf(C48033uCm.Activity.getLabel));
            map.put("layout/item_more_operator_common_function_0", Integer.valueOf(C48033uCm.Activity.zSsVtY));
            map.put("layout/item_more_operator_layout_0", Integer.valueOf(C48033uCm.Activity.DGUQLIekVPG));
            map.put("layout/item_recurring_cycle_step2_0", Integer.valueOf(C48033uCm.Activity.DUUtXg));
            map.put("layout/item_spread_trade_argitrage_0", Integer.valueOf(C48033uCm.Activity.YqksP));
            map.put("layout/item_stop_strategy_0", Integer.valueOf(C48033uCm.Activity.awiJhF));
            map.put("layout/item_strategy_arbitrage_list_0", Integer.valueOf(C48033uCm.Activity.frkDMe));
            map.put("layout/item_strategy_order_confirm_0", Integer.valueOf(C48033uCm.Activity.hrjNmC));
            map.put("layout/layout_bot_lead_profit_share_detail_0", Integer.valueOf(C48033uCm.Activity.fGQ));
            map.put("layout/layout_bot_loss_insurance_explain_dialog_0", Integer.valueOf(C48033uCm.Activity.DKtBnz));
            map.put("layout/layout_bot_loss_insurance_label_0", Integer.valueOf(C48033uCm.Activity.DPHNDa));
            map.put("layout/layout_bot_loss_insurance_tag_0", Integer.valueOf(C48033uCm.Activity.DrNnAm));
            map.put("layout/layout_bottom_button_view_0", Integer.valueOf(C48033uCm.Activity.DPHsZd));
            map.put("layout/layout_close_position_bottom_sheet_0", Integer.valueOf(C48033uCm.Activity.aJZHYI));
            map.put("layout/layout_detail_parameter_fragment_0", Integer.valueOf(C48033uCm.Activity.DPhTBN));
            map.put("layout/layout_filter_and_sort_bar_0", Integer.valueOf(C48033uCm.Activity.RAQtXZ));
            map.put("layout/layout_grid_bot_stop_fragment_0", Integer.valueOf(C48033uCm.Activity.geLlBI));
            map.put("layout/layout_recurring_ok_tag_0", Integer.valueOf(C48033uCm.Activity.zLAIeZ));
            map.put("layout/layout_signal_bot_type_view_0", Integer.valueOf(C48033uCm.Activity.reset));
            map.put("layout/layout_smart_recommend_item_0", Integer.valueOf(C48033uCm.Activity.ihnvzI));
            map.put("layout/llm_order_fragment_0", Integer.valueOf(C48033uCm.Activity.isReflectionWorking));
            map.put("layout/market_place_common_amt_view_0", Integer.valueOf(C48033uCm.Activity.DcMfJK));
            map.put("layout/market_place_contract_grid_amt_view_0", Integer.valueOf(C48033uCm.Activity.DTeKQX));
            map.put("layout/market_place_copy_param_item_price_range_0", Integer.valueOf(C48033uCm.Activity.RTWSvT));
            map.put("layout/market_place_recurring_amt_view_0", Integer.valueOf(C48033uCm.Activity.iHkeWl));
            map.put("layout/market_place_smart_portfolio_amt_view_0", Integer.valueOf(C48033uCm.Activity.UccSpe));
            map.put("layout/market_place_spot_dca_amt_view_0", Integer.valueOf(C48033uCm.Activity.ggKfIT));
            map.put("layout/overview_fragment_0", Integer.valueOf(C48033uCm.Activity.invokespecialROgMPW));
            map.put("layout/signal_multi_coin_select_fragment_0", Integer.valueOf(C48033uCm.Activity.invokespecialgBtXYZ));
            map.put("layout/smart_arbitrage_advanced_setting_view_0", Integer.valueOf(C48033uCm.Activity.DaTmkG));
            map.put("layout/smart_arbitrage_manual_fragment_0", Integer.valueOf(C48033uCm.Activity.RuDPQV));
            map.put("layout/spot_dca_explain_fragment_0", Integer.valueOf(C48033uCm.Activity.YFmri));
            map.put("layout/tactics_available_item_text_layout_0", Integer.valueOf(C48033uCm.Activity.aGOrKO));
            map.put("layout/tactics_information_coin_stack_item_0", Integer.valueOf(C48033uCm.Activity.atDTRm));
            map.put("layout/tactics_information_tv_item_0", Integer.valueOf(C48033uCm.Activity.aKhcqp));
            map.put("layout/tactics_recurring_price_range_item_0", Integer.valueOf(C48033uCm.Activity.gBtXYZ));
            map.put("layout/tactics_tips_dialog_tv_item_0", Integer.valueOf(C48033uCm.Activity.getUserContextRegisteredStatus));
            map.put("layout/trade_ai_recommend_item_layout_0", Integer.valueOf(C48033uCm.Activity.dzkkkq));
            map.put("layout/trade_arbitrage_switch_margin_mode_layout_0", Integer.valueOf(C48033uCm.Activity.hOMIpD));
            map.put("layout/trade_bot_contract_grid_switch_direction_view_0", Integer.valueOf(C48033uCm.Activity.processStrongAuthMessage));
            map.put("layout/trade_bot_switch_direction_view_0", Integer.valueOf(C48033uCm.Activity.pauseLocationServices));
            map.put("layout/trade_contract_grid_edit_param_dialog_0", Integer.valueOf(C48033uCm.Activity.hlXVux));
            map.put("layout/trade_grid_edit_param_dialog_0", Integer.valueOf(C48033uCm.Activity.scanPackages));
            map.put("layout/trade_impl_activity_bot_guide_spot_grid_0", Integer.valueOf(C48033uCm.Activity.profile));
            map.put("layout/trade_impl_activity_condition_setting_0", Integer.valueOf(C48033uCm.Activity.siEkQe));
            map.put("layout/trade_impl_activity_contract_dca_auto_margin_0", Integer.valueOf(C48033uCm.Activity.zpGcln));
            map.put("layout/trade_impl_activity_contract_grid_rsi_setting_0", Integer.valueOf(C48033uCm.Activity.DcMfJKDCKfqP));
            map.put("layout/trade_impl_activity_grid_rsi_setting_0", Integer.valueOf(C48033uCm.Activity.DcMfJKDCKfqPDCfLja));
            map.put("layout/trade_impl_activity_signal_bot_copy_detail_0", Integer.valueOf(C48033uCm.Activity.DMb));
            map.put("layout/trade_impl_activity_signal_bot_profit_0", Integer.valueOf(C48033uCm.Activity.fmB));
            map.put("layout/trade_impl_activity_signal_bot_trigger_0", Integer.valueOf(C48033uCm.Activity.onComplete));
            map.put("layout/trade_impl_bot_guide_smart_portfolio_desc_0", Integer.valueOf(C48033uCm.Activity.DcMfJKDDUqPf));
            map.put("layout/trade_impl_chat_community_item_0", Integer.valueOf(C48033uCm.Activity.DcMfJKDGTeJD));
            map.put("layout/trade_impl_contract_dca_advanced_layout_0", Integer.valueOf(C48033uCm.Activity.cancel));
            map.put("layout/trade_impl_contract_dca_append_condition_dialog_0", Integer.valueOf(C48033uCm.Activity.stopBehavioSecDataCollection));
            map.put("layout/trade_impl_contract_dca_stop_loss_dialog_0", Integer.valueOf(C48033uCm.Activity.sendBehavioSecData));
            map.put("layout/trade_impl_contract_grid_edit_confirm_dialog_0", Integer.valueOf(C48033uCm.Activity.DcMfJKDSqxTE));
            map.put("layout/trade_impl_customer_and_community_item_0", Integer.valueOf(C48033uCm.Activity.getSessionID));
            map.put("layout/trade_impl_dcd_advanced_product_match_0", Integer.valueOf(C48033uCm.Activity.DcMfJKDcMfJK));
            map.put("layout/trade_impl_dcd_advanced_setting_layout_0", Integer.valueOf(C48033uCm.Activity.DcMfJKOmnske));
            map.put("layout/trade_impl_dcd_principle_explain_dialog_0", Integer.valueOf(C48033uCm.Activity.DsL));
            map.put("layout/trade_impl_dfragment_stop_bot_0", Integer.valueOf(C48033uCm.Activity.jh));
            map.put("layout/trade_impl_dialog_contract_ai_order_0", Integer.valueOf(C48033uCm.Activity.sCB));
            map.put("layout/trade_impl_dialog_contract_dca_add_order_0", Integer.valueOf(C48033uCm.Activity.DcMfJKdMCrTj));
            map.put("layout/trade_impl_dialog_contract_dca_ai_order_0", Integer.valueOf(C48033uCm.Activity.fcfzuX));
            map.put("layout/trade_impl_dialog_spot_ai_order_0", Integer.valueOf(C48033uCm.Activity.fbC));
            map.put("layout/trade_impl_dialog_spot_dca_ai_order_0", Integer.valueOf(C48033uCm.Activity.getStatusCode));
            map.put("layout/trade_impl_explain_chart_best_price_0", Integer.valueOf(C48033uCm.Activity.DcMfJKRKUgwx));
            map.put("layout/trade_impl_explain_chart_better_price_0", Integer.valueOf(C48033uCm.Activity.DcMfJKfbSiEC));
            map.put("layout/trade_impl_explain_chart_fast_deal_0", Integer.valueOf(C48033uCm.Activity.Hx));
            map.put("layout/trade_impl_explain_start_and_build_0", Integer.valueOf(C48033uCm.Activity.DcMfJKfNLfdT));
            map.put("layout/trade_impl_explain_stop_and_sell_0", Integer.valueOf(C48033uCm.Activity.DcMfJKffREWX));
            map.put("layout/trade_impl_explain_tp_sl_0", Integer.valueOf(C48033uCm.Activity.DcMfJKfNUfqk));
            map.put("layout/trade_impl_explain_trailing_chart_classify_0", Integer.valueOf(C48033uCm.Activity.DcMfJKsgNvtZ));
            map.put("layout/trade_impl_explain_trailing_down_chart_0", Integer.valueOf(C48033uCm.Activity.DcMfJKfwDlxl));
            map.put("layout/trade_impl_explain_trailing_grid_0", Integer.valueOf(C48033uCm.Activity.DcMfJKsfEqpH));
            map.put("layout/trade_impl_explain_trailing_up_chart_0", Integer.valueOf(C48033uCm.Activity.XW));
            map.put("layout/trade_impl_explain_trigger_condition_0", Integer.valueOf(C48033uCm.Activity.DcMfJKgMxgjU));
            map.put("layout/trade_impl_explained_dialog_0", Integer.valueOf(C48033uCm.Activity.bindToGooglePlayService));
            map.put("layout/trade_impl_fragment_bot_category_0", Integer.valueOf(C48033uCm.Activity.getAdvertisingId));
            map.put("layout/trade_impl_fragment_bot_guide_contract_dca_0", Integer.valueOf(C48033uCm.Activity.DfrfUJ));
            map.put("layout/trade_impl_fragment_bot_guide_contract_grid_0", Integer.valueOf(C48033uCm.Activity.DcMfJKsuEgdN));
            map.put("layout/trade_impl_fragment_bot_guide_smart_portfolio_0", Integer.valueOf(C48033uCm.Activity.DlABUU));
            map.put("layout/trade_impl_fragment_bot_home_selected_0", Integer.valueOf(C48033uCm.Activity.glVQsU));
            map.put("layout/trade_impl_fragment_bot_nmp_0", Integer.valueOf(C48033uCm.Activity.DlmWDR));
            map.put("layout/trade_impl_fragment_history_event_0", Integer.valueOf(C48033uCm.Activity.DxnCrt));
            map.put("layout/trade_impl_fragment_history_positions_0", Integer.valueOf(C48033uCm.Activity.DwQSDd));
            map.put("layout/trade_impl_fragment_mp_bot_category_0", Integer.valueOf(C48033uCm.Activity.abAflu));
            map.put("layout/trade_impl_fragment_my_bot_and_signal_0", Integer.valueOf(C48033uCm.Activity.QFTsTN));
            map.put("layout/trade_impl_fragment_my_bot_assets_chart_0", Integer.valueOf(C48033uCm.Activity.DDjfYY));
            map.put("layout/trade_impl_fragment_nmp_bot_square_0", Integer.valueOf(C48033uCm.Activity.iUnTnt));
            map.put("layout/trade_impl_fragment_nmp_signal_square_0", Integer.valueOf(C48033uCm.Activity.fiXcQa));
            map.put("layout/trade_impl_fragment_signal_bot_orders_0", Integer.valueOf(C48033uCm.Activity.DzkRMH));
            map.put("layout/trade_impl_fragment_signal_bot_position_0", Integer.valueOf(C48033uCm.Activity.QWpYiD));
            map.put("layout/trade_impl_fragment_signal_create_bot_0", Integer.valueOf(C48033uCm.Activity.QKDJJA));
            map.put("layout/trade_impl_fragment_signal_subs_confirm_0", Integer.valueOf(C48033uCm.Activity.jNexW));
            map.put("layout/trade_impl_fragment_signal_subs_selected_0", Integer.valueOf(C48033uCm.Activity.DGGHxk));
            map.put("layout/trade_impl_fragment_single_coin_select_0", Integer.valueOf(C48033uCm.Activity.ExKek));
            map.put("layout/trade_impl_future_grid_advanced_layout_0", Integer.valueOf(C48033uCm.Activity.gsvlRV));
            map.put("layout/trade_impl_grid_edit_confirm_dialog_0", Integer.valueOf(C48033uCm.Activity.fVjYLc));
            map.put("layout/trade_impl_grid_futures_grid_slippage_control_dialog_0", Integer.valueOf(C48033uCm.Activity.gGNlxh));
            map.put("layout/trade_impl_grid_mode_explain_dialog_0", Integer.valueOf(C48033uCm.Activity.dbwnZN));
            map.put("layout/trade_impl_grid_mode_item_view_0", Integer.valueOf(C48033uCm.Activity.QslYrK));
            map.put("layout/trade_impl_grid_smart_arbitrage_open_position_cond_dialog_0", Integer.valueOf(C48033uCm.Activity.gCZUJG));
            map.put("layout/trade_impl_grid_tp_sl_dialog_0", Integer.valueOf(C48033uCm.Activity.hdpuIA));
            map.put("layout/trade_impl_grid_tp_sl_dialog2_0", Integer.valueOf(C48033uCm.Activity.FHvxmb));
            map.put("layout/trade_impl_history_position_item_0", Integer.valueOf(C48033uCm.Activity.hNurIN));
            map.put("layout/trade_impl_inner_item_view_0", Integer.valueOf(C48033uCm.Activity.gkZNMa));
            map.put("layout/trade_impl_item_signal_subscribe_0", Integer.valueOf(C48033uCm.Activity.OEgNct));
            map.put("layout/trade_impl_item_switch_button_view_0", Integer.valueOf(C48033uCm.Activity.apAOXX));
            map.put("layout/trade_impl_mp_bot_copy_trader_view_0", Integer.valueOf(C48033uCm.Activity.DztXDE));
            map.put("layout/trade_impl_mp_bot_copy_win_rate_view_0", Integer.valueOf(C48033uCm.Activity.OijiEz));
            map.put("layout/trade_impl_mp_home_create_bot_couple_layout_0", Integer.valueOf(C48033uCm.Activity.dPkBzA));
            map.put("layout/trade_impl_mp_home_create_bot_layout_0", Integer.valueOf(C48033uCm.Activity.gqOnQv));
            map.put("layout/trade_impl_mp_home_create_bot_multi_layout_0", Integer.valueOf(C48033uCm.Activity.Dap));
            map.put("layout/trade_impl_mp_spot_grid_amt_view_0", Integer.valueOf(C48033uCm.Activity.zEHIKV));
            map.put("layout/trade_impl_my_bot_asset_select_press_view_0", Integer.valueOf(C48033uCm.Activity.FQMcgEfQMcgE));
            map.put("layout/trade_impl_my_bot_asset_status_loading_view_0", Integer.valueOf(C48033uCm.Activity.svhCHd));
            map.put("layout/trade_impl_my_bot_asset_status_view_0", Integer.valueOf(C48033uCm.Activity.zDGrpR));
            map.put("layout/trade_impl_my_bot_item_asset_select_view_0", Integer.valueOf(C48033uCm.Activity.v));
            map.put("layout/trade_impl_nmp_bot_suqare_guide_item_0", Integer.valueOf(C48033uCm.Activity.sIqKDg));
            map.put("layout/trade_impl_nmp_bot_suqare_marquee_container_0", Integer.valueOf(C48033uCm.Activity.setPageName));
            map.put("layout/trade_impl_nmp_bot_suqare_vertical_container_0", Integer.valueOf(C48033uCm.Activity.FYtjSf));
            map.put("layout/trade_impl_recurring_advanced_layout_0", Integer.valueOf(C48033uCm.Activity.fdt));
            map.put("layout/trade_impl_rsi_settings_layout_0", Integer.valueOf(C48033uCm.Activity.FSMca));
            map.put("layout/trade_impl_signal_bot_advanced_layout_0", Integer.valueOf(C48033uCm.Activity.UJEglR));
            map.put("layout/trade_impl_signal_bot_dialog_manual_order_0", Integer.valueOf(C48033uCm.Activity.dlRikr));
            map.put("layout/trade_impl_signal_bot_sign_intro_dialog_0", Integer.valueOf(C48033uCm.Activity.GFUIi));
            map.put("layout/trade_impl_signal_bot_sign_select_dialog_0", Integer.valueOf(C48033uCm.Activity.DuXjdv));
            map.put("layout/trade_impl_signal_bot_update_dialog_0", Integer.valueOf(C48033uCm.Activity.NRYds));
            map.put("layout/trade_impl_signal_order_item_0", Integer.valueOf(C48033uCm.Activity.fMBJsc));
            map.put("layout/trade_impl_signal_position_item_0", Integer.valueOf(C48033uCm.Activity.hbZCHz));
            map.put("layout/trade_impl_smart_arbitrage_cal_cost_layout_0", Integer.valueOf(C48033uCm.Activity.sVvuFk));
            map.put("layout/trade_impl_smart_arbitrage_sub_info_0", Integer.valueOf(C48033uCm.Activity.gbIfDn));
            map.put("layout/trade_impl_smart_iceberg_explain_0", Integer.valueOf(C48033uCm.Activity.gVEiQJ));
            map.put("layout/trade_impl_smart_iceberg_explain_order_favorite_0", Integer.valueOf(C48033uCm.Activity.FhERFw));
            map.put("layout/trade_impl_smart_iceberg_grid_advanced_layout_0", Integer.valueOf(C48033uCm.Activity.GCXiNH));
            map.put("layout/trade_impl_smart_iceberg_limit_price_dialog_0", Integer.valueOf(C48033uCm.Activity.sYcwUD));
            map.put("layout/trade_impl_spot_dca_advanced_layout_0", Integer.valueOf(C48033uCm.Activity.DRGLNw));
            map.put("layout/trade_impl_spot_dca_append_condition_dialog_0", Integer.valueOf(C48033uCm.Activity.Dfm));
            map.put("layout/trade_impl_spot_dca_stop_loss_modify_dialog_0", Integer.valueOf(C48033uCm.Activity.fTEjYi));
            map.put("layout/trade_impl_spot_grid_explain_stop_and_sell_0", Integer.valueOf(C48033uCm.Activity.GGlJim));
            map.put("layout/trade_impl_spot_grid_reserve_funds_tips_dialog_0", Integer.valueOf(C48033uCm.Activity.Dfv));
            map.put("layout/trade_impl_trade_twap_modify_layout_0", Integer.valueOf(C48033uCm.Activity.dbUqJD));
            map.put("layout/trade_impl_trailing_dialog_0", Integer.valueOf(C48033uCm.Activity.OAhWiU));
            map.put("layout/trade_impl_view_advance_item_switch_0", Integer.valueOf(C48033uCm.Activity.GPCHlQ));
            map.put("layout/trade_impl_view_bot_category_0", Integer.valueOf(C48033uCm.Activity.GLcwwN));
            map.put("layout/trade_impl_view_bot_category_card_0", Integer.valueOf(C48033uCm.Activity.aQtmcU));
            map.put("layout/trade_impl_view_bot_category_single_card_0", Integer.valueOf(C48033uCm.Activity.sILrnl));
            map.put("layout/trade_impl_view_bot_guide_header_0", Integer.valueOf(C48033uCm.Activity.zeUYeG));
            map.put("layout/trade_impl_view_bot_guide_loss_insurance_0", Integer.valueOf(C48033uCm.Activity.GQzpsZ));
            map.put("layout/trade_impl_view_bot_guide_new_header_0", Integer.valueOf(C48033uCm.Activity.OzhFjl));
            map.put("layout/trade_impl_view_bot_guide_teach_0", Integer.valueOf(C48033uCm.Activity.DBAlnt));
            map.put("layout/trade_impl_view_bot_guide_top_details_0", Integer.valueOf(C48033uCm.Activity.QnnRaN));
            map.put("layout/trade_impl_view_coin_distribution_0", Integer.valueOf(C48033uCm.Activity.OrsvgJ));
            map.put("layout/trade_impl_view_dcd_pnl_chart_0", Integer.valueOf(C48033uCm.Activity.DQnQnb));
            map.put("layout/trade_impl_view_expand_helper_label_0", Integer.valueOf(C48033uCm.Activity.QiTXOm));
            map.put("layout/trade_impl_view_history_event_item_0", Integer.valueOf(C48033uCm.Activity.OgHfcT));
            map.put("layout/trade_impl_view_mp_bot_guide_0", Integer.valueOf(C48033uCm.Activity.RXdAnZ));
            map.put("layout/trade_impl_view_mp_category_child_0", Integer.valueOf(C48033uCm.Activity.RLmrWm));
            map.put("layout/trade_impl_view_mp_category_parent_0", Integer.valueOf(C48033uCm.Activity.drbYRJ));
            map.put("layout/trade_impl_view_select_input_twice_0", Integer.valueOf(C48033uCm.Activity.gAnGwV));
            map.put("layout/trade_impl_view_select_rsi_input_0", Integer.valueOf(C48033uCm.Activity.zFtALg));
            map.put("layout/trade_impl_view_signal_bot_detail_header_0", Integer.valueOf(C48033uCm.Activity.pXZxY));
            map.put("layout/trade_impl_view_signal_bot_profit_0", Integer.valueOf(C48033uCm.Activity.inahnb));
            map.put("layout/trade_impl_view_signal_bot_trigger_0", Integer.valueOf(C48033uCm.Activity.hGuIrQ));
            map.put("layout/trade_impl_view_signal_trigger_item_0", Integer.valueOf(C48033uCm.Activity.sRzUNh));
            map.put("layout/trade_impl_view_sort_profit_item_0", Integer.valueOf(C48033uCm.Activity.GQzpsZgQzpsZ));
            map.put("layout/trade_impl_view_terms_checkbox_0", Integer.valueOf(C48033uCm.Activity.zXhzOT));
            map.put("layout/trade_imple_market_place_contract_dca_amt_view_0", Integer.valueOf(C48033uCm.Activity.getValue));
            map.put("layout/trade_smart_arbi_stop_confirm_dialog_0", Integer.valueOf(C48033uCm.Activity.RckOJh));
            map.put("layout/trade_ui_activity_bot_copy_success_0", Integer.valueOf(C48033uCm.Activity.DXd));
            map.put("layout/trade_ui_activity_bot_lead_success_0", Integer.valueOf(C48033uCm.Activity.fQQVvf));
            map.put("layout/trade_ui_activity_bot_signal_publish_0", Integer.valueOf(C48033uCm.Activity.GhqvEQ));
            map.put("layout/trade_ui_activity_contract_dca_start_condition_0", Integer.valueOf(C48033uCm.Activity.hKJZrr));
            map.put("layout/trade_ui_activity_contract_dca_stop_condition_0", Integer.valueOf(C48033uCm.Activity.OStAOF));
            map.put("layout/trade_ui_activity_contract_dca_trigger_rsi_0", Integer.valueOf(C48033uCm.Activity.zzJhsT));
            map.put("layout/trade_ui_activity_dcd_product_detail_0", Integer.valueOf(C48033uCm.Activity.hgxRZI));
            map.put("layout/trade_ui_activity_dcd_product_list_0", Integer.valueOf(C48033uCm.Activity.GiPPlL));
            map.put("layout/trade_ui_activity_signal_bot_create_sign_0", Integer.valueOf(C48033uCm.Activity.idLUrz));
            map.put("layout/trade_ui_activity_spot_dca_start_condition_0", Integer.valueOf(C48033uCm.Activity.RcvFxC));
            map.put("layout/trade_ui_activity_spot_dca_trigger_rsi_0", Integer.valueOf(C48033uCm.Activity.config));
            map.put("layout/trade_ui_bot_item_switch_view_0", Integer.valueOf(C48033uCm.Activity.RihMUf));
            map.put("layout/trade_ui_bot_mp_recommend_item_0", Integer.valueOf(C48033uCm.Activity.getLocation));
            map.put("layout/trade_ui_bot_mp_view_more_0", Integer.valueOf(C48033uCm.Activity.fhUrPt));
            map.put("layout/trade_ui_bot_recurring_price_range_item_0", Integer.valueOf(C48033uCm.Activity.unregister));
            map.put("layout/trade_ui_child_order_fragment_list_0", Integer.valueOf(C48033uCm.Activity.GqbzPL));
            map.put("layout/trade_ui_contract_grid_close_pos_fg_0", Integer.valueOf(C48033uCm.Activity.Dff));
            map.put("layout/trade_ui_contract_grid_related_pos_fg_0", Integer.valueOf(C48033uCm.Activity.fZc));
            map.put("layout/trade_ui_dialog_adjustment_contract_margin_content_0", Integer.valueOf(C48033uCm.Activity.HJWChPDXdlte));
            map.put("layout/trade_ui_dialog_bot_guide_0", Integer.valueOf(C48033uCm.Activity.RhjxDW));
            map.put("layout/trade_ui_dialog_contract_dca_adjust_margin_0", Integer.valueOf(C48033uCm.Activity.aappFQ));
            map.put("layout/trade_ui_dialog_contract_dca_make_order_confirm_content_0", Integer.valueOf(C48033uCm.Activity.dXcUrg));
            map.put("layout/trade_ui_dialog_contract_dca_modify_tp_0", Integer.valueOf(C48033uCm.Activity.hcetpZ));
            map.put("layout/trade_ui_dialog_dcd_disclaimer_0", Integer.valueOf(C48033uCm.Activity.iLWfRf));
            map.put("layout/trade_ui_dialog_home_strategy_filter_content_0", Integer.valueOf(C48033uCm.Activity.gdLjtZ));
            map.put("layout/trade_ui_dialog_signal_bot_data_0", Integer.valueOf(C48033uCm.Activity.HJWChPHhYHK));
            map.put("layout/trade_ui_dialog_smart_arbitrage_container_preview_0", Integer.valueOf(C48033uCm.Activity.DeEinT));
            map.put("layout/trade_ui_dialog_smart_arbitrage_liq_price_rate_0", Integer.valueOf(C48033uCm.Activity.OxbLUn));
            map.put("layout/trade_ui_dialog_smart_arbitrage_select_coin_0", Integer.valueOf(C48033uCm.Activity.Qsauvs));
            map.put("layout/trade_ui_dialog_smart_iceberg_rsi_modify_0", Integer.valueOf(C48033uCm.Activity.DVmcag));
            map.put("layout/trade_ui_dialog_smart_intro_0", Integer.valueOf(C48033uCm.Activity.dSJNDS));
            map.put("layout/trade_ui_dialog_smart_invest_detail_0", Integer.valueOf(C48033uCm.Activity.putInt));
            map.put("layout/trade_ui_dialog_smart_recommend_0", Integer.valueOf(C48033uCm.Activity.hwkNQP));
            map.put("layout/trade_ui_dialog_spot_dca_make_order_confirm_content_0", Integer.valueOf(C48033uCm.Activity.gFTCsA));
            map.put("layout/trade_ui_dialog_titlebar_line_0", Integer.valueOf(C48033uCm.Activity.sZqaRl));
            map.put("layout/trade_ui_fragemt_tactics_list_container_0", Integer.valueOf(C48033uCm.Activity.fAklCm));
            map.put("layout/trade_ui_fragment_arbitrage_depth_0", Integer.valueOf(C48033uCm.Activity.HJWChPOKBmQN));
            map.put("layout/trade_ui_fragment_bot_guide_content_0", Integer.valueOf(C48033uCm.Activity.HJWChPOKBmQNaCIdOM));
            map.put("layout/trade_ui_fragment_contract_dca_manual_0", Integer.valueOf(C48033uCm.Activity.HJWChPOZOJIj));
            map.put("layout/trade_ui_fragment_dcd_arbitrage_record_0", Integer.valueOf(C48033uCm.Activity.DjwCMv));
            map.put("layout/trade_ui_fragment_dcd_create_0", Integer.valueOf(C48033uCm.Activity.fDu));
            map.put("layout/trade_ui_fragment_dcd_manual_create_0", Integer.valueOf(C48033uCm.Activity.QfZsXX));
            map.put("layout/trade_ui_fragment_market_place_featured_0", Integer.valueOf(C48033uCm.Activity.HJWChPQPAeHI));
            map.put("layout/trade_ui_fragment_market_place_ongoing_list_0", Integer.valueOf(C48033uCm.Activity.iLAtSv));
            map.put("layout/trade_ui_fragment_my_bot_history_order_list_0", Integer.valueOf(C48033uCm.Activity.QsIRgs));
            map.put("layout/trade_ui_fragment_my_bot_list_0", Integer.valueOf(C48033uCm.Activity.QOjuYg));
            map.put("layout/trade_ui_fragment_my_bot_order_list_0", Integer.valueOf(C48033uCm.Activity.itxZVF));
            map.put("layout/trade_ui_fragment_my_bot_signal_list_0", Integer.valueOf(C48033uCm.Activity.ONJgbh));
            map.put("layout/trade_ui_fragment_signal_bot_sign_action_0", Integer.valueOf(C48033uCm.Activity.iWlNch));
            map.put("layout/trade_ui_fragment_signal_bot_sign_params_content_0", Integer.valueOf(C48033uCm.Activity.HJWChPQdUnVm));
            map.put("layout/trade_ui_fragment_signal_bot_trades_0", Integer.valueOf(C48033uCm.Activity.ibnZAm));
            map.put("layout/trade_ui_fragment_spot_dca_manual_0", Integer.valueOf(C48033uCm.Activity.RSmiaq));
            map.put("layout/trade_ui_fragment_tactics_all_list_container2_0", Integer.valueOf(C48033uCm.Activity.HJWChPRAkuRW));
            map.put("layout/trade_ui_fragment_tactics_list_0", Integer.valueOf(C48033uCm.Activity.gCNefq));
            map.put("layout/trade_ui_fragment_tactics_list_container_0", Integer.valueOf(C48033uCm.Activity.RWIpjU));
            map.put("layout/trade_ui_home_strategy_filter_select_item_0", Integer.valueOf(C48033uCm.Activity.HJWChPRGtXKC));
            map.put("layout/trade_ui_item_bot_detail_dcd_profit_chart_0", Integer.valueOf(C48033uCm.Activity.HJWChPURsaBn));
            map.put("layout/trade_ui_item_chip_selection_0", Integer.valueOf(C48033uCm.Activity.HJWChPRGtXKCRGtXKC));
            map.put("layout/trade_ui_item_dcd_arb_record_0", Integer.valueOf(C48033uCm.Activity.ikIEnW));
            map.put("layout/trade_ui_item_dcd_arb_record_insided_0", Integer.valueOf(C48033uCm.Activity.HJWChPUUMfbK));
            map.put("layout/trade_ui_item_dcd_product_0", Integer.valueOf(C48033uCm.Activity.DuR));
            map.put("layout/trade_ui_item_fund_rate_trade_arbitrage_0", Integer.valueOf(C48033uCm.Activity.BVXAa));
            map.put("layout/trade_ui_item_home_signal_list_0", Integer.valueOf(C48033uCm.Activity.HJWChPdIKEqB));
            map.put("layout/trade_ui_item_signal_bot_sign_select_0", Integer.valueOf(C48033uCm.Activity.HJWChPfvRMlC));
            map.put("layout/trade_ui_item_smart_arbitrage_binder_0", Integer.valueOf(C48033uCm.Activity.RZMhtF));
            map.put("layout/trade_ui_makret_place_home_top_view_normal_0", Integer.valueOf(C48033uCm.Activity.dpErvT));
            map.put("layout/trade_ui_makret_place_home_top_view_trader_0", Integer.valueOf(C48033uCm.Activity.hfeTOA));
            map.put("layout/trade_ui_market_place_featured_content_item_0", Integer.valueOf(C48033uCm.Activity.iOIMNp));
            map.put("layout/trade_ui_market_place_featured_create_item_0", Integer.valueOf(C48033uCm.Activity.iRgjgR));
            map.put("layout/trade_ui_market_place_featured_title_item_0", Integer.valueOf(C48033uCm.Activity.gLWkOL));
            map.put("layout/trade_ui_market_place_home_create_strategy_list_item_0", Integer.valueOf(C48033uCm.Activity.izFvvl));
            map.put("layout/trade_ui_market_place_home_top_view_0", Integer.valueOf(C48033uCm.Activity.xxhdY));
            map.put("layout/trade_ui_my_bot_signal_item_view_0", Integer.valueOf(C48033uCm.Activity.ilfrrN));
            map.put("layout/trade_ui_signal_bot_create_sign_step1_0", Integer.valueOf(C48033uCm.Activity.aBDePw));
            map.put("layout/trade_ui_signal_bot_create_sign_step2_0", Integer.valueOf(C48033uCm.Activity.DzCpqu));
            map.put("layout/trade_ui_signal_bot_edit_view_0", Integer.valueOf(C48033uCm.Activity.HJWChPiaHEvk));
            map.put("layout/trade_ui_signal_bot_explain_content_item_0", Integer.valueOf(C48033uCm.Activity.HJWChPzRXNTw));
            map.put("layout/trade_ui_signal_bot_explain_title_item_0", Integer.valueOf(C48033uCm.Activity.OqCbbx));
            map.put("layout/trade_ui_signal_bot_guide_view_0", Integer.valueOf(C48033uCm.Activity.DGgkXd));
            map.put("layout/trade_ui_signal_coin_pair_item_0", Integer.valueOf(C48033uCm.Activity.DpxfQh));
            map.put("layout/trade_ui_signal_coin_pair_sub_title_item_0", Integer.valueOf(C48033uCm.Activity.geAOna));
            map.put("layout/trade_ui_tactic_tips_list_0", Integer.valueOf(C48033uCm.Activity.fzHEvu));
            map.put("layout/trade_ui_tactics_rec_info_detail_item_0", Integer.valueOf(C48033uCm.Activity.DsfknC));
            map.put("layout/trade_ui_view_arbitrage_smart_guide_0", Integer.valueOf(C48033uCm.Activity.apLTlu));
            map.put("layout/trade_ui_view_bot_signal_cost_setting_0", Integer.valueOf(C48033uCm.Activity.OCdtug));
            map.put("layout/trade_ui_view_bot_signal_trading_pair_select_0", Integer.valueOf(C48033uCm.Activity.DtnWsU));
            map.put("layout/trade_ui_view_contract_grid_slippage_percent_input_0", Integer.valueOf(C48033uCm.Activity.sEcTXd));
            map.put("layout/trade_ui_view_dcd_basic_create_button_0", Integer.valueOf(C48033uCm.Activity.iMXFZQ));
            map.put("layout/trade_ui_view_dcd_product_detail_header_0", Integer.valueOf(C48033uCm.Activity.icKaHr));
            map.put("layout/trade_ui_view_dcd_product_detail_invest_0", Integer.valueOf(C48033uCm.Activity.jFiva));
            map.put("layout/trade_ui_view_dcd_product_detail_tp_mode_0", Integer.valueOf(C48033uCm.Activity.fJk));
            map.put("layout/trade_ui_view_selection_item_0", Integer.valueOf(C48033uCm.Activity.QzqeNH));
            map.put("layout/trade_ui_view_smart_arb_pnl_chart_0", Integer.valueOf(C48033uCm.Activity.OAjjVP));
            map.put("layout/trade_ui_view_smart_arbitrage_cal_staking_apy_0", Integer.valueOf(C48033uCm.Activity.aWuQzD));
            map.put("layout/trade_ui_view_smart_arbitrage_inst_info_0", Integer.valueOf(C48033uCm.Activity.dYepVG));
            map.put("layout/trade_ui_withdraw_prifits_fg_0", Integer.valueOf(C48033uCm.Activity.seuMaA));
            map.put("layout/view_arbitrage_balance_0", Integer.valueOf(C48033uCm.Activity.adevsa));
            map.put("layout/view_arbitrage_coin_select_0", Integer.valueOf(C48033uCm.Activity.OFqMGB));
            map.put("layout/view_arbitrage_price_0", Integer.valueOf(C48033uCm.Activity.OGitdB));
            map.put("layout/view_arbitrage_trade_depth_0", Integer.valueOf(C48033uCm.Activity.zdxASf));
            map.put("layout/view_bot_grid_tp_sl_group_0", Integer.valueOf(C48033uCm.Activity.fGT));
            map.put("layout/view_bot_grid_tp_sl_group2_0", Integer.valueOf(C48033uCm.Activity.OHsvZP));
            map.put("layout/view_bot_networ_error_0", Integer.valueOf(C48033uCm.Activity.ORrpqH));
            map.put("layout/view_bot_profit_sharing_setting_0", Integer.valueOf(C48033uCm.Activity.dGrqPl));
            map.put("layout/view_bot_trade_header_0", Integer.valueOf(C48033uCm.Activity.uLLnq));
            map.put("layout/view_bot_trade_toolbar_0", Integer.valueOf(C48033uCm.Activity.gZKUVK));
            map.put("layout/view_coin_balance_0", Integer.valueOf(C48033uCm.Activity.FF));
            map.put("layout/view_coin_pair_item_0", Integer.valueOf(C48033uCm.Activity.OUcgGI));
            map.put("layout/view_coin_pairs_0", Integer.valueOf(C48033uCm.Activity.OAUGar));
            map.put("layout/view_contract_grid_deal_record_benefit_item_0", Integer.valueOf(C48033uCm.Activity.QYNZmZ));
            map.put("layout/view_distribute_item_0", Integer.valueOf(C48033uCm.Activity.OeawrHOeawrH));
            map.put("layout/view_invest_detail_item_0", Integer.valueOf(C48033uCm.Activity.OqHLSf));
            map.put("layout/view_market_place_copy_divider_view_0", Integer.valueOf(C48033uCm.Activity.fmdvVn));
            map.put("layout/view_market_place_copy_profit_view_0", Integer.valueOf(C48033uCm.Activity.dkJJWw));
            map.put("layout/view_market_place_toolbar_0", Integer.valueOf(C48033uCm.Activity.gCiISl));
            map.put("layout/view_pie_distribute_0", Integer.valueOf(C48033uCm.Activity.OhcwxsRkSIEV));
            map.put("layout/view_recurring_coin_config_0", Integer.valueOf(C48033uCm.Activity.OmYuqg));
            map.put("layout/view_recurring_coin_config_item_0", Integer.valueOf(C48033uCm.Activity.compare));
            map.put("layout/view_recurring_new_amount_0", Integer.valueOf(C48033uCm.Activity.UJpkuA));
            map.put("layout/view_recurring_select_coin_item_0", Integer.valueOf(C48033uCm.Activity.DcNNRp));
            map.put("layout/view_sheet_recurring_coin_config_0", Integer.valueOf(C48033uCm.Activity.RIKbBf));
            map.put("layout/view_signal_bot_advance_item_select_0", Integer.valueOf(C48033uCm.Activity.OEsIKP));
            map.put("layout/view_signal_bot_button_tab_0", Integer.valueOf(C48033uCm.Activity.QhYuFg));
            map.put("layout/view_signal_bot_set_fixed_amt_0", Integer.valueOf(C48033uCm.Activity.gqESXP));
            map.put("layout/view_signal_bot_set_percent_0", Integer.valueOf(C48033uCm.Activity.aChkwz));
            map.put("layout/view_signal_bot_set_tp_sl_0", Integer.valueOf(C48033uCm.Activity.fGsPTM));
            map.put("layout/view_simple_borrow_balance_0", Integer.valueOf(C48033uCm.Activity.dtVxwd));
            map.put("layout/view_smart_iceberg_input_panel_0", Integer.valueOf(C48033uCm.Activity.isScanInProgress));
            map.put("layout/view_smart_iceberg_trade_footer_0", Integer.valueOf(C48033uCm.Activity.sVaiLC));
            map.put("layout/view_smart_recommend_0", Integer.valueOf(C48033uCm.Activity.sJPPOI));
            map.put("layout/view_smart_recommend_item_0", Integer.valueOf(C48033uCm.Activity.isInitInProgress));
            map.put("layout/view_strategy_order_confirm_tp_sl_view_0", Integer.valueOf(C48033uCm.Activity.vqBjd));
            map.put("layout/view_strategy_ticker_0", Integer.valueOf(C48033uCm.Activity.OqhRBM));
            map.put("layout/view_tactics_profit_chart_view_0", Integer.valueOf(C48033uCm.Activity.zHQtTQ));
            map.put("layout/view_trade_dialog_footer_0", Integer.valueOf(C48033uCm.Activity.DDjgSw));
            map.put("layout/view_trade_footer_0", Integer.valueOf(C48033uCm.Activity.OtZEmZ));
            map.put("layout/view_trade_footer_ava_0", Integer.valueOf(C48033uCm.Activity.OtRJxF));
            map.put("layout/view_twap_input_panel_0", Integer.valueOf(C48033uCm.Activity.zEkrwr));
        }
    }
}
