package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.uilab.util.TipTool;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C52812wZg;
import o.wYT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wZg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52812wZg {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public android.content.Context AYXKKw;
    public android.widget.TextView AhwBna;
    public ViewTreeObserverOnGlobalLayoutListenerC52808wZc AkhnZx;
    public C52794wYp AuCTel;
    public int DbNXlk;
    public java.lang.Integer EZpvd;
    public android.widget.RelativeLayout KWHzl;
    public android.view.View OLrzqt;
    public int djBIcL;
    public ConstraintLayout ejfBZ;
    public Function0<Unit> fARcdN;
    public C52794wYp fIwbmz;
    public Function0<Unit> fJNWhG;
    public android.widget.TextView fetchVPNInfo;
    public java.util.List<StateListAnimator> gEmmrt;
    public android.widget.TextView getFieldNames;
    public Function0<Unit> isConnected;
    public android.widget.LinearLayout iwGUEr;
    public TipTool valueOf;
    public android.widget.ImageView values;

    public static final void OLrzqt(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.isConnected = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.RelativeLayout AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52794wYp AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.fARcdN = function0;
    }

    public final C52812wZg KWHzl(int i) {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.fJNWhG = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52794wYp isConnected() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView values() {
        return this.getFieldNames;
    }

    public C52812wZg(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = context;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C52761wXj.Fragment.sSMYrx, (android.view.ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        this.OLrzqt = viewInflate;
        this.gEmmrt = new java.util.ArrayList();
        this.fetchVPNInfo = (android.widget.TextView) this.OLrzqt.findViewById(C52761wXj.FragmentManager.RgLUBD);
        this.values = (android.widget.ImageView) this.OLrzqt.findViewById(C52761wXj.FragmentManager.OFhtUX);
        this.AhwBna = (android.widget.TextView) this.OLrzqt.findViewById(C52761wXj.FragmentManager.gdmIOq);
        this.getFieldNames = (android.widget.TextView) this.OLrzqt.findViewById(C52761wXj.FragmentManager.DTeKQX);
        this.KWHzl = (android.widget.RelativeLayout) this.OLrzqt.findViewById(C52761wXj.FragmentManager.Ufzxmz);
        this.AuCTel = (C52794wYp) this.OLrzqt.findViewById(C52761wXj.FragmentManager.AuCTel);
        this.fIwbmz = (C52794wYp) this.OLrzqt.findViewById(C52761wXj.FragmentManager.ejfBZ);
        this.iwGUEr = (android.widget.LinearLayout) this.OLrzqt.findViewById(C52761wXj.FragmentManager.QOLQEE);
        this.ejfBZ = (ConstraintLayout) this.OLrzqt.findViewById(C52761wXj.FragmentManager.fetchVPNInfo);
        C52794wYp c52794wYp = this.AuCTel;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.wZi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52812wZg.djBIcL(this.KWHzl, view);
                }
            });
        }
        C52794wYp c52794wYp2 = this.fIwbmz;
        if (c52794wYp2 != null) {
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.wZk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52812wZg.gEmmrt(this.AEQbTJ, view);
                }
            });
        }
        android.widget.ImageView imageView = this.values;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.wZj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52812wZg.valueOf(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void djBIcL(C52812wZg c52812wZg, android.view.View view) {
        c52812wZg.OLrzqt();
    }

    public static final void gEmmrt(C52812wZg c52812wZg, android.view.View view) {
        c52812wZg.AEQbTJ();
    }

    public static final void valueOf(C52812wZg c52812wZg, android.view.View view) {
        Function0<Unit> function0;
        if (c52812wZg.djBIcL < c52812wZg.gEmmrt.size() - 1 && (function0 = c52812wZg.fJNWhG) != null) {
            function0.invoke();
        }
        TipTool tipTool = c52812wZg.valueOf;
        if (tipTool != null) {
            tipTool.OLrzqt();
        }
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = c52812wZg.AkhnZx;
        if (viewTreeObserverOnGlobalLayoutListenerC52808wZc != null) {
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.AYXKKw();
        }
        Function0<Unit> function02 = c52812wZg.fARcdN;
        if (function02 != null) {
            function02.invoke();
        }
    }

    public static /* synthetic */ C52812wZg showCloseImage$default(C52812wZg c52812wZg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c52812wZg.KWHzl(z);
    }

    public final C52812wZg KWHzl(boolean z) {
        android.widget.ImageView imageView = this.values;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
        android.widget.TextView textView = this.fetchVPNInfo;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.startToStart = 0;
                layoutParams2.setMarginEnd(z ? C55298xhM.OLrzqt(32, this.AYXKKw) : C55298xhM.OLrzqt(8, this.AYXKKw));
                textView.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        return this;
    }

    public static /* synthetic */ C52812wZg setDismissType$default(C52812wZg c52812wZg, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c52812wZg.OLrzqt(i);
    }

    public final C52812wZg OLrzqt(int i) {
        this.DbNXlk = i;
        copydefault(i == 0);
        C52794wYp c52794wYp = this.AuCTel;
        if (c52794wYp != null) {
            c52794wYp.setCompoundDrawablesRelative(null, null, null, null);
        }
        C52794wYp c52794wYp2 = this.fIwbmz;
        if (c52794wYp2 != null) {
            c52794wYp2.setCompoundDrawablesRelative(null, null, null, null);
        }
        android.widget.TextView textView = this.getFieldNames;
        if (textView != null) {
            textView.setVisibility(8);
        }
        KWHzl(false);
        if (i == 0) {
            android.widget.RelativeLayout relativeLayout = this.KWHzl;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
        } else if (i != 1) {
            if (i != 2) {
                C52794wYp c52794wYp3 = this.AuCTel;
                if (c52794wYp3 != null) {
                    c52794wYp3.setText("");
                }
                C52794wYp c52794wYp4 = this.fIwbmz;
                if (c52794wYp4 != null) {
                    c52794wYp4.setText("");
                }
                android.widget.TextView textView2 = this.getFieldNames;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                KWHzl(true);
                C52794wYp c52794wYp5 = this.fIwbmz;
                if (c52794wYp5 != null) {
                    c52794wYp5.setVisibility(8);
                }
                C52794wYp c52794wYp6 = this.AuCTel;
                if (c52794wYp6 != null) {
                    OLrzqt(c52794wYp6, ContextCompat.getDrawable(this.AYXKKw, C52761wXj.TaskDescription.DGOPHZDGOPHZ));
                }
                C52794wYp c52794wYp7 = this.fIwbmz;
                if (c52794wYp7 != null) {
                    OLrzqt(c52794wYp7, ContextCompat.getDrawable(this.AYXKKw, C52761wXj.TaskDescription.DWgRXt));
                }
            } else {
                android.widget.RelativeLayout relativeLayout2 = this.KWHzl;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
            }
        }
        return this;
    }

    public final void EZpvd() {
        C52794wYp c52794wYp;
        int i = this.djBIcL - 1;
        this.djBIcL = i;
        if (i < 0) {
            this.djBIcL = 0;
            return;
        }
        C52794wYp c52794wYp2 = this.AuCTel;
        if (c52794wYp2 != null) {
            OLrzqt(c52794wYp2, ContextCompat.getDrawable(c52794wYp2.getContext(), C52761wXj.TaskDescription.DGOPHZDGOPHZ));
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.wZl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52812wZg.isConnected(this.OLrzqt, view);
                }
            });
            c52794wYp2.setText("");
        }
        if (this.djBIcL == 0 && (c52794wYp = this.fIwbmz) != null) {
            c52794wYp.setVisibility(8);
        }
        TipTool tipTool = this.valueOf;
        if (tipTool != null) {
            tipTool.KWHzl((TipTool.ActionBar) null);
        }
        TipTool tipTool2 = this.valueOf;
        if (tipTool2 != null) {
            tipTool2.OLrzqt();
        }
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.AkhnZx;
        if (viewTreeObserverOnGlobalLayoutListenerC52808wZc != null) {
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.OLrzqt();
        }
        copydefault();
    }

    public static final void isConnected(C52812wZg c52812wZg, android.view.View view) {
        c52812wZg.OLrzqt();
    }

    public final void DbNXlk() {
        C52794wYp c52794wYp;
        int i = this.djBIcL + 1;
        this.djBIcL = i;
        if (i > this.gEmmrt.size() - 1) {
            this.djBIcL = this.gEmmrt.size() - 1;
            return;
        }
        if (this.djBIcL == this.gEmmrt.size() - 1 && (c52794wYp = this.AuCTel) != null) {
            c52794wYp.setCompoundDrawablesRelative(null, null, null, null);
            c52794wYp.setText(c52794wYp.getContext().getString(C33089mpq.EZpvd.copydefault()));
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.wZh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52812wZg.values(this.EZpvd, view);
                }
            });
        }
        C52794wYp c52794wYp2 = this.fIwbmz;
        if (c52794wYp2 != null) {
            c52794wYp2.setVisibility(0);
        }
        TipTool tipTool = this.valueOf;
        if (tipTool != null) {
            tipTool.OLrzqt();
        }
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.AkhnZx;
        if (viewTreeObserverOnGlobalLayoutListenerC52808wZc != null) {
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.EZpvd();
        }
        copydefault();
    }

    public static final void values(C52812wZg c52812wZg, android.view.View view) {
        c52812wZg.KWHzl();
        Function0<Unit> function0 = c52812wZg.isConnected;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void fARcdN() {
        if (this.gEmmrt.size() == 0) {
            return;
        }
        copydefault();
    }

    public final C52812wZg AEQbTJ(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.gEmmrt.add(stateListAnimator);
        fetchVPNInfo();
        EZpvd(stateListAnimator);
        return this;
    }

    public final C52812wZg EZpvd(@NotNull java.util.List<StateListAnimator> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<StateListAnimator> list2 = this.gEmmrt;
        list2.clear();
        list2.addAll(list);
        fetchVPNInfo();
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            EZpvd((StateListAnimator) it.next());
        }
        return this;
    }

    public final C52812wZg KWHzl() {
        this.gEmmrt.clear();
        TipTool tipTool = this.valueOf;
        if (tipTool != null) {
            tipTool.OLrzqt();
        }
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.AkhnZx;
        if (viewTreeObserverOnGlobalLayoutListenerC52808wZc != null) {
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.AYXKKw();
        }
        C52794wYp c52794wYp = this.AuCTel;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.wZd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52812wZg.fetchVPNInfo(this.OLrzqt, view);
                }
            });
        }
        return this;
    }

    public static final void fetchVPNInfo(C52812wZg c52812wZg, android.view.View view) {
        c52812wZg.OLrzqt();
    }

    public final void OLrzqt() {
        if (this.gEmmrt.isEmpty()) {
            return;
        }
        if (this.gEmmrt.get(this.djBIcL).fetchVPNInfo() != null) {
            Function0<java.lang.Boolean> function0FetchVPNInfo = this.gEmmrt.get(this.djBIcL).fetchVPNInfo();
            Intrinsics.copydefault(function0FetchVPNInfo);
            if (function0FetchVPNInfo.invoke().booleanValue()) {
                return;
            }
        }
        DbNXlk();
    }

    public final void AEQbTJ() {
        if (this.gEmmrt.get(this.djBIcL).gEmmrt() != null) {
            Function0<java.lang.Boolean> function0GEmmrt = this.gEmmrt.get(this.djBIcL).gEmmrt();
            Intrinsics.copydefault(function0GEmmrt);
            if (function0GEmmrt.invoke().booleanValue()) {
                return;
            }
        }
        EZpvd();
    }

    public final void copydefault() {
        android.view.ViewParent parent;
        android.view.ViewParent parent2;
        C52794wYp c52794wYp;
        if (this.OLrzqt.getParent() != null) {
            android.view.ViewParent parent3 = this.OLrzqt.getParent();
            Intrinsics.copydefault(parent3, "");
            ((android.view.ViewGroup) parent3).removeView(this.OLrzqt);
        }
        int i = this.djBIcL;
        TipTool tipToolOLrzqt = TipTool.Companion.KWHzl(this.gEmmrt.get(i).valueOf()).AEQbTJ(copydefault(this.gEmmrt.get(this.djBIcL).DbNXlk())).EZpvd(this.OLrzqt).KWHzl(ContextCompat.getColor(this.AYXKKw, C52761wXj.Activity.iUnTnt)).OLrzqt(ContextCompat.getColor(this.AYXKKw, C52761wXj.Activity.hKJZrr)).OLrzqt(this.gEmmrt.get(this.djBIcL).copydefault(), this.gEmmrt.get(this.djBIcL).OLrzqt(), this.gEmmrt.get(this.djBIcL).EZpvd(), this.gEmmrt.get(this.djBIcL).AEQbTJ());
        java.lang.Integer num = this.EZpvd;
        if (num != null) {
            tipToolOLrzqt.AEQbTJ(C55298xhM.OLrzqt(num.intValue(), this.AYXKKw));
        }
        this.valueOf = tipToolOLrzqt.KWHzl(new TaskDescription(i, this)).djBIcL();
        if (this.gEmmrt.size() == 1 && (c52794wYp = this.AuCTel) != null) {
            c52794wYp.setCompoundDrawablesRelative(null, null, null, null);
            c52794wYp.setText(c52794wYp.getContext().getString(C33089mpq.EZpvd.copydefault()));
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.wZe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52812wZg.AkhnZx(this.OLrzqt, view);
                }
            });
        }
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.AkhnZx;
        if (viewTreeObserverOnGlobalLayoutListenerC52808wZc != null) {
            if (this.DbNXlk == 0) {
                viewTreeObserverOnGlobalLayoutListenerC52808wZc.EZpvd(true);
            }
            int i2 = this.DbNXlk;
            if (i2 == 0 || i2 == 1) {
                TipTool tipTool = this.valueOf;
                if (tipTool != null) {
                    tipTool.AEQbTJ(20.0f);
                }
                int color = ContextCompat.getColor(this.AYXKKw, C52761wXj.Activity.aBDePw);
                viewTreeObserverOnGlobalLayoutListenerC52808wZc.KWHzl(color);
                viewTreeObserverOnGlobalLayoutListenerC52808wZc.AEQbTJ(color);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC52808wZc.KWHzl(ContextCompat.getColor(this.AYXKKw, C52761wXj.Activity.UscePu));
                viewTreeObserverOnGlobalLayoutListenerC52808wZc.AEQbTJ(ContextCompat.getColor(this.AYXKKw, C52761wXj.Activity.ORxRYg));
            }
            if (this.DbNXlk == 2) {
                viewTreeObserverOnGlobalLayoutListenerC52808wZc.EZpvd(new Activity());
            }
            if (this.DbNXlk != 0) {
                viewTreeObserverOnGlobalLayoutListenerC52808wZc.DbNXlk();
            }
        }
        fIwbmz();
        if (this.gEmmrt.get(this.djBIcL).AYXKKw() != null) {
            android.view.View viewAYXKKw = this.gEmmrt.get(this.djBIcL).AYXKKw();
            if (viewAYXKKw != null && (parent2 = viewAYXKKw.getParent()) != null) {
                ((android.view.ViewGroup) parent2).removeView(this.gEmmrt.get(this.djBIcL).AYXKKw());
            }
            android.widget.LinearLayout linearLayout = this.iwGUEr;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                linearLayout.addView(this.gEmmrt.get(this.djBIcL).AYXKKw());
            }
        } else {
            ConstraintLayout constraintLayout = this.ejfBZ;
            if (constraintLayout != null && (parent = constraintLayout.getParent()) != null) {
                ((android.view.ViewGroup) parent).removeView(this.ejfBZ);
            }
            android.widget.LinearLayout linearLayout2 = this.iwGUEr;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
                linearLayout2.addView(this.ejfBZ);
            }
            android.widget.TextView textView = this.fetchVPNInfo;
            if (textView != null) {
                C55307xhV.AEQbTJ(textView, this.gEmmrt.get(this.djBIcL).AhwBna());
            }
            android.widget.TextView textView2 = this.AhwBna;
            if (textView2 != null) {
                C55307xhV.AEQbTJ(textView2, this.gEmmrt.get(this.djBIcL).djBIcL());
            }
        }
        android.widget.TextView textView3 = this.getFieldNames;
        if (textView3 != null) {
            int i3 = this.djBIcL;
            textView3.setText((i3 + 1) + "/" + this.gEmmrt.size());
        }
    }

    /* JADX INFO: renamed from: o.wZg$TaskDescription */
    public static final class TaskDescription implements TipTool.ActionBar {
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ C52812wZg OLrzqt;

        public TaskDescription(int i, C52812wZg c52812wZg) {
            this.KWHzl = i;
            this.OLrzqt = c52812wZg;
        }

        @Override // com.okinc.uilab.util.TipTool.ActionBar
        public void AEQbTJ(android.view.View view) {
            Function0<Unit> function0GEmmrt;
            if (this.KWHzl < this.OLrzqt.gEmmrt.size() - 1 || (function0GEmmrt = this.OLrzqt.gEmmrt()) == null) {
                return;
            }
            function0GEmmrt.invoke();
        }
    }

    public static final void AkhnZx(C52812wZg c52812wZg, android.view.View view) {
        c52812wZg.KWHzl();
        Function0<Unit> function0 = c52812wZg.isConnected;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.wZg$Activity */
    public static final class Activity implements wYT.Activity {
        public Activity() {
        }

        @Override // o.wYT.Activity
        public void EZpvd(wYY wyy) {
            if (wyy != null) {
                final C52812wZg c52812wZg = C52812wZg.this;
                wyy.setOnClickHighlight(new Function0() { // from class: o.wZm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C52812wZg.Activity.OLrzqt(c52812wZg);
                    }
                });
            }
        }

        public static final Unit OLrzqt(C52812wZg c52812wZg) {
            ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = c52812wZg.AkhnZx;
            if (viewTreeObserverOnGlobalLayoutListenerC52808wZc != null) {
                viewTreeObserverOnGlobalLayoutListenerC52808wZc.AYXKKw();
            }
            TipTool tipTool = c52812wZg.valueOf;
            if (tipTool != null) {
                tipTool.OLrzqt();
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ TipTool.Position getRealPosition$default(C52812wZg c52812wZg, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c52812wZg.copydefault(i);
    }

    public final TipTool.Position copydefault(int i) {
        if (i == 0) {
            return TipTool.Position.END;
        }
        if (i == 1) {
            return TipTool.Position.BOTTOM;
        }
        if (i == 2) {
            return TipTool.Position.START;
        }
        return TipTool.Position.TOP;
    }

    public final void fIwbmz() {
        TipTool tipTool = this.valueOf;
        if (tipTool != null) {
            tipTool.EZpvd(this.AEQbTJ);
            tipTool.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.wZf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C52812wZg.OLrzqt(view);
                }
            });
        }
    }

    public final void OLrzqt(C52794wYp c52794wYp, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public final void fetchVPNInfo() {
        if (this.AkhnZx == null) {
            ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = new ViewTreeObserverOnGlobalLayoutListenerC52808wZc(this.AYXKKw);
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.EZpvd(false);
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.copydefault(true);
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.copydefault();
            this.AkhnZx = viewTreeObserverOnGlobalLayoutListenerC52808wZc;
        }
    }

    public final void EZpvd(StateListAnimator stateListAnimator) {
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.AkhnZx;
        if (viewTreeObserverOnGlobalLayoutListenerC52808wZc != null) {
            android.view.View rootView = stateListAnimator.valueOf().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "");
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.EZpvd(rootView);
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.OLrzqt(stateListAnimator.valueOf(), C52761wXj.Fragment.OcIXYQ, new ActionBar(), new C52822wZq(0.0f, 0.0f, 0.0f, stateListAnimator.copydefault(), stateListAnimator.OLrzqt(), stateListAnimator.EZpvd(), stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl(), stateListAnimator.KWHzl()));
        }
    }

    /* JADX INFO: renamed from: o.wZg$ActionBar */
    public static final class ActionBar extends C52823wZr {
        public ActionBar() {
            super(0.0f, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.wZg$StateListAnimator */
    public static final class StateListAnimator {
        public float AEQbTJ;
        public java.lang.CharSequence AYXKKw;
        public android.view.View AhwBna;
        public int DbNXlk;
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;
        public java.lang.CharSequence djBIcL;
        public Function0<java.lang.Boolean> gEmmrt;
        public android.view.View valueOf;
        public Function0<java.lang.Boolean> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(float f) {
            this.AEQbTJ = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(int i) {
            this.EZpvd = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.CharSequence charSequence) {
            this.djBIcL = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int DbNXlk() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.DbNXlk = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(int i) {
            this.KWHzl = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(Function0<java.lang.Boolean> function0) {
            this.gEmmrt = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.copydefault = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.CharSequence charSequence) {
            this.AYXKKw = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(Function0<java.lang.Boolean> function0) {
            this.values = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<java.lang.Boolean> fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<java.lang.Boolean> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View valueOf() {
            return this.AhwBna;
        }

        public StateListAnimator(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AhwBna = view;
        }
    }

    public static /* synthetic */ C52812wZg closeOnOutsideArea$default(C52812wZg c52812wZg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c52812wZg.copydefault(z);
    }

    public final C52812wZg copydefault(boolean z) {
        this.AEQbTJ = z;
        fIwbmz();
        return this;
    }

    public static /* synthetic */ C52812wZg setType$default(C52812wZg c52812wZg, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c52812wZg.KWHzl(i);
    }

    /* JADX INFO: renamed from: o.wZg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wZg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
