package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.market.common.constants.TimeIntervalType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28597kdl extends kMD<C28598kdm> {
    public final Function1<C28598kdm, Unit> KWHzl;

    /* JADX INFO: renamed from: o.kdl$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TimeIntervalType.values().length];
            try {
                iArr[TimeIntervalType.FIVE_MIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TimeIntervalType.ONE_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeIntervalType.FOUR_HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeIntervalType.TWENTY_FOUR_HOUR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.kdm, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C28597kdl(@NotNull Function1<? super C28598kdm, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21543hDg c21543hDgEZpvd = C21543hDg.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21543hDgEZpvd, "");
        return c21543hDgEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull C28598kdm c28598kdm) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(c28598kdm, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        C21543hDg c21543hDg = viewBindingAEQbTJ instanceof C21543hDg ? (C21543hDg) viewBindingAEQbTJ : null;
        if (c21543hDg == null) {
            return;
        }
        LinearLayoutCompat root = c21543hDg.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, c28598kdm));
        int bindingAdapterPosition = kmf.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            c21543hDg.getRoot().setContentDescription(null);
        } else {
            c21543hDg.getRoot().setContentDescription("web3_dex_interval_picker_item_" + bindingAdapterPosition);
        }
        android.widget.TextView textView = c21543hDg.AEQbTJ;
        android.content.Context context = c21543hDg.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(OLrzqt(context, c28598kdm.EZpvd()));
        wYC wyc = c21543hDg.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(c28598kdm.KWHzl() ? 0 : 8);
    }

    public final java.lang.String OLrzqt(android.content.Context context, TimeIntervalType timeIntervalType) {
        int i = Application.copydefault[timeIntervalType.ordinal()];
        java.lang.String string = context.getString(i != 1 ? i != 2 ? i != 3 ? C23274hvD.Fragment.ICustomTabsCallback : C23274hvD.Fragment.extraCallback : C23274hvD.Fragment.OBzZra : C23274hvD.Fragment.sTbpmZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.kdl$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C28598kdm EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C28597kdl OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28597kdl c28597kdl, C28598kdm c28598kdm) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c28597kdl;
            this.EZpvd = c28598kdm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.invoke(this.EZpvd);
            }
        }
    }
}
