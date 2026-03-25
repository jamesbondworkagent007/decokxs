package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.assets.utxo.list.UtxoTileBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10300blp extends AbstractC19608gIr<C10303bls, C16774eqK> {
    public final java.lang.String AEQbTJ;
    public final Function2<java.lang.String, java.lang.Boolean, Unit> EZpvd;
    public final Function1<C10303bls, Unit> KWHzl;
    public final Function1<C10303bls, java.lang.Boolean> OLrzqt;
    public final Function1<java.lang.String, java.lang.String> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.bls, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.bls, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10300blp(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, java.lang.String> function1, @NotNull Function1<? super C10303bls, Unit> function12, @NotNull Function1<? super C10303bls, java.lang.Boolean> function13, @NotNull Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2) {
        super(UtxoTileBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = str;
        this.copydefault = function1;
        this.KWHzl = function12;
        this.OLrzqt = function13;
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C16774eqK c16774eqK, @NotNull C10303bls c10303bls) {
        Intrinsics.checkNotNullParameter(c16774eqK, "");
        Intrinsics.checkNotNullParameter(c10303bls, "");
        ConstraintLayout root = c16774eqK.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, c10303bls));
        c16774eqK.OLrzqt.setVisibility(this.OLrzqt.invoke(c10303bls).booleanValue() ? 4 : 0);
        c16774eqK.EZpvd.setImageDrawable(ContextCompat.getDrawable(c16774eqK.getRoot().getContext(), c10303bls.AhwBna() ? C52761wXj.TaskDescription.gqESXP : C52761wXj.TaskDescription.QqiRNA));
        c16774eqK.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(c16774eqK.getRoot().getContext(), c10303bls.AhwBna() ? C52761wXj.Activity.QVAiDq : C52761wXj.Activity.ORxRYg)));
        wYC wyc = c16774eqK.EZpvd;
        wyc.setOnClickListener(new TaskDescription(wyc, 1000L, this, c10303bls));
        wYC wyc2 = c16774eqK.copydefault;
        wyc2.setOnClickListener(new ActionBar(wyc2, 1000L, this, c10303bls));
        android.widget.TextView textView = c16774eqK.gEmmrt;
        android.content.Context context = c16774eqK.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C33069mpW.KWHzl(context, C13754dXa.FragmentManager.DGUQLIekVPG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num1", C10353bmp.OLrzqt.AEQbTJ(c10303bls.EZpvd())), C56390yDp.OLrzqt("symbol", this.AEQbTJ))));
        c16774eqK.djBIcL.setText(this.copydefault.invoke(java.lang.String.valueOf(c10303bls.EZpvd())));
    }

    /* JADX INFO: renamed from: o.blp$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C10303bls AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C10300blp KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C10300blp c10300blp, C10303bls c10303bls) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c10300blp;
            this.AEQbTJ = c10303bls;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.KWHzl.invoke(this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.blp$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C10303bls KWHzl;
        public final /* synthetic */ C10300blp OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C10300blp c10300blp, C10303bls c10303bls) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c10300blp;
            this.KWHzl = c10303bls;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.invoke(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.blp$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C10300blp AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C10303bls OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C10300blp c10300blp, C10303bls c10303bls) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c10300blp;
            this.OLrzqt = c10303bls;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.invoke(this.OLrzqt.copydefault(), java.lang.Boolean.valueOf(!this.OLrzqt.AhwBna()));
            }
        }
    }
}
