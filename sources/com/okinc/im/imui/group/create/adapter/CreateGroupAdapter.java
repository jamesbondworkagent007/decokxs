package com.okinc.im.imui.group.create.adapter;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.im.imui.group.create.adapter.CreateGroupAdapter;
import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.uilab.edit.OKEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC33959nMe;
import o.AbstractC33984nNc;
import o.AbstractC35894oHq;
import o.C33069mpW;
import o.C33070mpX;
import o.C33133mqh;
import o.C33933nLf;
import o.C35399nuc;
import o.C37241oqC;
import o.C52761wXj;
import o.C55001xbh;
import o.C55296xhK;
import o.C55298xhM;
import o.C55307xhV;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.nOD;
import o.nOE;
import o.nOH;
import o.nOI;
import o.pTB;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class CreateGroupAdapter extends AbstractC35894oHq<CreateGroupDisplayItem, ActionBar> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public StateListAnimator EZpvd;
    public final LifecycleOwner KWHzl;
    public TaskDescription OLrzqt;

    public final /* synthetic */ class LoaderManager {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DisplayItemType.values().length];
            try {
                iArr[DisplayItemType.GROUP_PROFILE_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayItemType.DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplayItemType.SWITCH_OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplayItemType.ACTION_OPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplayItemType.MEMBER_COUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplayItemType.MEMBER_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface TaskDescription {
        void AEQbTJ(@NotNull CreateGroupDisplayItem.OptionKey optionKey);

        void AEQbTJ(@NotNull CreateGroupDisplayItem.OptionKey optionKey, boolean z);

        void EZpvd(CharSequence charSequence);

        void copydefault(CharSequence charSequence);

        void djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.OLrzqt = taskDescription;
    }

    public CreateGroupAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.KWHzl = lifecycleOwner;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DisplayItemType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DisplayItemType[] $VALUES;
        public static final DisplayItemType GROUP_PROFILE_HEADER = new DisplayItemType("GROUP_PROFILE_HEADER", 0);
        public static final DisplayItemType DESCRIPTION = new DisplayItemType("DESCRIPTION", 1);
        public static final DisplayItemType SWITCH_OPTION = new DisplayItemType("SWITCH_OPTION", 2);
        public static final DisplayItemType ACTION_OPTION = new DisplayItemType("ACTION_OPTION", 3);
        public static final DisplayItemType MEMBER_COUNT = new DisplayItemType("MEMBER_COUNT", 4);
        public static final DisplayItemType MEMBER_ITEM = new DisplayItemType("MEMBER_ITEM", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DisplayItemType[] $values() {
            return new DisplayItemType[]{GROUP_PROFILE_HEADER, DESCRIPTION, SWITCH_OPTION, ACTION_OPTION, MEMBER_COUNT, MEMBER_ITEM};
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

    public final class StateListAnimator extends ActionBar {
        public final /* synthetic */ CreateGroupAdapter AEQbTJ;
        public boolean EZpvd;
        public final nOD OLrzqt;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.create.adapter.CreateGroupAdapter$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0413StateListAnimator implements TextWatcher {
            public final /* synthetic */ CreateGroupAdapter AEQbTJ;
            public final /* synthetic */ StateListAnimator EZpvd;
            public final /* synthetic */ nOD KWHzl;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public C0413StateListAnimator(nOD nod, StateListAnimator stateListAnimator, CreateGroupAdapter createGroupAdapter) {
                this.KWHzl = nod;
                this.EZpvd = stateListAnimator;
                this.AEQbTJ = createGroupAdapter;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TaskDescription taskDescription;
                this.KWHzl.AEQbTJ.setState(0);
                this.KWHzl.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                if (this.EZpvd.EZpvd || (taskDescription = this.AEQbTJ.OLrzqt) == null) {
                    return;
                }
                taskDescription.EZpvd(charSequence);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull CreateGroupAdapter createGroupAdapter, nOD nod) {
            super(createGroupAdapter, nod);
            Intrinsics.checkNotNullParameter(nod, "");
            this.AEQbTJ = createGroupAdapter;
            this.OLrzqt = nod;
        }

        @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.ActionBar
        public void copydefault(@NotNull CreateGroupDisplayItem createGroupDisplayItem) {
            Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
            if (createGroupDisplayItem instanceof CreateGroupDisplayItem.Description) {
                nOD nod = this.OLrzqt;
                CreateGroupAdapter createGroupAdapter = this.AEQbTJ;
                C55001xbh c55001xbhCopydefault = nod.AEQbTJ.copydefault();
                if (c55001xbhCopydefault != null) {
                    c55001xbhCopydefault.setTextSize(16.0f);
                    TextViewCompat.setLineHeight(c55001xbhCopydefault, C55298xhM.dpInt$default(24.0f, (Context) null, 1, (Object) null));
                    CreateGroupDisplayItem.Description description = (CreateGroupDisplayItem.Description) createGroupDisplayItem;
                    if (!Intrinsics.EZpvd((Object) String.valueOf(c55001xbhCopydefault.getText()), (Object) description.OLrzqt())) {
                        this.EZpvd = true;
                        c55001xbhCopydefault.setHint(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QVMIlx));
                        c55001xbhCopydefault.setText(description.OLrzqt());
                        Editable text = c55001xbhCopydefault.getText();
                        c55001xbhCopydefault.setSelection(text != null ? text.length() : 0);
                        this.EZpvd = false;
                    }
                }
                nod.AEQbTJ.setMaxLength(120);
                nod.AEQbTJ.setShowCount(true);
                C55001xbh c55001xbhCopydefault2 = nod.AEQbTJ.copydefault();
                if (c55001xbhCopydefault2 != null) {
                    c55001xbhCopydefault2.addTextChangedListener(new C0413StateListAnimator(nod, this, createGroupAdapter));
                }
                this.OLrzqt.KWHzl.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.ruDxL), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, "20"))));
                TextView textView = this.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
            }
        }

        public final void OLrzqt(boolean z) {
            TextView textView = this.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z ? 0 : 8);
        }

        public final void KWHzl() {
            nOD nod = this.OLrzqt;
            nod.AEQbTJ.setState(2);
            nod.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
        }
    }

    public final void OLrzqt() {
        StateListAnimator stateListAnimator = this.EZpvd;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl();
        }
    }

    public final void OLrzqt(boolean z) {
        StateListAnimator stateListAnimator = this.EZpvd;
        if (stateListAnimator != null) {
            stateListAnimator.OLrzqt(z);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    public boolean OLrzqt(@NotNull CreateGroupDisplayItem createGroupDisplayItem, @NotNull CreateGroupDisplayItem createGroupDisplayItem2) {
        Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
        Intrinsics.checkNotNullParameter(createGroupDisplayItem2, "");
        return ((createGroupDisplayItem instanceof CreateGroupDisplayItem.GroupProfileHeader) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.GroupProfileHeader)) || ((createGroupDisplayItem instanceof CreateGroupDisplayItem.Description) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.Description)) || (((createGroupDisplayItem instanceof CreateGroupDisplayItem.SwitchOption) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.SwitchOption)) || (((createGroupDisplayItem instanceof CreateGroupDisplayItem.ActionOption) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.ActionOption)) || (((createGroupDisplayItem instanceof CreateGroupDisplayItem.MemberCount) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.MemberCount)) || ((createGroupDisplayItem instanceof CreateGroupDisplayItem.MemberItem) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.MemberItem)))));
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[ORIG_RETURN, RETURN] */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean KWHzl(@NotNull CreateGroupDisplayItem createGroupDisplayItem, @NotNull CreateGroupDisplayItem createGroupDisplayItem2) {
        Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
        Intrinsics.checkNotNullParameter(createGroupDisplayItem2, "");
        if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.GroupProfileHeader) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.GroupProfileHeader)) {
            CreateGroupDisplayItem.GroupProfileHeader groupProfileHeader = (CreateGroupDisplayItem.GroupProfileHeader) createGroupDisplayItem;
            CreateGroupDisplayItem.GroupProfileHeader groupProfileHeader2 = (CreateGroupDisplayItem.GroupProfileHeader) createGroupDisplayItem2;
            if (!Intrinsics.EZpvd((Object) groupProfileHeader.AEQbTJ(), (Object) groupProfileHeader2.AEQbTJ()) || !Intrinsics.EZpvd((Object) groupProfileHeader.KWHzl(), (Object) groupProfileHeader2.KWHzl())) {
            }
        } else if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.Description) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.Description)) {
            CreateGroupDisplayItem.Description description = (CreateGroupDisplayItem.Description) createGroupDisplayItem;
            CreateGroupDisplayItem.Description description2 = (CreateGroupDisplayItem.Description) createGroupDisplayItem2;
            if (!Intrinsics.EZpvd((Object) description.OLrzqt(), (Object) description2.OLrzqt()) || description.EZpvd() != description2.EZpvd()) {
            }
        } else if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.SwitchOption) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.SwitchOption)) {
            CreateGroupDisplayItem.SwitchOption switchOption = (CreateGroupDisplayItem.SwitchOption) createGroupDisplayItem;
            CreateGroupDisplayItem.SwitchOption switchOption2 = (CreateGroupDisplayItem.SwitchOption) createGroupDisplayItem2;
            if (switchOption.AEQbTJ() != switchOption2.AEQbTJ() || switchOption.EZpvd() != switchOption2.EZpvd()) {
            }
        } else if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.ActionOption) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.ActionOption)) {
            if (((CreateGroupDisplayItem.ActionOption) createGroupDisplayItem).OLrzqt() == ((CreateGroupDisplayItem.ActionOption) createGroupDisplayItem2).OLrzqt()) {
            }
        } else if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.MemberCount) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.MemberCount)) {
            if (((CreateGroupDisplayItem.MemberCount) createGroupDisplayItem).AEQbTJ() != ((CreateGroupDisplayItem.MemberCount) createGroupDisplayItem2).AEQbTJ()) {
                return false;
            }
        } else {
            if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.MemberItem) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.MemberItem)) {
                CreateGroupDisplayItem.MemberItem memberItem = (CreateGroupDisplayItem.MemberItem) createGroupDisplayItem;
                CreateGroupDisplayItem.MemberItem memberItem2 = (CreateGroupDisplayItem.MemberItem) createGroupDisplayItem2;
                if (Intrinsics.EZpvd((Object) memberItem.OLrzqt().getContactsId(), (Object) memberItem2.OLrzqt().getContactsId()) && Intrinsics.EZpvd((Object) memberItem.OLrzqt().getAvatar(), (Object) memberItem2.OLrzqt().getAvatar()) && Intrinsics.EZpvd((Object) memberItem.copydefault(), (Object) memberItem2.copydefault())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Object AEQbTJ(@NotNull CreateGroupDisplayItem createGroupDisplayItem, @NotNull CreateGroupDisplayItem createGroupDisplayItem2) {
        Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
        Intrinsics.checkNotNullParameter(createGroupDisplayItem2, "");
        ArrayList arrayList = new ArrayList();
        if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.GroupProfileHeader) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.GroupProfileHeader)) {
            if (Intrinsics.EZpvd((Object) ((CreateGroupDisplayItem.GroupProfileHeader) createGroupDisplayItem).AEQbTJ(), (Object) ((CreateGroupDisplayItem.GroupProfileHeader) createGroupDisplayItem2).AEQbTJ())) {
                arrayList.add("KEY_REFRESH_PROFILE_IMAGE");
            }
        } else if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.Description) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.Description)) {
            if (((CreateGroupDisplayItem.Description) createGroupDisplayItem).EZpvd() != ((CreateGroupDisplayItem.Description) createGroupDisplayItem2).EZpvd()) {
                arrayList.add("KEY_REFRESH_PUBLIC_TYPE");
            }
        } else if ((createGroupDisplayItem instanceof CreateGroupDisplayItem.SwitchOption) && (createGroupDisplayItem2 instanceof CreateGroupDisplayItem.SwitchOption) && ((CreateGroupDisplayItem.SwitchOption) createGroupDisplayItem).EZpvd() != ((CreateGroupDisplayItem.SwitchOption) createGroupDisplayItem2).EZpvd()) {
            arrayList.add("KEY_REFRESH_SWITCH_OPTION");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final class Dialog extends ActionBar {
        public final nOE AEQbTJ;
        public final /* synthetic */ CreateGroupAdapter EZpvd;

        public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ Dialog EZpvd;
            public final /* synthetic */ nOE KWHzl;
            public final /* synthetic */ ViewTreeObserver copydefault;

            public ActionBar(ViewTreeObserver viewTreeObserver, View view, nOE noe, Dialog dialog) {
                this.copydefault = viewTreeObserver;
                this.AEQbTJ = view;
                this.KWHzl = noe;
                this.EZpvd = dialog;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                (this.copydefault.isAlive() ? this.copydefault : this.AEQbTJ.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
                OKEditText oKEditText = this.KWHzl.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(oKEditText, "");
                C55307xhV.copydefault(oKEditText);
                nOE noe = this.KWHzl;
                noe.EZpvd.OLrzqt.postDelayed(new TaskDescription(noe, this.EZpvd), 100L);
            }
        }

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ CreateGroupAdapter OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, CreateGroupAdapter createGroupAdapter) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.OLrzqt = createGroupAdapter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    TaskDescription taskDescription = this.OLrzqt.OLrzqt;
                    if (taskDescription != null) {
                        taskDescription.djBIcL();
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull CreateGroupAdapter createGroupAdapter, nOE noe) {
            super(createGroupAdapter, noe);
            Intrinsics.checkNotNullParameter(noe, "");
            this.EZpvd = createGroupAdapter;
            this.AEQbTJ = noe;
        }

        @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.ActionBar
        public void copydefault(@NotNull CreateGroupDisplayItem createGroupDisplayItem) {
            Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
            if (createGroupDisplayItem instanceof CreateGroupDisplayItem.GroupProfileHeader) {
                nOE noe = this.AEQbTJ;
                final CreateGroupAdapter createGroupAdapter = this.EZpvd;
                CreateGroupDisplayItem.GroupProfileHeader groupProfileHeader = (CreateGroupDisplayItem.GroupProfileHeader) createGroupDisplayItem;
                noe.EZpvd.OLrzqt.setText(groupProfileHeader.KWHzl());
                OKEditText oKEditText = noe.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(oKEditText, "");
                C33133mqh.copydefault(oKEditText, createGroupAdapter.KWHzl, new Function1() { // from class: o.nRz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CreateGroupAdapter.Dialog.OLrzqt(createGroupAdapter, (java.lang.CharSequence) obj);
                    }
                });
                ImageView imageView = noe.AEQbTJ;
                imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, createGroupAdapter));
                copydefault(groupProfileHeader.AEQbTJ());
                OKEditText oKEditText2 = noe.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(oKEditText2, "");
                ViewTreeObserver viewTreeObserver = oKEditText2.getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(new ActionBar(viewTreeObserver, oKEditText2, noe, this));
            }
        }

        public static final Unit OLrzqt(CreateGroupAdapter createGroupAdapter, CharSequence charSequence) {
            TaskDescription taskDescription = createGroupAdapter.OLrzqt;
            if (taskDescription != null) {
                taskDescription.copydefault(charSequence);
            }
            return Unit.INSTANCE;
        }

        public static final class TaskDescription implements Runnable {
            public final /* synthetic */ nOE OLrzqt;
            public final /* synthetic */ Dialog copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(nOE noe, Dialog dialog) {
                this.OLrzqt = noe;
                this.copydefault = dialog;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.OLrzqt.EZpvd.OLrzqt.requestFocus();
                Object systemService = this.copydefault.AEQbTJ.getRoot().getContext().getSystemService("input_method");
                Intrinsics.copydefault(systemService, "");
                ((InputMethodManager) systemService).showSoftInput(this.OLrzqt.EZpvd.OLrzqt, 1);
            }
        }

        public final void copydefault(String str) {
            ImageView imageView = this.AEQbTJ.AEQbTJ;
            if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                imageView.setImageResource(C35399nuc.ActionBar.dNCPSb);
                return;
            }
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            ImageView imageView2 = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            IMImageHelper.loadGroupAvatar$default(iMImageHelper, imageView2, str, null, 4, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        CreateGroupDisplayItem createGroupDisplayItem = KWHzl().getCurrentList().get(i);
        if (createGroupDisplayItem instanceof CreateGroupDisplayItem.GroupProfileHeader) {
            return DisplayItemType.GROUP_PROFILE_HEADER.ordinal();
        }
        if (createGroupDisplayItem instanceof CreateGroupDisplayItem.Description) {
            return DisplayItemType.DESCRIPTION.ordinal();
        }
        if (createGroupDisplayItem instanceof CreateGroupDisplayItem.SwitchOption) {
            return DisplayItemType.SWITCH_OPTION.ordinal();
        }
        if (createGroupDisplayItem instanceof CreateGroupDisplayItem.ActionOption) {
            return DisplayItemType.ACTION_OPTION.ordinal();
        }
        if (createGroupDisplayItem instanceof CreateGroupDisplayItem.MemberCount) {
            return DisplayItemType.MEMBER_COUNT.ordinal();
        }
        if (!(createGroupDisplayItem instanceof CreateGroupDisplayItem.MemberItem)) {
            throw new NoWhenBranchMatchedException();
        }
        return DisplayItemType.MEMBER_ITEM.ordinal();
    }

    public final class Application extends ActionBar {
        public final /* synthetic */ CreateGroupAdapter AEQbTJ;
        public final AbstractC33959nMe OLrzqt;

        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[CreateGroupDisplayItem.OptionKey.values().length];
                try {
                    iArr[CreateGroupDisplayItem.OptionKey.INVITE_PERMISSIONS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                KWHzl = iArr;
            }
        }

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ CreateGroupDisplayItem AEQbTJ;
            public final /* synthetic */ CreateGroupAdapter EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, CreateGroupAdapter createGroupAdapter, CreateGroupDisplayItem createGroupDisplayItem) {
                this.copydefault = view;
                this.KWHzl = j;
                this.EZpvd = createGroupAdapter;
                this.AEQbTJ = createGroupDisplayItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    TaskDescription taskDescription = this.EZpvd.OLrzqt;
                    if (taskDescription != null) {
                        taskDescription.AEQbTJ(((CreateGroupDisplayItem.ActionOption) this.AEQbTJ).OLrzqt());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull CreateGroupAdapter createGroupAdapter, AbstractC33959nMe abstractC33959nMe) {
            super(createGroupAdapter, abstractC33959nMe);
            Intrinsics.checkNotNullParameter(abstractC33959nMe, "");
            this.AEQbTJ = createGroupAdapter;
            this.OLrzqt = abstractC33959nMe;
        }

        @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.ActionBar
        public void copydefault(@NotNull CreateGroupDisplayItem createGroupDisplayItem) {
            Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
            if (createGroupDisplayItem instanceof CreateGroupDisplayItem.ActionOption) {
                AbstractC33959nMe abstractC33959nMe = this.OLrzqt;
                CreateGroupAdapter createGroupAdapter = this.AEQbTJ;
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(0);
                TextView textView = abstractC33959nMe.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                if (TaskDescription.KWHzl[((CreateGroupDisplayItem.ActionOption) createGroupDisplayItem).OLrzqt().ordinal()] == 1) {
                    abstractC33959nMe.AEQbTJ.setText(C33070mpX.OLrzqt(C35399nuc.LoaderManager.QSusPL, abstractC33959nMe.getRoot().getContext()));
                } else {
                    View root = abstractC33959nMe.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    root.setVisibility(8);
                }
                ConstraintLayout constraintLayout = abstractC33959nMe.OLrzqt;
                constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, createGroupAdapter, createGroupDisplayItem));
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        DisplayItemType displayItemType = (DisplayItemType) yDV.gEmmrt(DisplayItemType.values(), i);
        if (displayItemType == null) {
            throw new IllegalArgumentException("Invalid view type: " + i);
        }
        switch (LoaderManager.EZpvd[displayItemType.ordinal()]) {
            case 1:
                nOE noeOLrzqt = nOE.OLrzqt(layoutInflaterFrom, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(noeOLrzqt, "");
                return new Dialog(this, noeOLrzqt);
            case 2:
                nOD nodCopydefault = nOD.copydefault(layoutInflaterFrom, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(nodCopydefault, "");
                return new StateListAnimator(this, nodCopydefault);
            case 3:
                AbstractC33984nNc abstractC33984nNcOLrzqt = AbstractC33984nNc.OLrzqt(layoutInflaterFrom, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(abstractC33984nNcOLrzqt, "");
                return new Fragment(this, abstractC33984nNcOLrzqt);
            case 4:
                AbstractC33959nMe abstractC33959nMeKWHzl = AbstractC33959nMe.KWHzl(layoutInflaterFrom, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(abstractC33959nMeKWHzl, "");
                abstractC33959nMeKWHzl.KWHzl.setImageResource(C52761wXj.TaskDescription.DGUQLI);
                return new Application(this, abstractC33959nMeKWHzl);
            case 5:
                nOI noiOLrzqt = nOI.OLrzqt(layoutInflaterFrom, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(noiOLrzqt, "");
                return new FragmentManager(this, noiOLrzqt);
            case 6:
                nOH nohCopydefault = nOH.copydefault(layoutInflaterFrom, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(nohCopydefault, "");
                return new PendingIntent(this, nohCopydefault);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CreateGroupDisplayItem createGroupDisplayItem = KWHzl().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(createGroupDisplayItem, "");
        actionBar.copydefault(createGroupDisplayItem);
        if (actionBar instanceof StateListAnimator) {
            this.EZpvd = (StateListAnimator) actionBar;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(actionBar, i);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof List) {
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                    }
                }
                for (String str : arrayList) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1062456484) {
                        if (iHashCode != -995637631) {
                            if (iHashCode == 610830796 && str.equals("KEY_REFRESH_PUBLIC_TYPE")) {
                                StateListAnimator stateListAnimator = actionBar instanceof StateListAnimator ? (StateListAnimator) actionBar : null;
                                CreateGroupDisplayItem createGroupDisplayItem = KWHzl().getCurrentList().get(i);
                                CreateGroupDisplayItem.Description description = createGroupDisplayItem instanceof CreateGroupDisplayItem.Description ? (CreateGroupDisplayItem.Description) createGroupDisplayItem : null;
                                if (stateListAnimator != null && description != null) {
                                    stateListAnimator.OLrzqt(description.EZpvd());
                                }
                            }
                        } else if (str.equals("KEY_REFRESH_PROFILE_IMAGE")) {
                            Dialog dialog = actionBar instanceof Dialog ? (Dialog) actionBar : null;
                            CreateGroupDisplayItem createGroupDisplayItem2 = KWHzl().getCurrentList().get(i);
                            CreateGroupDisplayItem.GroupProfileHeader groupProfileHeader = createGroupDisplayItem2 instanceof CreateGroupDisplayItem.GroupProfileHeader ? (CreateGroupDisplayItem.GroupProfileHeader) createGroupDisplayItem2 : null;
                            if (dialog != null && groupProfileHeader != null) {
                                dialog.copydefault(groupProfileHeader.AEQbTJ());
                            }
                        }
                    } else if (str.equals("KEY_REFRESH_SWITCH_OPTION")) {
                        Fragment fragment = actionBar instanceof Fragment ? (Fragment) actionBar : null;
                        CreateGroupDisplayItem createGroupDisplayItem3 = KWHzl().getCurrentList().get(i);
                        CreateGroupDisplayItem.SwitchOption switchOption = createGroupDisplayItem3 instanceof CreateGroupDisplayItem.SwitchOption ? (CreateGroupDisplayItem.SwitchOption) createGroupDisplayItem3 : null;
                        if (fragment != null && switchOption != null) {
                            fragment.EZpvd(switchOption);
                        }
                    }
                }
            }
        }
    }

    public abstract class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ CreateGroupAdapter KWHzl;

        public abstract void copydefault(@NotNull CreateGroupDisplayItem createGroupDisplayItem);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull CreateGroupAdapter createGroupAdapter, ViewBinding viewBinding) {
            super(viewBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewBinding, "");
            this.KWHzl = createGroupAdapter;
        }
    }

    public final class Fragment extends ActionBar {
        public final /* synthetic */ CreateGroupAdapter OLrzqt;
        public final AbstractC33984nNc copydefault;

        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[CreateGroupDisplayItem.OptionKey.values().length];
                try {
                    iArr[CreateGroupDisplayItem.OptionKey.RESTRICTED_GROUP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CreateGroupDisplayItem.OptionKey.PUBLIC_GROUP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull CreateGroupAdapter createGroupAdapter, AbstractC33984nNc abstractC33984nNc) {
            super(createGroupAdapter, abstractC33984nNc);
            Intrinsics.checkNotNullParameter(abstractC33984nNc, "");
            this.OLrzqt = createGroupAdapter;
            this.copydefault = abstractC33984nNc;
        }

        @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.ActionBar
        public void copydefault(@NotNull CreateGroupDisplayItem createGroupDisplayItem) {
            Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
            if (createGroupDisplayItem instanceof CreateGroupDisplayItem.SwitchOption) {
                AbstractC33984nNc abstractC33984nNc = this.copydefault;
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(0);
                abstractC33984nNc.copydefault.setClickable(false);
                abstractC33984nNc.copydefault.setFocusable(false);
                CreateGroupDisplayItem.SwitchOption switchOption = (CreateGroupDisplayItem.SwitchOption) createGroupDisplayItem;
                int i = TaskDescription.KWHzl[switchOption.AEQbTJ().ordinal()];
                if (i == 1) {
                    abstractC33984nNc.AEQbTJ.setText(C33070mpX.OLrzqt(C35399nuc.LoaderManager.GiPPlLgiPPlL, abstractC33984nNc.getRoot().getContext()));
                    TextView textView = abstractC33984nNc.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    C55307xhV.AEQbTJ(textView, C33070mpX.OLrzqt(C35399nuc.LoaderManager.gbIfDn, abstractC33984nNc.getRoot().getContext()));
                } else if (i == 2) {
                    abstractC33984nNc.AEQbTJ.setText(C33070mpX.OLrzqt(C35399nuc.LoaderManager.DkGEDn, abstractC33984nNc.getRoot().getContext()));
                    TextView textView2 = abstractC33984nNc.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    C55307xhV.AEQbTJ(textView2, C33070mpX.OLrzqt(C35399nuc.LoaderManager.hdBMmm, abstractC33984nNc.getRoot().getContext()));
                } else {
                    View root = abstractC33984nNc.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    root.setVisibility(8);
                }
                EZpvd(switchOption);
            }
        }

        public final void EZpvd(@NotNull final CreateGroupDisplayItem.SwitchOption switchOption) {
            Intrinsics.checkNotNullParameter(switchOption, "");
            final AbstractC33984nNc abstractC33984nNc = this.copydefault;
            final CreateGroupAdapter createGroupAdapter = this.OLrzqt;
            abstractC33984nNc.copydefault.setChecked(switchOption.EZpvd());
            abstractC33984nNc.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nRB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    CreateGroupAdapter.Fragment.EZpvd(abstractC33984nNc, switchOption, createGroupAdapter, view);
                }
            });
        }

        public static final void EZpvd(AbstractC33984nNc abstractC33984nNc, CreateGroupDisplayItem.SwitchOption switchOption, CreateGroupAdapter createGroupAdapter, View view) {
            abstractC33984nNc.copydefault.setChecked(!switchOption.EZpvd());
            TaskDescription taskDescription = createGroupAdapter.OLrzqt;
            if (taskDescription != null) {
                taskDescription.AEQbTJ(switchOption.AEQbTJ(), !switchOption.EZpvd());
            }
        }
    }

    public final class FragmentManager extends ActionBar {
        public final /* synthetic */ CreateGroupAdapter AEQbTJ;
        public final nOI OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(@NotNull CreateGroupAdapter createGroupAdapter, nOI noi) {
            super(createGroupAdapter, noi);
            Intrinsics.checkNotNullParameter(noi, "");
            this.AEQbTJ = createGroupAdapter;
            this.OLrzqt = noi;
        }

        @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.ActionBar
        public void copydefault(@NotNull CreateGroupDisplayItem createGroupDisplayItem) {
            Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
            if (createGroupDisplayItem instanceof CreateGroupDisplayItem.MemberCount) {
                this.OLrzqt.AEQbTJ.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.RXdAnZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("count", pTB.formatLocalized$default(String.valueOf(((CreateGroupDisplayItem.MemberCount) createGroupDisplayItem).AEQbTJ()), null, 1, null)))));
            }
        }
    }

    public final class PendingIntent extends ActionBar {
        public final /* synthetic */ CreateGroupAdapter EZpvd;
        public final nOH OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull CreateGroupAdapter createGroupAdapter, nOH noh) {
            super(createGroupAdapter, noh);
            Intrinsics.checkNotNullParameter(noh, "");
            this.EZpvd = createGroupAdapter;
            this.OLrzqt = noh;
        }

        @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.ActionBar
        public void copydefault(@NotNull CreateGroupDisplayItem createGroupDisplayItem) {
            Intrinsics.checkNotNullParameter(createGroupDisplayItem, "");
            if (createGroupDisplayItem instanceof CreateGroupDisplayItem.MemberItem) {
                C37241oqC c37241oqC = C37241oqC.AEQbTJ;
                C33933nLf c33933nLf = this.OLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c33933nLf, "");
                CreateGroupDisplayItem.MemberItem memberItem = (CreateGroupDisplayItem.MemberItem) createGroupDisplayItem;
                c37241oqC.AEQbTJ(c33933nLf, memberItem.OLrzqt());
                C33933nLf c33933nLf2 = this.OLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c33933nLf2, "");
                String phoneRawNumber = memberItem.OLrzqt().getPhoneRawNumber();
                c37241oqC.OLrzqt(c33933nLf2, phoneRawNumber != null ? phoneRawNumber : "");
            }
        }
    }
}
