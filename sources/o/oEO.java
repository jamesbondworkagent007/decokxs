package o;

import com.okinc.im.usecase.messagelistmodel.ApplyClearMessageEventToMessageListModelUseCase$execute$1;
import com.okinc.im.usecase.messagelistmodel.LoadMessageListModelUseCaseV2;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEO {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final oCE OLrzqt;
    public final oEX copydefault;

    @yCM
    public oEO(@NotNull oEX oex, @NotNull oCE oce) {
        Intrinsics.checkNotNullParameter(oex, "");
        Intrinsics.checkNotNullParameter(oce, "");
        this.copydefault = oex;
        this.OLrzqt = oce;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, @NotNull C44452sQi c44452sQi, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyClearMessageEventToMessageListModelUseCase$execute$1 applyClearMessageEventToMessageListModelUseCase$execute$1;
        java.lang.String str3;
        OKConversation oKConversation;
        oEO oeo;
        if (continuation instanceof ApplyClearMessageEventToMessageListModelUseCase$execute$1) {
            applyClearMessageEventToMessageListModelUseCase$execute$1 = (ApplyClearMessageEventToMessageListModelUseCase$execute$1) continuation;
            int i = applyClearMessageEventToMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyClearMessageEventToMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                applyClearMessageEventToMessageListModelUseCase$execute$1 = new ApplyClearMessageEventToMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        ApplyClearMessageEventToMessageListModelUseCase$execute$1 applyClearMessageEventToMessageListModelUseCase$execute$12 = applyClearMessageEventToMessageListModelUseCase$execute$1;
        java.lang.Object objOLrzqt = applyClearMessageEventToMessageListModelUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyClearMessageEventToMessageListModelUseCase$execute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (!Intrinsics.EZpvd((java.lang.Object) c44452sQi.EZpvd(), (java.lang.Object) str)) {
                return null;
            }
            if (str == null) {
                str3 = str2;
                oKConversation = null;
                oeo = this;
                if (oKConversation != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                pUU.KWHzl("ApplyClearMessageEventToMessageListModelUseCase", "Start reload message list");
                oEX oex = oeo.copydefault;
                LoadMessageListModelUseCaseV2.ExecuteScenario executeScenario = LoadMessageListModelUseCaseV2.ExecuteScenario.RELOAD;
                applyClearMessageEventToMessageListModelUseCase$execute$12.L$0 = null;
                applyClearMessageEventToMessageListModelUseCase$execute$12.L$1 = null;
                applyClearMessageEventToMessageListModelUseCase$execute$12.label = 2;
                objOLrzqt = oex.AEQbTJ(oKConversation, null, str3, executeScenario, applyClearMessageEventToMessageListModelUseCase$execute$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                C36558odI c36558odI = (C36558odI) objOLrzqt;
                return c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : null, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
            }
            oCE oce = this.OLrzqt;
            applyClearMessageEventToMessageListModelUseCase$execute$12.L$0 = this;
            applyClearMessageEventToMessageListModelUseCase$execute$12.L$1 = str2;
            applyClearMessageEventToMessageListModelUseCase$execute$12.label = 1;
            objOLrzqt = oce.OLrzqt(str, applyClearMessageEventToMessageListModelUseCase$execute$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            str3 = str2;
            oeo = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                C36558odI c36558odI2 = (C36558odI) objOLrzqt;
                return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : null, (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
            }
            str3 = (java.lang.String) applyClearMessageEventToMessageListModelUseCase$execute$12.L$1;
            oeo = (oEO) applyClearMessageEventToMessageListModelUseCase$execute$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        oKConversation = (OKConversation) objOLrzqt;
        if (oKConversation != null) {
        }
    }
}
