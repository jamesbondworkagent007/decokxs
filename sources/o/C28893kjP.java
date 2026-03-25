package o;

import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.features.meme.ui.views.ToolButton;
import com.okinc.business.market.features.meme.ui.views.ToolDialogParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28893kjP extends C32995moB {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public Function1<? super ToolButton, Unit> OLrzqt;
    public C21466hAk copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function1<? super ToolButton, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    public final C21466hAk copydefault() {
        C21466hAk c21466hAk = this.copydefault;
        Intrinsics.copydefault(c21466hAk);
        return c21466hAk;
    }

    public final ToolDialogParams AEQbTJ() {
        ToolDialogParams toolDialogParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (toolDialogParams = (ToolDialogParams) arguments.getParcelable("key.tool_dialog")) == null) ? new ToolDialogParams(null, 1, null) : toolDialogParams;
    }

    /* JADX INFO: renamed from: o.kjP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kjP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C28893kjP KWHzl(@NotNull kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, @NotNull ToolDialogParams toolDialogParams) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(toolDialogParams, "");
            C28893kjP c28893kjP = new C28893kjP();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("position.x", pair.getFirst().intValue());
            bundle.putInt("position.y", pair.getSecond().intValue());
            bundle.putParcelable("key.tool_dialog", toolDialogParams);
            c28893kjP.setArguments(bundle);
            return c28893kjP;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.copydefault = C21466hAk.copydefault(layoutInflater, viewGroup, false);
        android.widget.LinearLayout root = copydefault().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
        view.post(new java.lang.Runnable() { // from class: o.kjL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C28893kjP.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void OLrzqt(C28893kjP c28893kjP) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28893kjP, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.C32995moB, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        EZpvd();
    }

    public final void EZpvd() {
        android.view.Window window;
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 51;
        }
        android.os.Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("position.x") : 0;
        android.os.Bundle arguments2 = getArguments();
        int i2 = arguments2 != null ? arguments2.getInt("position.y") : 0;
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        if (attributes2 != null) {
            android.content.Context context = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            attributes2.x = i - C55298xhM.OLrzqt(50, context);
        }
        WindowManager.LayoutParams attributes3 = window.getAttributes();
        if (attributes3 != null) {
            android.content.Context context2 = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            attributes3.y = i2 - C55298xhM.KWHzl(148.0f, context2);
        }
        window.getAttributes().dimAmount = 0.0f;
        window.setAttributes(window.getAttributes());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void KWHzl() {
        C21466hAk c21466hAkCopydefault = copydefault();
        for (ToolButton toolButton : AEQbTJ().copydefault()) {
            LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(copydefault().getRoot().getContext());
            linearLayoutCompat.setOrientation(0);
            linearLayoutCompat.setGravity(17);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
            linearLayoutCompat.setPadding(C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(4.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(4.0f, null, 1, null));
            linearLayoutCompat.setLayoutParams(layoutParams);
            if (toolButton.OLrzqt() != null) {
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(toolButton.OLrzqt().intValue());
                if (drawableKWHzl != null) {
                    java.lang.Integer numKWHzl = toolButton.KWHzl();
                    if (numKWHzl != null) {
                        C33057mpK.copydefault(drawableKWHzl, numKWHzl.intValue());
                    }
                } else {
                    drawableKWHzl = null;
                }
                imageView.setImageDrawable(drawableKWHzl);
                imageView.setLayoutParams(new LinearLayoutCompat.LayoutParams(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null)));
                linearLayoutCompat.addView(imageView);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) toolButton.AEQbTJ())) {
                android.widget.TextView textView = new android.widget.TextView(getContext(), null, 0, C52761wXj.LoaderManager.zuBGHE);
                textView.setText(toolButton.AEQbTJ());
                textView.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -2));
                textView.setMaxLines(1);
                textView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.zblBkD));
                C55296xhK.margin$default(textView, java.lang.Float.valueOf(4.0f), null, null, null, 14, null);
                linearLayoutCompat.addView(textView);
            }
            linearLayoutCompat.setOnClickListener(new Activity(linearLayoutCompat, 1000L, this, toolButton));
            c21466hAkCopydefault.copydefault.addView(linearLayoutCompat);
        }
        EZpvd();
    }

    /* JADX INFO: renamed from: o.kjP$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C28893kjP OLrzqt;
        public final /* synthetic */ ToolButton copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C28893kjP c28893kjP, ToolButton toolButton) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c28893kjP;
            this.copydefault = toolButton;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.OLrzqt;
                if (function1 != null) {
                    function1.invoke(this.copydefault);
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
