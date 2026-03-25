package com.okinc.business.invest_biz.ui.widget;

import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.widget.item.ItemData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class GroupData {
    public static final int $stable = 8;
    private ArrayList<ItemData> itemDataSet;
    private InvestConsumeData<String> title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.widget.GroupData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupData copy$default(GroupData groupData, InvestConsumeData investConsumeData, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            investConsumeData = groupData.title;
        }
        if ((i & 2) != 0) {
            arrayList = groupData.itemDataSet;
        }
        return groupData.copy(investConsumeData, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<String> component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ItemData> component2() {
        return this.itemDataSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupData copy(@NotNull InvestConsumeData<String> investConsumeData, @NotNull ArrayList<ItemData> arrayList) {
        Intrinsics.checkNotNullParameter(investConsumeData, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new GroupData(investConsumeData, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupData)) {
            return false;
        }
        GroupData groupData = (GroupData) obj;
        return Intrinsics.EZpvd(this.title, groupData.title) && Intrinsics.EZpvd(this.itemDataSet, groupData.itemDataSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ItemData> getItemDataSet() {
        return this.itemDataSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<String> getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.title.hashCode() * 31) + this.itemDataSet.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemDataSet(@NotNull ArrayList<ItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.itemDataSet = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull InvestConsumeData<String> investConsumeData) {
        Intrinsics.checkNotNullParameter(investConsumeData, "");
        this.title = investConsumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupData(title=" + this.title + ", itemDataSet=" + this.itemDataSet + ")";
    }

    public GroupData(@NotNull InvestConsumeData<String> investConsumeData, @NotNull ArrayList<ItemData> arrayList) {
        Intrinsics.checkNotNullParameter(investConsumeData, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.title = investConsumeData;
        this.itemDataSet = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.ui.bean.InvestConsumeData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.bean.InvestConsumeData:0x000b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: com.okinc.business.invest_biz.ui.bean.InvestConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.business.invest_biz.ui.bean.InvestConsumeData))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0013: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:13) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.ArrayList))
 A[MD:(com.okinc.business.invest_biz.ui.bean.InvestConsumeData<java.lang.String>, java.util.ArrayList<com.okinc.business.invest_biz.ui.widget.item.ItemData>):void (m)] (LINE:11) call: com.okinc.business.invest_biz.ui.widget.GroupData.<init>(com.okinc.business.invest_biz.ui.bean.InvestConsumeData, java.util.ArrayList):void type: THIS */
    public /* synthetic */ GroupData(InvestConsumeData investConsumeData, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InvestConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : investConsumeData, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    public final ItemData getSelectData() {
        Object next;
        Iterator<T> it = this.itemDataSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ItemData) next).getSelected()) {
                break;
            }
        }
        ItemData itemData = (ItemData) next;
        return itemData == null ? new ItemData(null, false, 0, null, false, null, false, null, 255, null) : itemData;
    }
}
