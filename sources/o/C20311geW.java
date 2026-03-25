package o;

import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.web.WebActivity;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20311geW extends C20446ggz<C9303bSz> {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C9303bSz AEQbTJ(C20311geW c20311geW) {
        return (C9303bSz) c20311geW.ejfBZ();
    }

    /* JADX INFO: renamed from: o.geW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.geW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C20311geW KWHzl(android.os.Bundle bundle) {
            C20311geW c20311geW = new C20311geW();
            c20311geW.setArguments(bundle);
            return c20311geW;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20446ggz, o.AbstractC20080gaD, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        final java.lang.String strAEQbTJ;
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(collection, "");
        super.copydefault(collection);
        final AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if (abstractC9832bcy == null) {
            return;
        }
        Function0 function0 = null;
        if (abstractC9832bcy instanceof C9826bcs) {
            java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", ((C9339bTi) ((C9303bSz) ejfBZ()).QKudOq()).KWHzl().getFeeCoinMeta().fJNWhG())));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((C9826bcs) abstractC9832bcy).KWHzl())) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getValue);
                function0 = new Function0() { // from class: o.gff
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20311geW.copydefault(abstractC9832bcy, this);
                    }
                };
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, strCopydefault, strAYXKKw, function0, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if ((abstractC9832bcy instanceof C9828bcu) || (abstractC9832bcy instanceof C9829bcv)) {
            C9785bcD c9785bcD = (C9785bcD) abstractC9832bcy;
            if (c9785bcD instanceof C9828bcu) {
                strAEQbTJ = ((C9828bcu) abstractC9832bcy).KWHzl();
            } else {
                strAEQbTJ = c9785bcD instanceof C9829bcv ? ((C9829bcv) abstractC9832bcy).AEQbTJ() : "";
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getValue);
                function0 = new Function0() { // from class: o.gfb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C20311geW.copydefault(strAEQbTJ, this);
                    }
                };
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQYQgr), strAYXKKw, function0, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
        }
    }

    public static final Unit copydefault(AbstractC9832bcy abstractC9832bcy, C20311geW c20311geW) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", ((C9826bcs) abstractC9832bcy).KWHzl()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = c20311geW.getContext();
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.geW$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C20311geW.AEQbTJ(C20311geW.this).valueOf(editable != null ? editable.toString() : null);
        }
    }

    /* JADX INFO: renamed from: o.geW$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C52794wYp.startLoading$default(C20311geW.this.gEmmrt().KWHzl.copydefault(), 0L, 1, null);
            C20311geW.AEQbTJ(C20311geW.this).KWHzl(editable != null ? editable.toString() : null).AEQbTJ(new InterfaceC58227yxM(C20311geW.this.new Application()) { // from class: o.geW.PendingIntent
                public final /* synthetic */ Function1 KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    Intrinsics.checkNotNullParameter(function1, "");
                    this.KWHzl = function1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final /* synthetic */ void accept(java.lang.Object obj) {
                    this.KWHzl.invoke(obj);
                }
            }, new InterfaceC58227yxM(C20311geW.this.new TaskDescription()) { // from class: o.geW.PendingIntent
                public final /* synthetic */ Function1 KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    Intrinsics.checkNotNullParameter(function1, "");
                    this.KWHzl = function1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final /* synthetic */ void accept(java.lang.Object obj) {
                    this.KWHzl.invoke(obj);
                }
            });
        }
    }

    public static final Unit copydefault(java.lang.String str, C20311geW c20311geW) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = c20311geW.getContext();
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20446ggz
    public C57464yis QUSxYX() {
        return AbstractC20102gaZ.moreView$default(this, C33129mqd.OLrzqt((java.lang.CharSequence) RcXXUw()) && ((C9303bSz) ejfBZ()).fHqPtx().AuCTel(), null, new Function1() { // from class: o.gfc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20311geW.AEQbTJ(this.EZpvd, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 2, null);
    }

    public static final Unit AEQbTJ(C20311geW c20311geW, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strRcXXUw = c20311geW.RcXXUw();
        actionBar.OLrzqt(c20311geW.copydefault(strRcXXUw != null ? strRcXXUw : ""));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20446ggz
    public android.view.View copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C17043evO c17043evOKWHzl = C17043evO.KWHzl(getLayoutInflater(), djSkpj().EZpvd.fIwbmz(), false);
        c17043evOKWHzl.getRoot().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hKJZrr));
        C55008xbo c55008xbo = djSkpj().EZpvd;
        android.widget.TextView root = c17043evOKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55008xbo.setLabelView(root);
        C55008xbo c55008xbo2 = djSkpj().EZpvd;
        android.view.View viewInflate = getLayoutInflater().inflate(C13754dXa.TaskDescription.OeawrHRnVkix, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate, "");
        C57230yeW c57230yeW = (C57230yeW) viewInflate;
        c57230yeW.setMaxDecimalValue(0);
        java.lang.String strOcIXYQ = ((C9303bSz) ejfBZ()).OcIXYQ();
        C57230yeW.setTextWrapper$default(c57230yeW, strOcIXYQ, null, 2, null);
        c57230yeW.setHint(strOcIXYQ != null ? pTB.formatLocalized$default(strOcIXYQ, null, 1, null) : null);
        ((android.widget.TextView) viewInflate).addTextChangedListener(new ActionBar());
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        c55008xbo2.setContentView(viewInflate);
        djSkpj().EZpvd.setVisibility(0);
        C17043evO c17043evOKWHzl2 = C17043evO.KWHzl(getLayoutInflater(), djSkpj().OLrzqt.fIwbmz(), false);
        c17043evOKWHzl2.getRoot().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl4));
        C55008xbo c55008xbo3 = djSkpj().OLrzqt;
        android.widget.TextView root2 = c17043evOKWHzl2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        c55008xbo3.setLabelView(root2);
        OKEditText root3 = C17048evT.KWHzl(getLayoutInflater(), djSkpj().OLrzqt.fIwbmz(), false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "");
        root3.setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDetachedFromWindow));
        djSkpj().OLrzqt.setSizeType(100);
        djSkpj().OLrzqt.setContentView(root3);
        root3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        java.lang.String strRcXXUw = RcXXUw();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strRcXXUw)) {
            if (((C9303bSz) ejfBZ()).fHqPtx().AuCTel()) {
                root3.setText(strRcXXUw);
            } else {
                djSkpj().AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialDPHOMC));
                djSkpj().KWHzl.setText(strRcXXUw);
            }
        }
        if (!((C9303bSz) ejfBZ()).fHqPtx().AuCTel()) {
            djSkpj().OLrzqt.setVisibility(8);
            djSkpj().AEQbTJ.setVisibility(0);
            djSkpj().KWHzl.setVisibility(0);
        } else {
            root3.addTextChangedListener(new StateListAnimator());
        }
        android.view.View root4 = djSkpj().getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        return root4;
    }

    /* JADX INFO: renamed from: o.geW$Application */
    public static final class Application implements Function1<kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String>, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String> pair) {
            AEQbTJ(pair);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            C20311geW.this.gEmmrt().KWHzl.copydefault().fIwbmz();
        }
    }

    /* JADX INFO: renamed from: o.geW$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            C20311geW.this.gEmmrt().KWHzl.copydefault().fIwbmz();
        }
    }
}
