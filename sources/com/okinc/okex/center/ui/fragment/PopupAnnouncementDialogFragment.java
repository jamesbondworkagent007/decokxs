package com.okinc.okex.center.ui.fragment;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.PopupAnnouncementReadReq;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.fragment.PopupAnnouncementDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC45032siD;
import o.AbstractC47383tox;
import o.AbstractC58185ywX;
import o.C32979mnm;
import o.C33024moe;
import o.C33129mqd;
import o.C45363soQ;
import o.C45397soy;
import o.C52794wYp;
import o.C55134xeH;
import o.C55296xhK;
import o.C55298xhM;
import o.C55302xhQ;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.InterfaceC44921sfz;
import o.InterfaceC56387yDm;
import o.InterfaceC58227yxM;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class PopupAnnouncementDialogFragment extends AbstractC45032siD {
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.siO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PopupAnnouncementDialogFragment.AhwBna(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.siV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(PopupAnnouncementDialogFragment.AYXKKw());
        }
    });
    public AbstractC47383tox djBIcL;
    public boolean gEmmrt;

    @yCM
    public C45397soy selfServiceUseCase;
    public boolean valueOf;
    public CharSequence values;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(CharSequence charSequence) {
        this.values = charSequence;
    }

    public static final class ActionBar implements View.OnLayoutChangeListener {
        public final /* synthetic */ AbstractC47383tox AEQbTJ;
        public final /* synthetic */ PopupAnnouncementDialogFragment EZpvd;

        public ActionBar(AbstractC47383tox abstractC47383tox, PopupAnnouncementDialogFragment popupAnnouncementDialogFragment) {
            this.AEQbTJ = abstractC47383tox;
            this.EZpvd = popupAnnouncementDialogFragment;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            this.AEQbTJ.AYXKKw.post(this.EZpvd.new Application());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.fragment.PopupAnnouncementDialogFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final PopupAnnouncementDialogFragment AEQbTJ(@NotNull AnnouncementPopupDisplayModel announcementPopupDisplayModel) {
            Intrinsics.checkNotNullParameter(announcementPopupDisplayModel, "");
            PopupAnnouncementDialogFragment popupAnnouncementDialogFragment = new PopupAnnouncementDialogFragment();
            popupAnnouncementDialogFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_ANNOUNCEMENT", announcementPopupDisplayModel)));
            return popupAnnouncementDialogFragment;
        }
    }

    public final AnnouncementPopupDisplayModel gEmmrt() {
        return (AnnouncementPopupDisplayModel) this.AYXKKw.getValue();
    }

    public static final AnnouncementPopupDisplayModel AhwBna(PopupAnnouncementDialogFragment popupAnnouncementDialogFragment) {
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = popupAnnouncementDialogFragment.getArguments();
            if (arguments != null) {
                return (AnnouncementPopupDisplayModel) arguments.getParcelable("KEY_ANNOUNCEMENT", AnnouncementPopupDisplayModel.class);
            }
        } else {
            Bundle arguments2 = popupAnnouncementDialogFragment.getArguments();
            if (arguments2 != null) {
                return (AnnouncementPopupDisplayModel) arguments2.getParcelable("KEY_ANNOUNCEMENT");
            }
        }
        return null;
    }

    public final C45397soy djBIcL() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final int AhwBna() {
        return ((Number) this.DbNXlk.getValue()).intValue();
    }

    public static final int AYXKKw() {
        return (int) (C55302xhQ.AEQbTJ(C32979mnm.EZpvd.OLrzqt()) * 0.75f);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o.sjc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
                return PopupAnnouncementDialogFragment.KWHzl(dialogInterface, i, keyEvent);
            }
        });
        return dialogOnCreateDialog;
    }

    public static final boolean KWHzl(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4 && keyEvent.getAction() == 1;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47383tox abstractC47383toxOLrzqt = AbstractC47383tox.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47383toxOLrzqt, "");
        this.djBIcL = abstractC47383toxOLrzqt;
        View root = abstractC47383toxOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AnnouncementPopupDisplayModel announcementPopupDisplayModelGEmmrt = gEmmrt();
        if (announcementPopupDisplayModelGEmmrt == null) {
            rVN.reportFullyDrawn$default((Fragment) this, false, (String) null, 2, (Object) null);
            dismissAllowingStateLoss();
            return;
        }
        AbstractC47383tox abstractC47383tox = this.djBIcL;
        if (abstractC47383tox != null) {
            TextView textView = abstractC47383tox.values;
            String title = announcementPopupDisplayModelGEmmrt.getTitle();
            if (title == null) {
                title = "";
            }
            textView.setText(title);
            TextView textView2 = abstractC47383tox.values;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            String title2 = announcementPopupDisplayModelGEmmrt.getTitle();
            textView2.setVisibility(title2 == null || title2.length() == 0 ? 8 : 0);
            CharSequence charSequence = this.values;
            if (C33129mqd.OLrzqt(charSequence)) {
                TextView textView3 = abstractC47383tox.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(0);
                abstractC47383tox.DbNXlk.setText(charSequence);
                abstractC47383tox.DbNXlk.setMovementMethod(C55134xeH.OLrzqt());
            } else {
                TextView textView4 = abstractC47383tox.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(8);
            }
            SelfServiceToolBean ctaSelfServiceTool = announcementPopupDisplayModelGEmmrt.getCtaSelfServiceTool();
            C52794wYp c52794wYp = abstractC47383tox.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(ctaSelfServiceTool != null ? 0 : 8);
            if (ctaSelfServiceTool != null) {
                abstractC47383tox.EZpvd.setText(ctaSelfServiceTool.getTitle());
                C52794wYp c52794wYp2 = abstractC47383tox.EZpvd;
                c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this, ctaSelfServiceTool));
            }
            C52794wYp c52794wYp3 = abstractC47383tox.copydefault;
            c52794wYp3.setOnClickListener(new TaskDescription(c52794wYp3, 1000L, this));
            OLrzqt(abstractC47383tox);
            NestedScrollView nestedScrollView = abstractC47383tox.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            if (ViewCompat.isLaidOut(nestedScrollView) && !nestedScrollView.isLayoutRequested()) {
                abstractC47383tox.AYXKKw.post(new Application());
            } else {
                nestedScrollView.addOnLayoutChangeListener(new ActionBar(abstractC47383tox, this));
            }
        }
        C45363soQ.onSessionIdEvent$default("SupportCenter_PopupAnnouncement_Banner_View", false, null, 3, null);
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    public static final class Application implements Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PopupAnnouncementDialogFragment.this.valueOf();
            PopupAnnouncementDialogFragment.this.DbNXlk();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setLayout(C55302xhQ.OLrzqt(C32979mnm.EZpvd.OLrzqt()) - C55298xhM.dp2px$default(48.0f, null, 1, null), -2);
        window.setGravity(17);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        fetchVPNInfo();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = false;
        this.djBIcL = null;
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ PopupAnnouncementDialogFragment AEQbTJ;
        public final /* synthetic */ NestedScrollView EZpvd;
        public final /* synthetic */ AbstractC47383tox KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, PopupAnnouncementDialogFragment popupAnnouncementDialogFragment, AbstractC47383tox abstractC47383tox, NestedScrollView nestedScrollView) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = popupAnnouncementDialogFragment;
            this.KWHzl = abstractC47383tox;
            this.EZpvd = nestedScrollView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.gEmmrt = true;
                this.KWHzl.KWHzl.setVisibility(4);
                NestedScrollView nestedScrollView = this.EZpvd;
                nestedScrollView.smoothScrollBy(0, nestedScrollView.getHeight());
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ PopupAnnouncementDialogFragment EZpvd;
        public final /* synthetic */ SelfServiceToolBean KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, PopupAnnouncementDialogFragment popupAnnouncementDialogFragment, SelfServiceToolBean selfServiceToolBean) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = popupAnnouncementDialogFragment;
            this.KWHzl = selfServiceToolBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C45363soQ.onSessionIdEvent$default("SupportCenter_PopupAnnouncement_CTA_Click", false, null, 3, null);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new PopupAnnouncementDialogFragment$onViewCreated$1$1$1(this.EZpvd, this.KWHzl, null), 3, null);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ PopupAnnouncementDialogFragment AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, PopupAnnouncementDialogFragment popupAnnouncementDialogFragment) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = popupAnnouncementDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C45363soQ.onSessionIdEvent$default("SupportCenter_PopupAnnouncement_Close_Click", false, null, 3, null);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        fetchVPNInfo();
    }

    public final void fetchVPNInfo() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        AnnouncementPopupDisplayModel announcementPopupDisplayModelGEmmrt = gEmmrt();
        String id = announcementPopupDisplayModelGEmmrt != null ? announcementPopupDisplayModelGEmmrt.getId() : null;
        if (id == null) {
            id = "";
        }
        if (C33129mqd.OLrzqt((CharSequence) id)) {
            AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) InterfaceC44921sfz.Companion.AEQbTJ().AEQbTJ(new PopupAnnouncementReadReq(C56402yEa.EZpvd(id))));
            final Function1 function1 = new Function1() { // from class: o.siU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return PopupAnnouncementDialogFragment.AEQbTJ((ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.siT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    PopupAnnouncementDialogFragment.copydefault(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.siX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return PopupAnnouncementDialogFragment.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.siW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    PopupAnnouncementDialogFragment.EZpvd(function12, obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(ResponseData responseData) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(final AbstractC47383tox abstractC47383tox) {
        NestedScrollView nestedScrollView = abstractC47383tox.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        LinearLayout linearLayout = abstractC47383tox.KWHzl;
        linearLayout.setOnClickListener(new FragmentManager(linearLayout, 1000L, this, abstractC47383tox, nestedScrollView));
        nestedScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.siR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                PopupAnnouncementDialogFragment.EZpvd(this.copydefault, abstractC47383tox, view, i, i2, i3, i4);
            }
        });
    }

    public static final void EZpvd(PopupAnnouncementDialogFragment popupAnnouncementDialogFragment, AbstractC47383tox abstractC47383tox, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0 && !popupAnnouncementDialogFragment.gEmmrt) {
            popupAnnouncementDialogFragment.gEmmrt = true;
            abstractC47383tox.KWHzl.setVisibility(4);
        }
        popupAnnouncementDialogFragment.DbNXlk();
    }

    public final void valueOf() {
        int measuredHeight;
        AbstractC47383tox abstractC47383tox = this.djBIcL;
        if (abstractC47383tox != null && (measuredHeight = abstractC47383tox.valueOf.getMeasuredHeight()) > 0) {
            int iMin = Math.min(measuredHeight, AhwBna());
            NestedScrollView nestedScrollView = abstractC47383tox.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            if (nestedScrollView.getLayoutParams().height == iMin) {
                DbNXlk();
                return;
            }
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iMin;
                nestedScrollView.setLayoutParams(layoutParams);
                nestedScrollView.post(new Runnable() { // from class: o.siP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopupAnnouncementDialogFragment.KWHzl(this.KWHzl);
                    }
                });
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void KWHzl(PopupAnnouncementDialogFragment popupAnnouncementDialogFragment) {
        popupAnnouncementDialogFragment.DbNXlk();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DbNXlk() {
        boolean z;
        AbstractC47383tox abstractC47383tox = this.djBIcL;
        if (abstractC47383tox == null) {
            return;
        }
        NestedScrollView nestedScrollView = abstractC47383tox.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        boolean zCanScrollVertically = nestedScrollView.canScrollVertically(-1);
        boolean zCanScrollVertically2 = nestedScrollView.canScrollVertically(1);
        abstractC47383tox.isConnected.setVisibility(zCanScrollVertically ? 0 : 4);
        abstractC47383tox.AEQbTJ.setVisibility(zCanScrollVertically2 ? 0 : 4);
        C52794wYp c52794wYp = abstractC47383tox.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        if (c52794wYp.getVisibility() == 8) {
            if (abstractC47383tox.copydefault.isShown()) {
                C52794wYp c52794wYp2 = abstractC47383tox.copydefault;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                if (AEQbTJ(nestedScrollView, c52794wYp2)) {
                    z = true;
                }
            }
            z = false;
        } else {
            if (abstractC47383tox.EZpvd.isShown()) {
                C52794wYp c52794wYp3 = abstractC47383tox.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
                if (AEQbTJ(nestedScrollView, c52794wYp3)) {
                }
            }
            z = false;
        }
        abstractC47383tox.KWHzl.setVisibility((this.gEmmrt || zCanScrollVertically || !zCanScrollVertically2 || z) ? false : true ? 0 : 4);
    }

    public final boolean AEQbTJ(View view, View view2) {
        if (view2.getHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        return view.getGlobalVisibleRect(rect) && view2.getGlobalVisibleRect(rect2) && rect2.intersect(rect) && rect2.height() >= view2.getHeight() / 2;
    }
}
