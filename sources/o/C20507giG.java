package o;

import android.os.Build;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.giG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20507giG extends wXX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C10854bwM AEQbTJ;
    public final float AYXKKw;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public long OLrzqt;
    public java.lang.String copydefault = "";
    public java.util.List<DappBTCUTXOInfo> valueOf = yDY.AhwBna();
    public java.util.List<DappBTCUTXOInfo> AhwBna = yDY.AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.giG$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.giG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C20507giG AEQbTJ(@NotNull java.lang.String str, long j, @NotNull java.util.List<DappBTCUTXOInfo> list, @NotNull java.util.List<DappBTCUTXOInfo> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            C20507giG c20507giG = new C20507giG();
            c20507giG.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str), C56390yDp.OLrzqt("coinId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("inputList", list), C56390yDp.OLrzqt("outputList", list2)));
            return c20507giG;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.util.List<DappBTCUTXOInfo> parcelableArrayList;
        java.util.List<DappBTCUTXOInfo> parcelableArrayList2;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.copydefault = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "");
            this.OLrzqt = arguments.getLong("coinId", 0L);
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                parcelableArrayList = arguments.getParcelableArrayList("inputList", DappBTCUTXOInfo.class);
            } else {
                parcelableArrayList = arguments.getParcelableArrayList("inputList");
            }
            if (parcelableArrayList == null) {
                parcelableArrayList = yDY.AhwBna();
            }
            this.valueOf = parcelableArrayList;
            if (i >= 33) {
                parcelableArrayList2 = arguments.getParcelableArrayList("outputList", DappBTCUTXOInfo.class);
            } else {
                parcelableArrayList2 = arguments.getParcelableArrayList("outputList");
            }
            if (parcelableArrayList2 == null) {
                parcelableArrayList2 = yDY.AhwBna();
            }
            this.AhwBna = parcelableArrayList2;
        }
        this.AEQbTJ = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(this.OLrzqt));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.gEmmrt();
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.setStyle(1);
        wxq.setDividerVisibility(false);
        wxq.setHorizontalGravity(8388611);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onKeyUpPanel));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C20508giH c20508giH = new C20508giH(context);
        c20508giH.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C10854bwM c10854bwM = this.AEQbTJ;
        if (c10854bwM != null) {
            c20508giH.setInputAndOutput(this.copydefault, c10854bwM, this.valueOf, this.AhwBna, new Function1() { // from class: o.giI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20507giG.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
                }
            });
        }
        constraintLayout.addView(c20508giH);
    }

    public static final Unit OLrzqt(C20507giG c20507giG, java.lang.String str) {
        Function1<? super java.lang.String, Unit> function1 = c20507giG.KWHzl;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }
}
