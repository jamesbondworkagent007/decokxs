package o;

import com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment;
import com.okinc.market.watch.data.UserGroup;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.qKU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qKU implements InterfaceC40518qYv {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = UserGroup.$stable;
    public final UserGroup OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ qKU copy$default(qKU qku, UserGroup userGroup, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userGroup = qku.OLrzqt;
        }
        return qku.KWHzl(userGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGroup AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qKU KWHzl(@NotNull UserGroup userGroup) {
        Intrinsics.checkNotNullParameter(userGroup, "");
        return new qKU(userGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qKU) && Intrinsics.EZpvd(this.OLrzqt, ((qKU) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavFavoritesGroupPage(rawUserGroup=" + this.OLrzqt + ")";
    }

    public qKU(@NotNull UserGroup userGroup) {
        Intrinsics.checkNotNullParameter(userGroup, "");
        this.OLrzqt = userGroup;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qKU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final boolean KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "CRYPTO");
        }

        /* JADX WARN: Type inference failed for: r2v6, types: [T, java.util.ArrayList, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r7v14, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v18 */
        public final java.util.List<qKU> KWHzl(@NotNull java.util.List<UserGroup> list, boolean z) {
            java.util.List<java.lang.String> list2;
            Intrinsics.checkNotNullParameter(list, "");
            ?? r7 = list;
            if (z) {
                java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
                final Function1 function1 = new Function1() { // from class: o.qKR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(qKU.Application.OLrzqt((UserGroup) obj));
                    }
                };
                listFJNWhG.removeIf(new java.util.function.Predicate() { // from class: o.qKS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return qKU.Application.EZpvd(function1, obj);
                    }
                });
                r7 = listFJNWhG;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r7;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> mapCopydefault = C40380qTs.KWHzl.copydefault();
            if (mapCopydefault != null && (list2 = mapCopydefault.get("bizType")) != null) {
                ?? arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : r7) {
                    UserGroup userGroup = (UserGroup) obj;
                    if (Intrinsics.EZpvd((java.lang.Object) userGroup.getGroupName(), (java.lang.Object) "ALL") || list2.contains(userGroup.getGroupName())) {
                        arrayList.add(obj);
                    }
                }
                objectRef.element = arrayList;
            }
            if (((java.util.List) objectRef.element).size() == 2) {
                java.util.Iterator it = ((java.util.List) objectRef.element).iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) ((UserGroup) it.next()).getGroupName(), (java.lang.Object) "ALL")) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    objectRef.element = C56402yEa.EZpvd(((java.util.List) objectRef.element).get(i));
                }
            }
            java.util.List list3 = (java.util.List) objectRef.element;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
            java.util.Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new qKU((UserGroup) it2.next()));
            }
            return arrayList2;
        }

        public static final boolean EZpvd(Function1 function1, java.lang.Object obj) {
            return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
        }

        public static final boolean OLrzqt(UserGroup userGroup) {
            Intrinsics.checkNotNullParameter(userGroup, "");
            return Intrinsics.EZpvd((java.lang.Object) userGroup.getGroupName(), (java.lang.Object) "CRYPTO");
        }
    }

    public final java.lang.String EZpvd() {
        return this.OLrzqt.getGroupName();
    }

    public final java.lang.String copydefault() {
        return this.OLrzqt.getTranslatedGroupName();
    }

    @Override // o.InterfaceC40518qYv
    public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
        Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
        return Intrinsics.EZpvd(this, interfaceC40518qYv);
    }

    @Override // o.InterfaceC40518qYv
    public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
        Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
        return Intrinsics.EZpvd(this, interfaceC40518qYv);
    }

    @Override // o.InterfaceC40518qYv
    public androidx.fragment.app.Fragment createFragment() {
        return new NavSearchFavoritesListFragment();
    }
}
