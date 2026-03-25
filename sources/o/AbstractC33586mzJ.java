package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33592mzP;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC33586mzJ {
    public android.content.Context AEQbTJ;
    public C33584mzH EZpvd;
    public int KWHzl;
    public java.util.ArrayList<C33589mzM> OLrzqt;
    public mPS copydefault;
    public final java.util.ArrayList<java.lang.Integer> gEmmrt;

    /* JADX INFO: renamed from: o.mzJ$Activity */
    public static final class Activity {

        /* JADX INFO: renamed from: o.mzJ$Activity$Activity, reason: collision with other inner class name */
        public interface InterfaceC0885Activity {
            void copydefault(int i, int i2, @NotNull java.util.ArrayList<C33583mzG> arrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C33589mzM> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Integer> gEmmrt() {
        return this.gEmmrt;
    }

    public AbstractC33586mzJ(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.gEmmrt = new java.util.ArrayList<>();
        this.OLrzqt = new java.util.ArrayList<>();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        djBIcL();
    }

    public final void djBIcL() {
        this.copydefault = (mPS) DataBindingUtil.inflate(android.view.LayoutInflater.from(this.AEQbTJ), C32113mPz.Fragment.zLjUOn, null, false);
    }

    public final void KWHzl() {
        android.view.View view = new android.view.View(this.AEQbTJ);
        view.setBackgroundColor(ContextCompat.getColor(this.AEQbTJ, C52761wXj.Activity.fZc));
        view.setLayoutParams(new LinearLayout.LayoutParams(C55298xhM.copydefault(0.5f, this.AEQbTJ), -1));
        mPS mps = this.copydefault;
        if (mps == null) {
            Intrinsics.gEmmrt("");
            mps = null;
        }
        mps.KWHzl.addView(view);
    }

    public final void OLrzqt(@NotNull AbstractC33602mzZ abstractC33602mzZ, boolean z, int i, @NotNull java.util.ArrayList<C33583mzG> arrayList, StateListAnimator.InterfaceC0886StateListAnimator interfaceC0886StateListAnimator, Activity.InterfaceC0885Activity interfaceC0885Activity) {
        Intrinsics.checkNotNullParameter(abstractC33602mzZ, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        android.content.Context context = this.AEQbTJ;
        mPS mps = this.copydefault;
        mPS mps2 = null;
        if (mps == null) {
            Intrinsics.gEmmrt("");
            mps = null;
        }
        android.widget.LinearLayout linearLayout = mps.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        android.view.View viewAEQbTJ = abstractC33602mzZ.AEQbTJ(context, linearLayout);
        ViewGroup.LayoutParams layoutParams = viewAEQbTJ.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = 0;
        layoutParams2.weight = abstractC33602mzZ.OLrzqt();
        viewAEQbTJ.setLayoutParams(layoutParams2);
        mPS mps3 = this.copydefault;
        if (mps3 == null) {
            Intrinsics.gEmmrt("");
            mps3 = null;
        }
        mps3.copydefault.addView(viewAEQbTJ);
        RecyclerView recyclerView = new RecyclerView(this.AEQbTJ);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.AEQbTJ, 1, false));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1);
        layoutParams3.weight = abstractC33602mzZ.OLrzqt();
        layoutParams3.setMarginEnd(C55298xhM.copydefault(15.0f, this.AEQbTJ));
        recyclerView.setLayoutParams(layoutParams3);
        recyclerView.setBackgroundColor(abstractC33602mzZ.AEQbTJ());
        mPS mps4 = this.copydefault;
        if (mps4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            mps2 = mps4;
        }
        mps2.KWHzl.addView(recyclerView);
        if (abstractC33602mzZ.KWHzl()) {
            KWHzl();
        }
        C33589mzM c33589mzM = new C33589mzM(this.AEQbTJ, false, z, i, this, recyclerView, arrayList, abstractC33602mzZ, interfaceC0886StateListAnimator, interfaceC0885Activity, null);
        recyclerView.setAdapter(c33589mzM);
        this.OLrzqt.add(c33589mzM);
    }

    public final void EZpvd(@NotNull C33596mzT c33596mzT, boolean z, int i, @NotNull java.util.ArrayList<C33583mzG> arrayList, StateListAnimator.InterfaceC0886StateListAnimator interfaceC0886StateListAnimator, Activity.InterfaceC0885Activity interfaceC0885Activity) {
        Intrinsics.checkNotNullParameter(c33596mzT, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        RecyclerView recyclerView = new RecyclerView(this.AEQbTJ);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.AEQbTJ, 0, false));
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.copydefault(16.0f, this.AEQbTJ), 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iCopydefault = C55298xhM.copydefault(15.0f, this.AEQbTJ);
        layoutParams.setMarginStart(iCopydefault);
        layoutParams.setMarginEnd(iCopydefault);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setBackgroundColor(c33596mzT.AEQbTJ());
        mPS mps = this.copydefault;
        mPS mps2 = null;
        if (mps == null) {
            Intrinsics.gEmmrt("");
            mps = null;
        }
        mps.AEQbTJ.addView(recyclerView);
        android.view.View view = new android.view.View(this.AEQbTJ);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C55298xhM.copydefault(0.5f, this.AEQbTJ));
        int iCopydefault2 = C55298xhM.copydefault(15.0f, this.AEQbTJ);
        layoutParams2.setMarginStart(iCopydefault2);
        layoutParams2.setMarginEnd(iCopydefault2);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundColor(ContextCompat.getColor(this.AEQbTJ, C32113mPz.ActionBar.DbNXlk));
        mPS mps3 = this.copydefault;
        if (mps3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            mps2 = mps3;
        }
        mps2.AEQbTJ.addView(view);
        C33589mzM c33589mzM = new C33589mzM(this.AEQbTJ, false, z, i, this, recyclerView, arrayList, c33596mzT, interfaceC0886StateListAnimator, interfaceC0885Activity, null);
        recyclerView.setAdapter(c33589mzM);
        this.OLrzqt.add(c33589mzM);
    }

    public final void copydefault(@NotNull C33593mzQ c33593mzQ, boolean z, int i, @NotNull java.util.ArrayList<C33583mzG> arrayList, StateListAnimator.InterfaceC0886StateListAnimator interfaceC0886StateListAnimator, Activity.InterfaceC0885Activity interfaceC0885Activity) {
        Intrinsics.checkNotNullParameter(c33593mzQ, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        RecyclerView recyclerView = new RecyclerView(this.AEQbTJ);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this.AEQbTJ, arrayList.size()));
        recyclerView.addItemDecoration(new C31707mAy(C55298xhM.copydefault(13.0f, this.AEQbTJ), 0, 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iCopydefault = C55298xhM.copydefault(15.0f, this.AEQbTJ);
        layoutParams.setMarginStart(iCopydefault);
        layoutParams.setMarginEnd(iCopydefault);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setBackgroundColor(c33593mzQ.AEQbTJ());
        mPS mps = this.copydefault;
        if (mps == null) {
            Intrinsics.gEmmrt("");
            mps = null;
        }
        mps.AEQbTJ.addView(recyclerView);
        C33589mzM c33589mzM = new C33589mzM(this.AEQbTJ, false, z, i, this, recyclerView, arrayList, c33593mzQ, interfaceC0886StateListAnimator, interfaceC0885Activity, null);
        recyclerView.setAdapter(c33589mzM);
        this.OLrzqt.add(c33589mzM);
    }

    public final void AEQbTJ(@NotNull C33597mzU c33597mzU, boolean z, int i, @NotNull java.util.ArrayList<C33583mzG> arrayList, StateListAnimator.InterfaceC0886StateListAnimator interfaceC0886StateListAnimator, Activity.InterfaceC0885Activity interfaceC0885Activity) {
        Intrinsics.checkNotNullParameter(c33597mzU, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        RecyclerView recyclerView = new RecyclerView(this.AEQbTJ);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this.AEQbTJ, arrayList.size()));
        recyclerView.addItemDecoration(new C31707mAy(C55298xhM.copydefault(13.0f, this.AEQbTJ), 0, 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iCopydefault = C55298xhM.copydefault(15.0f, this.AEQbTJ);
        layoutParams.setMarginStart(iCopydefault);
        layoutParams.setMarginEnd(iCopydefault);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setBackgroundColor(c33597mzU.AEQbTJ());
        mPS mps = this.copydefault;
        if (mps == null) {
            Intrinsics.gEmmrt("");
            mps = null;
        }
        mps.AEQbTJ.addView(recyclerView);
        C33589mzM c33589mzM = new C33589mzM(this.AEQbTJ, false, z, i, this, recyclerView, arrayList, c33597mzU, interfaceC0886StateListAnimator, interfaceC0885Activity, null);
        recyclerView.setAdapter(c33589mzM);
        this.OLrzqt.add(c33589mzM);
    }

    public final android.view.View OLrzqt() {
        mPS mps = this.copydefault;
        if (mps == null) {
            Intrinsics.gEmmrt("");
            mps = null;
        }
        android.view.View root = mps.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public android.view.View AYXKKw() {
        mPS mps = this.copydefault;
        if (mps == null) {
            Intrinsics.gEmmrt("");
            mps = null;
        }
        android.view.View root = mps.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final void copydefault(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            AYXKKw().setBackgroundColor(ContextCompat.getColor(this.AEQbTJ, C32113mPz.ActionBar.QKVWgx));
        } else {
            AYXKKw().setBackground(drawable);
        }
    }

    public final void OLrzqt(boolean z, java.lang.Integer num, boolean z2, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        if (z) {
            C33584mzH c33584mzH = new C33584mzH(this.AEQbTJ, AYXKKw(), false, z2);
            this.EZpvd = c33584mzH;
            c33584mzH.setInputMethodMode(48);
            C33584mzH c33584mzH2 = this.EZpvd;
            if (c33584mzH2 != null) {
                c33584mzH2.EZpvd(drawable2);
            }
            if (num != null) {
                ViewGroup.LayoutParams layoutParams = AYXKKw().getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).width = num.intValue();
                    AYXKKw().setLayoutParams(layoutParams);
                }
            }
        }
        copydefault(drawable);
    }

    public static /* synthetic */ void show$default(AbstractC33586mzJ abstractC33586mzJ, android.view.View view, boolean z, int i, java.lang.Integer num, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        boolean z2 = (i3 & 2) != 0 ? false : z;
        int i4 = (i3 & 4) != 0 ? 0 : i;
        if ((i3 & 8) != 0) {
            num = null;
        }
        abstractC33586mzJ.KWHzl(view, z2, i4, num, (i3 & 16) != 0 ? 0 : i2);
    }

    public final void KWHzl(@NotNull android.view.View view, boolean z, int i, java.lang.Integer num, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        if (num != null) {
            if (num.intValue() == 1) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                ViewGroup.LayoutParams layoutParams = AYXKKw().getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).setMarginStart(iArr[0] - (view.getWidth() / 2));
                    AYXKKw().setLayoutParams(layoutParams);
                }
            } else if (num.intValue() == 3) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                ViewGroup.LayoutParams layoutParams2 = AYXKKw().getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.leftMargin = (iArr2[0] - AYXKKw().getLayoutParams().width) + view.getWidth() + i2;
                    layoutParams3.topMargin = i;
                    AYXKKw().setLayoutParams(layoutParams2);
                }
            } else if (num.intValue() == 8388611) {
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                ViewGroup.LayoutParams layoutParams4 = AYXKKw().getLayoutParams();
                if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                    layoutParams5.setMarginStart((iArr3[0] - AYXKKw().getLayoutParams().width) + view.getWidth() + i2);
                    layoutParams5.topMargin = i;
                    AYXKKw().setLayoutParams(layoutParams4);
                }
            }
        }
        C33584mzH c33584mzH = this.EZpvd;
        if (c33584mzH != null) {
            c33584mzH.AEQbTJ(z);
        }
        C33584mzH c33584mzH2 = this.EZpvd;
        if (c33584mzH2 != null) {
            c33584mzH2.setClippingEnabled(true);
        }
        C33584mzH c33584mzH3 = this.EZpvd;
        if (c33584mzH3 != null) {
            c33584mzH3.showAsDropDown(view, 0, i);
        }
    }

    public static /* synthetic */ void showAtLocation$default(AbstractC33586mzJ abstractC33586mzJ, android.view.View view, boolean z, int i, java.lang.Integer num, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAtLocation");
        }
        boolean z2 = (i3 & 2) != 0 ? false : z;
        int i4 = (i3 & 4) != 0 ? 0 : i;
        if ((i3 & 8) != 0) {
            num = null;
        }
        abstractC33586mzJ.OLrzqt(view, z2, i4, num, (i3 & 16) != 0 ? 0 : i2);
    }

    public final void OLrzqt(@NotNull android.view.View view, boolean z, int i, java.lang.Integer num, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (num != null) {
            if (num.intValue() == 1) {
                ViewGroup.LayoutParams layoutParams = AYXKKw().getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).setMarginStart(iArr[0] - (view.getWidth() / 2));
                    AYXKKw().setLayoutParams(layoutParams);
                }
            } else if (num.intValue() == 3) {
                ViewGroup.LayoutParams layoutParams2 = AYXKKw().getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams2).leftMargin = (iArr[0] - AYXKKw().getLayoutParams().width) + view.getWidth() + i2;
                    AYXKKw().setLayoutParams(layoutParams2);
                }
            } else if (num.intValue() == 8388611) {
                ViewGroup.LayoutParams layoutParams3 = AYXKKw().getLayoutParams();
                if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams3).setMarginStart((iArr[0] - AYXKKw().getLayoutParams().width) + view.getWidth() + i2);
                    AYXKKw().setLayoutParams(layoutParams3);
                }
            }
        }
        C33584mzH c33584mzH = this.EZpvd;
        if (c33584mzH != null) {
            c33584mzH.AEQbTJ(z);
        }
        C33584mzH c33584mzH2 = this.EZpvd;
        if (c33584mzH2 != null) {
            c33584mzH2.setClippingEnabled(false);
        }
        C33584mzH c33584mzH3 = this.EZpvd;
        if (c33584mzH3 != null) {
            c33584mzH3.showAtLocation(view, 0, 0, i + iArr[1] + view.getHeight());
        }
    }

    public final void EZpvd() {
        C33584mzH c33584mzH = this.EZpvd;
        if (c33584mzH != null) {
            c33584mzH.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.mzJ$StateListAnimator */
    public static final class StateListAnimator {
        public java.util.ArrayList<java.lang.Integer> AEQbTJ;
        public InterfaceC0886StateListAnimator AYXKKw;
        public AbstractC33592mzP.Application AhwBna;
        public java.util.ArrayList<AbstractC33587mzK> AkhnZx;
        public java.lang.Integer DbNXlk;
        public android.graphics.drawable.Drawable EZpvd;
        public java.util.ArrayList<C33583mzG> KWHzl;
        public boolean OLrzqt;
        public android.content.Context copydefault;
        public boolean djBIcL;
        public AbstractC33587mzK fetchVPNInfo;
        public boolean gEmmrt;
        public AbstractC33592mzP.Activity valueOf;
        public android.graphics.drawable.Drawable values;

        /* JADX INFO: renamed from: o.mzJ$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public interface InterfaceC0886StateListAnimator {
            void OLrzqt(int i, @NotNull java.util.ArrayList<C33583mzG> arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.content.Context AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC33587mzK AYXKKw() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC0886StateListAnimator AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<AbstractC33587mzK> DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.drawable.Drawable KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(InterfaceC0886StateListAnimator interfaceC0886StateListAnimator) {
            this.AYXKKw = interfaceC0886StateListAnimator;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull java.util.ArrayList<java.lang.Integer> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.AEQbTJ = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.util.ArrayList<C33583mzG> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.KWHzl = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(android.graphics.drawable.Drawable drawable) {
            this.EZpvd = drawable;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(boolean z) {
            this.OLrzqt = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC33592mzP.Activity djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.drawable.Drawable gEmmrt() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer isConnected() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC33592mzP.Application valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.djBIcL;
        }

        public final java.util.ArrayList<C33583mzG> OLrzqt() {
            java.util.ArrayList<C33583mzG> arrayList = this.KWHzl;
            if (arrayList != null) {
                return arrayList;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        public final java.util.ArrayList<java.lang.Integer> EZpvd() {
            java.util.ArrayList<java.lang.Integer> arrayList = this.AEQbTJ;
            if (arrayList != null) {
                return arrayList;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        public StateListAnimator(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.djBIcL = true;
            this.AkhnZx = new java.util.ArrayList<>();
            this.gEmmrt = true;
            this.copydefault = context;
        }

        public final StateListAnimator EZpvd(@NotNull AbstractC33587mzK abstractC33587mzK) {
            Intrinsics.checkNotNullParameter(abstractC33587mzK, "");
            this.AkhnZx.add(abstractC33587mzK);
            return this;
        }

        public final StateListAnimator KWHzl(@NotNull java.util.ArrayList<C33583mzG> arrayList, @NotNull java.util.ArrayList<java.lang.Integer> arrayList2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            OLrzqt(arrayList);
            KWHzl(arrayList2);
            return this;
        }

        public final C33595mzS copydefault() {
            return new C33595mzS(this);
        }
    }
}
