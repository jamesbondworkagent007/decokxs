package o;

import com.okinc.im.usecase.messagelistmodel.ApplyDeleteMessageEventToMessageListModelUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEM {
    public static final Application Companion = new Application(null);
    public final C35829oFf OLrzqt;

    @yCM
    public oEM(@NotNull C35829oFf c35829oFf) {
        Intrinsics.checkNotNullParameter(c35829oFf, "");
        this.OLrzqt = c35829oFf;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C36558odI c36558odI, @NotNull C44454sQk c44454sQk, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyDeleteMessageEventToMessageListModelUseCase$execute$1 applyDeleteMessageEventToMessageListModelUseCase$execute$1;
        if (continuation instanceof ApplyDeleteMessageEventToMessageListModelUseCase$execute$1) {
            applyDeleteMessageEventToMessageListModelUseCase$execute$1 = (ApplyDeleteMessageEventToMessageListModelUseCase$execute$1) continuation;
            int i = applyDeleteMessageEventToMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyDeleteMessageEventToMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                applyDeleteMessageEventToMessageListModelUseCase$execute$1 = new ApplyDeleteMessageEventToMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = applyDeleteMessageEventToMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyDeleteMessageEventToMessageListModelUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (!Intrinsics.EZpvd((java.lang.Object) c44454sQk.copydefault(), (java.lang.Object) c36558odI.OLrzqt().getTargetId())) {
                return c36558odI;
            }
            C35829oFf c35829oFf = this.OLrzqt;
            java.util.List<java.lang.String> listAEQbTJ = c44454sQk.AEQbTJ();
            applyDeleteMessageEventToMessageListModelUseCase$execute$1.label = 1;
            objOLrzqt = c35829oFf.OLrzqt(c36558odI, listAEQbTJ, applyDeleteMessageEventToMessageListModelUseCase$execute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        C36558odI c36558odI2 = (C36558odI) objOLrzqt;
        return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : null, (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
    }
}
