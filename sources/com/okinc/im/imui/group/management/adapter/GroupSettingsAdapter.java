package com.okinc.im.imui.group.management.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33958nMd;
import o.AbstractC33959nMe;
import o.AbstractC33963nMi;
import o.AbstractC33984nNc;
import o.AbstractC35894oHq;
import o.C35689oAa;
import o.C35690oAb;
import o.C35694oAf;
import o.C37734ozS;
import o.C37738ozW;
import o.C37739ozX;
import o.C37740ozY;
import o.C37741ozZ;
import o.C55296xhK;
import o.C55307xhV;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.nMB;
import o.nMW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupSettingsAdapter extends AbstractC35894oHq<C35694oAf, Application> {
    public static final ActionBar Companion = new ActionBar(null);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DisplayItemType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DisplayItemType[] $VALUES;
        public static final DisplayItemType GROUP_SUBHEADER = new DisplayItemType("GROUP_SUBHEADER", 0);
        public static final DisplayItemType ENTRANCE_SETTING = new DisplayItemType("ENTRANCE_SETTING", 1);
        public static final DisplayItemType ENTRANCE_WITH_SUMMARY_SETTING = new DisplayItemType("ENTRANCE_WITH_SUMMARY_SETTING", 2);
        public static final DisplayItemType SWITCH_SETTING = new DisplayItemType("SWITCH_SETTING", 3);
        public static final DisplayItemType HIGHLIGHT_SETTING = new DisplayItemType("HIGHLIGHT_SETTING", 4);
        public static final DisplayItemType DIVIDER_SETTING = new DisplayItemType("DIVIDER_SETTING", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DisplayItemType[] $values() {
            return new DisplayItemType[]{GROUP_SUBHEADER, ENTRANCE_SETTING, ENTRANCE_WITH_SUMMARY_SETTING, SWITCH_SETTING, HIGHLIGHT_SETTING, DIVIDER_SETTING};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DisplayItemType> getEntries() {
            return $ENTRIES;
        }

        private DisplayItemType(String str, int i) {
        }

        static {
            DisplayItemType[] displayItemTypeArr$values = $values();
            $VALUES = displayItemTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(displayItemTypeArr$values);
        }

        public static DisplayItemType valueOf(String str) {
            return (DisplayItemType) Enum.valueOf(DisplayItemType.class, str);
        }

        public static DisplayItemType[] values() {
            return (DisplayItemType[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull C35694oAf c35694oAf, @NotNull C35694oAf c35694oAf2) {
        Intrinsics.checkNotNullParameter(c35694oAf, "");
        Intrinsics.checkNotNullParameter(c35694oAf2, "");
        if (!(c35694oAf instanceof C37740ozY) || !(c35694oAf2 instanceof C37740ozY)) {
            if ((c35694oAf instanceof C37739ozX) && (c35694oAf2 instanceof C37739ozX)) {
                return Intrinsics.EZpvd(((C37739ozX) c35694oAf).OLrzqt(), ((C37739ozX) c35694oAf2).OLrzqt());
            }
            if ((c35694oAf instanceof C37738ozW) && (c35694oAf2 instanceof C37738ozW)) {
                return Intrinsics.EZpvd(((C37738ozW) c35694oAf).OLrzqt(), ((C37738ozW) c35694oAf2).OLrzqt());
            }
            if ((c35694oAf instanceof C35690oAb) && (c35694oAf2 instanceof C35690oAb)) {
                return Intrinsics.EZpvd(((C35690oAb) c35694oAf).OLrzqt(), ((C35690oAb) c35694oAf2).OLrzqt());
            }
            if ((c35694oAf instanceof C37741ozZ) && (c35694oAf2 instanceof C37741ozZ)) {
                return Intrinsics.EZpvd(((C37741ozZ) c35694oAf).OLrzqt(), ((C37741ozZ) c35694oAf2).OLrzqt());
            }
            if ((!(c35694oAf instanceof C37734ozS) || !(c35694oAf2 instanceof C37734ozS)) && (!(c35694oAf instanceof C35689oAa) || !(c35694oAf2 instanceof C35689oAa))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0145 A[ORIG_RETURN, RETURN] */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean KWHzl(@NotNull C35694oAf c35694oAf, @NotNull C35694oAf c35694oAf2) {
        Intrinsics.checkNotNullParameter(c35694oAf, "");
        Intrinsics.checkNotNullParameter(c35694oAf2, "");
        if ((c35694oAf instanceof C37740ozY) && (c35694oAf2 instanceof C37740ozY)) {
            C37740ozY c37740ozY = (C37740ozY) c35694oAf;
            C37740ozY c37740ozY2 = (C37740ozY) c35694oAf2;
            if (!Intrinsics.EZpvd(c37740ozY.OLrzqt(), c37740ozY2.OLrzqt()) || !Intrinsics.EZpvd(c37740ozY.KWHzl(), c37740ozY2.KWHzl())) {
            }
        } else if ((c35694oAf instanceof C37739ozX) && (c35694oAf2 instanceof C37739ozX)) {
            C37739ozX c37739ozX = (C37739ozX) c35694oAf;
            C37739ozX c37739ozX2 = (C37739ozX) c35694oAf2;
            if (!Intrinsics.EZpvd(c37739ozX.OLrzqt(), c37739ozX2.OLrzqt()) || !Intrinsics.EZpvd(c37739ozX.KWHzl(), c37739ozX2.KWHzl()) || !Intrinsics.EZpvd((Object) c37739ozX.EZpvd(), (Object) c37739ozX2.EZpvd()) || !Intrinsics.EZpvd(c37739ozX.copydefault(), c37739ozX2.copydefault())) {
            }
        } else if ((c35694oAf instanceof C37738ozW) && (c35694oAf2 instanceof C37738ozW)) {
            C37738ozW c37738ozW = (C37738ozW) c35694oAf;
            C37738ozW c37738ozW2 = (C37738ozW) c35694oAf2;
            if (!Intrinsics.EZpvd(c37738ozW.OLrzqt(), c37738ozW2.OLrzqt()) || !Intrinsics.EZpvd(c37738ozW.copydefault(), c37738ozW2.copydefault()) || !Intrinsics.EZpvd(c37738ozW.EZpvd(), c37738ozW2.EZpvd()) || !Intrinsics.EZpvd(c37738ozW.KWHzl(), c37738ozW2.KWHzl())) {
            }
        } else if ((c35694oAf instanceof C35690oAb) && (c35694oAf2 instanceof C35690oAb)) {
            C35690oAb c35690oAb = (C35690oAb) c35694oAf;
            C35690oAb c35690oAb2 = (C35690oAb) c35694oAf2;
            if (!Intrinsics.EZpvd(c35690oAb.OLrzqt(), c35690oAb2.OLrzqt()) || !Intrinsics.EZpvd(c35690oAb.EZpvd(), c35690oAb2.EZpvd()) || c35690oAb.copydefault() != c35690oAb2.copydefault() || c35690oAb.AEQbTJ() != c35690oAb2.AEQbTJ() || !Intrinsics.EZpvd(c35690oAb.KWHzl(), c35690oAb2.KWHzl())) {
            }
        } else {
            if (!(c35694oAf instanceof C37741ozZ) || !(c35694oAf2 instanceof C37741ozZ)) {
                return ((c35694oAf instanceof C37734ozS) && (c35694oAf2 instanceof C37734ozS)) || ((c35694oAf instanceof C35689oAa) && (c35694oAf2 instanceof C35689oAa));
            }
            C37741ozZ c37741ozZ = (C37741ozZ) c35694oAf;
            C37741ozZ c37741ozZ2 = (C37741ozZ) c35694oAf2;
            if (!Intrinsics.EZpvd(c37741ozZ.OLrzqt(), c37741ozZ2.OLrzqt()) || !Intrinsics.EZpvd(c37741ozZ.KWHzl(), c37741ozZ2.KWHzl())) {
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Object AEQbTJ(@NotNull C35694oAf c35694oAf, @NotNull C35694oAf c35694oAf2) {
        Intrinsics.checkNotNullParameter(c35694oAf, "");
        Intrinsics.checkNotNullParameter(c35694oAf2, "");
        if ((c35694oAf instanceof C35690oAb) && (c35694oAf2 instanceof C35690oAb)) {
            ArrayList arrayList = new ArrayList();
            C35690oAb c35690oAb = (C35690oAb) c35694oAf;
            C35690oAb c35690oAb2 = (C35690oAb) c35694oAf2;
            if (c35690oAb.copydefault() != c35690oAb2.copydefault()) {
                arrayList.add("switch_state");
            }
            if (c35690oAb.AEQbTJ() != c35690oAb2.AEQbTJ()) {
                arrayList.add("enabled_state");
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return super.AEQbTJ(c35694oAf, c35694oAf2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        C35694oAf c35694oAf = KWHzl().getCurrentList().get(i);
        if (c35694oAf instanceof C37740ozY) {
            return DisplayItemType.GROUP_SUBHEADER.ordinal();
        }
        if (c35694oAf instanceof C37739ozX) {
            return DisplayItemType.ENTRANCE_SETTING.ordinal();
        }
        if (c35694oAf instanceof C37738ozW) {
            return DisplayItemType.ENTRANCE_WITH_SUMMARY_SETTING.ordinal();
        }
        if (c35694oAf instanceof C35690oAb) {
            return DisplayItemType.SWITCH_SETTING.ordinal();
        }
        if (c35694oAf instanceof C37741ozZ) {
            return DisplayItemType.HIGHLIGHT_SETTING.ordinal();
        }
        if ((c35694oAf instanceof C35689oAa) || (c35694oAf instanceof C37734ozS)) {
            return DisplayItemType.DIVIDER_SETTING.ordinal();
        }
        throw new IllegalArgumentException("Unknown item type: " + KWHzl().getCurrentList().get(i));
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == DisplayItemType.GROUP_SUBHEADER.ordinal()) {
            nMW nmwEZpvd = nMW.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(nmwEZpvd, "");
            return new PendingIntent(this, nmwEZpvd);
        }
        if (i == DisplayItemType.ENTRANCE_SETTING.ordinal()) {
            AbstractC33963nMi abstractC33963nMiEZpvd = AbstractC33963nMi.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC33963nMiEZpvd, "");
            return new Activity(this, abstractC33963nMiEZpvd);
        }
        if (i == DisplayItemType.ENTRANCE_WITH_SUMMARY_SETTING.ordinal()) {
            AbstractC33959nMe abstractC33959nMeKWHzl = AbstractC33959nMe.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC33959nMeKWHzl, "");
            return new StateListAnimator(this, abstractC33959nMeKWHzl);
        }
        if (i == DisplayItemType.SWITCH_SETTING.ordinal()) {
            AbstractC33984nNc abstractC33984nNcOLrzqt = AbstractC33984nNc.OLrzqt(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC33984nNcOLrzqt, "");
            return new Dialog(this, abstractC33984nNcOLrzqt);
        }
        if (i == DisplayItemType.HIGHLIGHT_SETTING.ordinal()) {
            nMB nmbCopydefault = nMB.copydefault(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(nmbCopydefault, "");
            return new FragmentManager(this, nmbCopydefault);
        }
        if (i == DisplayItemType.DIVIDER_SETTING.ordinal()) {
            AbstractC33958nMd abstractC33958nMdAEQbTJ = AbstractC33958nMd.AEQbTJ(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC33958nMdAEQbTJ, "");
            return new TaskDescription(this, abstractC33958nMdAEQbTJ);
        }
        throw new IllegalArgumentException("Invalid view type");
    }

    public final class Activity extends Application {
        public final AbstractC33963nMi EZpvd;
        public final /* synthetic */ GroupSettingsAdapter KWHzl;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0436Activity implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ AbstractC33963nMi KWHzl;
            public final /* synthetic */ C37739ozX OLrzqt;
            public final /* synthetic */ View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0436Activity(View view, long j, C37739ozX c37739ozX, AbstractC33963nMi abstractC33963nMi) {
                this.copydefault = view;
                this.EZpvd = j;
                this.OLrzqt = c37739ozX;
                this.KWHzl = abstractC33963nMi;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    C37739ozX c37739ozX = this.OLrzqt;
                    Context context = this.KWHzl.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c37739ozX.KWHzl(context);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Activity(@NotNull GroupSettingsAdapter groupSettingsAdapter, AbstractC33963nMi abstractC33963nMi) {
            Intrinsics.checkNotNullParameter(abstractC33963nMi, "");
            this.KWHzl = groupSettingsAdapter;
            View root = abstractC33963nMi.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.EZpvd = abstractC33963nMi;
        }

        @Override // com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter.Application
        public void KWHzl(@NotNull C35694oAf c35694oAf) {
            Intrinsics.checkNotNullParameter(c35694oAf, "");
            C37739ozX c37739ozX = (C37739ozX) c35694oAf;
            AbstractC33963nMi abstractC33963nMi = this.EZpvd;
            abstractC33963nMi.copydefault.setText(c37739ozX.OLrzqt());
            TextView textView = abstractC33963nMi.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, c37739ozX.EZpvd());
            abstractC33963nMi.EZpvd.setContentDescription(c37739ozX.KWHzl());
            if (c37739ozX.copydefault() != null) {
                ImageView imageView = abstractC33963nMi.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                abstractC33963nMi.OLrzqt.setImageDrawable(c37739ozX.copydefault());
            } else {
                ImageView imageView2 = abstractC33963nMi.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
            }
            LinearLayout linearLayout = abstractC33963nMi.EZpvd;
            linearLayout.setOnClickListener(new ViewOnClickListenerC0436Activity(linearLayout, 1000L, c37739ozX, abstractC33963nMi));
        }
    }

    public final class FragmentManager extends Application {
        public final /* synthetic */ GroupSettingsAdapter AEQbTJ;
        public final nMB copydefault;

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ C37741ozZ EZpvd;
            public final /* synthetic */ nMB OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(View view, long j, C37741ozZ c37741ozZ, nMB nmb) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.EZpvd = c37741ozZ;
                this.OLrzqt = nmb;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C37741ozZ c37741ozZ = this.EZpvd;
                    Context context = this.OLrzqt.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c37741ozZ.KWHzl(context);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentManager(@NotNull GroupSettingsAdapter groupSettingsAdapter, nMB nmb) {
            Intrinsics.checkNotNullParameter(nmb, "");
            this.AEQbTJ = groupSettingsAdapter;
            View root = nmb.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.copydefault = nmb;
        }

        @Override // com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter.Application
        public void KWHzl(@NotNull C35694oAf c35694oAf) {
            Intrinsics.checkNotNullParameter(c35694oAf, "");
            C37741ozZ c37741ozZ = (C37741ozZ) c35694oAf;
            nMB nmb = this.copydefault;
            nmb.OLrzqt.setText(c37741ozZ.OLrzqt());
            nmb.AEQbTJ.setContentDescription(c37741ozZ.KWHzl());
            LinearLayout linearLayout = nmb.AEQbTJ;
            linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, c37741ozZ, nmb));
        }
    }

    public final class StateListAnimator extends Application {
        public final /* synthetic */ GroupSettingsAdapter KWHzl;
        public final AbstractC33959nMe copydefault;

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ AbstractC33959nMe AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ View KWHzl;
            public final /* synthetic */ C37738ozW copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, C37738ozW c37738ozW, AbstractC33959nMe abstractC33959nMe) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.copydefault = c37738ozW;
                this.AEQbTJ = abstractC33959nMe;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    C37738ozW c37738ozW = this.copydefault;
                    Context context = this.AEQbTJ.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c37738ozW.KWHzl(context);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator(@NotNull GroupSettingsAdapter groupSettingsAdapter, AbstractC33959nMe abstractC33959nMe) {
            Intrinsics.checkNotNullParameter(abstractC33959nMe, "");
            this.KWHzl = groupSettingsAdapter;
            View root = abstractC33959nMe.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.copydefault = abstractC33959nMe;
        }

        @Override // com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter.Application
        public void KWHzl(@NotNull C35694oAf c35694oAf) {
            Intrinsics.checkNotNullParameter(c35694oAf, "");
            C37738ozW c37738ozW = (C37738ozW) c35694oAf;
            AbstractC33959nMe abstractC33959nMe = this.copydefault;
            abstractC33959nMe.AEQbTJ.setText(c37738ozW.OLrzqt());
            abstractC33959nMe.copydefault.setText(c37738ozW.copydefault());
            if (c37738ozW.EZpvd() != null) {
                abstractC33959nMe.KWHzl.setImageDrawable(c37738ozW.EZpvd());
                ImageView imageView = abstractC33959nMe.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
            } else {
                ImageView imageView2 = abstractC33959nMe.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
            }
            abstractC33959nMe.getRoot().setContentDescription(c37738ozW.KWHzl());
            View root = abstractC33959nMe.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, c37738ozW, abstractC33959nMe));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        C35694oAf c35694oAf = KWHzl().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(c35694oAf, "");
        application.KWHzl(c35694oAf);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(application, i, list);
            return;
        }
        C35694oAf c35694oAf = KWHzl().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(c35694oAf, "");
        application.KWHzl(c35694oAf, list);
    }

    public static abstract class Application extends RecyclerView.ViewHolder {
        public abstract void KWHzl(@NotNull C35694oAf c35694oAf);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }

        public void KWHzl(@NotNull C35694oAf c35694oAf, @NotNull List<Object> list) {
            Intrinsics.checkNotNullParameter(c35694oAf, "");
            Intrinsics.checkNotNullParameter(list, "");
            KWHzl(c35694oAf);
        }
    }

    public final class PendingIntent extends Application {
        public final /* synthetic */ GroupSettingsAdapter KWHzl;
        public final nMW OLrzqt;

        /* JADX WARN: Illegal instructions before constructor call */
        public PendingIntent(@NotNull GroupSettingsAdapter groupSettingsAdapter, nMW nmw) {
            Intrinsics.checkNotNullParameter(nmw, "");
            this.KWHzl = groupSettingsAdapter;
            View root = nmw.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.OLrzqt = nmw;
        }

        @Override // com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter.Application
        public void KWHzl(@NotNull C35694oAf c35694oAf) {
            Intrinsics.checkNotNullParameter(c35694oAf, "");
            nMW nmw = this.OLrzqt;
            nmw.KWHzl.setText(c35694oAf.OLrzqt());
            nmw.getRoot().setContentDescription(c35694oAf.KWHzl());
        }
    }

    public final class Dialog extends Application {
        public final AbstractC33984nNc AEQbTJ;
        public final /* synthetic */ GroupSettingsAdapter EZpvd;

        /* JADX WARN: Illegal instructions before constructor call */
        public Dialog(@NotNull GroupSettingsAdapter groupSettingsAdapter, AbstractC33984nNc abstractC33984nNc) {
            Intrinsics.checkNotNullParameter(abstractC33984nNc, "");
            this.EZpvd = groupSettingsAdapter;
            View root = abstractC33984nNc.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.AEQbTJ = abstractC33984nNc;
        }

        @Override // com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter.Application
        public void KWHzl(@NotNull C35694oAf c35694oAf) {
            Intrinsics.checkNotNullParameter(c35694oAf, "");
            final C35690oAb c35690oAb = (C35690oAb) c35694oAf;
            final AbstractC33984nNc abstractC33984nNc = this.AEQbTJ;
            ConstraintLayout constraintLayout = abstractC33984nNc.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            Iterator<View> it = ViewGroupKt.getChildren(constraintLayout).iterator();
            while (it.hasNext()) {
                it.next().setEnabled(c35690oAb.AEQbTJ());
            }
            abstractC33984nNc.OLrzqt.setContentDescription(c35690oAb.KWHzl());
            abstractC33984nNc.copydefault.setChecked(c35690oAb.copydefault());
            abstractC33984nNc.copydefault.setClickable(false);
            abstractC33984nNc.copydefault.setFocusable(false);
            abstractC33984nNc.AEQbTJ.setText(c35690oAb.OLrzqt());
            TextView textView = abstractC33984nNc.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, c35690oAb.EZpvd());
            abstractC33984nNc.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nWo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    GroupSettingsAdapter.Dialog.OLrzqt(c35690oAb, abstractC33984nNc, view);
                }
            });
        }

        public static final void OLrzqt(C35690oAb c35690oAb, AbstractC33984nNc abstractC33984nNc, View view) {
            if (c35690oAb.AEQbTJ()) {
                abstractC33984nNc.copydefault.setChecked(!c35690oAb.copydefault());
                Context context = abstractC33984nNc.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c35690oAb.KWHzl(context);
            }
        }

        @Override // com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter.Application
        public void KWHzl(@NotNull C35694oAf c35694oAf, @NotNull List<Object> list) {
            Intrinsics.checkNotNullParameter(c35694oAf, "");
            Intrinsics.checkNotNullParameter(list, "");
            C35690oAb c35690oAb = (C35690oAb) c35694oAf;
            for (Object obj : list) {
                if (Intrinsics.EZpvd(obj, (Object) "switch_state")) {
                    this.AEQbTJ.copydefault.setChecked(c35690oAb.copydefault());
                } else if (Intrinsics.EZpvd(obj, (Object) "enabled_state")) {
                    ConstraintLayout constraintLayout = this.AEQbTJ.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    Iterator<View> it = ViewGroupKt.getChildren(constraintLayout).iterator();
                    while (it.hasNext()) {
                        it.next().setEnabled(c35690oAb.AEQbTJ());
                    }
                } else {
                    KWHzl(c35694oAf);
                }
            }
        }
    }

    public final class TaskDescription extends Application {
        public final /* synthetic */ GroupSettingsAdapter AEQbTJ;
        public final AbstractC33958nMd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter.Application
        public void KWHzl(@NotNull C35694oAf c35694oAf) {
            Intrinsics.checkNotNullParameter(c35694oAf, "");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TaskDescription(@NotNull GroupSettingsAdapter groupSettingsAdapter, AbstractC33958nMd abstractC33958nMd) {
            Intrinsics.checkNotNullParameter(abstractC33958nMd, "");
            this.AEQbTJ = groupSettingsAdapter;
            View root = abstractC33958nMd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.copydefault = abstractC33958nMd;
        }
    }
}
