package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.OKSlidingTabLayout;
import com.okinc.mln_ui.ui.viewmodel.DebugViewModel$clearCache$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.resource.request.MlnUpdateResp;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.AbstractC48864udi;
import o.C43114rjF;
import o.InterfaceC7340ahw;
import o.InterfaceC7792aqX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43114rjF extends AndroidViewModel {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43114rjF(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43114rjF.copydefault();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.rjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43114rjF.AYXKKw();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rjK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43114rjF.AhwBna();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43114rjF.valueOf();
            }
        });
        DbNXlk().setValue(new Activity(null, null, null, null, null, null, false, 127, null));
        C43082ria.copydefault(getApplication(), new AnonymousClass3(application));
    }

    public final MutableLiveData<Activity> DbNXlk() {
        return (MutableLiveData) this.AEQbTJ.getValue();
    }

    public static final MutableLiveData copydefault() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.Map<java.lang.String, java.util.List<C43155rju>>> isConnected() {
        return (MutableLiveData) this.copydefault.getValue();
    }

    public static final MutableLiveData AYXKKw() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.lang.String> fetchVPNInfo() {
        return (MutableLiveData) this.EZpvd.getValue();
    }

    public static final MutableLiveData AhwBna() {
        return new MutableLiveData("");
    }

    public final C43043rho values() {
        return (C43043rho) this.OLrzqt.getValue();
    }

    public static final C43043rho valueOf() {
        return C43047rhs.AEQbTJ.OLrzqt();
    }

    /* JADX INFO: renamed from: o.rjF$3, reason: invalid class name */
    public static final class AnonymousClass3 implements InterfaceC7340ahw {
        public final /* synthetic */ android.app.Application EZpvd;

        public AnonymousClass3(android.app.Application application) {
            this.EZpvd = application;
        }

        @Override // o.InterfaceC7340ahw
        public void EZpvd(java.lang.Throwable th) {
            InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
        }

        @Override // o.InterfaceC7340ahw
        public void OLrzqt() {
            final C43114rjF c43114rjF = C43114rjF.this;
            final android.app.Application application = this.EZpvd;
            C56433yFe.thread$default(false, false, null, null, 0, new Function0() { // from class: o.rjP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43114rjF.AnonymousClass3.AEQbTJ(c43114rjF, application);
                }
            }, 31, null);
            C43114rjF.this.fARcdN();
        }

        public static final Unit AEQbTJ(C43114rjF c43114rjF, android.app.Application application) {
            c43114rjF.DbNXlk().postValue(C43114rjF.Companion.copydefault(application));
            return Unit.INSTANCE;
        }
    }

    public final void gEmmrt() {
        InterfaceC7792aqX.TaskDescription.requestMlnHotReload$default(C43192rke.values, getApplication(), false, null, 6, null);
    }

    public final void AEQbTJ(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new DebugViewModel$clearCache$1(this, function0, null), 2, null);
    }

    public final void EZpvd(@NotNull ViewOnClickListenerC43147rjm viewOnClickListenerC43147rjm, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC43147rjm, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        new StateListAnimator(viewOnClickListenerC43147rjm).show(fragmentManager);
    }

    public final void OLrzqt(boolean z) {
        if (z) {
            return;
        }
        djBIcL();
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C43056riA.enterLua$default(C43056riA.AEQbTJ, context, "MLNTest.lua", null, 4, null);
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C43056riA.AEQbTJ.copydefault(context, "uidemo", "/home", C56424yEw.gEmmrt(C56390yDp.OLrzqt("checkupdate", "1"), C56390yDp.OLrzqt("isentry", "1")));
    }

    public final void fARcdN() {
        final java.util.Collection<java.lang.String> collectionCopydefault = values().copydefault();
        AbstractC58185ywX<ResponseData<java.util.List<MlnUpdateResp>>> abstractC58185ywXKWHzl = ((InterfaceC43191rkd) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC43191rkd.class), null, 1, null)).KWHzl("https://office-mobilecicdapi.okg.com/online-mobile/lua_api/lua_file_list");
        final Function1 function1 = new Function1() { // from class: o.rjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43114rjF.AEQbTJ(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.rjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C43114rjF.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        C33024moe.subscribeOnIO$default(abstractC58185ywXAEQbTJ, new Function1() { // from class: o.rjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43114rjF.copydefault((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.rjO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43114rjF.EZpvd(this.EZpvd, collectionCopydefault, (java.util.Map) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final java.util.Map EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.Map) function1.invoke(obj);
    }

    public static final java.util.Map AEQbTJ(C43114rjF c43114rjF, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List<MlnUpdateResp> list = (java.util.List) responseData.getData();
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (MlnUpdateResp mlnUpdateResp : list) {
                arrayList.add(new C43155rju(mlnUpdateResp, c43114rjF.copydefault(mlnUpdateResp.getMd5())));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : arrayList) {
                java.lang.String strKWHzl = ((C43155rju) obj).KWHzl();
                java.lang.Object arrayList2 = linkedHashMap.get(strKWHzl);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(strKWHzl, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj);
            }
            SortedMap sortedMapGEmmrt = C56423yEv.gEmmrt(linkedHashMap);
            if (sortedMapGEmmrt != null) {
                return sortedMapGEmmrt;
            }
        }
        return C56424yEw.KWHzl();
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C7870arw.copydefault("Reload teset packet failed. \n " + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C43114rjF c43114rjF, java.util.Collection collection, java.util.Map map) {
        c43114rjF.isConnected().setValue(map);
        if (!map.containsKey(c43114rjF.fetchVPNInfo().getValue())) {
            MutableLiveData<java.lang.String> mutableLiveDataFetchVPNInfo = c43114rjF.fetchVPNInfo();
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.RcXXUw(map.keySet());
            if (str == null) {
                str = "";
            }
            mutableLiveDataFetchVPNInfo.postValue(str);
        }
        for (java.util.List<C43155rju> list : map.values()) {
            Intrinsics.copydefault(list);
            for (C43155rju c43155rju : list) {
                c43155rju.OLrzqt().postValue(java.lang.Boolean.valueOf(collection.contains(c43155rju.EZpvd().getMd5())));
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final C43155rju c43155rju, @NotNull final AbstractC48864udi.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(c43155rju, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.lang.String strAEQbTJ = c43155rju.AEQbTJ();
        final java.lang.String strValueOf = c43155rju.valueOf();
        AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.rjM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                C43114rjF.AEQbTJ(this.AEQbTJ, c43155rju, strValueOf, actionBar, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(yBP.AEQbTJ()).subscribe(new TaskDescription(c43155rju, strValueOf, strAEQbTJ, actionBar, this));
    }

    public static final void AEQbTJ(C43114rjF c43114rjF, C43155rju c43155rju, java.lang.String str, AbstractC48864udi.ActionBar actionBar, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        new C33143mqr(c43114rjF.getApplication(), c43155rju.EZpvd().getUrl(), str, c43155rju.EZpvd().getMd5(), new ActionBar(actionBar, interfaceC58251yxk)).EZpvd();
    }

    /* JADX INFO: renamed from: o.rjF$ActionBar */
    public static final class ActionBar implements InterfaceC33145mqt {
        public final /* synthetic */ InterfaceC58251yxk<java.lang.String> OLrzqt;
        public final /* synthetic */ AbstractC48864udi.ActionBar copydefault;

        public ActionBar(AbstractC48864udi.ActionBar actionBar, InterfaceC58251yxk<java.lang.String> interfaceC58251yxk) {
            this.copydefault = actionBar;
            this.OLrzqt = interfaceC58251yxk;
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
            this.copydefault.AEQbTJ(j, j2);
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            this.OLrzqt.onError(new java.lang.Exception("Download failed, errorCode = " + i + ", desc = " + str));
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            InterfaceC58251yxk<java.lang.String> interfaceC58251yxk = this.OLrzqt;
            if (str == null) {
                str = "";
            }
            interfaceC58251yxk.onNext(str);
        }
    }

    /* JADX INFO: renamed from: o.rjF$TaskDescription */
    public static final class TaskDescription implements InterfaceC58256yxp<java.lang.String> {
        public final /* synthetic */ C43155rju AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ AbstractC48864udi.ActionBar KWHzl;
        public final /* synthetic */ C43114rjF OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
        }

        public TaskDescription(C43155rju c43155rju, java.lang.String str, java.lang.String str2, AbstractC48864udi.ActionBar actionBar, C43114rjF c43114rjF) {
            this.AEQbTJ = c43155rju;
            this.copydefault = str;
            this.EZpvd = str2;
            this.KWHzl = actionBar;
            this.OLrzqt = c43114rjF;
        }

        /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
        @Override // o.InterfaceC58256yxp
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onNext(java.lang.String str) throws java.lang.Throwable {
            Intrinsics.checkNotNullParameter(str, "");
            if (!C59449zhJ.gEmmrt(this.AEQbTJ.EZpvd().getMd5(), C33478mxH.KWHzl.OLrzqt(this.copydefault), true)) {
                this.OLrzqt.KWHzl(this.copydefault);
                this.KWHzl.OLrzqt(new java.lang.Exception("MD5 not match"));
            } else {
                C33550mya.OLrzqt(this.EZpvd, this.copydefault);
                this.KWHzl.EZpvd(this.EZpvd);
            }
            this.OLrzqt.KWHzl(this.AEQbTJ);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl.OLrzqt(th);
        }
    }

    public final void djBIcL() {
        java.util.Collection<java.util.List<C43155rju>> collectionValues;
        java.util.Map<java.lang.String, java.util.List<C43155rju>> value = isConnected().getValue();
        if (value != null && (collectionValues = value.values()) != null) {
            java.util.Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                java.util.Iterator it2 = ((java.util.List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((C43155rju) it2.next()).OLrzqt().postValue(java.lang.Boolean.FALSE);
                }
            }
        }
        values().KWHzl();
        RxBus.AEQbTJ(new C43128rjT());
    }

    public final void KWHzl(@NotNull C43155rju c43155rju) {
        java.util.Collection<java.util.List<C43155rju>> collectionValues;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(c43155rju, "");
            AEQbTJ(c43155rju.KWHzl(), c43155rju.EZpvd().getMd5());
            java.util.Collection<java.lang.String> collectionCopydefault = values().copydefault();
            java.util.Map<java.lang.String, java.util.List<C43155rju>> value = isConnected().getValue();
            if (value != null && (collectionValues = value.values()) != null) {
                java.util.Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    for (C43155rju c43155rju2 : (java.util.List) it.next()) {
                        c43155rju2.OLrzqt().postValue(java.lang.Boolean.valueOf(collectionCopydefault.contains(c43155rju2.EZpvd().getMd5())));
                    }
                }
            }
        }
    }

    public static /* synthetic */ java.lang.String getTestPacketFileDir$default(C43114rjF c43114rjF, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c43114rjF.copydefault(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(java.lang.String str) {
        java.lang.String str2;
        java.lang.String absolutePath = C7788aqT.AEQbTJ().AYXKKw().getAbsolutePath();
        if (str != null) {
            str2 = java.io.File.separator + str;
            if (str2 == null) {
                str2 = "";
            }
        }
        return absolutePath + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean KWHzl(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            if (file.exists()) {
                return file.delete();
            }
            return false;
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
            return false;
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        values().AEQbTJ(str, str2);
        RxBus.AEQbTJ(new C43128rjT());
    }

    public final boolean fJNWhG() {
        return values().djBIcL();
    }

    public final void KWHzl(boolean z) {
        SPUtils.put("lua_debug_mode", java.lang.Boolean.valueOf(z), "mln");
    }

    public final boolean AuCTel() {
        return SPUtils.getBoolean("lua_debug_mode", false, "mln");
    }

    public final void AEQbTJ(boolean z) {
        UDView.QKVWgx = z;
        OKSlidingTabLayout.KWHzl = z;
        SPUtils.put("lua_debug_key_mode", java.lang.Boolean.valueOf(z), "mln");
    }

    public final boolean ejfBZ() {
        return SPUtils.getBoolean("lua_debug_key_mode", false, "mln");
    }

    public final boolean fIwbmz() {
        return values().AYXKKw();
    }

    public final void copydefault(boolean z) {
        values().KWHzl(z);
    }

    public final java.util.List<C43155rju> AkhnZx() {
        java.util.List<C43155rju> list;
        java.util.Map<java.lang.String, java.util.List<C43155rju>> value = isConnected().getValue();
        return (value == null || (list = value.get(fetchVPNInfo().getValue())) == null) ? yDY.AhwBna() : list;
    }

    /* JADX INFO: renamed from: o.rjF$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, null, null, null, null, false, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = activity.AYXKKw;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = activity.EZpvd;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = activity.AhwBna;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = activity.AEQbTJ;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = activity.OLrzqt;
            }
            java.lang.String str11 = str6;
            if ((i & 64) != 0) {
                z = activity.KWHzl;
            }
            return activity.AEQbTJ(str, str7, str8, str9, str10, str11, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, str2, str3, str4, str5, str6, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.lang.String str = this.AYXKKw;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.AhwBna;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.AEQbTJ;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.OLrzqt;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DebugInfo(appId=" + this.copydefault + ", version=" + this.AYXKKw + ", md5=" + this.EZpvd + ", tag=" + this.AhwBna + ", fitVersion=" + this.AEQbTJ + ", diffMd5=" + this.OLrzqt + ", needShowDiffInfo=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        public Activity(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.AYXKKw = str2;
            this.EZpvd = str3;
            this.AhwBna = str4;
            this.AEQbTJ = str5;
            this.OLrzqt = str6;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:336) call: o.rjF.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null, (i & 64) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.rjF$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rjF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final Activity copydefault(@NotNull android.content.Context context) {
            java.lang.String strAkhnZx;
            java.lang.String str;
            java.lang.String str2;
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String strGEmmrt = C7326ahi.gEmmrt();
            if (!C7788aqT.AEQbTJ().values()) {
                if (C7788aqT.AEQbTJ().fetchVPNInfo()) {
                    strAkhnZx = C7788aqT.AEQbTJ().DbNXlk();
                    str = "TestPacket";
                } else {
                    java.lang.String strAEQbTJ = C7788aqT.AEQbTJ().AEQbTJ(context, "");
                    if (strAEQbTJ == null || !C59449zhJ.startsWith$default(strAEQbTJ, "file://android_asset/", false, 2, null)) {
                        strAkhnZx = C43192rke.values.AkhnZx();
                        str = null;
                    } else {
                        str2 = "BuiltIn";
                    }
                }
                return new Activity("oklua", strGEmmrt, strAkhnZx, str, null, null, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
            str2 = "HotReload";
            str = str2;
            strAkhnZx = null;
            return new Activity("oklua", strGEmmrt, strAkhnZx, str, null, null, false, WalletImportError.ERROR_CODE_AA_EXIST, null);
        }

        public final java.util.List<java.lang.String> OLrzqt() {
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.DXXBbs(C43047rhs.AEQbTJ.EZpvd()));
        }
    }

    /* JADX INFO: renamed from: o.rjF$StateListAnimator */
    public static final class StateListAnimator extends wXS {
        public final ViewOnClickListenerC43147rjm OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.wXS
        public java.lang.CharSequence copydefault() {
            return "White list update";
        }

        public StateListAnimator(@NotNull ViewOnClickListenerC43147rjm viewOnClickListenerC43147rjm) {
            Intrinsics.checkNotNullParameter(viewOnClickListenerC43147rjm, "");
            this.OLrzqt = viewOnClickListenerC43147rjm;
        }

        @Override // o.wXS
        public void copydefault(@NotNull LinearLayoutCompat linearLayoutCompat) {
            Intrinsics.checkNotNullParameter(linearLayoutCompat, "");
            AEQbTJ(linearLayoutCompat, "oklua").setOnClickListener(new View.OnClickListener() { // from class: o.rjN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C43114rjF.StateListAnimator.copydefault(this.copydefault, view);
                }
            });
            for (final java.lang.String str : C43114rjF.Companion.OLrzqt()) {
                AEQbTJ(linearLayoutCompat, str).setOnClickListener(new View.OnClickListener() { // from class: o.rjL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C43114rjF.StateListAnimator.EZpvd(this.EZpvd, str, view);
                    }
                });
            }
        }

        public static final void copydefault(StateListAnimator stateListAnimator, android.view.View view) {
            stateListAnimator.dismiss();
            stateListAnimator.OLrzqt.show();
            C43192rke.values.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), stateListAnimator.OLrzqt);
        }

        public static final void EZpvd(StateListAnimator stateListAnimator, java.lang.String str, android.view.View view) {
            stateListAnimator.dismiss();
            stateListAnimator.OLrzqt.show();
            stateListAnimator.OLrzqt.EZpvd();
            C43047rhs c43047rhs = C43047rhs.AEQbTJ;
            c43047rhs.copydefault(str, c43047rhs.copydefault(str), null, true, stateListAnimator.OLrzqt);
        }

        @Override // o.wXS, o.wXX
        public void onFooterCreated(@NotNull wYF wyf) {
            Intrinsics.checkNotNullParameter(wyf, "");
            super.onFooterCreated(wyf);
            wyf.setCancelText("Cancel");
        }
    }
}
