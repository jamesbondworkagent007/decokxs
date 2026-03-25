package o;

import android.view.View;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ord, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37321ord extends AbstractC43310rmq<C37251oqM, AbstractC34015nOg> {
    public StateListAnimator EZpvd;

    /* JADX INFO: renamed from: o.ord$StateListAnimator */
    public interface StateListAnimator {
        void KWHzl(@NotNull C37251oqM c37251oqM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.DcMfJK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.rms, java.lang.Object] */
    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, C37251oqM c37251oqM) {
        onBindViewHolder((C43312rms<AbstractC34015nOg>) c43312rms, c37251oqM);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC34015nOg> c43312rms, @NotNull C37251oqM c37251oqM) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c37251oqM, "");
        super.onBindViewHolder((C43312rms) c43312rms, c37251oqM);
        AbstractC34015nOg abstractC34015nOg = (AbstractC34015nOg) c43312rms.OLrzqt();
        Intrinsics.copydefault(abstractC34015nOg);
        copydefault(abstractC34015nOg, c37251oqM);
        android.view.View view = c43312rms.itemView;
        view.setOnClickListener(new TaskDescription(view, 1000L, this, c37251oqM));
    }

    public final void copydefault(AbstractC34015nOg abstractC34015nOg, final C37251oqM c37251oqM) {
        OKReminder oKReminder = abstractC34015nOg.KWHzl;
        oKReminder.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DGUQLIdZmdUa));
        oKReminder.setMessage(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getLabel));
        oKReminder.setStyle(0);
        oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fBE), new Function0() { // from class: o.oqZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37321ord.KWHzl(this.AEQbTJ, c37251oqM);
            }
        });
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.AkhnZx));
    }

    public static final Unit KWHzl(C37321ord c37321ord, C37251oqM c37251oqM) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMContactPage_Top_SyncBanner_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.orb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37321ord.AEQbTJ((EventParamsList) obj);
            }
        });
        StateListAnimator stateListAnimator = c37321ord.EZpvd;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl(c37251oqM);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "IMContactPage_Top_SyncBanner_Click", "", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ord$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C37251oqM AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C37321ord KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C37321ord c37321ord, C37251oqM c37251oqM) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c37321ord;
            this.AEQbTJ = c37251oqM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                StateListAnimator stateListAnimatorOLrzqt = this.KWHzl.OLrzqt();
                if (stateListAnimatorOLrzqt != null) {
                    stateListAnimatorOLrzqt.KWHzl(this.AEQbTJ);
                }
            }
        }
    }
}
