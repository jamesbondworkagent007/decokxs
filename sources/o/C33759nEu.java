package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.just.agentweb.DefaultWebClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nEu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33759nEu extends wXX {
    public static final int AEQbTJ;
    public static final Activity Companion;
    public static final java.lang.String OLrzqt;
    public java.lang.String EZpvd;
    public C33887nJn KWHzl;
    public java.lang.String copydefault;

    /* JADX INFO: renamed from: o.nEu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nEu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String copydefault() {
            return C33759nEu.OLrzqt;
        }

        public final C33759nEu EZpvd(java.lang.String str, java.lang.String str2) {
            C33759nEu c33759nEu = new C33759nEu();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            bundle.putString("content", str2);
            c33759nEu.setArguments(bundle);
            return c33759nEu;
        }
    }

    static {
        Activity activity = new Activity(null);
        Companion = activity;
        AEQbTJ = 8;
        java.lang.String simpleName = activity.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        OLrzqt = simpleName;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.EZpvd = arguments.getString("title", "");
            this.copydefault = arguments.getString("content", "");
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
        wxq.AYXKKw().setTextSize(1, 16.0f);
        wxq.AYXKKw().setText(this.EZpvd);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C33887nJn c33887nJnAEQbTJ = C33887nJn.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        this.KWHzl = c33887nJnAEQbTJ;
        if (c33887nJnAEQbTJ != null) {
            android.widget.TextView textView = c33887nJnAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            java.lang.String str = this.copydefault;
            C55133xeG.AEQbTJ(textView, str != null ? str : "", new Function1() { // from class: o.nEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C33759nEu.OLrzqt(this.AEQbTJ, (java.lang.String) obj));
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final boolean OLrzqt(C33759nEu c33759nEu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.AYXKKw(str, DefaultWebClient.HTTPS_SCHEME, false) || C59449zhJ.AYXKKw(str, DefaultWebClient.HTTP_SCHEME, false)) {
            android.content.Context context = c33759nEu.getContext();
            if (context == null) {
                return true;
            }
            C35169nqJ.AEQbTJ.OLrzqt(context, str);
            return true;
        }
        android.content.Context context2 = c33759nEu.getContext();
        if (context2 == null) {
            return true;
        }
        oGV.processDeeplink$default(oGV.EZpvd, context2, str, null, null, new Function1() { // from class: o.nEv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33759nEu.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 12, null);
        return true;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
