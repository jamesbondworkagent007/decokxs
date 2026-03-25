package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.jSB;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface jSB extends RxBus.Application {
    public static final Application Companion = Application.KWHzl;

    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();

        private Application() {
        }

        public final void EZpvd(@NotNull Lifecycle lifecycle, @NotNull final Function1<? super jSB, Unit> function1) {
            Intrinsics.checkNotNullParameter(lifecycle, "");
            Intrinsics.checkNotNullParameter(function1, "");
            lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.business.market.features.favorites.editing.ui.FavoritesEditingChangedEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1
                public InterfaceC58217yxC EZpvd;

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onCreate(LifecycleOwner lifecycleOwner) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    super.onCreate(lifecycleOwner);
                    AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(jSB.class, new String[0]);
                    final Function1 function12 = function1;
                    this.EZpvd = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<jSB, Unit>() { // from class: com.okinc.business.market.features.favorites.editing.ui.FavoritesEditingChangedEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1.1
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(jSB jsb) {
                            AEQbTJ(jsb);
                            return Unit.INSTANCE;
                        }

                        public final void AEQbTJ(jSB jsb) {
                            jSB jsb2 = jsb;
                            pUU.OLrzqt("FavoritesEditingChangedEvent listen: " + jsb2);
                            function12.invoke(jsb2);
                        }
                    }) { // from class: o.jSA.StateListAnimator
                        public final /* synthetic */ Function1 EZpvd;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.EZpvd = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.EZpvd.invoke(obj);
                        }
                    }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.business.market.features.favorites.editing.ui.FavoritesEditingChangedEvent$Companion$listen$$inlined$repeatListenRxEventOnCreate$1.2
                        public final void AEQbTJ(Throwable th) {
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(Throwable th) {
                            AEQbTJ(th);
                            return Unit.INSTANCE;
                        }
                    }) { // from class: o.jSA.StateListAnimator
                        public final /* synthetic */ Function1 EZpvd;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.EZpvd = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.EZpvd.invoke(obj);
                        }
                    });
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
                    if (interfaceC58217yxC != null) {
                        interfaceC58217yxC.dispose();
                    }
                    super.onDestroy(lifecycleOwner);
                }
            });
        }
    }

    public static final class Fragment {
        public static boolean EZpvd(@NotNull jSB jsb, java.lang.String str) {
            return true;
        }

        public static void EZpvd(@NotNull jSB jsb) {
            pUU.OLrzqt("FavoritesEditingChangedEvent post: " + jsb);
            RxBus.AEQbTJ(jsb);
        }
    }

    public static final class SharedElementCallback implements jSB {
        public static final SharedElementCallback copydefault = new SharedElementCallback();

        private SharedElementCallback() {
        }

        public void OLrzqt() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }

    public static final class FragmentManager implements jSB {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragmentManager.OLrzqt;
            }
            return fragmentManager.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FragmentManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((FragmentManager) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GroupNewAddedEvent(groupName=" + this.OLrzqt + ")";
        }

        public FragmentManager(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public void KWHzl() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Dialog implements jSB {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.AEQbTJ;
            }
            return dialog.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Dialog) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GroupRemovedEvent(groupName=" + this.AEQbTJ + ")";
        }

        public Dialog(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public void OLrzqt() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class LoaderManager implements jSB {
        public final java.lang.String EZpvd;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.EZpvd;
            }
            if ((i & 2) != 0) {
                z = loaderManager.KWHzl;
            }
            return loaderManager.copydefault(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager copydefault(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoaderManager)) {
                return false;
            }
            LoaderManager loaderManager = (LoaderManager) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) loaderManager.EZpvd) && this.KWHzl == loaderManager.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GroupVisibilityChangedEvent(groupName=" + this.EZpvd + ", isHidden=" + this.KWHzl + ")";
        }

        public LoaderManager(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.KWHzl = z;
        }

        public void KWHzl() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class PendingIntent implements jSB {
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = pendingIntent.copydefault;
            }
            return pendingIntent.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new PendingIntent(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pendingIntent.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) pendingIntent.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GroupNameChangedEvent(oldGroupName=" + this.OLrzqt + ", newGroupName=" + this.copydefault + ")";
        }

        public PendingIntent(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
        }

        public void OLrzqt() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements jSB {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }

        public void KWHzl() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }

    public static final class Activity implements jSB {
        public final java.util.List<java.lang.String> EZpvd;
        public final java.util.List<java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jSB$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                list2 = activity.EZpvd;
            }
            return activity.copydefault(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new Activity(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CryptosNewAddedToGroupsEvent(cryptoList=" + this.OLrzqt + ", groupList=" + this.EZpvd + ")";
        }

        public Activity(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.OLrzqt = list;
            this.EZpvd = list2;
        }

        public void OLrzqt() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator implements jSB {
        public final java.lang.String EZpvd;
        public final java.util.List<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jSB$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(list, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(list, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CryptosRemovedFromGroupsEvent(cryptoList=" + this.copydefault + ", groupName=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = list;
            this.EZpvd = str;
        }

        public void EZpvd() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }

    public static final class ActionBar implements jSB {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AddedToFavoritesEvent(tip=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public void AEQbTJ() {
            Fragment.EZpvd(this);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return Fragment.EZpvd(this, str);
        }
    }
}
