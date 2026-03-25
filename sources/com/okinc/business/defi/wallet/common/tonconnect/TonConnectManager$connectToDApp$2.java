package com.okinc.business.defi.wallet.common.tonconnect;

import com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest;
import com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession;
import com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork;
import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent;
import com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppInitialRequest;
import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C10854bwM;
import o.C13754dXa;
import o.C15974ebF;
import o.C16058eck;
import o.C16066ecs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectManager$connectToDApp$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C16058eck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectManager$connectToDApp$2(C16058eck c16058eck, AbstractC12782ctV abstractC12782ctV, Continuation<? super TonConnectManager$connectToDApp$2> continuation) {
        super(2, continuation);
        this.this$0 = c16058eck;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonConnectManager$connectToDApp$2(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((TonConnectManager$connectToDApp$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b8  */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r10v1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        DAppInitialRequest dAppInitialRequest;
        C10854bwM c10854bwMGEmmrt;
        Object objKWHzl;
        X25519KeyPair x25519KeyPairAEQbTJ;
        Object objCopydefault;
        DAppInitialRequest dAppInitialRequest2;
        DAppManifest dAppManifest;
        X25519KeyPair x25519KeyPair;
        Object objEZpvd;
        ?? r0;
        C16058eck c16058eck;
        ?? r02;
        C15974ebF c15974ebF;
        int i;
        int i2;
        C16058eck c16058eck2;
        ?? r03;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.OLrzqt(this.$wallet)) {
                dAppInitialRequest = this.this$0.AEQbTJ;
                if (dAppInitialRequest != null && (c10854bwMGEmmrt = this.this$0.gEmmrt()) != null) {
                    C16058eck c16058eck3 = this.this$0;
                    String manifestUrl = dAppInitialRequest.OLrzqt().getManifestUrl();
                    this.L$0 = dAppInitialRequest;
                    this.L$1 = c10854bwMGEmmrt;
                    this.label = 1;
                    objKWHzl = c16058eck3.KWHzl(manifestUrl, this);
                    if (objKWHzl == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                return C56443yFo.KWHzl(false);
            }
            return C56443yFo.KWHzl(false);
        }
        if (i3 == 1) {
            c10854bwMGEmmrt = (C10854bwM) this.L$1;
            dAppInitialRequest = (DAppInitialRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = this.I$0;
                        c16058eck2 = (C16058eck) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        i2 = i4;
                        c16058eck2.AYXKKw();
                        r03 = i2;
                        return C56443yFo.KWHzl(r03 != 0);
                    }
                    int i5 = this.I$0;
                    c16058eck = (C16058eck) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    r02 = i5;
                    ?? r10 = r02;
                    C16058eck c16058eck4 = c16058eck;
                    c15974ebF = c16058eck4.AhwBna;
                    i = C13754dXa.FragmentManager.getTitle;
                    this.L$0 = c16058eck4;
                    this.I$0 = r10 == true ? 1 : 0;
                    this.label = 5;
                    if (C15974ebF.displayToast$default(c15974ebF, i, false, true, false, this, 10, null) != objCopydefault2) {
                        return objCopydefault2;
                    }
                    i2 = r10 == true ? 1 : 0;
                    c16058eck2 = c16058eck4;
                    c16058eck2.AYXKKw();
                    r03 = i2;
                    return C56443yFo.KWHzl(r03 != 0);
                }
                int i6 = this.I$0;
                x25519KeyPair = (X25519KeyPair) this.L$2;
                dAppManifest = (DAppManifest) this.L$1;
                dAppInitialRequest2 = (DAppInitialRequest) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                r0 = i6;
                X25519KeyPair x25519KeyPair2 = x25519KeyPair;
                DAppManifest dAppManifest2 = dAppManifest;
                c16058eck = this.this$0;
                AbstractC12782ctV abstractC12782ctV = this.$wallet;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                    r03 = r0;
                    if (r0 != 0) {
                        String strDbNXlk = abstractC12782ctV.DbNXlk();
                        DAppSession dAppSession = new DAppSession(dAppInitialRequest2.EZpvd(), abstractC12782ctV.DbNXlk(), TonNetwork.MAIN_NET, x25519KeyPair2, dAppManifest2, (String) null, C56443yFo.KWHzl(System.currentTimeMillis()), 32, (DefaultConstructorMarker) null);
                        this.L$0 = c16058eck;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.I$0 = r0;
                        this.label = 4;
                        r02 = r0;
                        if (c16058eck.KWHzl(strDbNXlk, dAppSession, (Continuation<? super Unit>) this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                        ?? r102 = r02;
                        C16058eck c16058eck42 = c16058eck;
                        c15974ebF = c16058eck42.AhwBna;
                        i = C13754dXa.FragmentManager.getTitle;
                        this.L$0 = c16058eck42;
                        this.I$0 = r102 == true ? 1 : 0;
                        this.label = 5;
                        if (C15974ebF.displayToast$default(c15974ebF, i, false, true, false, this, 10, null) != objCopydefault2) {
                        }
                    }
                    return C56443yFo.KWHzl(r03 != 0);
                }
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("TonConnectManager", "Error connecting to dApp", thM7380exceptionOrNullimpl);
                    return C56443yFo.KWHzl(false);
                }
                return C56443yFo.KWHzl(false);
            }
            X25519KeyPair x25519KeyPair3 = (X25519KeyPair) this.L$2;
            DAppManifest dAppManifest3 = (DAppManifest) this.L$1;
            DAppInitialRequest dAppInitialRequest3 = (DAppInitialRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
            dAppInitialRequest2 = dAppInitialRequest3;
            dAppManifest = dAppManifest3;
            x25519KeyPair = x25519KeyPair3;
            objCopydefault = obj;
            WalletEvent walletEvent = (WalletEvent) objCopydefault;
            C16058eck c16058eck5 = this.this$0;
            String strAEQbTJ = c16058eck5.AEQbTJ(c16058eck5.AkhnZx.encodeToString(WalletEvent.Companion.serializer(), walletEvent), x25519KeyPair.getPrvKey(), dAppInitialRequest2.EZpvd());
            ?? r04 = walletEvent instanceof WalletEvent.ConnectSuccess;
            C16066ecs c16066ecs = this.this$0.AuCTel;
            String pubKey = x25519KeyPair.getPubKey();
            String strEZpvd = dAppInitialRequest2.EZpvd();
            String strBase64 = ByteString.Companion.decodeHex(strAEQbTJ).base64();
            this.L$0 = dAppInitialRequest2;
            this.L$1 = dAppManifest;
            this.L$2 = x25519KeyPair;
            this.I$0 = r04;
            this.label = 3;
            objEZpvd = c16066ecs.EZpvd(pubKey, strEZpvd, strBase64, this);
            r0 = r04;
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
            X25519KeyPair x25519KeyPair22 = x25519KeyPair;
            DAppManifest dAppManifest22 = dAppManifest;
            c16058eck = this.this$0;
            AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
            if (Result.m7384isSuccessimpl(objEZpvd)) {
            }
        }
        DAppInitialRequest dAppInitialRequest4 = dAppInitialRequest;
        C10854bwM c10854bwM = c10854bwMGEmmrt;
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
        DAppManifest dAppManifest4 = (DAppManifest) objKWHzl;
        if (dAppManifest4 != null && (x25519KeyPairAEQbTJ = this.this$0.AEQbTJ()) != null) {
            C16058eck c16058eck6 = this.this$0;
            AbstractC12782ctV abstractC12782ctV3 = this.$wallet;
            DAppInitialRequest.ConnectRequest connectRequestOLrzqt = dAppInitialRequest4.OLrzqt();
            this.L$0 = dAppInitialRequest4;
            this.L$1 = dAppManifest4;
            this.L$2 = x25519KeyPairAEQbTJ;
            this.label = 2;
            objCopydefault = c16058eck6.copydefault(abstractC12782ctV3, c10854bwM, dAppManifest4, connectRequestOLrzqt, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            dAppInitialRequest2 = dAppInitialRequest4;
            dAppManifest = dAppManifest4;
            x25519KeyPair = x25519KeyPairAEQbTJ;
            WalletEvent walletEvent2 = (WalletEvent) objCopydefault;
            C16058eck c16058eck52 = this.this$0;
            String strAEQbTJ2 = c16058eck52.AEQbTJ(c16058eck52.AkhnZx.encodeToString(WalletEvent.Companion.serializer(), walletEvent2), x25519KeyPair.getPrvKey(), dAppInitialRequest2.EZpvd());
            ?? r042 = walletEvent2 instanceof WalletEvent.ConnectSuccess;
            C16066ecs c16066ecs2 = this.this$0.AuCTel;
            String pubKey2 = x25519KeyPair.getPubKey();
            String strEZpvd2 = dAppInitialRequest2.EZpvd();
            String strBase642 = ByteString.Companion.decodeHex(strAEQbTJ2).base64();
            this.L$0 = dAppInitialRequest2;
            this.L$1 = dAppManifest;
            this.L$2 = x25519KeyPair;
            this.I$0 = r042;
            this.label = 3;
            objEZpvd = c16066ecs2.EZpvd(pubKey2, strEZpvd2, strBase642, this);
            r0 = r042;
            if (objEZpvd == objCopydefault2) {
            }
            X25519KeyPair x25519KeyPair222 = x25519KeyPair;
            DAppManifest dAppManifest222 = dAppManifest;
            c16058eck = this.this$0;
            AbstractC12782ctV abstractC12782ctV22 = this.$wallet;
            if (Result.m7384isSuccessimpl(objEZpvd)) {
            }
        }
        return C56443yFo.KWHzl(false);
    }
}
