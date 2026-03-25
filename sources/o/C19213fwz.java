package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.fwz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19213fwz extends RecyclerView.ViewHolder {
    public final C16918esw KWHzl;
    public final Function1<C18977fsb, Unit> OLrzqt;
    public final C18955fsF copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsb, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19213fwz(@NotNull C16918esw c16918esw, @NotNull Function1<? super C18977fsb, Unit> function1) {
        super(c16918esw.getRoot());
        Intrinsics.checkNotNullParameter(c16918esw, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = c16918esw;
        this.OLrzqt = function1;
        this.copydefault = new C18955fsF();
    }

    private final android.content.Context copydefault() {
        android.content.Context context = this.KWHzl.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    public final void copydefault(@NotNull C18977fsb c18977fsb) {
        Intrinsics.checkNotNullParameter(c18977fsb, "");
        try {
            C16918esw c16918esw = this.KWHzl;
            C5335Nt c5335NtCopydefault = Glide.KWHzl(c16918esw.AEQbTJ).EZpvd(c18977fsb.KWHzl().copydefault()).KWHzl(C13754dXa.Activity.fZBcTu).copydefault(C13754dXa.Activity.fZBcTu);
            android.content.Context context = c16918esw.AEQbTJ.getContext();
            int i = C52761wXj.Activity.zuBGHE;
            android.content.Context context2 = c16918esw.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c5335NtCopydefault.OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C14641dpL(context, 8.0f, 1.0f, C33070mpX.OLrzqt(i, context2)))).EZpvd((android.widget.ImageView) c16918esw.AEQbTJ);
            c16918esw.AhwBna.setText(this.copydefault.EZpvd(c18977fsb.KWHzl().EZpvd(), c18977fsb.EZpvd(), copydefault()));
            C55251xgS c55251xgS = c16918esw.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
            C55251xgS c55251xgS2 = c16918esw.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            c55251xgS2.setVisibility(8);
            C55251xgS c55251xgS3 = c16918esw.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            c55251xgS3.setVisibility(8);
            int i2 = 0;
            for (java.lang.Object obj : c18977fsb.KWHzl().OLrzqt()) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                if (i2 == 0) {
                    C55251xgS c55251xgS4 = c16918esw.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS4, "");
                    c55251xgS4.setVisibility(0);
                    c16918esw.OLrzqt.setText(str);
                }
                if (i2 == 1) {
                    C55251xgS c55251xgS5 = c16918esw.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS5, "");
                    c55251xgS5.setVisibility(0);
                    c16918esw.KWHzl.setText(str);
                }
                if (i2 == 2) {
                    C55251xgS c55251xgS6 = c16918esw.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS6, "");
                    c55251xgS6.setVisibility(0);
                    c16918esw.EZpvd.setText(str);
                }
                i2++;
            }
            C57440yiU c57440yiU = c16918esw.copydefault;
            Intrinsics.checkNotNullExpressionValue(c57440yiU, "");
            AEQbTJ(c57440yiU, c18977fsb.KWHzl().AEQbTJ(), 3);
            ConstraintLayout root = c16918esw.getRoot();
            root.setOnClickListener(new Application(root, 1000L, this, c18977fsb));
        } catch (java.lang.Exception e) {
            C10856bwO.copydefault("DAppSearchResultViewHolder", 0, "bind", e);
        }
    }

    public final void AEQbTJ(C57440yiU c57440yiU, java.util.List<java.lang.String> list, int i) {
        if (list.isEmpty()) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(c57440yiU.getContext());
        c57440yiU.removeAllViews();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C17024euw c17024euwKWHzl = C17024euw.KWHzl(layoutInflaterFrom, c57440yiU, false);
            Intrinsics.checkNotNullExpressionValue(c17024euwKWHzl, "");
            android.widget.ImageView imageView = c17024euwKWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            if (i2 != i) {
                C57659ymb.copydefault(imageView, list.get(i2), C52761wXj.TaskDescription.aHXSQp, 1.0f, 20.0f);
                c57440yiU.addView(c17024euwKWHzl.getRoot());
            } else {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    android.content.Context context = c57440yiU.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    layoutParams.height = C55298xhM.KWHzl(20.0f, context);
                    android.content.Context context2 = c57440yiU.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    layoutParams.width = C55298xhM.KWHzl(20.0f, context2);
                    imageView.setLayoutParams(layoutParams);
                    C57660ymc c57660ymc = new C57660ymc(c57440yiU.getContext(), 1.0f, c57440yiU.getContext().getColor(C52761wXj.Activity.zuBGHE), false);
                    ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(imageView);
                    android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c57440yiU.getContext(), C13754dXa.Activity.getNewProxyInstance);
                    if (drawable != null) {
                        drawable.setTint(c57440yiU.getContext().getColor(C52761wXj.Activity.EZpvd));
                    } else {
                        drawable = null;
                    }
                    componentCallbacks2C5333NrKWHzl.AEQbTJ(drawable).EZpvd((NN<android.graphics.Bitmap>) c57660ymc).EZpvd(imageView);
                    android.widget.TextView textView = c17024euwKWHzl.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setTextAppearance(C52761wXj.LoaderManager.QUSxYX);
                    textView.setTextColor(c57440yiU.getContext().getColor(C52761wXj.Activity.Dmq));
                    textView.setVisibility(0);
                    textView.setText(Marker.ANY_NON_NULL_MARKER + (list.size() - i));
                    c57440yiU.addView(c17024euwKWHzl.getRoot());
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    /* JADX INFO: renamed from: o.fwz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C19213fwz KWHzl;
        public final /* synthetic */ C18977fsb OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19213fwz c19213fwz, C18977fsb c18977fsb) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c19213fwz;
            this.OLrzqt = c18977fsb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke(this.OLrzqt);
            }
        }
    }
}
