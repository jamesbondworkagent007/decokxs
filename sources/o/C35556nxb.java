package o;

import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.privacy.SettingType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35556nxb extends RecyclerView.ViewHolder {
    public final AbstractC33936nLi copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35556nxb(@NotNull AbstractC33936nLi abstractC33936nLi) {
        super(abstractC33936nLi.getRoot());
        Intrinsics.checkNotNullParameter(abstractC33936nLi, "");
        this.copydefault = abstractC33936nLi;
    }

    public final void copydefault(@NotNull final C37199opN c37199opN, @NotNull final Function1<? super SettingType, Unit> function1) {
        Intrinsics.checkNotNullParameter(c37199opN, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault.OLrzqt(c37199opN);
        if (c37199opN.KWHzl()) {
            AbstractC33936nLi abstractC33936nLi = this.copydefault;
            android.widget.ImageView imageView = abstractC33936nLi.copydefault;
            android.graphics.drawable.Drawable drawable = AppCompatResources.getDrawable(abstractC33936nLi.getRoot().getContext(), C52761wXj.TaskDescription.DGUQLI);
            if (drawable != null) {
                int i = C52761wXj.Activity.QwvEab;
                android.content.Context context = this.copydefault.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                DrawableCompat.setTint(drawable, C33070mpX.OLrzqt(i, context));
                imageView.setImageDrawable(drawable);
            }
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.nxd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35556nxb.EZpvd(function1, c37199opN, view);
            }
        });
    }

    public static final void EZpvd(Function1 function1, C37199opN c37199opN, android.view.View view) {
        function1.invoke(c37199opN.OLrzqt());
    }
}
