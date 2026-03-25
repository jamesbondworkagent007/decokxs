package com.okinc.buysell.ui.pro.transaction.list.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.crcore.shared.net.responsebean.bsc.UserInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.InterfaceC31764mDa;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellOrderListPageActivityViewModel extends AbstractC33073mpa {
    public final MutableLiveData<C32989mnw<Application>> AEQbTJ;
    public final InterfaceC31764mDa EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Application>> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public BuySellOrderListPageActivityViewModel(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.EZpvd = interfaceC31764mDa;
        this.AEQbTJ = new MutableLiveData<>();
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellOrderListPageActivityViewModel$fetchUserInfo$1(this, null), 3, null);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.pro.transaction.list.viewmodel.BuySellOrderListPageActivityViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.buysell.ui.pro.transaction.list.viewmodel.BuySellOrderListPageActivityViewModel$Application$Application, reason: collision with other inner class name */
        public static final class C0386Application extends Application {
            public static final int copydefault = UserInfoBean.$stable;
            public final UserInfoBean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0386Application copy$default(C0386Application c0386Application, UserInfoBean userInfoBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    userInfoBean = c0386Application.EZpvd;
                }
                return c0386Application.KWHzl(userInfoBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0386Application KWHzl(@NotNull UserInfoBean userInfoBean) {
                Intrinsics.checkNotNullParameter(userInfoBean, "");
                return new C0386Application(userInfoBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UserInfoBean copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0386Application) && Intrinsics.EZpvd(this.EZpvd, ((C0386Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(userInfo=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0386Application(@NotNull UserInfoBean userInfoBean) {
                super(null);
                Intrinsics.checkNotNullParameter(userInfoBean, "");
                this.EZpvd = userInfoBean;
            }
        }

        private Application() {
        }

        public static final class Activity extends Application {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.copydefault;
                }
                return activity.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(String str) {
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.copydefault;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Fail(error=" + this.copydefault + ")";
            }

            public Activity(String str) {
                super(null);
                this.copydefault = str;
            }
        }
    }
}
