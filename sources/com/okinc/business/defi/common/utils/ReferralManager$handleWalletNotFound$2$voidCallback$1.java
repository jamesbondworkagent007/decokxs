package com.okinc.business.defi.common.utils;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.net.bean.BlockAddressCheckResp;
import com.okinc.business.defi.biz.net.bean.InviterAddress;
import com.okinc.business.defi.biz.net.bean.RefInfoResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager$handleWalletNotFound$2$voidCallback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isFromAF;
    final /* synthetic */ RefInfoResponse $response;
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
    final /* synthetic */ ReferralManager this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralManager$handleWalletNotFound$2$voidCallback$1(ReferralManager referralManager, RefInfoResponse refInfoResponse, boolean z, Context context, Continuation<? super ReferralManager$handleWalletNotFound$2$voidCallback$1> continuation) {
        super(2, continuation);
        this.this$0 = referralManager;
        this.$response = refInfoResponse;
        this.$isFromAF = z;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferralManager$handleWalletNotFound$2$voidCallback$1(this.this$0, this.$response, this.$isFromAF, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferralManager$handleWalletNotFound$2$voidCallback$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1693=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v29, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v48, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3 A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:7:0x0023, B:10:0x004a, B:13:0x007d, B:17:0x00b2, B:55:0x01e2, B:57:0x01e6, B:20:0x00c1, B:37:0x0112, B:39:0x011a, B:41:0x011e, B:43:0x0124, B:44:0x013c, B:45:0x016d, B:47:0x0173, B:48:0x0195, B:51:0x01ac, B:21:0x00c7, B:29:0x00e6, B:31:0x00f3, B:32:0x00fa, B:34:0x0102, B:26:0x00d4), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:7:0x0023, B:10:0x004a, B:13:0x007d, B:17:0x00b2, B:55:0x01e2, B:57:0x01e6, B:20:0x00c1, B:37:0x0112, B:39:0x011a, B:41:0x011e, B:43:0x0124, B:44:0x013c, B:45:0x016d, B:47:0x0173, B:48:0x0195, B:51:0x01ac, B:21:0x00c7, B:29:0x00e6, B:31:0x00f3, B:32:0x00fa, B:34:0x0102, B:26:0x00d4), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:7:0x0023, B:10:0x004a, B:13:0x007d, B:17:0x00b2, B:55:0x01e2, B:57:0x01e6, B:20:0x00c1, B:37:0x0112, B:39:0x011a, B:41:0x011e, B:43:0x0124, B:44:0x013c, B:45:0x016d, B:47:0x0173, B:48:0x0195, B:51:0x01ac, B:21:0x00c7, B:29:0x00e6, B:31:0x00f3, B:32:0x00fa, B:34:0x0102, B:26:0x00d4), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:7:0x0023, B:10:0x004a, B:13:0x007d, B:17:0x00b2, B:55:0x01e2, B:57:0x01e6, B:20:0x00c1, B:37:0x0112, B:39:0x011a, B:41:0x011e, B:43:0x0124, B:44:0x013c, B:45:0x016d, B:47:0x0173, B:48:0x0195, B:51:0x01ac, B:21:0x00c7, B:29:0x00e6, B:31:0x00f3, B:32:0x00fa, B:34:0x0102, B:26:0x00d4), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e6 A[Catch: Exception -> 0x00cd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cd, blocks: (B:7:0x0023, B:10:0x004a, B:13:0x007d, B:17:0x00b2, B:55:0x01e2, B:57:0x01e6, B:20:0x00c1, B:37:0x0112, B:39:0x011a, B:41:0x011e, B:43:0x0124, B:44:0x013c, B:45:0x016d, B:47:0x0173, B:48:0x0195, B:51:0x01ac, B:21:0x00c7, B:29:0x00e6, B:31:0x00f3, B:32:0x00fa, B:34:0x0102, B:26:0x00d4), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0284 A[Catch: Exception -> 0x02e3, TryCatch #2 {Exception -> 0x02e3, blocks: (B:73:0x027c, B:75:0x0284, B:77:0x028c, B:63:0x0220, B:65:0x0228, B:67:0x0230, B:69:0x023f, B:59:0x01f7), top: B:102:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02db A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:85:0x02cf, B:84:0x02c9, B:88:0x02db, B:91:0x02e7, B:93:0x02f8, B:94:0x0308, B:95:0x030f, B:96:0x032d), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f8 A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:85:0x02cf, B:84:0x02c9, B:88:0x02db, B:91:0x02e7, B:93:0x02f8, B:94:0x0308, B:95:0x030f, B:96:0x032d), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0308 A[Catch: Exception -> 0x02d9, TryCatch #1 {Exception -> 0x02d9, blocks: (B:85:0x02cf, B:84:0x02c9, B:88:0x02db, B:91:0x02e7, B:93:0x02f8, B:94:0x0308, B:95:0x030f, B:96:0x032d), top: B:101:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objWithContext;
        AbstractC12782ctV abstractC12782ctV;
        ReferralManager referralManager;
        Object objAEQbTJ;
        Object objCopydefault;
        AbstractC12782ctV abstractC12782ctV2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Map map;
        String str8;
        String str9;
        Object objWithContext2;
        String str10;
        String str11;
        String str12;
        String str13;
        AbstractC12782ctV abstractC12782ctV3;
        String str14;
        AbstractC43419rot abstractC43419rot;
        BlockAddressCheckResp blockAddressCheckResp;
        Object objCopydefault2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        AbstractC12782ctV abstractC12782ctV4;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Exception e) {
                e = e;
                str = i;
            }
        } catch (Exception e2) {
            e = e2;
            str = "DexReferral";
        }
        switch (i) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ReferralManager$handleWalletNotFound$2$voidCallback$1$wallet$1 referralManager$handleWalletNotFound$2$voidCallback$1$wallet$1 = new ReferralManager$handleWalletNotFound$2$voidCallback$1$wallet$1(null);
                this.label = 1;
                objWithContext = BuildersKt.withContext(io2, referralManager$handleWalletNotFound$2$voidCallback$1$wallet$1, this);
                if (objWithContext == objCopydefault3) {
                    return objCopydefault3;
                }
                abstractC12782ctV = (AbstractC12782ctV) objWithContext;
                referralManager = this.this$0;
                Intrinsics.copydefault(abstractC12782ctV);
                if (referralManager.AEQbTJ(abstractC12782ctV) == null) {
                    pUU.copydefault("DexReferral", "bindReferralCode wallet not found, getReferralInfoBean, the code is exist");
                } else if (this.this$0.valueOf(abstractC12782ctV)) {
                    ReferralManager referralManager2 = this.this$0;
                    RefInfoResponse refInfoResponse = this.$response;
                    this.L$0 = abstractC12782ctV;
                    this.label = 2;
                    objAEQbTJ = referralManager2.AEQbTJ(abstractC12782ctV, refInfoResponse, (Continuation<? super Boolean>) this);
                    if (objAEQbTJ == objCopydefault3) {
                        return objCopydefault3;
                    }
                    if (((Boolean) objAEQbTJ).booleanValue()) {
                        String refCode = this.$response.getRefCode();
                        String inviter = this.$response.getInviter();
                        String discountRate = this.$response.getDiscountRate();
                        List<InviterAddress> inviterAddresses = this.$response.getInviterAddresses();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(inviterAddresses, 10)), 16));
                        for (InviterAddress inviterAddress : inviterAddresses) {
                            Pair pairOLrzqt = C56390yDp.OLrzqt(String.valueOf(inviterAddress.getChainId()), inviterAddress.getAddress());
                            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                        }
                        String strDbNXlk = abstractC12782ctV.DbNXlk();
                        String strAEQbTJ = this.this$0.AEQbTJ(refCode, linkedHashMap);
                        ReferralManager referralManager3 = this.this$0;
                        Intrinsics.copydefault(abstractC12782ctV);
                        Pair pairEZpvd = referralManager3.EZpvd(abstractC12782ctV);
                        if (pairEZpvd == null || strAEQbTJ == null) {
                            pUU.KWHzl("DexReferral", "bindReferralCode: param error signMsg=" + strAEQbTJ + ", chainAddressMap=" + pairEZpvd);
                        } else {
                            String str28 = (String) pairEZpvd.getFirst();
                            String str29 = (String) pairEZpvd.getSecond();
                            ReferralManager referralManager4 = this.this$0;
                            this.L$0 = abstractC12782ctV;
                            this.L$1 = refCode;
                            this.L$2 = inviter;
                            this.L$3 = discountRate;
                            this.L$4 = linkedHashMap;
                            this.L$5 = strAEQbTJ;
                            this.L$6 = str28;
                            this.L$7 = str29;
                            this.label = 3;
                            objCopydefault = referralManager4.copydefault(str28, strDbNXlk, strAEQbTJ, (Continuation<? super String>) this);
                            if (objCopydefault == objCopydefault3) {
                                return objCopydefault3;
                            }
                            abstractC12782ctV2 = abstractC12782ctV;
                            str2 = str29;
                            str3 = refCode;
                            str4 = str28;
                            str5 = inviter;
                            str6 = strAEQbTJ;
                            str7 = discountRate;
                            map = linkedHashMap;
                            str8 = (String) objCopydefault;
                            if (str8 == null) {
                                ReferralManager referralManager5 = this.this$0;
                                Intrinsics.copydefault(abstractC12782ctV2);
                                Map mapKWHzl = referralManager5.KWHzl(abstractC12782ctV2);
                                CoroutineDispatcher io3 = Dispatchers.getIO();
                                str9 = "DexReferral";
                                try {
                                    ReferralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1 referralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1 = new ReferralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1(this.this$0, mapKWHzl, null);
                                    this.L$0 = abstractC12782ctV2;
                                    this.L$1 = str3;
                                    this.L$2 = str5;
                                    this.L$3 = str7;
                                    this.L$4 = map;
                                    this.L$5 = str6;
                                    this.L$6 = str4;
                                    this.L$7 = str2;
                                    this.L$8 = str8;
                                    this.label = 4;
                                    objWithContext2 = BuildersKt.withContext(io3, referralManager$handleWalletNotFound$2$voidCallback$1$checkResponse$1, this);
                                    if (objWithContext2 == objCopydefault3) {
                                        return objCopydefault3;
                                    }
                                    str10 = str4;
                                    str11 = str6;
                                    str12 = str8;
                                    str13 = str5;
                                    abstractC12782ctV3 = abstractC12782ctV2;
                                    str14 = str2;
                                    String str30 = str3;
                                    String str31 = str7;
                                    abstractC43419rot = (AbstractC43419rot) objWithContext2;
                                    if (abstractC43419rot.EZpvd() || (blockAddressCheckResp = (BlockAddressCheckResp) abstractC43419rot.copydefault()) == null || !Intrinsics.EZpvd(blockAddressCheckResp.getPass(), C56443yFo.KWHzl(true))) {
                                        String str32 = str13;
                                        pUU.KWHzl(str9, "bindReferralCode blockAddressCheck not pass");
                                        if (!this.$isFromAF) {
                                            this.this$0.OLrzqt(this.$context, false, str30, str32, str31);
                                        }
                                    } else {
                                        ReferralManager referralManager6 = this.this$0;
                                        Intrinsics.copydefault(abstractC12782ctV3);
                                        this.L$0 = abstractC12782ctV3;
                                        this.L$1 = str30;
                                        this.L$2 = str13;
                                        this.L$3 = str31;
                                        this.L$4 = str11;
                                        this.L$5 = str10;
                                        this.L$6 = str14;
                                        this.L$7 = str12;
                                        this.L$8 = null;
                                        this.label = 5;
                                        String str33 = str13;
                                        AbstractC12782ctV abstractC12782ctV5 = abstractC12782ctV3;
                                        objCopydefault2 = referralManager6.copydefault(abstractC12782ctV3, str30, str13, map, str31, str11, str12, this);
                                        if (objCopydefault2 == objCopydefault3) {
                                            return objCopydefault3;
                                        }
                                        str15 = str12;
                                        str16 = str14;
                                        str17 = str10;
                                        str18 = str11;
                                        str19 = str33;
                                        abstractC12782ctV4 = abstractC12782ctV5;
                                        str20 = str30;
                                        str21 = str31;
                                        if (((Boolean) objCopydefault2).booleanValue()) {
                                            pUU.copydefault(str9, "bindReferralCode wallet not found, saveReferralInfo fail, internal issue");
                                        } else if (this.this$0.djBIcL()) {
                                            ReferralBindReportManagerV2 referralBindReportManagerV2 = this.this$0.fetchVPNInfo;
                                            Map<String, String> mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(str17, str16));
                                            Intrinsics.copydefault(abstractC12782ctV4);
                                            this.L$0 = str20;
                                            this.L$1 = str19;
                                            this.L$2 = str21;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.label = 6;
                                            if (referralBindReportManagerV2.OLrzqt(str20, mapEZpvd, abstractC12782ctV4, str18, str15, 5, false, this) == objCopydefault3) {
                                                return objCopydefault3;
                                            }
                                            str25 = str21;
                                            str26 = str19;
                                            str27 = str20;
                                            str22 = str25;
                                            str23 = str26;
                                            str24 = str27;
                                            this.this$0.OLrzqt(this.$context, true, str24, str23, str22);
                                        } else {
                                            pUU.KWHzl(str9, "bindReferralCode: report unenable");
                                            str22 = str21;
                                            str23 = str19;
                                            str24 = str20;
                                            this.this$0.OLrzqt(this.$context, true, str24, str23, str22);
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    str = str9;
                                    pUU.AEQbTJ(str, "bindReferralCode rebind error", e);
                                }
                            } else {
                                pUU.KWHzl("DexReferral", "bindReferralCode: signature null");
                            }
                        }
                    } else if (!this.$isFromAF && (this.$context instanceof FragmentActivity)) {
                        pUU.KWHzl("DexReferral", "bindReferralCode wallet self bind");
                        this.this$0.KWHzl(this.$context, this.$response.getRefCode(), abstractC12782ctV.DbNXlk());
                    }
                } else {
                    pUU.copydefault("DexReferral", "bindReferralCode wallet not found, bind again, not support type");
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objWithContext = obj;
                abstractC12782ctV = (AbstractC12782ctV) objWithContext;
                referralManager = this.this$0;
                Intrinsics.copydefault(abstractC12782ctV);
                if (referralManager.AEQbTJ(abstractC12782ctV) == null) {
                }
                return Unit.INSTANCE;
            case 2:
                abstractC12782ctV = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                if (((Boolean) objAEQbTJ).booleanValue()) {
                }
                return Unit.INSTANCE;
            case 3:
                str2 = (String) this.L$7;
                str4 = (String) this.L$6;
                str6 = (String) this.L$5;
                map = (Map) this.L$4;
                String str34 = (String) this.L$3;
                String str35 = (String) this.L$2;
                String str36 = (String) this.L$1;
                AbstractC12782ctV abstractC12782ctV6 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC12782ctV2 = abstractC12782ctV6;
                str3 = str36;
                str5 = str35;
                str7 = str34;
                objCopydefault = obj;
                str8 = (String) objCopydefault;
                if (str8 == null) {
                }
                break;
            case 4:
                String str37 = (String) this.L$8;
                String str38 = (String) this.L$7;
                String str39 = (String) this.L$6;
                String str40 = (String) this.L$5;
                Map map2 = (Map) this.L$4;
                str7 = (String) this.L$3;
                String str41 = (String) this.L$2;
                str3 = (String) this.L$1;
                AbstractC12782ctV abstractC12782ctV7 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objWithContext2 = obj;
                str10 = str39;
                str11 = str40;
                map = map2;
                str13 = str41;
                str9 = "DexReferral";
                abstractC12782ctV3 = abstractC12782ctV7;
                str12 = str37;
                str14 = str38;
                String str302 = str3;
                String str312 = str7;
                abstractC43419rot = (AbstractC43419rot) objWithContext2;
                if (abstractC43419rot.EZpvd()) {
                    break;
                }
                String str322 = str13;
                pUU.KWHzl(str9, "bindReferralCode blockAddressCheck not pass");
                if (!this.$isFromAF) {
                }
                return Unit.INSTANCE;
            case 5:
                String str42 = (String) this.L$7;
                str16 = (String) this.L$6;
                str17 = (String) this.L$5;
                String str43 = (String) this.L$4;
                String str44 = (String) this.L$3;
                String str45 = (String) this.L$2;
                String str46 = (String) this.L$1;
                AbstractC12782ctV abstractC12782ctV8 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str19 = str45;
                str20 = str46;
                str9 = "DexReferral";
                str15 = str42;
                str21 = str44;
                objCopydefault2 = obj;
                str18 = str43;
                abstractC12782ctV4 = abstractC12782ctV8;
                if (((Boolean) objCopydefault2).booleanValue()) {
                }
                break;
            case 6:
                str25 = (String) this.L$2;
                str26 = (String) this.L$1;
                str27 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str9 = "DexReferral";
                str22 = str25;
                str23 = str26;
                str24 = str27;
                this.this$0.OLrzqt(this.$context, true, str24, str23, str22);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
