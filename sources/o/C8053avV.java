package o;

import android.animation.Animator;
import android.os.Build;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.immomo.mls.fun.constants.TextAlign;
import com.lzf.easyfloat.enums.ShowPattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C8114awd;
import o.C8132awv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.avV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8053avV {
    public final android.content.Context AEQbTJ;
    public android.view.WindowManager AYXKKw;
    public WindowManager.LayoutParams AhwBna;
    public int EZpvd;
    public C8055avX KWHzl;
    public android.animation.Animator OLrzqt;
    public C8132awv copydefault;
    public int djBIcL;
    public C8057avZ gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8132awv AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8055avX EZpvd() {
        return this.KWHzl;
    }

    public C8053avV(@NotNull android.content.Context context, @NotNull C8055avX c8055avX) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c8055avX, "");
        this.AEQbTJ = context;
        this.KWHzl = c8055avX;
        this.djBIcL = -1;
        this.EZpvd = -1;
    }

    public static final /* synthetic */ C8057avZ KWHzl(C8053avV c8053avV) {
        C8057avZ c8057avZ = c8053avV.gEmmrt;
        if (c8057avZ == null) {
            Intrinsics.gEmmrt("");
        }
        return c8057avZ;
    }

    public final android.view.WindowManager djBIcL() {
        android.view.WindowManager windowManager = this.AYXKKw;
        if (windowManager == null) {
            Intrinsics.gEmmrt("");
        }
        return windowManager;
    }

    public final WindowManager.LayoutParams gEmmrt() {
        WindowManager.LayoutParams layoutParams = this.AhwBna;
        if (layoutParams == null) {
            Intrinsics.gEmmrt("");
        }
        return layoutParams;
    }

    public final boolean AEQbTJ() {
        android.view.View viewFindViewById;
        if (AhwBna() == null) {
            android.content.Context context = this.AEQbTJ;
            android.app.Activity activityCopydefault = context instanceof android.app.Activity ? (android.app.Activity) context : C8127awq.copydefault.copydefault();
            if (activityCopydefault == null || (viewFindViewById = activityCopydefault.findViewById(android.R.id.content)) == null) {
                return false;
            }
            return viewFindViewById.post(new StateListAnimator());
        }
        return KWHzl();
    }

    /* JADX INFO: renamed from: o.avV$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8053avV.this.KWHzl();
        }
    }

    public final boolean KWHzl() {
        C8114awd.Application applicationKWHzl;
        yHO<java.lang.Boolean, java.lang.String, android.view.View, Unit> yhoOLrzqt;
        try {
            this.gEmmrt = new C8057avZ(this.AEQbTJ, this.KWHzl);
            isConnected();
            OLrzqt();
            this.KWHzl.AYXKKw(true);
            return true;
        } catch (java.lang.Exception e) {
            InterfaceC8111awa interfaceC8111awaOLrzqt = this.KWHzl.OLrzqt();
            if (interfaceC8111awaOLrzqt != null) {
                interfaceC8111awaOLrzqt.EZpvd(false, java.lang.String.valueOf(e), null);
            }
            C8114awd c8114awdAYXKKw = this.KWHzl.AYXKKw();
            if (c8114awdAYXKKw != null && (applicationKWHzl = c8114awdAYXKKw.KWHzl()) != null && (yhoOLrzqt = applicationKWHzl.OLrzqt()) != null) {
                yhoOLrzqt.invoke(java.lang.Boolean.FALSE, java.lang.String.valueOf(e), null);
            }
            return false;
        }
    }

    public final void isConnected() {
        java.lang.Object systemService = this.AEQbTJ.getSystemService("window");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        this.AYXKKw = (android.view.WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (this.KWHzl.uzCIH() == ShowPattern.CURRENT_ACTIVITY) {
            layoutParams.type = 1000;
            layoutParams.token = AhwBna();
        } else {
            layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED;
        }
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.flags = this.KWHzl.AkhnZx() ? 552 : 40;
        layoutParams.width = this.KWHzl.AubY() ? -1 : -2;
        layoutParams.height = this.KWHzl.isConnected() ? -1 : -2;
        if (this.KWHzl.AkhnZx() && this.KWHzl.isConnected()) {
            layoutParams.height = C8124awn.EZpvd.OLrzqt(this.AEQbTJ);
        }
        if (true ^ Intrinsics.EZpvd(this.KWHzl.AuCTel(), new kotlin.Pair(0, 0))) {
            layoutParams.x = this.KWHzl.AuCTel().getFirst().intValue();
            layoutParams.y = this.KWHzl.AuCTel().getSecond().intValue();
        }
        Unit unit = Unit.INSTANCE;
        this.AhwBna = layoutParams;
    }

    public final android.os.IBinder AhwBna() {
        android.view.Window window;
        android.view.View decorView;
        android.content.Context context = this.AEQbTJ;
        android.app.Activity activityCopydefault = context instanceof android.app.Activity ? (android.app.Activity) context : C8127awq.copydefault.copydefault();
        if (activityCopydefault == null || (window = activityCopydefault.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getWindowToken();
    }

    public final void OLrzqt() {
        C8132awv c8132awv = new C8132awv(this.AEQbTJ, this.KWHzl, null, 0, 12, null);
        this.copydefault = c8132awv;
        c8132awv.setTag(this.KWHzl.djBIcL());
        android.view.View viewFJNWhG = this.KWHzl.fJNWhG();
        if (viewFJNWhG != null) {
            C8132awv c8132awv2 = this.copydefault;
            if (c8132awv2 != null) {
                c8132awv2.addView(viewFJNWhG);
            }
        } else {
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.AEQbTJ);
            java.lang.Integer numEjfBZ = this.KWHzl.ejfBZ();
            Intrinsics.copydefault(numEjfBZ);
            viewFJNWhG = layoutInflaterFrom.inflate(numEjfBZ.intValue(), (android.view.ViewGroup) this.copydefault, true);
        }
        Intrinsics.checkNotNullExpressionValue(viewFJNWhG, "");
        viewFJNWhG.setVisibility(4);
        android.view.WindowManager windowManager = this.AYXKKw;
        if (windowManager == null) {
            Intrinsics.gEmmrt("");
        }
        C8132awv c8132awv3 = this.copydefault;
        WindowManager.LayoutParams layoutParams = this.AhwBna;
        if (layoutParams == null) {
            Intrinsics.gEmmrt("");
        }
        windowManager.addView(c8132awv3, layoutParams);
        C8132awv c8132awv4 = this.copydefault;
        if (c8132awv4 != null) {
            c8132awv4.setTouchListener(new TaskDescription());
        }
        C8132awv c8132awv5 = this.copydefault;
        if (c8132awv5 != null) {
            c8132awv5.setLayoutListener(new Application(viewFJNWhG));
        }
        fetchVPNInfo();
    }

    /* JADX INFO: renamed from: o.avV$TaskDescription */
    public static final class TaskDescription implements InterfaceC8113awc {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        @Override // o.InterfaceC8113awc
        public void copydefault(@NotNull android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            C8057avZ c8057avZKWHzl = C8053avV.KWHzl(C8053avV.this);
            C8132awv c8132awvAYXKKw = C8053avV.this.AYXKKw();
            Intrinsics.copydefault(c8132awvAYXKKw);
            c8057avZKWHzl.OLrzqt(c8132awvAYXKKw, motionEvent, C8053avV.this.djBIcL(), C8053avV.this.gEmmrt());
        }
    }

    /* JADX INFO: renamed from: o.avV$Application */
    public static final class Application implements C8132awv.TaskDescription {
        public final /* synthetic */ android.view.View EZpvd;

        public Application(android.view.View view) {
            this.EZpvd = view;
        }

        @Override // o.C8132awv.TaskDescription
        public void copydefault() {
            C8114awd.Application applicationKWHzl;
            yHO<java.lang.Boolean, java.lang.String, android.view.View, Unit> yhoOLrzqt;
            C8053avV c8053avV = C8053avV.this;
            c8053avV.AEQbTJ(c8053avV.AYXKKw());
            C8053avV c8053avV2 = C8053avV.this;
            C8132awv c8132awvAYXKKw = c8053avV2.AYXKKw();
            c8053avV2.djBIcL = c8132awvAYXKKw != null ? c8132awvAYXKKw.getMeasuredWidth() : -1;
            C8053avV c8053avV3 = C8053avV.this;
            C8132awv c8132awvAYXKKw2 = c8053avV3.AYXKKw();
            c8053avV3.EZpvd = c8132awvAYXKKw2 != null ? c8132awvAYXKKw2.getMeasuredHeight() : -1;
            C8055avX c8055avXEZpvd = C8053avV.this.EZpvd();
            if (c8055avXEZpvd.KWHzl() || ((c8055avXEZpvd.uzCIH() == ShowPattern.BACKGROUND && C8127awq.copydefault.EZpvd()) || (c8055avXEZpvd.uzCIH() == ShowPattern.FOREGROUND && !C8127awq.copydefault.EZpvd()))) {
                C8053avV.setVisible$default(C8053avV.this, 8, false, 2, null);
                C8053avV.this.valueOf();
            } else {
                C8053avV c8053avV4 = C8053avV.this;
                android.view.View view = this.EZpvd;
                Intrinsics.checkNotNullExpressionValue(view, "");
                c8053avV4.OLrzqt(view);
            }
            c8055avXEZpvd.AEQbTJ(this.EZpvd);
            InterfaceC8118awh interfaceC8118awhFetchVPNInfo = c8055avXEZpvd.fetchVPNInfo();
            if (interfaceC8118awhFetchVPNInfo != null) {
                interfaceC8118awhFetchVPNInfo.KWHzl(this.EZpvd);
            }
            InterfaceC8111awa interfaceC8111awaOLrzqt = c8055avXEZpvd.OLrzqt();
            if (interfaceC8111awaOLrzqt != null) {
                interfaceC8111awaOLrzqt.EZpvd(true, null, this.EZpvd);
            }
            C8114awd c8114awdAYXKKw = c8055avXEZpvd.AYXKKw();
            if (c8114awdAYXKKw == null || (applicationKWHzl = c8114awdAYXKKw.KWHzl()) == null || (yhoOLrzqt = applicationKWHzl.OLrzqt()) == null) {
                return;
            }
            yhoOLrzqt.invoke(java.lang.Boolean.TRUE, null, this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.avV$Fragment */
    public static final class Fragment implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C8132awv EZpvd;
        public final /* synthetic */ C8053avV KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(C8132awv c8132awv, C8053avV c8053avV) {
            this.EZpvd = c8132awv;
            this.KWHzl = c8053avV;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            boolean z = false;
            boolean z2 = this.KWHzl.djBIcL == -1 || this.KWHzl.EZpvd == -1;
            if (this.KWHzl.djBIcL == this.EZpvd.getMeasuredWidth() && this.KWHzl.EZpvd == this.EZpvd.getMeasuredHeight()) {
                z = true;
            }
            if (z2 || z) {
                return;
            }
            if ((this.KWHzl.EZpvd().values() & 8388611) != 8388611) {
                if ((this.KWHzl.EZpvd().values() & 8388613) == 8388613) {
                    this.KWHzl.gEmmrt().x -= this.EZpvd.getMeasuredWidth() - this.KWHzl.djBIcL;
                } else if ((this.KWHzl.EZpvd().values() & 1) == 1 || (this.KWHzl.EZpvd().values() & 17) == 17) {
                    int i = this.KWHzl.djBIcL / 2;
                    int measuredWidth = this.EZpvd.getMeasuredWidth() / 2;
                    this.KWHzl.gEmmrt().x += i - measuredWidth;
                }
            }
            if ((this.KWHzl.EZpvd().values() & 48) != 48) {
                if ((this.KWHzl.EZpvd().values() & 80) == 80) {
                    this.KWHzl.gEmmrt().y -= this.EZpvd.getMeasuredHeight() - this.KWHzl.EZpvd;
                } else if ((this.KWHzl.EZpvd().values() & 16) == 16 || (this.KWHzl.EZpvd().values() & 17) == 17) {
                    int i2 = this.KWHzl.EZpvd / 2;
                    int measuredHeight = this.EZpvd.getMeasuredHeight() / 2;
                    this.KWHzl.gEmmrt().y += i2 - measuredHeight;
                }
            }
            this.KWHzl.djBIcL = this.EZpvd.getMeasuredWidth();
            this.KWHzl.EZpvd = this.EZpvd.getMeasuredHeight();
            this.KWHzl.djBIcL().updateViewLayout(this.KWHzl.AYXKKw(), this.KWHzl.gEmmrt());
        }
    }

    public final void fetchVPNInfo() {
        android.view.ViewTreeObserver viewTreeObserver;
        C8132awv c8132awv = this.copydefault;
        if (c8132awv == null || (viewTreeObserver = c8132awv.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new Fragment(c8132awv, this));
    }

    public final void valueOf() {
        C8132awv c8132awv;
        if (!this.KWHzl.DbNXlk() || (c8132awv = this.copydefault) == null) {
            return;
        }
        copydefault(c8132awv);
    }

    public final void copydefault(android.view.View view) {
        if (view != null) {
            if (!(view instanceof android.view.ViewGroup)) {
                EZpvd(view);
                return;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof android.view.ViewGroup) {
                    copydefault(childAt);
                } else {
                    Intrinsics.checkNotNullExpressionValue(childAt, "");
                    EZpvd(childAt);
                }
            }
        }
    }

    public final void EZpvd(android.view.View view) {
        if (view instanceof android.widget.EditText) {
            C8129aws.KWHzl.AEQbTJ((android.widget.EditText) view, this.KWHzl.djBIcL());
        }
    }

    public final void AEQbTJ(android.view.View view) {
        if ((!Intrinsics.EZpvd(this.KWHzl.AuCTel(), new kotlin.Pair(0, 0))) || view == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.WindowManager windowManager = this.AYXKKw;
        if (windowManager == null) {
            Intrinsics.gEmmrt("");
        }
        windowManager.getDefaultDisplay().getRectSize(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        WindowManager.LayoutParams layoutParams = this.AhwBna;
        if (layoutParams == null) {
            Intrinsics.gEmmrt("");
        }
        int iCopydefault = i > layoutParams.y ? C8124awn.EZpvd.copydefault(view) : 0;
        int iEZpvd = this.KWHzl.AEQbTJ().EZpvd(this.AEQbTJ) - iCopydefault;
        switch (this.KWHzl.AhwBna()) {
            case 1:
            case 49:
                WindowManager.LayoutParams layoutParams2 = this.AhwBna;
                if (layoutParams2 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams2.x = (rect.right - view.getWidth()) >> 1;
                break;
            case 5:
            case 53:
            case 8388613:
            case 8388661:
                WindowManager.LayoutParams layoutParams3 = this.AhwBna;
                if (layoutParams3 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams3.x = rect.right - view.getWidth();
                break;
            case 16:
            case 19:
            case TextAlign.LEFT /* 8388627 */:
                WindowManager.LayoutParams layoutParams4 = this.AhwBna;
                if (layoutParams4 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams4.y = (iEZpvd - view.getHeight()) >> 1;
                break;
            case 17:
                WindowManager.LayoutParams layoutParams5 = this.AhwBna;
                if (layoutParams5 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams5.x = (rect.right - view.getWidth()) >> 1;
                WindowManager.LayoutParams layoutParams6 = this.AhwBna;
                if (layoutParams6 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams6.y = (iEZpvd - view.getHeight()) >> 1;
                break;
            case 21:
            case TextAlign.RIGHT /* 8388629 */:
                WindowManager.LayoutParams layoutParams7 = this.AhwBna;
                if (layoutParams7 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams7.x = rect.right - view.getWidth();
                WindowManager.LayoutParams layoutParams8 = this.AhwBna;
                if (layoutParams8 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams8.y = (iEZpvd - view.getHeight()) >> 1;
                break;
            case 80:
            case 83:
            case 8388691:
                WindowManager.LayoutParams layoutParams9 = this.AhwBna;
                if (layoutParams9 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams9.y = iEZpvd - view.getHeight();
                break;
            case 81:
                WindowManager.LayoutParams layoutParams10 = this.AhwBna;
                if (layoutParams10 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams10.x = (rect.right - view.getWidth()) >> 1;
                WindowManager.LayoutParams layoutParams11 = this.AhwBna;
                if (layoutParams11 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams11.y = iEZpvd - view.getHeight();
                break;
            case 85:
            case 8388693:
                WindowManager.LayoutParams layoutParams12 = this.AhwBna;
                if (layoutParams12 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams12.x = rect.right - view.getWidth();
                WindowManager.LayoutParams layoutParams13 = this.AhwBna;
                if (layoutParams13 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams13.y = iEZpvd - view.getHeight();
                break;
        }
        WindowManager.LayoutParams layoutParams14 = this.AhwBna;
        if (layoutParams14 == null) {
            Intrinsics.gEmmrt("");
        }
        layoutParams14.x += this.KWHzl.hDKMBd().getFirst().intValue();
        WindowManager.LayoutParams layoutParams15 = this.AhwBna;
        if (layoutParams15 == null) {
            Intrinsics.gEmmrt("");
        }
        layoutParams15.y += this.KWHzl.hDKMBd().getSecond().intValue();
        if (this.KWHzl.AkhnZx()) {
            if (this.KWHzl.uzCIH() != ShowPattern.CURRENT_ACTIVITY) {
                WindowManager.LayoutParams layoutParams16 = this.AhwBna;
                if (layoutParams16 == null) {
                    Intrinsics.gEmmrt("");
                }
                layoutParams16.y -= iCopydefault;
            }
        } else if (this.KWHzl.uzCIH() == ShowPattern.CURRENT_ACTIVITY) {
            WindowManager.LayoutParams layoutParams17 = this.AhwBna;
            if (layoutParams17 == null) {
                Intrinsics.gEmmrt("");
            }
            layoutParams17.y += iCopydefault;
        }
        android.view.WindowManager windowManager2 = this.AYXKKw;
        if (windowManager2 == null) {
            Intrinsics.gEmmrt("");
        }
        WindowManager.LayoutParams layoutParams18 = this.AhwBna;
        if (layoutParams18 == null) {
            Intrinsics.gEmmrt("");
        }
        windowManager2.updateViewLayout(view, layoutParams18);
    }

    public static /* synthetic */ void setVisible$default(C8053avV c8053avV, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        c8053avV.KWHzl(i, z);
    }

    public final void KWHzl(int i, boolean z) {
        C8114awd.Application applicationKWHzl;
        Function1<android.view.View, Unit> function1Copydefault;
        C8114awd.Application applicationKWHzl2;
        Function1<android.view.View, Unit> function1AhwBna;
        C8132awv c8132awv = this.copydefault;
        if (c8132awv != null) {
            Intrinsics.copydefault(c8132awv);
            if (c8132awv.getChildCount() < 1) {
                return;
            }
            this.KWHzl.KWHzl(z);
            C8132awv c8132awv2 = this.copydefault;
            Intrinsics.copydefault(c8132awv2);
            c8132awv2.setVisibility(i);
            C8132awv c8132awv3 = this.copydefault;
            Intrinsics.copydefault(c8132awv3);
            android.view.View childAt = c8132awv3.getChildAt(0);
            if (i == 0) {
                this.KWHzl.AYXKKw(true);
                InterfaceC8111awa interfaceC8111awaOLrzqt = this.KWHzl.OLrzqt();
                if (interfaceC8111awaOLrzqt != null) {
                    Intrinsics.checkNotNullExpressionValue(childAt, "");
                    interfaceC8111awaOLrzqt.EZpvd(childAt);
                }
                C8114awd c8114awdAYXKKw = this.KWHzl.AYXKKw();
                if (c8114awdAYXKKw == null || (applicationKWHzl2 = c8114awdAYXKKw.KWHzl()) == null || (function1AhwBna = applicationKWHzl2.AhwBna()) == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                function1AhwBna.invoke(childAt);
                return;
            }
            this.KWHzl.AYXKKw(false);
            InterfaceC8111awa interfaceC8111awaOLrzqt2 = this.KWHzl.OLrzqt();
            if (interfaceC8111awaOLrzqt2 != null) {
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                interfaceC8111awaOLrzqt2.copydefault(childAt);
            }
            C8114awd c8114awdAYXKKw2 = this.KWHzl.AYXKKw();
            if (c8114awdAYXKKw2 == null || (applicationKWHzl = c8114awdAYXKKw2.KWHzl()) == null || (function1Copydefault = applicationKWHzl.copydefault()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            function1Copydefault.invoke(childAt);
        }
    }

    public final void OLrzqt(android.view.View view) {
        if (this.copydefault == null || this.KWHzl.zsXlph()) {
            return;
        }
        C8132awv c8132awv = this.copydefault;
        Intrinsics.copydefault(c8132awv);
        WindowManager.LayoutParams layoutParams = this.AhwBna;
        if (layoutParams == null) {
            Intrinsics.gEmmrt("");
        }
        android.view.WindowManager windowManager = this.AYXKKw;
        if (windowManager == null) {
            Intrinsics.gEmmrt("");
        }
        android.animation.Animator animatorKWHzl = new C8052avU(c8132awv, layoutParams, windowManager, this.KWHzl).KWHzl();
        if (animatorKWHzl != null) {
            WindowManager.LayoutParams layoutParams2 = this.AhwBna;
            if (layoutParams2 == null) {
                Intrinsics.gEmmrt("");
            }
            layoutParams2.flags = 552;
            animatorKWHzl.addListener(new ActionBar(view));
            animatorKWHzl.start();
            Unit unit = Unit.INSTANCE;
        } else {
            animatorKWHzl = null;
        }
        this.OLrzqt = animatorKWHzl;
        if (animatorKWHzl == null) {
            view.setVisibility(0);
            android.view.WindowManager windowManager2 = this.AYXKKw;
            if (windowManager2 == null) {
                Intrinsics.gEmmrt("");
            }
            WindowManager.LayoutParams layoutParams3 = this.AhwBna;
            if (layoutParams3 == null) {
                Intrinsics.gEmmrt("");
            }
            windowManager2.updateViewLayout(view, layoutParams3);
        }
    }

    /* JADX INFO: renamed from: o.avV$ActionBar */
    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View OLrzqt;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        public ActionBar(android.view.View view) {
            this.OLrzqt = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            C8053avV.this.EZpvd().copydefault(false);
            if (!C8053avV.this.EZpvd().AkhnZx()) {
                C8053avV.this.gEmmrt().flags = 40;
            }
            C8053avV.this.valueOf();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            this.OLrzqt.setVisibility(0);
            C8053avV.this.EZpvd().copydefault(true);
        }
    }

    public final void copydefault() {
        if (this.copydefault != null) {
            if (this.KWHzl.zsXlph() && this.OLrzqt == null) {
                return;
            }
            android.animation.Animator animator = this.OLrzqt;
            if (animator != null) {
                animator.cancel();
            }
            C8132awv c8132awv = this.copydefault;
            Intrinsics.copydefault(c8132awv);
            WindowManager.LayoutParams layoutParams = this.AhwBna;
            if (layoutParams == null) {
                Intrinsics.gEmmrt("");
            }
            android.view.WindowManager windowManager = this.AYXKKw;
            if (windowManager == null) {
                Intrinsics.gEmmrt("");
            }
            android.animation.Animator animatorOLrzqt = new C8052avU(c8132awv, layoutParams, windowManager, this.KWHzl).OLrzqt();
            if (animatorOLrzqt == null) {
                remove$default(this, false, 1, null);
                return;
            }
            if (this.KWHzl.zsXlph()) {
                return;
            }
            this.KWHzl.copydefault(true);
            WindowManager.LayoutParams layoutParams2 = this.AhwBna;
            if (layoutParams2 == null) {
                Intrinsics.gEmmrt("");
            }
            layoutParams2.flags = 552;
            animatorOLrzqt.addListener(new Activity());
            animatorOLrzqt.start();
        }
    }

    /* JADX INFO: renamed from: o.avV$Activity */
    public static final class Activity implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            C8053avV.remove$default(C8053avV.this, false, 1, null);
        }
    }

    public static /* synthetic */ void remove$default(C8053avV c8053avV, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c8053avV.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        try {
            this.KWHzl.copydefault(false);
            C8056avY.OLrzqt.OLrzqt(this.KWHzl.djBIcL());
            android.view.WindowManager windowManager = this.AYXKKw;
            if (windowManager == null) {
                Intrinsics.gEmmrt("");
            }
            if (z) {
                windowManager.removeViewImmediate(this.copydefault);
            } else {
                windowManager.removeView(this.copydefault);
            }
        } catch (java.lang.Exception e) {
            C8130awt.OLrzqt.OLrzqt("浮窗关闭出现异常：" + e);
        }
    }

    /* JADX INFO: renamed from: o.avV$FragmentManager */
    public static final class FragmentManager implements java.lang.Runnable {
        public final /* synthetic */ C8053avV AEQbTJ;
        public final /* synthetic */ C8132awv EZpvd;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(C8132awv c8132awv, C8053avV c8053avV, int i, int i2) {
            this.EZpvd = c8132awv;
            this.AEQbTJ = c8053avV;
            this.OLrzqt = i;
            this.copydefault = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8053avV.KWHzl(this.AEQbTJ).EZpvd(this.EZpvd, this.AEQbTJ.gEmmrt(), this.AEQbTJ.djBIcL());
        }
    }

    public final void OLrzqt(int i, int i2) {
        C8132awv c8132awv = this.copydefault;
        if (c8132awv != null) {
            if (i == -1 && i2 == -1) {
                c8132awv.postDelayed(new FragmentManager(c8132awv, this, i, i2), 200L);
                return;
            }
            WindowManager.LayoutParams layoutParams = this.AhwBna;
            if (layoutParams == null) {
                Intrinsics.gEmmrt("");
            }
            layoutParams.x = i;
            WindowManager.LayoutParams layoutParams2 = this.AhwBna;
            if (layoutParams2 == null) {
                Intrinsics.gEmmrt("");
            }
            layoutParams2.y = i2;
            android.view.WindowManager windowManager = this.AYXKKw;
            if (windowManager == null) {
                Intrinsics.gEmmrt("");
            }
            WindowManager.LayoutParams layoutParams3 = this.AhwBna;
            if (layoutParams3 == null) {
                Intrinsics.gEmmrt("");
            }
            windowManager.updateViewLayout(c8132awv, layoutParams3);
        }
    }
}
