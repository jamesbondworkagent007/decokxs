package com.okinc.business.market.features.token_detail;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel$updateTokenDetail$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C29772kzu;
import o.C31256lqb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class RealtimeDataViewModel$updateTokenDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketTxWsInfoItemBean $bean;
    int label;
    final /* synthetic */ RealtimeDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeDataViewModel$updateTokenDetail$1(RealtimeDataViewModel realtimeDataViewModel, MarketTxWsInfoItemBean marketTxWsInfoItemBean, Continuation<? super RealtimeDataViewModel$updateTokenDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = realtimeDataViewModel;
        this.$bean = marketTxWsInfoItemBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealtimeDataViewModel$updateTokenDetail$1(this.this$0, this.$bean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RealtimeDataViewModel$updateTokenDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29772kzu c29772kzu = this.this$0.AkhnZx;
            MarketTxWsInfoItemBean marketTxWsInfoItemBean = this.$bean;
            this.label = 1;
            Object objOLrzqt = c29772kzu.OLrzqt(marketTxWsInfoItemBean, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        TokenDetail tokenDetail = (TokenDetail) objM7386unboximpl;
        if (tokenDetail == null) {
            return Unit.INSTANCE;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.this$0.OLrzqt.getValue();
        C31256lqb.EZpvd(tokenDetail.copydefault(), new Function1() { // from class: o.kzc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$0(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.KWHzl(), new Function1() { // from class: o.kzr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$1(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.AEQbTJ(), new Function1() { // from class: o.kzp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$2(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.OLrzqt(), new Function1() { // from class: o.kzg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$3(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.EZpvd(), new Function1() { // from class: o.kzj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$4(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.AkhnZx(), new Function1() { // from class: o.kzi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$5(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.DbNXlk(), new Function1() { // from class: o.kzf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$6(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.fetchVPNInfo(), new Function1() { // from class: o.kzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$7(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.AuCTel(), new Function1() { // from class: o.kzl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$8(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.AhwBna(), new Function1() { // from class: o.kzn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$9(objectRef, (java.lang.String) obj2);
            }
        });
        String strAYXKKw = tokenDetail.AYXKKw();
        if (strAYXKKw != null) {
            C31256lqb.EZpvd(strAYXKKw, new Function1() { // from class: o.kzb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$10(objectRef, (java.lang.String) obj2);
                }
            });
        }
        C31256lqb.EZpvd(tokenDetail.ejfBZ(), new Function1() { // from class: o.kzk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$11(objectRef, (java.lang.String) obj2);
            }
        });
        String strDjBIcL = tokenDetail.djBIcL();
        if (strDjBIcL != null) {
            C31256lqb.EZpvd(strDjBIcL, new Function1() { // from class: o.kzo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$12(objectRef, (java.lang.String) obj2);
                }
            });
        }
        String strValues = tokenDetail.values();
        if (strValues != null) {
            C31256lqb.EZpvd(strValues, new Function1() { // from class: o.kzm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$13(objectRef, (java.lang.String) obj2);
                }
            });
        }
        if (true ^ tokenDetail.isConnected().isEmpty()) {
            TokenDetail tokenDetail2 = (TokenDetail) objectRef.element;
            objectRef.element = tokenDetail2.OLrzqt(((-2) & 1) != 0 ? tokenDetail2.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail2.copydefault : null, ((-2) & 4) != 0 ? tokenDetail2.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail2.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail2.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail2.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail2.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail2.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail2.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail2.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail2.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail2.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail2.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail2.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail2.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail2.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail2.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail2.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail2.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail2.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail2.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail2.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail2.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail2.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail2.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail2.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail2.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail2.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail2.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail2.values : null, ((-2) & 1073741824) != 0 ? tokenDetail2.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail2.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail2.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail2.uzCIH : tokenDetail.isConnected(), (31 & 4) != 0 ? tokenDetail2.djBIcL : null, (31 & 8) != 0 ? tokenDetail2.AhwBna : null, (31 & 16) != 0 ? tokenDetail2.iwGUEr : null);
        }
        C31256lqb.EZpvd(tokenDetail.valueOf(), new Function1() { // from class: o.kzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$14(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.gEmmrt(), new Function1() { // from class: o.kzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$15(objectRef, (java.lang.String) obj2);
            }
        });
        C31256lqb.EZpvd(tokenDetail.fARcdN(), new Function1() { // from class: o.kzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return RealtimeDataViewModel$updateTokenDetail$1.invokeSuspend$lambda$16(objectRef, (java.lang.String) obj2);
            }
        });
        this.this$0.OLrzqt.setValue(objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$0(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : str, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$1(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : str, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$2(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : str, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$3(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : str, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$4(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : str, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$5(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : str, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$6(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : str, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$7(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : str, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$8(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : str, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$9(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : str, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$10(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : str, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$11(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : str, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$12(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : str, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$13(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : str, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$14(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : str, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$15(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : str, (31 & 16) != 0 ? tokenDetail.iwGUEr : null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.okinc.business.market.features.token_detail.TokenDetail] */
    public static final Unit invokeSuspend$lambda$16(Ref.ObjectRef objectRef, String str) {
        TokenDetail tokenDetail = (TokenDetail) objectRef.element;
        objectRef.element = tokenDetail.OLrzqt(((-2) & 1) != 0 ? tokenDetail.EZpvd : null, ((-2) & 2) != 0 ? tokenDetail.copydefault : null, ((-2) & 4) != 0 ? tokenDetail.OLrzqt : null, ((-2) & 8) != 0 ? tokenDetail.KWHzl : null, ((-2) & 16) != 0 ? tokenDetail.AEQbTJ : null, ((-2) & 32) != 0 ? tokenDetail.AYXKKw : null, ((-2) & 64) != 0 ? tokenDetail.fARcdN : null, ((-2) & 128) != 0 ? tokenDetail.fJNWhG : null, ((-2) & 256) != 0 ? tokenDetail.ejfBZ : null, ((-2) & 512) != 0 ? tokenDetail.fIwbmz : null, ((-2) & 1024) != 0 ? tokenDetail.wlaJM : null, ((-2) & 2048) != 0 ? tokenDetail.zLjUOn : null, ((-2) & 4096) != 0 ? tokenDetail.AuCTelauCTel : null, ((-2) & 8192) != 0 ? tokenDetail.zsXlph : null, ((-2) & 16384) != 0 ? tokenDetail.zuBGHE : null, ((-2) & 32768) != 0 ? tokenDetail.AwvSrB : null, ((-2) & 65536) != 0 ? tokenDetail.AxsJAY : null, ((-2) & 131072) != 0 ? tokenDetail.gHZMYf : null, ((-2) & 262144) != 0 ? tokenDetail.OcIXYQ : null, ((-2) & 524288) != 0 ? tokenDetail.ORxRYg : null, ((-2) & 1048576) != 0 ? tokenDetail.isConnected : null, ((-2) & 2097152) != 0 ? tokenDetail.AkhnZx : null, ((-2) & 4194304) != 0 ? tokenDetail.DbNXlk : null, ((-2) & 8388608) != 0 ? tokenDetail.AuCTel : null, ((-2) & 16777216) != 0 ? tokenDetail.hDKMBd : null, ((-2) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenDetail.getFieldNames : null, ((-2) & 67108864) != 0 ? tokenDetail.AubY : null, ((-2) & 134217728) != 0 ? tokenDetail.sSMYrx : null, ((-2) & 268435456) != 0 ? tokenDetail.gEmmrt : null, ((-2) & 536870912) != 0 ? tokenDetail.values : null, ((-2) & 1073741824) != 0 ? tokenDetail.valueOf : null, ((-2) & Integer.MIN_VALUE) != 0 ? tokenDetail.fetchVPNInfo : null, (31 & 1) != 0 ? tokenDetail.getNewProxyInstance : null, (31 & 2) != 0 ? tokenDetail.uzCIH : null, (31 & 4) != 0 ? tokenDetail.djBIcL : null, (31 & 8) != 0 ? tokenDetail.AhwBna : null, (31 & 16) != 0 ? tokenDetail.iwGUEr : str);
        return Unit.INSTANCE;
    }
}
