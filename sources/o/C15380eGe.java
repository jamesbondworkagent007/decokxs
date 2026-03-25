package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eGe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15380eGe extends C43318rmy<eFM, AbstractC16810equ> {
    public final Function1<java.lang.Boolean, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15380eGe(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        super(C13754dXa.TaskDescription.gqOnQv, dTV.isConnected);
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC16810equ> c43312rms, @NotNull final eFM efm) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(efm, "");
        super.onBindViewHolder((C43312rms) c43312rms, efm);
        if (efm.OLrzqt()) {
            ((AbstractC16810equ) c43312rms.OLrzqt()).EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ParcelableVolumeInfo1));
            ((AbstractC16810equ) c43312rms.OLrzqt()).EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
        } else {
            ((AbstractC16810equ) c43312rms.OLrzqt()).EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi23Callback));
            ((AbstractC16810equ) c43312rms.OLrzqt()).EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
        }
        ((AbstractC16810equ) c43312rms.OLrzqt()).EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.eGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15380eGe.copydefault(this.AEQbTJ, efm, view);
            }
        });
    }

    public static final void copydefault(C15380eGe c15380eGe, eFM efm, android.view.View view) {
        c15380eGe.KWHzl.invoke(java.lang.Boolean.valueOf(!efm.OLrzqt()));
    }
}
