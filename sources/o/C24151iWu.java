package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.iVX;

/* JADX INFO: renamed from: o.iWu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24151iWu extends AbstractC24139iWi<iVX.VoiceInteractor> {
    public static final C24151iWu KWHzl = new C24151iWu();

    /* JADX WARN: Illegal instructions before constructor call */
    private C24151iWu() {
        int i = C25493ixk.FragmentManager.QFTsTN;
        int i2 = C52761wXj.TaskDescription.Dap;
        super(i, java.lang.Integer.valueOf(i2), new Function2() { // from class: o.iWs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C24151iWu.OLrzqt((android.view.View) obj, (iVX.VoiceInteractor) obj2);
            }
        });
    }

    public static final Unit OLrzqt(android.view.View view, iVX.VoiceInteractor voiceInteractor) throws java.io.UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(voiceInteractor, "");
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27508jwX.openUrl$default(c27508jwX, context, voiceInteractor.KWHzl(), false, 2, null);
        return Unit.INSTANCE;
    }
}
