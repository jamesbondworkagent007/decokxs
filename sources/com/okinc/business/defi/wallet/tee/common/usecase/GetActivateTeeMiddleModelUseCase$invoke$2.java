package com.okinc.business.defi.wallet.tee.common.usecase;

import com.okinc.business.defi.biz.core.error.TeeGeneratedError;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeMiddleModel;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.common.model.ADOriginData;
import com.okinc.business.defi.wallet.tee.common.model.ActivateTEERequest;
import com.okinc.business.defi.wallet.tee.common.model.AttestationParseData;
import com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData;
import com.okinc.business.defi.wallet.tee.common.model.SignatureOriginData;
import com.okinc.wallet.core.mpc.PrivateKeyOriginData;
import com.okinc.wallet.core.tee.HPKEEncryptData;
import com.okinc.wallet.core.tee.HPKEKeypair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C17835fUa;
import o.C33129mqd;
import o.C33488mxR;
import o.C54905xZr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.fTT;
import o.fTV;
import o.fTW;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class GetActivateTeeMiddleModelUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ActivateTeeMiddleModel>>, Object> {
    final /* synthetic */ ActivateTeeModel $activateTeeModel;
    final /* synthetic */ AttestationParseData $attestationParseData;
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ fTT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActivateTeeMiddleModelUseCase$invoke$2(fTT ftt, AbstractC12782ctV abstractC12782ctV, String str, ActivateTeeModel activateTeeModel, AttestationParseData attestationParseData, Continuation<? super GetActivateTeeMiddleModelUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = ftt;
        this.$wallet = abstractC12782ctV;
        this.$password = str;
        this.$activateTeeModel = activateTeeModel;
        this.$attestationParseData = attestationParseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetActivateTeeMiddleModelUseCase$invoke$2(this.this$0, this.$wallet, this.$password, this.$activateTeeModel, this.$attestationParseData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ActivateTeeMiddleModel>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<ActivateTeeMiddleModel>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<ActivateTeeMiddleModel>> continuation) {
        return ((GetActivateTeeMiddleModelUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:57:0x02af) to fix multi-entry loop: BACK_EDGE: B:57:0x02af -> B:51:0x0292 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:109:0x0292 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x00c9 */
    /* JADX DEBUG: Type inference failed for r4v27. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0492 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0493  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [long] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x026e -> B:103:0x0285). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x02ca -> B:60:0x02d3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r2;
        long jAEQbTJ;
        String strEjfBZ;
        Object objAwait;
        String str;
        Object objOLrzqt;
        ?? r22;
        HPKEKeypair hPKEKeypair;
        Iterator it;
        String str2;
        String str3;
        String str4;
        ?? r12;
        List<PrivateKeyOriginData> list;
        String str5;
        fTT ftt;
        HPKEKeypair hPKEKeypair2;
        AbstractC12782ctV abstractC12782ctV;
        ?? r17;
        String str6;
        Object obj2;
        String str7;
        List<PrivateKeyOriginData> list2;
        fTT ftt2;
        AbstractC12782ctV abstractC12782ctV2;
        String str8;
        HPKEKeypair hPKEKeypair3;
        long j;
        Throwable th;
        HPKEKeypair hPKEKeypair4;
        Object obj3;
        String str9;
        Object objCopydefault;
        String str10;
        HPKEKeypair hPKEKeypair5;
        ?? r4;
        Object objAwait2;
        long j2;
        ?? r122;
        HPKEEncryptData hPKEEncryptData;
        Object objCopydefault2;
        String str11;
        HPKEKeypair hPKEKeypair6;
        String str12;
        ?? r42;
        Object objOLrzqt2;
        String str13;
        ?? r10;
        HPKEInfoData hPKEInfoData;
        Object objCopydefault3 = C56442yFn.copydefault();
        String str14 = "}";
        try {
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    pUU.copydefault(this.this$0.KWHzl, "GetActivateTeeMiddleModelUseCase operate start");
                    C10854bwM c10854bwMIsConnected = this.this$0.copydefault.isConnected();
                    if (c10854bwMIsConnected == null) {
                        Result.Application application = Result.Companion;
                        return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.KWHzl(this.this$0.KWHzl + " : Get ETH chainId failed"))));
                    }
                    jAEQbTJ = c10854bwMIsConnected.AEQbTJ();
                    strEjfBZ = this.$wallet.ejfBZ();
                    fTT ftt3 = this.this$0;
                    if (strEjfBZ.length() == 0) {
                        Result.Application application2 = Result.Companion;
                        return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.KWHzl(ftt3.KWHzl + " : Get teeId failed"))));
                    }
                    AbstractC58260yxt abstractC58260yxtPrivateKeyForChainId$default = AbstractC12782ctV.privateKeyForChainId$default(this.$wallet, this.$password, jAEQbTJ, 0, 4, null);
                    this.L$0 = strEjfBZ;
                    this.J$0 = jAEQbTJ;
                    this.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtPrivateKeyForChainId$default, this);
                    if (objAwait == objCopydefault3) {
                        return objCopydefault3;
                    }
                    long j3 = jAEQbTJ;
                    r2 = strEjfBZ;
                    try {
                        str = (String) objAwait;
                        fTV ftv = this.this$0.AEQbTJ;
                        Intrinsics.copydefault((Object) str);
                        this.L$0 = r2;
                        this.L$1 = str;
                        this.label = 2;
                        objOLrzqt = ftv.OLrzqt(str, "OKX-TEE-WALLET-IDENTITY", this);
                        r22 = r2;
                        if (objOLrzqt == objCopydefault3) {
                            return objCopydefault3;
                        }
                        hPKEKeypair = (HPKEKeypair) objOLrzqt;
                        if (hPKEKeypair != null) {
                            pUU.copydefault(this.this$0.KWHzl, "operate hPKEKeypair result priKeyHex = " + C33129mqd.OLrzqt((CharSequence) hPKEKeypair.getPriKeyHex()) + ": pubKeyHex = " + C33129mqd.OLrzqt((CharSequence) hPKEKeypair.getPubKeyHex()));
                            String strOLrzqt = this.this$0.EZpvd.OLrzqt(new ADOriginData(r22, this.$activateTeeModel.getTeeType().getTypeCode(), hPKEKeypair.getPubKeyHex(), this.$activateTeeModel.getExpireTimestamp(), this.$activateTeeModel.getTimestamp(), this.$activateTeeModel.getCommand().getCommand()).toJson());
                            ArrayList arrayList = new ArrayList();
                            List<Long> chainIndexList = this.$activateTeeModel.getChainIndexList();
                            fTT ftt4 = this.this$0;
                            AbstractC12782ctV abstractC12782ctV3 = this.$wallet;
                            String str15 = this.$password;
                            it = chainIndexList.iterator();
                            str2 = str;
                            str3 = "}";
                            str4 = str15;
                            r12 = r22;
                            list = arrayList;
                            str5 = strOLrzqt;
                            ftt = ftt4;
                            hPKEKeypair2 = hPKEKeypair;
                            abstractC12782ctV = abstractC12782ctV3;
                            if (it.hasNext()) {
                                long jLongValue = ((Number) it.next()).longValue();
                                C10854bwM c10854bwMCopydefault = ftt.copydefault.copydefault(jLongValue);
                                if (c10854bwMCopydefault != null) {
                                    String str16 = str3;
                                    long jAEQbTJ2 = c10854bwMCopydefault.AEQbTJ();
                                    Object obj4 = objCopydefault3;
                                    String str17 = str2;
                                    try {
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj4;
                                        list2 = list;
                                        str7 = str5;
                                        str6 = str17;
                                        r17 = r12;
                                        ftt2 = ftt;
                                        hPKEKeypair3 = hPKEKeypair2;
                                        abstractC12782ctV2 = abstractC12782ctV;
                                        j = jAEQbTJ2;
                                        str8 = str4;
                                        str14 = str16;
                                        hPKEKeypair4 = hPKEKeypair3;
                                        pUU.AEQbTJ(ftt2.KWHzl, "Failed to get privateKey for chainId=" + j, th);
                                        String str18 = str14;
                                        str4 = str8;
                                        abstractC12782ctV = abstractC12782ctV2;
                                        ftt = ftt2;
                                        list = list2;
                                        str5 = str7;
                                        r122 = r17;
                                        hPKEKeypair2 = hPKEKeypair4;
                                        str3 = str18;
                                        objCopydefault3 = obj2;
                                        str2 = str6;
                                        r12 = r122;
                                        if (it.hasNext()) {
                                        }
                                    }
                                    AbstractC58260yxt abstractC58260yxtPrivateKeyForChainId$default2 = AbstractC12782ctV.privateKeyForChainId$default(abstractC12782ctV, str4, jAEQbTJ2, 0, 4, null);
                                    this.L$0 = r12;
                                    this.L$1 = str17;
                                    this.L$2 = hPKEKeypair2;
                                    this.L$3 = str5;
                                    this.L$4 = list;
                                    this.L$5 = ftt;
                                    this.L$6 = abstractC12782ctV;
                                    this.L$7 = str4;
                                    this.L$8 = it;
                                    this.J$0 = jLongValue;
                                    this.J$1 = jAEQbTJ2;
                                    this.label = 3;
                                    objAwait2 = RxAwaitKt.await(abstractC58260yxtPrivateKeyForChainId$default2, this);
                                    obj2 = obj4;
                                    if (objAwait2 == obj2) {
                                        return obj2;
                                    }
                                    str6 = str17;
                                    hPKEKeypair4 = hPKEKeypair2;
                                    r17 = r12;
                                    abstractC12782ctV2 = abstractC12782ctV;
                                    ftt2 = ftt;
                                    String str19 = str4;
                                    str14 = str16;
                                    str8 = str19;
                                    list2 = list;
                                    str7 = str5;
                                    j = jAEQbTJ2;
                                    j2 = jLongValue;
                                    try {
                                    } catch (Throwable th3) {
                                        pUU.AEQbTJ(ftt2.KWHzl, "Failed to get privateKey for chainId=" + j, th3);
                                    }
                                    String str20 = (String) objAwait2;
                                    Intrinsics.copydefault((Object) str20);
                                    list2.add(new PrivateKeyOriginData(j2, str20));
                                    String str182 = str14;
                                    str4 = str8;
                                    abstractC12782ctV = abstractC12782ctV2;
                                    ftt = ftt2;
                                    list = list2;
                                    str5 = str7;
                                    r122 = r17;
                                    hPKEKeypair2 = hPKEKeypair4;
                                    str3 = str182;
                                    objCopydefault3 = obj2;
                                    str2 = str6;
                                    r12 = r122;
                                    if (it.hasNext()) {
                                    }
                                } else {
                                    String str21 = str2;
                                    obj2 = objCopydefault3;
                                    str6 = str21;
                                    r122 = r12;
                                    objCopydefault3 = obj2;
                                    str2 = str6;
                                    r12 = r122;
                                    if (it.hasNext()) {
                                    }
                                }
                            } else {
                                String str22 = str3;
                                String str23 = str2;
                                obj3 = objCopydefault3;
                                fTT ftt5 = this.this$0;
                                ActivateTeeModel activateTeeModel = this.$activateTeeModel;
                                try {
                                    Result.Application application3 = Result.Companion;
                                    String str24 = ftt5.KWHzl;
                                    String strEZpvd = C33488mxR.EZpvd(activateTeeModel.getChainIndexList());
                                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(C56443yFo.KWHzl(((PrivateKeyOriginData) it2.next()).getCoinType()));
                                    }
                                    pUU.copydefault(str24, "chainIndexList = " + strEZpvd + " : supportedChainIndex = " + C33488mxR.EZpvd(arrayList2));
                                    Result.m7377constructorimpl(Unit.INSTANCE);
                                    break;
                                } catch (Throwable th4) {
                                    Result.Application application4 = Result.Companion;
                                    Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
                                }
                                fTV ftv2 = this.this$0.AEQbTJ;
                                String userDataHex = this.$attestationParseData.getUserDataHex();
                                String priKeyHex = hPKEKeypair2.getPriKeyHex();
                                this.L$0 = r12;
                                this.L$1 = str23;
                                this.L$2 = hPKEKeypair2;
                                this.L$3 = str5;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.label = 4;
                                str9 = str5;
                                objCopydefault = ftv2.copydefault(list, str5, userDataHex, priKeyHex, this);
                                if (objCopydefault == obj3) {
                                    return obj3;
                                }
                                str14 = str22;
                                str10 = str23;
                                hPKEKeypair5 = hPKEKeypair2;
                                r4 = r12;
                                hPKEEncryptData = (HPKEEncryptData) objCopydefault;
                                if (hPKEEncryptData == null) {
                                    pUU.copydefault(this.this$0.KWHzl, "teeHPKEEncrypt operate result ciphertextHex = " + C33129mqd.OLrzqt((CharSequence) hPKEEncryptData.getCiphertextHex()) + ": encapsulatedKeyHex = " + C33129mqd.OLrzqt((CharSequence) hPKEEncryptData.getEncapsulatedKeyHex()));
                                    C17835fUa c17835fUa = this.this$0.gEmmrt;
                                    String ciphertextHex = hPKEEncryptData.getCiphertextHex();
                                    String str25 = C54905xZr.EZpvd().get(this.$attestationParseData.getFrontendPubkeyVersionSelected());
                                    if (str25 == null) {
                                        str25 = "";
                                    }
                                    this.L$0 = r4;
                                    this.L$1 = str10;
                                    this.L$2 = hPKEKeypair5;
                                    this.L$3 = str9;
                                    this.L$4 = hPKEEncryptData;
                                    this.label = 5;
                                    objCopydefault2 = c17835fUa.copydefault(ciphertextHex, str25, this);
                                    if (objCopydefault2 == obj3) {
                                        return obj3;
                                    }
                                    str11 = str10;
                                    hPKEKeypair6 = hPKEKeypair5;
                                    str12 = str9;
                                    r42 = r4;
                                    String str26 = (String) objCopydefault2;
                                    pUU.copydefault(this.this$0.KWHzl, "teeRsaEncrypt operate result ciphertext = " + C33129mqd.OLrzqt((CharSequence) str26) + str14);
                                    HPKEInfoData hPKEInfoData2 = new HPKEInfoData(str12, hPKEEncryptData.getEncapsulatedKeyHex(), str26);
                                    String json = new SignatureOriginData(this.$wallet.DbNXlk(), r42, this.$activateTeeModel.getTimestamp(), this.$activateTeeModel.getCommand().getCommand(), this.$activateTeeModel.getChainIndexList(), this.this$0.EZpvd.EZpvd(str26)).toJson();
                                    fTW ftw = this.this$0.EZpvd;
                                    Intrinsics.copydefault((Object) str11);
                                    this.L$0 = r42;
                                    this.L$1 = hPKEKeypair6;
                                    this.L$2 = hPKEInfoData2;
                                    this.L$3 = json;
                                    this.L$4 = null;
                                    this.label = 6;
                                    objOLrzqt2 = ftw.OLrzqt(str11, json, this);
                                    if (objOLrzqt2 != obj3) {
                                        return obj3;
                                    }
                                    str13 = json;
                                    r10 = r42;
                                    hPKEInfoData = hPKEInfoData2;
                                    String str27 = (String) objOLrzqt2;
                                    pUU.copydefault(this.this$0.KWHzl, "teeBase64Signature operate result = " + C33129mqd.OLrzqt((CharSequence) str27) + str14);
                                    ActivateTEERequest activateTEERequest = new ActivateTEERequest(this.$wallet.DbNXlk(), r10, this.$activateTeeModel.getTimestamp(), this.$activateTeeModel.getExpireTimestamp(), this.$activateTeeModel.getAutoRenew(), this.$activateTeeModel.getChainIndexList(), str27, str13, hPKEInfoData, this.$attestationParseData.getFrontendPubkeyVersionSelected());
                                    pUU.copydefault(this.this$0.KWHzl, "GetActivateTeeMiddleModelUseCase operate end and return success}");
                                    Result.Application application5 = Result.Companion;
                                    return Result.m7376boximpl(Result.m7377constructorimpl(new ActivateTeeMiddleModel(hPKEKeypair6, activateTEERequest)));
                                }
                                Result.Application application6 = Result.Companion;
                                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.KWHzl + " : sdk Tee HPKE Encrypt failed"))));
                            }
                        } else {
                            Result.Application application7 = Result.Companion;
                            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.KWHzl + " : sdk Get HPKEPair failed"))));
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r2 = j3;
                        pUU.AEQbTJ(this.this$0.KWHzl, "first Failed to get privateKey for chainId=" + r2, th);
                        Result.Application application8 = Result.Companion;
                        return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.KWHzl + " get privateKey failed"))));
                    }
                    break;
                case 1:
                    jAEQbTJ = this.J$0;
                    strEjfBZ = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAwait = obj;
                    long j32 = jAEQbTJ;
                    r2 = strEjfBZ;
                    str = (String) objAwait;
                    fTV ftv3 = this.this$0.AEQbTJ;
                    Intrinsics.copydefault((Object) str);
                    this.L$0 = r2;
                    this.L$1 = str;
                    this.label = 2;
                    objOLrzqt = ftv3.OLrzqt(str, "OKX-TEE-WALLET-IDENTITY", this);
                    r22 = r2;
                    if (objOLrzqt == objCopydefault3) {
                    }
                    hPKEKeypair = (HPKEKeypair) objOLrzqt;
                    if (hPKEKeypair != null) {
                    }
                    break;
                case 2:
                    str = (String) this.L$1;
                    String str28 = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = obj;
                    r22 = str28;
                    hPKEKeypair = (HPKEKeypair) objOLrzqt;
                    if (hPKEKeypair != null) {
                    }
                    break;
                case 3:
                    j = this.J$1;
                    j2 = this.J$0;
                    it = (Iterator) this.L$8;
                    str8 = (String) this.L$7;
                    abstractC12782ctV2 = (AbstractC12782ctV) this.L$6;
                    ftt2 = (fTT) this.L$5;
                    list2 = (List) this.L$4;
                    str7 = (String) this.L$3;
                    HPKEKeypair hPKEKeypair7 = (HPKEKeypair) this.L$2;
                    str6 = (String) this.L$1;
                    String str29 = (String) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objAwait2 = obj;
                        obj2 = objCopydefault3;
                        hPKEKeypair4 = hPKEKeypair7;
                        r17 = str29;
                    } catch (Throwable th6) {
                        th = th6;
                        hPKEKeypair3 = hPKEKeypair7;
                        obj2 = objCopydefault3;
                        r17 = str29;
                        hPKEKeypair4 = hPKEKeypair3;
                        pUU.AEQbTJ(ftt2.KWHzl, "Failed to get privateKey for chainId=" + j, th);
                        String str1822 = str14;
                        str4 = str8;
                        abstractC12782ctV = abstractC12782ctV2;
                        ftt = ftt2;
                        list = list2;
                        str5 = str7;
                        r122 = r17;
                        hPKEKeypair2 = hPKEKeypair4;
                        str3 = str1822;
                        objCopydefault3 = obj2;
                        str2 = str6;
                        r12 = r122;
                        if (it.hasNext()) {
                        }
                    }
                    String str202 = (String) objAwait2;
                    Intrinsics.copydefault((Object) str202);
                    list2.add(new PrivateKeyOriginData(j2, str202));
                    String str18222 = str14;
                    str4 = str8;
                    abstractC12782ctV = abstractC12782ctV2;
                    ftt = ftt2;
                    list = list2;
                    str5 = str7;
                    r122 = r17;
                    hPKEKeypair2 = hPKEKeypair4;
                    str3 = str18222;
                    objCopydefault3 = obj2;
                    str2 = str6;
                    r12 = r122;
                    if (it.hasNext()) {
                    }
                    break;
                case 4:
                    String str30 = (String) this.L$3;
                    hPKEKeypair5 = (HPKEKeypair) this.L$2;
                    str10 = (String) this.L$1;
                    String str31 = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str9 = str30;
                    obj3 = objCopydefault3;
                    objCopydefault = obj;
                    r4 = str31;
                    hPKEEncryptData = (HPKEEncryptData) objCopydefault;
                    if (hPKEEncryptData == null) {
                    }
                    break;
                case 5:
                    hPKEEncryptData = (HPKEEncryptData) this.L$4;
                    str12 = (String) this.L$3;
                    hPKEKeypair6 = (HPKEKeypair) this.L$2;
                    String str32 = (String) this.L$1;
                    String str33 = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str11 = str32;
                    r42 = str33;
                    obj3 = objCopydefault3;
                    objCopydefault2 = obj;
                    String str262 = (String) objCopydefault2;
                    pUU.copydefault(this.this$0.KWHzl, "teeRsaEncrypt operate result ciphertext = " + C33129mqd.OLrzqt((CharSequence) str262) + str14);
                    HPKEInfoData hPKEInfoData22 = new HPKEInfoData(str12, hPKEEncryptData.getEncapsulatedKeyHex(), str262);
                    String json2 = new SignatureOriginData(this.$wallet.DbNXlk(), r42, this.$activateTeeModel.getTimestamp(), this.$activateTeeModel.getCommand().getCommand(), this.$activateTeeModel.getChainIndexList(), this.this$0.EZpvd.EZpvd(str262)).toJson();
                    fTW ftw2 = this.this$0.EZpvd;
                    Intrinsics.copydefault((Object) str11);
                    this.L$0 = r42;
                    this.L$1 = hPKEKeypair6;
                    this.L$2 = hPKEInfoData22;
                    this.L$3 = json2;
                    this.L$4 = null;
                    this.label = 6;
                    objOLrzqt2 = ftw2.OLrzqt(str11, json2, this);
                    if (objOLrzqt2 != obj3) {
                    }
                    break;
                case 6:
                    String str34 = (String) this.L$3;
                    HPKEInfoData hPKEInfoData3 = (HPKEInfoData) this.L$2;
                    hPKEKeypair6 = (HPKEKeypair) this.L$1;
                    String str35 = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str13 = str34;
                    hPKEInfoData = hPKEInfoData3;
                    r10 = str35;
                    objOLrzqt2 = obj;
                    String str272 = (String) objOLrzqt2;
                    pUU.copydefault(this.this$0.KWHzl, "teeBase64Signature operate result = " + C33129mqd.OLrzqt((CharSequence) str272) + str14);
                    ActivateTEERequest activateTEERequest2 = new ActivateTEERequest(this.$wallet.DbNXlk(), r10, this.$activateTeeModel.getTimestamp(), this.$activateTeeModel.getExpireTimestamp(), this.$activateTeeModel.getAutoRenew(), this.$activateTeeModel.getChainIndexList(), str272, str13, hPKEInfoData, this.$attestationParseData.getFrontendPubkeyVersionSelected());
                    pUU.copydefault(this.this$0.KWHzl, "GetActivateTeeMiddleModelUseCase operate end and return success}");
                    Result.Application application52 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(new ActivateTeeMiddleModel(hPKEKeypair6, activateTEERequest2)));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
