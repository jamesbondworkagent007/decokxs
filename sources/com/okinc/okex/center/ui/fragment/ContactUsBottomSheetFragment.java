package com.okinc.okex.center.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.center.ui.fragment.ContactUsBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52787wYi;
import o.C33070mpX;
import o.C47315tni;
import o.C47424tpl;
import o.C47457tqR;
import o.C52761wXj;
import o.C55167xeo;
import o.C56390yDp;
import o.C56392yDr;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.rVN;
import o.wXQ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ContactUsBottomSheetFragment extends AbstractC52787wYi {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function1<? super ContactUsType, Unit> AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.siy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ContactUsBottomSheetFragment.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ContactUsType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ContactUsType[] $VALUES;
        public static final ContactUsType CHAT_BOT = new ContactUsType("CHAT_BOT", 0);
        public static final ContactUsType TOLL_FREE = new ContactUsType("TOLL_FREE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ContactUsType[] $values() {
            return new ContactUsType[]{CHAT_BOT, TOLL_FREE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ContactUsType> getEntries() {
            return $ENTRIES;
        }

        private ContactUsType(String str, int i) {
        }

        static {
            ContactUsType[] contactUsTypeArr$values = $values();
            $VALUES = contactUsTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(contactUsTypeArr$values);
        }

        public static ContactUsType valueOf(String str) {
            return (ContactUsType) Enum.valueOf(ContactUsType.class, str);
        }

        public static ContactUsType[] values() {
            return (ContactUsType[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ ConstraintLayout EZpvd;
        public final /* synthetic */ ContactUsBottomSheetFragment copydefault;

        public StateListAnimator(View view, ConstraintLayout constraintLayout, ContactUsBottomSheetFragment contactUsBottomSheetFragment) {
            this.AEQbTJ = view;
            this.EZpvd = constraintLayout;
            this.copydefault = contactUsBottomSheetFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.AEQbTJ.isLaidOut()) {
                this.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RecyclerView recyclerView = (RecyclerView) this.EZpvd.findViewById(C52761wXj.FragmentManager.fLIjIY);
                if (recyclerView != null) {
                    this.copydefault.OLrzqt(recyclerView);
                }
            }
        }
    }

    public final String OLrzqt() {
        return (String) this.EZpvd.getValue();
    }

    public static final String AEQbTJ(ContactUsBottomSheetFragment contactUsBottomSheetFragment) {
        Bundle arguments = contactUsBottomSheetFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("phone_number");
        }
        return null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.fragment.ContactUsBottomSheetFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull FragmentManager fragmentManager, @NotNull String str, @NotNull Function1<? super ContactUsType, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ContactUsBottomSheetFragment contactUsBottomSheetFragment = new ContactUsBottomSheetFragment();
            contactUsBottomSheetFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("phone_number", str)));
            contactUsBottomSheetFragment.AEQbTJ = function1;
            contactUsBottomSheetFragment.show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        C47424tpl c47424tplKWHzl = C47424tpl.KWHzl(LayoutInflater.from(wxq.getContext()));
        Intrinsics.checkNotNullExpressionValue(c47424tplKWHzl, "");
        wxq.addView(c47424tplKWHzl.getRoot());
    }

    @Override // o.AbstractC52787wYi, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.ODWQjV), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.zsXlph));
        KWHzl();
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new StateListAnimator(constraintLayout, constraintLayout, this));
    }

    private final void KWHzl() {
        if (getContext() != null) {
            ConstraintLayout root = C47457tqR.AEQbTJ(LayoutInflater.from(getContext())).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            C55167xeo c55167xeo = new C55167xeo(C47315tni.Application.djBIcL, C33070mpX.AYXKKw(C47315tni.PendingIntent.gkJEwt), C33070mpX.AYXKKw(C47315tni.PendingIntent.iRxXKY), root, 0, 16, null);
            int i = C52761wXj.TaskDescription.QHmsKR;
            String strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.AxsJAYaxsJAY);
            String strAYXKKw2 = C33070mpX.AYXKKw(C47315tni.PendingIntent.iZzfmt);
            String strOLrzqt = OLrzqt();
            OLrzqt(yDY.gEmmrt(c55167xeo, new C55167xeo(i, strAYXKKw, C59449zhJ.replace$default(strAYXKKw2, "{phoneNumber}", strOLrzqt == null ? "" : strOLrzqt, false, 4, (Object) null), null, 0, 16, null)));
            OLrzqt(new Function2() { // from class: o.siu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ContactUsBottomSheetFragment.OLrzqt(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (C55167xeo) obj2);
                }
            });
        }
    }

    public static final Unit OLrzqt(ContactUsBottomSheetFragment contactUsBottomSheetFragment, int i, C55167xeo c55167xeo) {
        ContactUsType contactUsType;
        Function1<? super ContactUsType, Unit> function1 = contactUsBottomSheetFragment.AEQbTJ;
        if (function1 != null) {
            if (i == 0) {
                contactUsType = ContactUsType.CHAT_BOT;
            } else if (i == 1) {
                contactUsType = ContactUsType.TOLL_FREE;
            } else {
                throw new IllegalArgumentException("Invalid index");
            }
            function1.invoke(contactUsType);
        }
        contactUsBottomSheetFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new Runnable() { // from class: o.six
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ContactUsBottomSheetFragment.copydefault(this.copydefault);
            }
        });
    }

    public static final void copydefault(ContactUsBottomSheetFragment contactUsBottomSheetFragment) {
        rVN.reportFullyDrawn$default((Fragment) contactUsBottomSheetFragment, true, (String) null, 2, (Object) null);
    }

    public final void OLrzqt(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            KWHzl(childAt.findViewById(C52761wXj.FragmentManager.ffGIBT));
            KWHzl(childAt.findViewById(C52761wXj.FragmentManager.zLAIeZ));
        }
        recyclerView.requestLayout();
    }

    public final void KWHzl(View view) {
        if (view == null || !(view.getParent() instanceof ConstraintLayout)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
        layoutParams2.endToEnd = 0;
        view.setLayoutParams(layoutParams2);
    }
}
