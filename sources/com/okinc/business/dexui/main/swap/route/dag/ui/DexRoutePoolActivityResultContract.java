package com.okinc.business.dexui.main.swap.route.dag.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC24414idQ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DexRoutePoolActivityResultContract extends ActivityResultContract<Input, Unit> {
    public void OLrzqt(int i, Intent intent) {
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* synthetic */ Unit parseResult(int i, Intent intent) {
        OLrzqt(i, intent);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(@NotNull Context context, @NotNull Input input) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(input, "");
        Intent intent = new Intent(context, (Class<?>) ActivityC24414idQ.class);
        intent.putExtra("extra_route_pool_data", input);
        return intent;
    }

    public static final class Input implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        private final List<PoolInfo> pools;

        public static final class Creator implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PoolInfo.CREATOR.createFromParcel(parcel));
                }
                return new Input(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i) {
                return new Input[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Input() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.route.dag.ui.DexRoutePoolActivityResultContract$Input */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Input copy$default(Input input, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = input.pools;
            }
            return input.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PoolInfo> component1() {
            return this.pools;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Input copy(@NotNull List<PoolInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Input(list);
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
            return (obj instanceof Input) && Intrinsics.EZpvd(this.pools, ((Input) obj).pools);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PoolInfo> getPools() {
            return this.pools;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.pools.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Input(pools=" + this.pools + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<PoolInfo> list = this.pools;
            parcel.writeInt(list.size());
            Iterator<PoolInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public Input(@NotNull List<PoolInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.pools = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo>):void (m)] (LINE:26) call: com.okinc.business.dexui.main.swap.route.dag.ui.DexRoutePoolActivityResultContract.Input.<init>(java.util.List):void type: THIS */
        public /* synthetic */ Input(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }
    }
}
