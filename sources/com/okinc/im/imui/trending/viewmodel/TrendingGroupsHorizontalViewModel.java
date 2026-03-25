package com.okinc.im.imui.trending.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.immomo.mls.fun.lt.SILoading;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33073mpa;
import o.C35748oCf;
import o.C35775oDf;
import o.nGS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TrendingGroupsHorizontalViewModel extends AbstractC33073mpa {
    public final LiveData<Application> AYXKKw;
    public final C35775oDf EZpvd;
    public final MutableLiveData<Application> KWHzl;
    public final C35748oCf OLrzqt;
    public boolean copydefault;
    public final SavedStateHandle valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Application> OLrzqt() {
        return this.AYXKKw;
    }

    @yCM
    public TrendingGroupsHorizontalViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C35775oDf c35775oDf, @NotNull C35748oCf c35748oCf) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c35775oDf, "");
        Intrinsics.checkNotNullParameter(c35748oCf, "");
        this.valueOf = savedStateHandle;
        this.EZpvd = c35775oDf;
        this.OLrzqt = c35748oCf;
        MutableLiveData<Application> mutableLiveData = new MutableLiveData<>(Application.Activity.EZpvd);
        this.KWHzl = mutableLiveData;
        this.AYXKKw = mutableLiveData;
        this.copydefault = true;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.trending.viewmodel.TrendingGroupsHorizontalViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Integer EZpvd() {
        return (Integer) this.valueOf.get("arg_max_group_count");
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.trending.viewmodel.TrendingGroupsHorizontalViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends Application {
            public static final Activity EZpvd = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -236401258;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return SILoading.LUA_CLASS_NAME;
            }

            private Activity() {
                super(null);
            }
        }

        private Application() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class TaskDescription extends Application {
            public static final TaskDescription AEQbTJ = new TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -444743641;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Empty";
            }

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.trending.viewmodel.TrendingGroupsHorizontalViewModel$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0486Application extends Application {
            public final List<nGS> OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.trending.viewmodel.TrendingGroupsHorizontalViewModel$Application$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0486Application copy$default(C0486Application c0486Application, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = c0486Application.OLrzqt;
                }
                return c0486Application.copydefault(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<nGS> OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0486Application copydefault(@NotNull List<nGS> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new C0486Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0486Application) && Intrinsics.EZpvd(this.OLrzqt, ((C0486Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(groupList=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0486Application(@NotNull List<nGS> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.OLrzqt = list;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends Application {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -444592926;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error";
            }

            private StateListAnimator() {
                super(null);
            }
        }
    }

    public static /* synthetic */ void fetchTrendingGroups$default(TrendingGroupsHorizontalViewModel trendingGroupsHorizontalViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        trendingGroupsHorizontalViewModel.copydefault(z);
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TrendingGroupsHorizontalViewModel$fetchTrendingGroups$1(this, z, null), 3, null);
    }
}
