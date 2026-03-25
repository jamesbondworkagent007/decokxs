package o;

import com.okinc.okex.debug.adapter.EntrypointListAdapter;
import com.okinc.okex.debug.bean.DetectIssueParams;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC44878sfI;
import o.ActivityC44946sgX;
import o.C47315tni;
import o.C55018xby;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45485sqg extends AbstractC45451spz {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public AbstractC47370tok OLrzqt;
    public final java.lang.String copydefault = "Txn List";
    public final int AEQbTJ = C47315tni.ActionBar.zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC45451spz
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.sqg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sqg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C45485sqg EZpvd() {
            return new C45485sqg();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47370tok abstractC47370tokAEQbTJ = AbstractC47370tok.AEQbTJ(layoutInflater, viewGroup, false);
        this.OLrzqt = abstractC47370tokAEQbTJ;
        if (abstractC47370tokAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC47370tokAEQbTJ = null;
        }
        android.view.View root = abstractC47370tokAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47370tok abstractC47370tok = this.OLrzqt;
        if (abstractC47370tok == null) {
            Intrinsics.gEmmrt("");
            abstractC47370tok = null;
        }
        final C55018xby c55018xby = abstractC47370tok.AEQbTJ;
        c55018xby.setItems(KWHzl());
        final AbstractC52786wYh abstractC52786wYhOLrzqt = c55018xby.OLrzqt();
        if (abstractC52786wYhOLrzqt != null) {
            C55018xby.Activity activity = abstractC52786wYhOLrzqt instanceof C55018xby.Activity ? (C55018xby.Activity) abstractC52786wYhOLrzqt : null;
            if (activity != null) {
                activity.EZpvd(new Function1() { // from class: o.sqi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C45485sqg.AEQbTJ(c55018xby, this, abstractC52786wYhOLrzqt, (java.lang.CharSequence) obj);
                    }
                });
            }
        }
        EntrypointListAdapter entrypointListAdapter = new EntrypointListAdapter();
        abstractC47370tok.OLrzqt.setAdapter(entrypointListAdapter);
        entrypointListAdapter.AEQbTJ(AEQbTJ());
        view.post(new java.lang.Runnable() { // from class: o.sqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45485sqg.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final Unit AEQbTJ(C55018xby c55018xby, C45485sqg c45485sqg, AbstractC52786wYh abstractC52786wYh, java.lang.CharSequence charSequence) {
        for (C55276xgr c55276xgr : c55018xby.copydefault()) {
            if (c55276xgr.AEQbTJ()) {
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                DetectIssueParams detectIssueParams = objOLrzqt instanceof DetectIssueParams ? (DetectIssueParams) objOLrzqt : null;
                ActivityC44946sgX.ActionBar actionBar = ActivityC44946sgX.Companion;
                android.content.Context context = c55018xby.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c45485sqg.startActivity(actionBar.OLrzqt(context, detectIssueParams));
                abstractC52786wYh.dismiss();
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final void EZpvd(C45485sqg c45485sqg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45485sqg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final java.util.List<EntrypointListAdapter.StateListAnimator> AEQbTJ() {
        final android.content.Context context = getContext();
        java.util.List<EntrypointListAdapter.StateListAnimator> listGEmmrt = context != null ? yDY.gEmmrt(new EntrypointListAdapter.StateListAnimator.ActionBar("Entrypoints"), new EntrypointListAdapter.StateListAnimator.Activity("All Transaction Lists", new Function0() { // from class: o.sql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45485sqg.OLrzqt(context, this);
            }
        }), new EntrypointListAdapter.StateListAnimator.Activity("Txn Issue Troubleshoot Form", new Function0() { // from class: o.sqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45485sqg.EZpvd(context, this);
            }
        })) : null;
        return listGEmmrt == null ? yDY.AhwBna() : listGEmmrt;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sfI.StateListAnimator.createIntent$default(o.sfI$StateListAnimator, android.content.Context, java.lang.Integer, int, java.lang.Object):android.content.Intent */
    public static final Unit OLrzqt(android.content.Context context, C45485sqg c45485sqg) {
        c45485sqg.startActivity(ActivityC44878sfI.StateListAnimator.createIntent$default(ActivityC44878sfI.Companion, context, null, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sgX.ActionBar.createIntent$default(o.sgX$ActionBar, android.content.Context, com.okinc.okex.debug.bean.DetectIssueParams, int, java.lang.Object):android.content.Intent */
    public static final Unit EZpvd(android.content.Context context, C45485sqg c45485sqg) {
        c45485sqg.startActivity(ActivityC44946sgX.ActionBar.createIntent$default(ActivityC44946sgX.Companion, context, null, 2, null));
        return Unit.INSTANCE;
    }

    public final java.util.List<C55276xgr> KWHzl() {
        return yDY.AhwBna(new C55276xgr("Case 1: Unsupported token: (-1)", new DetectIssueParams(-1, null, null, 6, null), null, false, false, null, null, 124, null), new C55276xgr("Case 2: Found completed transaction", new DetectIssueParams(0, 0, "txid"), null, false, false, null, null, 124, null), new C55276xgr("Case 3: Transaction deposit error incorrect address", new DetectIssueParams(0, 0, "txid"), null, false, false, null, null, 124, null), new C55276xgr("Case 4: Transaction deposit non OKX transaction", new DetectIssueParams(0, 0, "notfound"), null, false, false, null, null, 124, null), new C55276xgr("Case 5: Transaction deposit Missing tag memo", new DetectIssueParams(0, 0, "missingtagmemo"), null, false, false, null, null, 124, null), new C55276xgr("Case 6: Transaction deposit Below min non btc", new DetectIssueParams(0, 0, "minnonbtc"), null, false, false, null, null, 124, null), new C55276xgr("Case 7: Transaction deposit Below min btc", new DetectIssueParams(0, 0, "minbtc"), null, false, false, null, null, 124, null), new C55276xgr("Case 8: Found completed translation", new DetectIssueParams(0, 0, "completed"), null, false, false, null, null, 124, null), new C55276xgr("Case 9: Found in-progress translation", new DetectIssueParams(0, 0, "inprogress"), null, false, false, null, null, 124, null), new C55276xgr("Case 10: Found untradable translation", new DetectIssueParams(0, 0, "untradable"), null, false, false, null, null, 124, null));
    }
}
