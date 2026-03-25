package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.unify_trade.bot.market_place.search.SearchStrategyHistorySource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vtx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51808vtx extends android.widget.FrameLayout {
    public android.widget.ImageView AEQbTJ;
    public java.util.ArrayList<SearchStrategyHistorySource> EZpvd;
    public Function1<? super java.lang.String, Unit> OLrzqt;
    public C51806vtv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickItemListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51808vtx(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51808vtx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51808vtx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    public final void AEQbTJ() {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.OqhRBMiKdSzF, this);
        this.AEQbTJ = viewInflate != null ? (android.widget.ImageView) viewInflate.findViewById(C48033uCm.Application.invokeSuspend) : null;
        C51806vtv c51806vtv = viewInflate != null ? (C51806vtv) viewInflate.findViewById(C48033uCm.Application.onEvent) : null;
        this.copydefault = c51806vtv;
        if (c51806vtv != null) {
            c51806vtv.setMaxLine(100);
        }
        android.widget.ImageView imageView = this.AEQbTJ;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.vty
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51808vtx.AhwBna(this.EZpvd, view);
                }
            });
        }
        OLrzqt();
    }

    public static final void AhwBna(C51808vtx c51808vtx, android.view.View view) {
        c51808vtx.EZpvd();
    }

    public final void EZpvd(@NotNull java.util.ArrayList<SearchStrategyHistorySource> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.EZpvd = arrayList;
        C51806vtv c51806vtv = this.copydefault;
        if (c51806vtv != null) {
            c51806vtv.removeAllViews();
        }
        java.util.ArrayList<SearchStrategyHistorySource> arrayList2 = this.EZpvd;
        if (arrayList2 != null) {
            for (final SearchStrategyHistorySource searchStrategyHistorySource : arrayList2) {
                android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.invokespecialaKhcqp, (android.view.ViewGroup) this.copydefault, false);
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.getEnabledChangedCallbackactivity_release);
                if (textView != null) {
                    textView.setText(java.lang.String.valueOf(searchStrategyHistorySource.getName()));
                }
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.vtE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C51808vtx.OLrzqt(this.EZpvd, searchStrategyHistorySource, view);
                    }
                });
                C51806vtv c51806vtv2 = this.copydefault;
                if (c51806vtv2 != null) {
                    c51806vtv2.addView(viewInflate);
                }
            }
        }
    }

    public static final void OLrzqt(C51808vtx c51808vtx, SearchStrategyHistorySource searchStrategyHistorySource, android.view.View view) {
        Function1<? super java.lang.String, Unit> function1 = c51808vtx.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.String.valueOf(searchStrategyHistorySource.getName()));
        }
    }

    public static /* synthetic */ void addLastView$default(C51808vtx c51808vtx, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        c51808vtx.EZpvd(bool);
    }

    public final void EZpvd(java.lang.Boolean bool) {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.invokespecialaVhqwO, (android.view.ViewGroup) this.copydefault, false);
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C48033uCm.Application.ImmLeaksCleaner);
        Intrinsics.copydefault(bool);
        if (!bool.booleanValue()) {
            if (imageView != null) {
                imageView.setImageResource(C48033uCm.ActionBar.ejfBZ);
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.vtw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51808vtx.OLrzqt(this.KWHzl, view);
                }
            });
        } else {
            if (imageView != null) {
                imageView.setImageResource(C48033uCm.ActionBar.fJNWhG);
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.vtz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51808vtx.AEQbTJ(this.copydefault, view);
                }
            });
        }
        C51806vtv c51806vtv = this.copydefault;
        if (c51806vtv != null) {
            c51806vtv.addView(viewInflate);
        }
    }

    public static final void OLrzqt(C51808vtx c51808vtx, android.view.View view) {
        c51808vtx.copydefault();
    }

    public static final void AEQbTJ(C51808vtx c51808vtx, android.view.View view) {
        c51808vtx.OLrzqt();
    }

    public final void copydefault() {
        java.util.ArrayList<SearchStrategyHistorySource> arrayListEZpvd = C55945xtX.OLrzqt.EZpvd();
        C51806vtv c51806vtv = this.copydefault;
        if (c51806vtv != null) {
            c51806vtv.removeAllViews();
        }
        EZpvd(arrayListEZpvd);
        if (KWHzl()) {
            EZpvd(java.lang.Boolean.TRUE);
        }
    }

    public final void OLrzqt() {
        java.util.ArrayList<SearchStrategyHistorySource> arrayListKWHzl = C55945xtX.OLrzqt.KWHzl(10);
        C51806vtv c51806vtv = this.copydefault;
        if (c51806vtv != null) {
            c51806vtv.removeAllViews();
        }
        EZpvd(arrayListKWHzl);
        if (KWHzl()) {
            EZpvd(java.lang.Boolean.FALSE);
        }
        setVisibility(arrayListKWHzl.isEmpty() ^ true ? 0 : 8);
    }

    public final boolean KWHzl() {
        java.util.ArrayList<SearchStrategyHistorySource> arrayListEZpvd = C55945xtX.OLrzqt.EZpvd();
        return C33129mqd.KWHzl((java.util.Collection) arrayListEZpvd) && arrayListEZpvd.size() > 10;
    }

    public final void AYXKKw() {
        OLrzqt();
    }

    public final void EZpvd() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.OAjjVP));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.aWuQzD), new View.OnClickListener() { // from class: o.vtB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51808vtx.KWHzl(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(ContextCompat.getColor(viewOnClickListenerC54939xaY.getContext(), C52761wXj.Activity.DGOPHZ));
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.processStrongAuthMessage);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string, new View.OnClickListener() { // from class: o.vtA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51808vtx.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(C51808vtx c51808vtx, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C55945xtX c55945xtX = C55945xtX.OLrzqt;
        if (c55945xtX != null) {
            c55945xtX.AEQbTJ();
        }
        c51808vtx.OLrzqt();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
