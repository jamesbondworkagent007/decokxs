package o;

import androidx.compose.material.SwipeableDefaults;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.okinc.cruilib.compose.composable.common.list.SwipeableListState$resetItemRevealState$1;
import com.okinc.cruilib.compose.composable.common.list.SwipeableListState$resetItemRevealStates$1;
import com.okinc.cruilib.compose.library.revealswipe.RevealValue;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.mDK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mDT<Id, Item extends mDK<Id>> {
    public final java.util.Map<Id, SwipeableState<RevealValue>> EZpvd;
    public final SnapshotStateMap<Id, mDS> KWHzl;
    public final CoroutineScope copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean copydefault(RevealValue revealValue) {
        Intrinsics.checkNotNullParameter(revealValue, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SnapshotStateMap<Id, mDS> copydefault() {
        return this.KWHzl;
    }

    public mDT(@NotNull java.util.List<? extends Item> list, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.copydefault = coroutineScope;
        this.EZpvd = new LinkedHashMap();
        this.KWHzl = SnapshotStateKt.mutableStateMapOf();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.KWHzl.put(((mDK) it.next()).AEQbTJ(), new mDS(false, false, false, 7, null));
        }
    }

    public final boolean OLrzqt(Id id) {
        mDS mds = this.KWHzl.get(id);
        return mds != null && mds.copydefault();
    }

    public final boolean EZpvd(Id id, boolean z) {
        mDS mdsCopy$default = this.KWHzl.get(id);
        if (mdsCopy$default == null) {
            return false;
        }
        if ((!mdsCopy$default.copydefault() && z) || (mdsCopy$default.copydefault() && !z)) {
            mdsCopy$default = mDS.copy$default(mdsCopy$default, z, false, false, 6, null);
            this.KWHzl.put(id, mdsCopy$default);
        }
        mDS mdsCopy$default2 = mdsCopy$default;
        if (!z && mdsCopy$default2.KWHzl()) {
            mdsCopy$default2 = mDS.copy$default(mdsCopy$default2, false, false, false, 3, null);
            this.KWHzl.put(id, mdsCopy$default2);
        }
        if (mdsCopy$default2.KWHzl()) {
            return false;
        }
        if (!z) {
            return true;
        }
        for (Map.Entry<Id, mDS> entry : this.KWHzl.entrySet()) {
            Id key = entry.getKey();
            mDS value = entry.getValue();
            if (!Intrinsics.EZpvd(key, id) && value.copydefault() && !value.KWHzl()) {
                this.KWHzl.put(key, mDS.copy$default(value, false, false, true, 3, null));
                copydefault(key);
            }
        }
        return true;
    }

    public final void AEQbTJ(Id id, boolean z) {
        mDS mds = this.KWHzl.get(id);
        if (mds != null) {
            if ((mds.AEQbTJ() || !z) && (!mds.AEQbTJ() || z)) {
                return;
            }
            this.KWHzl.put(id, mDS.copy$default(mds, false, z, false, 5, null));
        }
    }

    public final boolean EZpvd(@NotNull java.util.Set<? extends Id> set) {
        Intrinsics.checkNotNullParameter(set, "");
        if (set.isEmpty()) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (java.lang.Object obj : set) {
            mDS mds = this.KWHzl.get(obj);
            if (mds != null && !mds.KWHzl()) {
                this.KWHzl.put((Id) obj, mDS.copy$default(mds, false, false, true, 3, null));
                linkedHashSet.add(obj);
            }
        }
        KWHzl(linkedHashSet);
        return true;
    }

    public final void KWHzl(java.util.Set<? extends Id> set) {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new SwipeableListState$resetItemRevealStates$1(set, this, null), 3, null);
    }

    public final void copydefault(Id id) {
        BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new SwipeableListState$resetItemRevealState$1(this, id, null), 3, null);
    }

    public final java.lang.Object KWHzl(Id id, Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = C31825mFh.KWHzl(AEQbTJ(id), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final SwipeableState<RevealValue> AEQbTJ(Id id) {
        java.util.Map<Id, SwipeableState<RevealValue>> map = this.EZpvd;
        SwipeableState<RevealValue> swipeableState = map.get(id);
        if (swipeableState == null) {
            SwipeableState<RevealValue> swipeableState2 = new SwipeableState<>(RevealValue.Default, SwipeableDefaults.INSTANCE.getAnimationSpec(), new Function1() { // from class: o.mDW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(mDT.copydefault((RevealValue) obj));
                }
            });
            map.put(id, swipeableState2);
            swipeableState = swipeableState2;
        }
        return swipeableState;
    }

    public final void OLrzqt(@NotNull java.util.List<? extends Item> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((mDK) it.next()).AEQbTJ());
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        java.util.Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(this.KWHzl.keySet());
        java.util.Set set = setOqFWZa;
        for (java.lang.Object obj : CollectionsKt___CollectionsKt.AYXKKw((java.lang.Iterable) setOqFWZa2, (java.lang.Iterable) set)) {
            this.KWHzl.remove(obj);
            this.EZpvd.remove(obj);
        }
        java.util.Iterator it2 = CollectionsKt___CollectionsKt.AYXKKw((java.lang.Iterable) set, (java.lang.Iterable) setOqFWZa2).iterator();
        while (it2.hasNext()) {
            this.KWHzl.put((Id) it2.next(), new mDS(false, false, false, 7, null));
        }
    }
}
