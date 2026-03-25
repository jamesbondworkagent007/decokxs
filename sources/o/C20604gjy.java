package o;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.wallet.transfer.ButtonType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gjy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20604gjy extends AbstractC20512giL<C20598gjs> {
    public final boolean AEQbTJ;
    public final Function1<C20598gjs, Unit> EZpvd;
    public final boolean copydefault;

    /* JADX INFO: renamed from: o.gjy$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.CREATE_ACCOUNT_BUTTON.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.ACTIVE_BUTTON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.gjs, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C20604gjy(boolean z, boolean z2, @NotNull Function1<? super C20598gjs, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = z;
        this.AEQbTJ = z2;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16908esm> c43312rms, @NotNull final C20598gjs c20598gjs) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c20598gjs, "");
        super.onBindViewHolder((C43312rms) c43312rms, c20598gjs);
        ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt, "");
        AbstractC20512giL.AEQbTJ((AbstractC16908esm) viewDataBindingOLrzqt, c20598gjs.DbNXlk(), c20598gjs.AhwBna());
        ViewDataBinding viewDataBindingOLrzqt2 = c43312rms.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt2, "");
        AbstractC20512giL.copydefault((AbstractC16908esm) viewDataBindingOLrzqt2, 0);
        ViewDataBinding viewDataBindingOLrzqt3 = c43312rms.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt3, "");
        AbstractC20512giL.AEQbTJ((AbstractC16908esm) viewDataBindingOLrzqt3, c20598gjs.values(), c20598gjs.isConnected());
        ViewDataBinding viewDataBindingOLrzqt4 = c43312rms.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt4, "");
        AbstractC20512giL.OLrzqt((AbstractC16908esm) viewDataBindingOLrzqt4, c20598gjs.AkhnZx());
        int i = StateListAnimator.EZpvd[c20598gjs.AEQbTJ().ordinal()];
        if (i == 1) {
            ViewDataBinding viewDataBindingOLrzqt5 = c43312rms.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt5, "");
            AbstractC20512giL.EZpvd((AbstractC16908esm) viewDataBindingOLrzqt5, c20598gjs.fJNWhG().DbNXlk());
        } else if (i == 2) {
            ViewDataBinding viewDataBindingOLrzqt6 = c43312rms.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt6, "");
            AbstractC20512giL.OLrzqt((AbstractC16908esm) viewDataBindingOLrzqt6, new View.OnClickListener() { // from class: o.gjA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20604gjy.KWHzl(this.copydefault, c20598gjs, view);
                }
            });
        } else {
            if (this.AEQbTJ) {
                ViewDataBinding viewDataBindingOLrzqt7 = c43312rms.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt7, "");
                AbstractC20512giL.EZpvd((AbstractC16908esm) viewDataBindingOLrzqt7, this.copydefault ? c20598gjs.KWHzl() : "--", this.copydefault ? C54880xYt.formatValuationFromAsset$default(c20598gjs.OLrzqt(), null, false, 0, false, 15, null) : "--", false, new View.OnClickListener() { // from class: o.gjz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C20604gjy.copydefault(this.copydefault, c20598gjs, view);
                    }
                });
                return;
            }
            ((AbstractC16908esm) c43312rms.OLrzqt()).getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.gjE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20604gjy.djBIcL(this.EZpvd, c20598gjs, view);
                }
            });
        }
    }

    public static final void KWHzl(C20604gjy c20604gjy, C20598gjs c20598gjs, android.view.View view) {
        c20604gjy.EZpvd.invoke(c20598gjs);
    }

    public static final void copydefault(C20604gjy c20604gjy, C20598gjs c20598gjs, android.view.View view) {
        c20604gjy.EZpvd.invoke(c20598gjs);
    }

    public static final void djBIcL(C20604gjy c20604gjy, C20598gjs c20598gjs, android.view.View view) {
        c20604gjy.EZpvd.invoke(c20598gjs);
    }
}
