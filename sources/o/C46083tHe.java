package o;

import com.immomo.mls.InitData;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46083tHe extends AbstractC43061riF {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "OrbitSearchFeedHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.DGOPHZDGOPHZ;
    }

    public final java.lang.String AhwBna() {
        android.os.Bundle arguments = getArguments();
        return C33129mqd.gEmmrt(arguments != null ? arguments.getString(JwtUtilsKt.DID_METHOD_KEY) : null);
    }

    public final java.lang.String KWHzl() {
        android.os.Bundle arguments = getArguments();
        return C33129mqd.gEmmrt(arguments != null ? arguments.getString("content") : null);
    }

    public final java.lang.String gEmmrt() {
        android.os.Bundle arguments = getArguments();
        return C33129mqd.gEmmrt(arguments != null ? arguments.getString("pageSource") : null);
    }

    /* JADX INFO: renamed from: o.tHe$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tHe.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C46083tHe newInstance$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            return application.AEQbTJ(str, str2, str3);
        }

        public final C46083tHe AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C46083tHe c46083tHe = new C46083tHe();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(JwtUtilsKt.DID_METHOD_KEY, str);
            bundle.putString("content", str2);
            bundle.putString("pageSource", str3);
            c46083tHe.setArguments(bundle);
            return c46083tHe;
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C47501trL.TaskDescription.DfrfUJ);
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        view.post(new java.lang.Runnable() { // from class: o.tHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46083tHe.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(C46083tHe c46083tHe) {
        if (c46083tHe.OLrzqt) {
            return;
        }
        c46083tHe.OLrzqt = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c46083tHe, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        return C43056riA.AEQbTJ.EZpvd("market", "/feed/searchFeeds", C56424yEw.djBIcL(C56390yDp.OLrzqt(JwtUtilsKt.DID_METHOD_KEY, AhwBna()), C56390yDp.OLrzqt("pageSource", gEmmrt()), C56390yDp.OLrzqt("content", KWHzl())));
    }
}
