package o;

import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC9742bbN;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15119dyM extends C43318rmy<InterfaceC9742bbN, dMO> {
    public final androidx.fragment.app.Fragment copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15119dyM(@NotNull androidx.fragment.app.Fragment fragment) {
        super(dLX.Fragment.AubY, 0);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = fragment;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<dMO> c43312rms, @NotNull InterfaceC9742bbN interfaceC9742bbN) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(interfaceC9742bbN, "");
        super.onBindViewHolder((C43312rms) c43312rms, interfaceC9742bbN);
        FragmentActivity activity = this.copydefault.getActivity();
        if (activity != null) {
            Glide.copydefault(activity).EZpvd(interfaceC9742bbN.KWHzl().DbNXlk()).gEmmrt().KWHzl(C52761wXj.TaskDescription.gCZUJG).EZpvd(((dMO) c43312rms.OLrzqt()).OLrzqt);
        }
        ((dMO) c43312rms.OLrzqt()).AEQbTJ.setText(interfaceC9742bbN.valueOf());
        ((dMO) c43312rms.OLrzqt()).EZpvd.setText(interfaceC9742bbN.KWHzl().gEmmrt());
        ((dMO) c43312rms.OLrzqt()).KWHzl.setText(C43154rjt.OLrzqt.KWHzl(interfaceC9742bbN.AYXKKw()));
        ((dMO) c43312rms.OLrzqt()).copydefault.setText(InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(interfaceC9742bbN, false, 1, null));
    }
}
