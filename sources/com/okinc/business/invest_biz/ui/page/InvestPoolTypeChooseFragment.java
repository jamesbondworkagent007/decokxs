package com.okinc.business.invest_biz.ui.page;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.ui.page.InvestPoolTypeChooseFragment;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC23748iHw;
import o.AbstractC23784iJe;
import o.AbstractC58247yxg;
import o.C25488ixf;
import o.C25493ixk;
import o.C31703mAu;
import o.C32113mPz;
import o.C33052mpF;
import o.C43312rms;
import o.C43316rmw;
import o.C43318rmy;
import o.C8003auW;
import o.InterfaceC58227yxM;
import o.iHE;
import o.iSY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestPoolTypeChooseFragment extends iSY {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public Function1<? super PoolDialogDataItem, Unit> EZpvd;
    public iHE KWHzl;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.page.InvestPoolTypeChooseFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.C57662yme, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C32113mPz.Dialog.QUSxYX);
    }

    @Override // o.iSY, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd(true);
        EZpvd();
    }

    @Override // o.iSY
    public void copydefault(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.KWHzl = (iHE) DataBindingUtil.inflate(layoutInflater, C25493ixk.Activity.QKVWgx, viewGroup, true);
    }

    private final void EZpvd() {
        PoolDialogData poolDialogData;
        TextView textView;
        Bundle arguments = getArguments();
        if (arguments == null || (poolDialogData = (PoolDialogData) arguments.getParcelable("data")) == null) {
            return;
        }
        AbstractC23748iHw abstractC23748iHwDjBIcL = djBIcL();
        if (abstractC23748iHwDjBIcL != null && (textView = abstractC23748iHwDjBIcL.fetchVPNInfo) != null) {
            textView.setText(poolDialogData.getTitle());
        }
        iHE ihe = this.KWHzl;
        iHE ihe2 = null;
        if (ihe == null) {
            Intrinsics.gEmmrt("");
            ihe = null;
        }
        ihe.EZpvd.setHasFixedSize(true);
        iHE ihe3 = this.KWHzl;
        if (ihe3 == null) {
            Intrinsics.gEmmrt("");
            ihe3 = null;
        }
        ihe3.EZpvd.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        iHE ihe4 = this.KWHzl;
        if (ihe4 == null) {
            Intrinsics.gEmmrt("");
            ihe4 = null;
        }
        ihe4.EZpvd.addItemDecoration(new C31703mAu(C33052mpF.dp2px$default(12.0f, null, 1, null), 0));
        iHE ihe5 = this.KWHzl;
        if (ihe5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihe2 = ihe5;
        }
        RecyclerView recyclerView = ihe2.EZpvd;
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(PoolDialogDataItem.class, new ActionBar(poolDialogData, C25493ixk.Activity.QSLkRj, C25488ixf.OLrzqt));
        c43316rmw.AhwBna(poolDialogData.getItemList());
        recyclerView.setAdapter(c43316rmw);
    }

    public static final class ActionBar extends C43318rmy<PoolDialogDataItem, AbstractC23784iJe> {
        public final /* synthetic */ PoolDialogData OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(PoolDialogData poolDialogData, int i, int i2) {
            super(i, i2);
            this.OLrzqt = poolDialogData;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC23784iJe> c43312rms, final PoolDialogDataItem poolDialogDataItem) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(poolDialogDataItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, poolDialogDataItem);
            TextView textView = ((AbstractC23784iJe) c43312rms.OLrzqt()).OLrzqt;
            String tag = poolDialogDataItem.getTag();
            textView.setVisibility((tag == null || tag.length() == 0) ? 8 : 0);
            c43312rms.itemView.setContentDescription(poolDialogDataItem.isMulti() ? "web3_defi_detail_redeem_select_view" : "web3_defi_detail_invest_redeem_single");
            AbstractC58247yxg<Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(((AbstractC23784iJe) c43312rms.OLrzqt()).getRoot()).throttleFirst(500L, TimeUnit.MILLISECONDS);
            final InvestPoolTypeChooseFragment investPoolTypeChooseFragment = InvestPoolTypeChooseFragment.this;
            final PoolDialogData poolDialogData = this.OLrzqt;
            abstractC58247yxgThrottleFirst.subscribe(new InterfaceC58227yxM() { // from class: o.iQn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    InvestPoolTypeChooseFragment.ActionBar.copydefault(investPoolTypeChooseFragment, poolDialogDataItem, poolDialogData, obj);
                }
            });
        }

        public static final void copydefault(InvestPoolTypeChooseFragment investPoolTypeChooseFragment, PoolDialogDataItem poolDialogDataItem, PoolDialogData poolDialogData, Object obj) {
            if (investPoolTypeChooseFragment.EZpvd != null) {
                Function1 function1 = investPoolTypeChooseFragment.EZpvd;
                Intrinsics.copydefault(function1);
                function1.invoke(poolDialogDataItem);
                SPUtils.put(poolDialogData.getSp_unique(), Integer.valueOf(poolDialogDataItem.isMulti() ? 2 : 1));
                investPoolTypeChooseFragment.dismissAllowingStateLoss();
            }
        }
    }

    public static final class PoolDialogData implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PoolDialogData> CREATOR = new Creator();
        private final List<PoolDialogDataItem> itemList;
        private final String sp_unique;
        private final String title;

        public static final class Creator implements Parcelable.Creator<PoolDialogData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PoolDialogData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PoolDialogDataItem.CREATOR.createFromParcel(parcel));
                }
                return new PoolDialogData(string, string2, arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PoolDialogData[] newArray(int i) {
                return new PoolDialogData[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.page.InvestPoolTypeChooseFragment$PoolDialogData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PoolDialogData copy$default(PoolDialogData poolDialogData, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = poolDialogData.sp_unique;
            }
            if ((i & 2) != 0) {
                str2 = poolDialogData.title;
            }
            if ((i & 4) != 0) {
                list = poolDialogData.itemList;
            }
            return poolDialogData.copy(str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.sp_unique;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PoolDialogDataItem> component3() {
            return this.itemList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PoolDialogData copy(@NotNull String str, @NotNull String str2, @NotNull List<PoolDialogDataItem> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new PoolDialogData(str, str2, list);
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
            if (!(obj instanceof PoolDialogData)) {
                return false;
            }
            PoolDialogData poolDialogData = (PoolDialogData) obj;
            return Intrinsics.EZpvd((Object) this.sp_unique, (Object) poolDialogData.sp_unique) && Intrinsics.EZpvd((Object) this.title, (Object) poolDialogData.title) && Intrinsics.EZpvd(this.itemList, poolDialogData.itemList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PoolDialogDataItem> getItemList() {
            return this.itemList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSp_unique() {
            return this.sp_unique;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.sp_unique.hashCode() * 31) + this.title.hashCode()) * 31) + this.itemList.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PoolDialogData(sp_unique=" + this.sp_unique + ", title=" + this.title + ", itemList=" + this.itemList + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.sp_unique);
            parcel.writeString(this.title);
            List<PoolDialogDataItem> list = this.itemList;
            parcel.writeInt(list.size());
            Iterator<PoolDialogDataItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public PoolDialogData(@NotNull String str, @NotNull String str2, @NotNull List<PoolDialogDataItem> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.sp_unique = str;
            this.title = str2;
            this.itemList = list;
        }
    }

    public static final class PoolDialogDataItem implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PoolDialogDataItem> CREATOR = new Creator();
        private final String content;
        private final boolean isMulti;
        private final String tag;
        private final String title;

        public static final class Creator implements Parcelable.Creator<PoolDialogDataItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PoolDialogDataItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PoolDialogDataItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PoolDialogDataItem[] newArray(int i) {
                return new PoolDialogDataItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PoolDialogDataItem copy$default(PoolDialogDataItem poolDialogDataItem, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = poolDialogDataItem.title;
            }
            if ((i & 2) != 0) {
                str2 = poolDialogDataItem.tag;
            }
            if ((i & 4) != 0) {
                str3 = poolDialogDataItem.content;
            }
            if ((i & 8) != 0) {
                z = poolDialogDataItem.isMulti;
            }
            return poolDialogDataItem.copy(str, str2, str3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.isMulti;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PoolDialogDataItem copy(@NotNull String str, String str2, @NotNull String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new PoolDialogDataItem(str, str2, str3, z);
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
            if (!(obj instanceof PoolDialogDataItem)) {
                return false;
            }
            PoolDialogDataItem poolDialogDataItem = (PoolDialogDataItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) poolDialogDataItem.title) && Intrinsics.EZpvd((Object) this.tag, (Object) poolDialogDataItem.tag) && Intrinsics.EZpvd((Object) this.content, (Object) poolDialogDataItem.content) && this.isMulti == poolDialogDataItem.isMulti;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContent() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTag() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.title.hashCode();
            String str = this.tag;
            return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode()) * 31) + Boolean.hashCode(this.isMulti);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isMulti() {
            return this.isMulti;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PoolDialogDataItem(title=" + this.title + ", tag=" + this.tag + ", content=" + this.content + ", isMulti=" + this.isMulti + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.title);
            parcel.writeString(this.tag);
            parcel.writeString(this.content);
            parcel.writeInt(this.isMulti ? 1 : 0);
        }

        public PoolDialogDataItem(@NotNull String str, String str2, @NotNull String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.title = str;
            this.tag = str2;
            this.content = str3;
            this.isMulti = z;
        }
    }
}
