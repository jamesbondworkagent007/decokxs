package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.dto.ContentItem;
import com.okinc.tradingbot.impl.dto.DetailArg;
import com.okinc.tradingbot.impl.dto.HistoryEventsDto;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wOO extends AbstractC59533zio<HistoryEventsDto, StateListAnimator> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final java.util.List<java.lang.String> OLrzqt = yDY.gEmmrt("redeemedTime", "redeemedPos");
    public final java.lang.String copydefault;

    public wOO(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wOO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uSG usgCopydefault = uSG.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(usgCopydefault, "");
        return new StateListAnimator(usgCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull HistoryEventsDto historyEventsDto) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(historyEventsDto, "");
        final uSG usgAEQbTJ = stateListAnimator.AEQbTJ();
        android.view.View view = usgAEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(view, "");
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = stateListAnimator.getBindingAdapter();
        boolean z = true;
        view.setVisibility((bindingAdapter == null || stateListAnimator.getAbsoluteAdapterPosition() + 1 != bindingAdapter.getItemCount()) ? 0 : 8);
        usgAEQbTJ.EZpvd.setText(pTA.format$default(new Date(historyEventsDto.KWHzl()), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null));
        usgAEQbTJ.AYXKKw.setText(historyEventsDto.copydefault());
        usgAEQbTJ.getRoot().setOnClickListener(null);
        java.lang.String str = this.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_arbitrage")) {
            boolean z2 = !historyEventsDto.AhwBna().isEmpty();
            C52794wYp c52794wYp = usgAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(z2 ? 0 : 8);
            if (z2) {
                android.widget.RelativeLayout relativeLayoutOLrzqt = usgAEQbTJ.getRoot();
                relativeLayoutOLrzqt.setOnClickListener(new Activity(relativeLayoutOLrzqt, 1000L, usgAEQbTJ, historyEventsDto));
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recurring")) {
            java.util.List<DetailArg> listAEQbTJ = historyEventsDto.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                java.util.List<ContentItem> listKWHzl = ((DetailArg) it.next()).KWHzl();
                if (listKWHzl == null) {
                    listKWHzl = new java.util.ArrayList<>();
                }
                C56406yEe.KWHzl(arrayList, listKWHzl);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((ContentItem) obj).AEQbTJ(), (java.lang.Object) "- -")) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                z = false;
                C52794wYp c52794wYp2 = usgAEQbTJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                c52794wYp2.setVisibility(z ? 0 : 8);
                if (z) {
                    android.widget.RelativeLayout relativeLayoutOLrzqt2 = usgAEQbTJ.getRoot();
                    relativeLayoutOLrzqt2.setOnClickListener(new Application(relativeLayoutOLrzqt2, 1000L, usgAEQbTJ, historyEventsDto));
                }
            } else {
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    java.lang.String strAEQbTJ = ((ContentItem) it2.next()).AEQbTJ();
                    if (strAEQbTJ != null && C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
                        break;
                    }
                }
                z = false;
                C52794wYp c52794wYp22 = usgAEQbTJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c52794wYp22, "");
                c52794wYp22.setVisibility(z ? 0 : 8);
                if (z) {
                }
            }
        } else {
            boolean z3 = !historyEventsDto.AEQbTJ().isEmpty();
            C52794wYp c52794wYp3 = usgAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            c52794wYp3.setVisibility(z3 ? 0 : 8);
            if (z3) {
                android.widget.RelativeLayout relativeLayoutOLrzqt3 = usgAEQbTJ.getRoot();
                relativeLayoutOLrzqt3.setOnClickListener(new TaskDescription(relativeLayoutOLrzqt3, 1000L, usgAEQbTJ, historyEventsDto));
            }
        }
        RecyclerView recyclerView = usgAEQbTJ.gEmmrt;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: o.wOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return wOO.KWHzl(usgAEQbTJ, view2, motionEvent);
            }
        });
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(com.okinc.tradingbot.impl.dto.Message.class, new wOR(historyEventsDto.djBIcL()));
        recyclerView.setAdapter(c59534zip);
        java.util.List<com.okinc.tradingbot.impl.dto.Message> listValueOf = historyEventsDto.valueOf();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listValueOf) {
            com.okinc.tradingbot.impl.dto.Message message = (com.okinc.tradingbot.impl.dto.Message) obj2;
            if (!Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "smart_arbitrage") || !OLrzqt.contains(message.OLrzqt())) {
                arrayList3.add(obj2);
            }
        }
        C33064mpR.OLrzqt(c59534zip, arrayList3);
    }

    public static final boolean KWHzl(uSG usg, android.view.View view, android.view.MotionEvent motionEvent) {
        usg.KWHzl.setPressed(motionEvent.getAction() == 0);
        if (motionEvent.getAction() == 1) {
            usg.getRoot().performClick();
        }
        return false;
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final uSG EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uSG AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull uSG usg) {
            super(usg.getRoot());
            Intrinsics.checkNotNullParameter(usg, "");
            this.EZpvd = usg;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ HistoryEventsDto KWHzl;
        public final /* synthetic */ uSG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, uSG usg, HistoryEventsDto historyEventsDto) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = usg;
            this.KWHzl = historyEventsDto;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context context = this.copydefault.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Json jsonKWHzl = C43284rmQ.KWHzl();
                jsonKWHzl.getSerializersModule();
                c43056riA.OLrzqt(context, "okluatradingeco", "/bot/arb/transaction_history", C56423yEv.EZpvd(C56390yDp.OLrzqt("item", jsonKWHzl.encodeToString(HistoryEventsDto.Companion.serializer(), this.KWHzl))));
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ uSG OLrzqt;
        public final /* synthetic */ HistoryEventsDto copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, uSG usg, HistoryEventsDto historyEventsDto) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = usg;
            this.copydefault = historyEventsDto;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context context = this.OLrzqt.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Json jsonKWHzl = C43284rmQ.KWHzl();
                jsonKWHzl.getSerializersModule();
                c43056riA.OLrzqt(context, "okluatradingeco", "/bot/recurring/coin_message_info", C56423yEv.EZpvd(C56390yDp.OLrzqt("eventData", jsonKWHzl.encodeToString(HistoryEventsDto.Companion.serializer(), this.copydefault))));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ HistoryEventsDto AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ uSG OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, uSG usg, HistoryEventsDto historyEventsDto) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = usg;
            this.AEQbTJ = historyEventsDto;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context context = this.OLrzqt.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Json jsonKWHzl = C43284rmQ.KWHzl();
                jsonKWHzl.getSerializersModule();
                c43056riA.OLrzqt(context, "okluatradingeco", "/bot/grid/modification_info", C56423yEv.EZpvd(C56390yDp.OLrzqt("eventData", jsonKWHzl.encodeToString(HistoryEventsDto.Companion.serializer(), this.AEQbTJ))));
            }
        }
    }
}
