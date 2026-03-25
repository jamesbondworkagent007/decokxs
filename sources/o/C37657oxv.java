package o;

import android.content.SharedPreferences;
import com.okinc.im.imui.sticker.usecase.FirstTimeUploadStickerUseCase$isFirstTimeUpload$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37657oxv {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final oGC AEQbTJ;
    public final oGM KWHzl;
    public final oGB copydefault;

    @yCM
    public C37657oxv(@NotNull oGM ogm, @NotNull oGB ogb, @NotNull oGC ogc) {
        Intrinsics.checkNotNullParameter(ogm, "");
        Intrinsics.checkNotNullParameter(ogb, "");
        Intrinsics.checkNotNullParameter(ogc, "");
        this.KWHzl = ogm;
        this.copydefault = ogb;
        this.AEQbTJ = ogc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        FirstTimeUploadStickerUseCase$isFirstTimeUpload$1 firstTimeUploadStickerUseCase$isFirstTimeUpload$1;
        if (continuation instanceof FirstTimeUploadStickerUseCase$isFirstTimeUpload$1) {
            firstTimeUploadStickerUseCase$isFirstTimeUpload$1 = (FirstTimeUploadStickerUseCase$isFirstTimeUpload$1) continuation;
            int i = firstTimeUploadStickerUseCase$isFirstTimeUpload$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                firstTimeUploadStickerUseCase$isFirstTimeUpload$1.label = i - Integer.MIN_VALUE;
            } else {
                firstTimeUploadStickerUseCase$isFirstTimeUpload$1 = new FirstTimeUploadStickerUseCase$isFirstTimeUpload$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = firstTimeUploadStickerUseCase$isFirstTimeUpload$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = firstTimeUploadStickerUseCase$isFirstTimeUpload$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            oGB ogb = this.copydefault;
            java.lang.String strEZpvd = EZpvd();
            firstTimeUploadStickerUseCase$isFirstTimeUpload$1.label = 1;
            objEZpvd = ogb.EZpvd(strEZpvd, firstTimeUploadStickerUseCase$isFirstTimeUpload$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return C56443yFo.KWHzl(!Intrinsics.EZpvd(objEZpvd, C56443yFo.KWHzl(true)));
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = this.AEQbTJ.OLrzqt(new Function1() { // from class: o.oxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37657oxv.AEQbTJ(this.AEQbTJ, (SharedPreferences.Editor) obj);
            }
        }, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C37657oxv c37657oxv, SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "");
        editor.putBoolean(c37657oxv.EZpvd(), true);
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd() {
        java.lang.String strAEQbTJ = this.KWHzl.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        return "shown_first_time_upload_alert_" + strAEQbTJ;
    }

    /* JADX INFO: renamed from: o.oxv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oxv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
