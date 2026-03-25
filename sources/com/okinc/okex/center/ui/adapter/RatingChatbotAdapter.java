package com.okinc.okex.center.ui.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.ui.adapter.RatingChatbotAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC47428tpp;
import o.AbstractC47438tpz;
import o.AbstractC5449Sd;
import o.C33070mpX;
import o.C45363soQ;
import o.C45862szb;
import o.C47315tni;
import o.C52794wYp;
import o.C55296xhK;
import o.C55298xhM;
import o.C56444yFp;
import o.InterfaceC5460So;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingChatbotAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final List<Section> EZpvd = yDY.AhwBna(Section.RATING, Section.CHATBOT);
    public Function1<? super EventParamsList, Unit> KWHzl;
    public ActionBar OLrzqt;
    public boolean copydefault;

    public interface ActionBar {
        void copydefault(boolean z);

        void iwGUEr();
    }

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Section.values().length];
            try {
                iArr[Section.RATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Section.CHATBOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.OLrzqt = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.components.track.bean.EventParamsList, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.components.track.bean.EventParamsList, kotlin.Unit> */
    public final Function1<EventParamsList, Unit> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super EventParamsList, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Section {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Section[] $VALUES;
        public static final Section RATING = new Section("RATING", 0);
        public static final Section CHATBOT = new Section("CHATBOT", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Section[] $values() {
            return new Section[]{RATING, CHATBOT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Section> getEntries() {
            return $ENTRIES;
        }

        private Section(String str, int i) {
        }

        static {
            Section[] sectionArr$values = $values();
            $VALUES = sectionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sectionArr$values);
        }

        public static Section valueOf(String str) {
            return (Section) Enum.valueOf(Section.class, str);
        }

        public static Section[] values() {
            return (Section[]) $VALUES.clone();
        }
    }

    public static final class TaskDescription {
        public final String AEQbTJ;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            return taskDescription.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) taskDescription.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ChatbotAttributes(label=" + this.copydefault + ", icon=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
        }
    }

    public final void EZpvd(boolean z) {
        if (this.copydefault != z) {
            this.copydefault = z;
            if (z) {
                notifyItemRangeInserted(0, this.EZpvd.size());
            } else {
                notifyItemRangeRemoved(0, this.EZpvd.size());
            }
        }
    }

    public final void EZpvd() {
        AEQbTJ(Section.RATING);
    }

    public final void KWHzl() {
        copydefault(Section.RATING);
    }

    public final void AEQbTJ() {
        AEQbTJ(Section.CHATBOT);
    }

    public final void OLrzqt() {
        copydefault(Section.CHATBOT);
    }

    public final void AEQbTJ(Section section) {
        Integer numValueOf = Integer.valueOf(this.EZpvd.indexOf(section));
        if (numValueOf.intValue() <= -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            this.EZpvd.remove(section);
            notifyItemRemoved(iIntValue);
        }
    }

    public final void copydefault(Section section) {
        if (this.EZpvd.contains(section)) {
            return;
        }
        int i = Activity.KWHzl[section.ordinal()];
        if (i == 1) {
            this.EZpvd.add(0, section);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.EZpvd.add(section);
        }
        notifyItemInserted(this.EZpvd.lastIndexOf(section));
    }

    public final void EZpvd(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            OLrzqt();
        } else {
            AEQbTJ();
        }
        Integer numValueOf = Integer.valueOf(this.EZpvd.lastIndexOf(Section.CHATBOT));
        if (numValueOf.intValue() <= -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new RatingChatbotAdapter$updateChatbotButtonProperties$2$1(this, numValueOf.intValue(), str, str2, null), 3, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == Section.RATING.ordinal()) {
            AbstractC47438tpz abstractC47438tpzAEQbTJ = AbstractC47438tpz.AEQbTJ(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47438tpzAEQbTJ, "");
            return new Application(this, abstractC47438tpzAEQbTJ);
        }
        if (i == Section.CHATBOT.ordinal()) {
            AbstractC47428tpp abstractC47428tppKWHzl = AbstractC47428tpp.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47428tppKWHzl, "");
            return new StateListAnimator(this, abstractC47428tppKWHzl);
        }
        throw new IllegalArgumentException("Invalid viewType: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.EZpvd.get(i).ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.copydefault) {
            return this.EZpvd.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        onBindViewHolder(viewHolder, i, yDY.AhwBna());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (viewHolder instanceof Application) {
            ((Application) viewHolder).EZpvd();
            return;
        }
        if (viewHolder instanceof StateListAnimator) {
            StateListAnimator stateListAnimator = (StateListAnimator) viewHolder;
            stateListAnimator.KWHzl();
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof TaskDescription) {
                        arrayList.add(obj);
                    }
                }
                TaskDescription taskDescription = (TaskDescription) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (taskDescription != null) {
                    stateListAnimator.KWHzl(taskDescription.AEQbTJ(), taskDescription.OLrzqt());
                }
            }
        }
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ RatingChatbotAdapter KWHzl;
        public final AbstractC47438tpz OLrzqt;

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ RatingChatbotAdapter EZpvd;
            public final /* synthetic */ View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, RatingChatbotAdapter ratingChatbotAdapter) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.EZpvd = ratingChatbotAdapter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    ActionBar actionBar = this.EZpvd.OLrzqt;
                    if (actionBar != null) {
                        actionBar.copydefault(true);
                    }
                }
            }
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ RatingChatbotAdapter copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, RatingChatbotAdapter ratingChatbotAdapter) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.copydefault = ratingChatbotAdapter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    ActionBar actionBar = this.copydefault.OLrzqt;
                    if (actionBar != null) {
                        actionBar.copydefault(false);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull RatingChatbotAdapter ratingChatbotAdapter, AbstractC47438tpz abstractC47438tpz) {
            super(abstractC47438tpz.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47438tpz, "");
            this.KWHzl = ratingChatbotAdapter;
            this.OLrzqt = abstractC47438tpz;
        }

        public final void EZpvd() {
            C45862szb c45862szb = this.OLrzqt.EZpvd;
            final RatingChatbotAdapter ratingChatbotAdapter = this.KWHzl;
            c45862szb.setRatingLabel(C33070mpX.AYXKKw(C47315tni.PendingIntent.iCPUKe));
            ImageView imageViewAEQbTJ = c45862szb.AEQbTJ();
            imageViewAEQbTJ.setOnClickListener(new StateListAnimator(imageViewAEQbTJ, 1000L, ratingChatbotAdapter));
            ImageView imageViewCopydefault = c45862szb.copydefault();
            imageViewCopydefault.setOnClickListener(new TaskDescription(imageViewCopydefault, 1000L, ratingChatbotAdapter));
            C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_HelpfulButton_View", false, new Function1() { // from class: o.shU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return RatingChatbotAdapter.Application.KWHzl(ratingChatbotAdapter, (EventParamsList) obj);
                }
            }, 1, null);
        }

        public static final Unit KWHzl(RatingChatbotAdapter ratingChatbotAdapter, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            Function1<EventParamsList, Unit> function1Copydefault = ratingChatbotAdapter.copydefault();
            if (function1Copydefault != null) {
                function1Copydefault.invoke(eventParamsList);
            }
            return Unit.INSTANCE;
        }
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final AbstractC47428tpp OLrzqt;
        public final /* synthetic */ RatingChatbotAdapter copydefault;

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.adapter.RatingChatbotAdapter$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0536StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ RatingChatbotAdapter KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0536StateListAnimator(View view, long j, RatingChatbotAdapter ratingChatbotAdapter) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.KWHzl = ratingChatbotAdapter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    ActionBar actionBar = this.KWHzl.OLrzqt;
                    if (actionBar != null) {
                        actionBar.iwGUEr();
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RatingChatbotAdapter ratingChatbotAdapter, AbstractC47428tpp abstractC47428tpp) {
            super(abstractC47428tpp.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47428tpp, "");
            this.copydefault = ratingChatbotAdapter;
            this.OLrzqt = abstractC47428tpp;
        }

        public final void KWHzl() {
            C52794wYp c52794wYp = this.OLrzqt.AEQbTJ;
            c52794wYp.setOnClickListener(new ViewOnClickListenerC0536StateListAnimator(c52794wYp, 1000L, this.copydefault));
        }

        public final void KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            AbstractC47428tpp abstractC47428tpp = this.OLrzqt;
            abstractC47428tpp.AEQbTJ.setText(str);
            if (!StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
                Glide.KWHzl(abstractC47428tpp.AEQbTJ).EZpvd(str2).OLrzqt(C55298xhM.dp2px$default(16.0f, null, 1, null)).OLrzqt(new Activity(abstractC47428tpp));
            }
        }

        public static final class Activity extends AbstractC5449Sd<Drawable> {
            public final /* synthetic */ AbstractC47428tpp OLrzqt;

            @Override // o.InterfaceC5462Sq
            public void a_(Drawable drawable) {
            }

            public Activity(AbstractC47428tpp abstractC47428tpp) {
                this.OLrzqt = abstractC47428tpp;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
            @Override // o.InterfaceC5462Sq
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void copydefault(Drawable drawable, InterfaceC5460So<? super Drawable> interfaceC5460So) {
                Intrinsics.checkNotNullParameter(drawable, "");
                C52794wYp c52794wYp = this.OLrzqt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                if (!C55296xhK.AEQbTJ(c52794wYp)) {
                    this.OLrzqt.AEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    this.OLrzqt.AEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        }
    }
}
