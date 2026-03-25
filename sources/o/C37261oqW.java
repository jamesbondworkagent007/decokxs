package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37261oqW extends AbstractC43310rmq<C37243oqE, AbstractC33942nLo> {
    public Function0<Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.ULRxlR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC33942nLo> c43312rms, @NotNull C37243oqE c37243oqE) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c37243oqE, "");
        super.onBindViewHolder((C43312rms) c43312rms, c37243oqE);
        C55173xeu c55173xeu = ((AbstractC33942nLo) c43312rms.OLrzqt()).OLrzqt;
        c55173xeu.setTitle(C33070mpX.AYXKKw(c37243oqE.AEQbTJ()));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(c37243oqE.OLrzqt()));
        if (c37243oqE.KWHzl() != 0) {
            c55173xeu.setRetry(C33070mpX.AYXKKw(c37243oqE.KWHzl()));
            C52794wYp c52794wYpAEQbTJ = c55173xeu.AEQbTJ();
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
            return;
        }
        c55173xeu.setRetry("");
    }

    /* JADX INFO: renamed from: o.oqW$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C37261oqW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C37261oqW c37261oqW) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c37261oqW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0<Unit> function0KWHzl = this.copydefault.KWHzl();
                if (function0KWHzl != null) {
                    function0KWHzl.invoke();
                }
            }
        }
    }
}
