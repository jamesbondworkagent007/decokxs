package com.okinc.planet.biz_positions;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.planet.biz_positions.EcoSelectionBottomSheetV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52792wYn;
import o.C33070mpX;
import o.C47501trL;
import o.C52794wYp;
import o.C55198xfS;
import o.C55276xgr;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC56387yDm;
import o.wXQ;
import o.wYF;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class EcoSelectionBottomSheetV2<T extends Parcelable> extends AbstractC52792wYn {
    public Function2<? super Selection<T>, ? super Integer, Unit> EZpvd;
    public final boolean KWHzl;
    public DialogInterface.OnDismissListener OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.tEm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return EcoSelectionBottomSheetV2.copydefault(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.tEo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return EcoSelectionBottomSheetV2.djBIcL(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tEs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(EcoSelectionBottomSheetV2.EZpvd(this.AEQbTJ));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    public static final class Selection<T extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<Selection<?>> CREATOR = new Creator();
        public final CharSequence AEQbTJ;
        public final T EZpvd;
        public final boolean KWHzl;
        public final CharSequence OLrzqt;
        public final boolean copydefault;

        public static final class Creator implements Parcelable.Creator<Selection<?>> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Selection<?> createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new Selection<>((CharSequence) creator.createFromParcel(parcel), parcel.readParcelable(Selection.class.getClassLoader()), (CharSequence) creator.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Selection<?>[] newArray(int i) {
                return new Selection[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.planet.biz_positions.EcoSelectionBottomSheetV2$Selection */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Selection copy$default(Selection selection, CharSequence charSequence, Parcelable parcelable, CharSequence charSequence2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = selection.OLrzqt;
            }
            if ((i & 2) != 0) {
                parcelable = selection.EZpvd;
            }
            Parcelable parcelable2 = parcelable;
            if ((i & 4) != 0) {
                charSequence2 = selection.AEQbTJ;
            }
            CharSequence charSequence3 = charSequence2;
            if ((i & 8) != 0) {
                z = selection.KWHzl;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = selection.copydefault;
            }
            return selection.KWHzl(charSequence, parcelable2, charSequence3, z3, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Selection<T> KWHzl(@NotNull CharSequence charSequence, T t, @NotNull CharSequence charSequence2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            return new Selection<>(charSequence, t, charSequence2, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Selection)) {
                return false;
            }
            Selection selection = (Selection) obj;
            return Intrinsics.EZpvd(this.OLrzqt, selection.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, selection.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, selection.AEQbTJ) && this.KWHzl == selection.KWHzl && this.copydefault == selection.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            T t = this.EZpvd;
            return (((((((iHashCode * 31) + (t == null ? 0 : t.hashCode())) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            CharSequence charSequence = this.OLrzqt;
            T t = this.EZpvd;
            CharSequence charSequence2 = this.AEQbTJ;
            return "Selection(title=" + ((Object) charSequence) + ", data=" + t + ", description=" + ((Object) charSequence2) + ", selected=" + this.KWHzl + ", isSelectable=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TextUtils.writeToParcel(this.OLrzqt, parcel, i);
            parcel.writeParcelable(this.EZpvd, i);
            TextUtils.writeToParcel(this.AEQbTJ, parcel, i);
            parcel.writeInt(this.KWHzl ? 1 : 0);
            parcel.writeInt(this.copydefault ? 1 : 0);
        }

        public Selection(@NotNull CharSequence charSequence, T t, @NotNull CharSequence charSequence2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            this.OLrzqt = charSequence;
            this.EZpvd = t;
            this.AEQbTJ = charSequence2;
            this.KWHzl = z;
            this.copydefault = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r7v0 java.lang.CharSequence)
  (wrap:android.os.Parcelable:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.os.Parcelable) : (r8v0 android.os.Parcelable))
  (wrap:java.lang.CharSequence:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.CharSequence))
  (wrap:boolean:0x0012: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
 A[MD:(java.lang.CharSequence, T extends android.os.Parcelable, java.lang.CharSequence, boolean, boolean):void (m)] (LINE:22) call: com.okinc.planet.biz_positions.EcoSelectionBottomSheetV2.Selection.<init>(java.lang.CharSequence, android.os.Parcelable, java.lang.CharSequence, boolean, boolean):void type: THIS */
        public /* synthetic */ Selection(CharSequence charSequence, Parcelable parcelable, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, (i & 2) != 0 ? null : parcelable, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_positions.EcoSelectionBottomSheetV2.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ EcoSelectionBottomSheetV2 newInstance$default(TaskDescription taskDescription, List list, String str, boolean z, Function2 function2, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return taskDescription.KWHzl(list, str, z, function2);
        }

        public final <T extends Parcelable> EcoSelectionBottomSheetV2<T> KWHzl(@NotNull List<Selection<T>> list, String str, boolean z, @NotNull Function2<? super Selection<T>, ? super Integer, Unit> function2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function2, "");
            EcoSelectionBottomSheetV2<T> ecoSelectionBottomSheetV2 = new EcoSelectionBottomSheetV2<>();
            ecoSelectionBottomSheetV2.EZpvd = function2;
            ecoSelectionBottomSheetV2.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("selections", new ArrayList(list)), C56390yDp.OLrzqt("DismissOnSelected", Boolean.valueOf(z)), C56390yDp.OLrzqt("BottomSheetTitle", str)));
            return ecoSelectionBottomSheetV2;
        }
    }

    public final List<Selection<T>> EZpvd() {
        return (List) this.valueOf.getValue();
    }

    public static final List copydefault(EcoSelectionBottomSheetV2 ecoSelectionBottomSheetV2) {
        List parcelableArrayList;
        Bundle arguments = ecoSelectionBottomSheetV2.getArguments();
        if (arguments == null) {
            parcelableArrayList = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            Iterable parcelableArrayList2 = arguments.getParcelableArrayList("selections", Selection.class);
            if (parcelableArrayList2 == null) {
                parcelableArrayList2 = yDY.AhwBna();
            }
            parcelableArrayList = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList2);
        } else {
            parcelableArrayList = arguments.getParcelableArrayList("selections");
            if (parcelableArrayList == null) {
                parcelableArrayList = yDY.AhwBna();
            }
        }
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    private final String KWHzl() {
        return (String) this.AYXKKw.getValue();
    }

    public static final String djBIcL(EcoSelectionBottomSheetV2 ecoSelectionBottomSheetV2) {
        Bundle arguments = ecoSelectionBottomSheetV2.getArguments();
        String string = arguments != null ? arguments.getString("BottomSheetTitle") : null;
        return string == null ? "" : string;
    }

    public final boolean AEQbTJ() {
        return ((Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean EZpvd(EcoSelectionBottomSheetV2 ecoSelectionBottomSheetV2) {
        Bundle arguments = ecoSelectionBottomSheetV2.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("DismissOnSelected", true);
        }
        return true;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (KWHzl().length() > 0) {
            wxq.setStyle(2);
            wxq.AEQbTJ().setVisibility(0);
            wxq.setTitle(KWHzl());
            return;
        }
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        List<Selection<T>> listEZpvd = EZpvd();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            Selection selection = (Selection) it.next();
            arrayList.add(new C55276xgr(selection.OLrzqt(), null, selection.EZpvd(), selection.AEQbTJ(), selection.copydefault(), null, null, 98, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.tEv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return EcoSelectionBottomSheetV2.KWHzl(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit KWHzl(EcoSelectionBottomSheetV2 ecoSelectionBottomSheetV2, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        if (c55276xgr != null) {
            Iterator<Selection<T>> it = ecoSelectionBottomSheetV2.EZpvd().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd(it.next().OLrzqt(), c55276xgr.AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                Function2<? super Selection<T>, ? super Integer, Unit> function2 = ecoSelectionBottomSheetV2.EZpvd;
                if (function2 != null) {
                    function2.invoke(ecoSelectionBottomSheetV2.EZpvd().get(i), Integer.valueOf(i));
                }
                if (ecoSelectionBottomSheetV2.AEQbTJ()) {
                    ecoSelectionBottomSheetV2.dismissAllowingStateLoss();
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.OLrzqt;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OLrzqt = null;
        this.EZpvd = null;
        super.onDestroyView();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(17);
        C52794wYp c52794wYpOLrzqt = wyf.OLrzqt();
        if (c52794wYpOLrzqt != null) {
            c52794wYpOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.tEr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    EcoSelectionBottomSheetV2.EZpvd(this.EZpvd, view);
                }
            });
        }
        wyf.setCancelText(C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKRKUgwx));
    }

    public static final void EZpvd(EcoSelectionBottomSheetV2 ecoSelectionBottomSheetV2, View view) {
        ecoSelectionBottomSheetV2.dismissAllowingStateLoss();
    }
}
