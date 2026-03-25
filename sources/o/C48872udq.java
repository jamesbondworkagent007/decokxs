package o;

import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.resource.request.DynamicResourceUpdateRequestBody;
import com.okinc.resource.request.DynamicResourceUpdateResp;
import com.okinc.rxutils.RxBus;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48864udi;
import o.C30360lVm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.udq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48872udq implements C30360lVm.StateListAnimator {
    public static final C48872udq AEQbTJ = new C48872udq();
    public static final C48834udE EZpvd = new C48834udE("DynamicResource");
    public static final java.util.Set<java.lang.String> AYXKKw = Collections.synchronizedSet(new LinkedHashSet());
    public static final java.util.Map<java.lang.String, java.lang.String> AhwBna = Collections.synchronizedMap(new LinkedHashMap());
    public static InterfaceC48871udp OLrzqt = new C48874uds();
    public static AbstractC48864udi KWHzl = new Activity();
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC48864udi OLrzqt() {
        return KWHzl;
    }

    private C48872udq() {
    }

    /* JADX INFO: renamed from: o.udq$Activity */
    public static final class Activity extends AbstractC48864udi {
        public Activity() {
            super("dynamicResource", false, 2, null);
        }

        @Override // o.AbstractC48864udi
        public boolean EZpvd(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) str2) && C48833udD.copydefault(str2, C48872udq.AEQbTJ.OLrzqt(str)) > 0;
            AEQbTJ().AEQbTJ(str, "should update: " + z);
            return z;
        }
    }

    public static /* synthetic */ void registerFileResourceId$default(C48872udq c48872udq, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c48872udq.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw.add(str);
        java.util.Map<java.lang.String, java.lang.String> map = AhwBna;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put(str, str2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = OLrzqt(str);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            return null;
        }
        AbstractC48864udi abstractC48864udi = KWHzl;
        Intrinsics.copydefault((java.lang.Object) strOLrzqt);
        return abstractC48864udi.AEQbTJ(str, strOLrzqt);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getString(java.lang.String.valueOf(str), null, "dynamic_resource");
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getString(str + "-fallback", null, "dynamic_resource");
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.String strOLrzqt = OLrzqt(str);
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) strOLrzqt)) {
            return;
        }
        SPUtils.put(java.lang.String.valueOf(str), str2, "dynamic_resource");
        SPUtils.put(str + "-fallback", strOLrzqt, "dynamic_resource");
        java.lang.String str3 = AhwBna.get(str);
        if (str3 != null) {
            RxBus.AEQbTJ(new Application(str3, str2));
        }
    }

    /* JADX INFO: renamed from: o.udq$PendingIntent */
    public static final class PendingIntent implements AbstractC48864udi.Application {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ AbstractC48864udi.ActionBar EZpvd;

        public PendingIntent(AbstractC48864udi.ActionBar actionBar, java.lang.String str) {
            this.EZpvd = actionBar;
            this.AEQbTJ = str;
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            AbstractC48864udi.Application.ActionBar.EZpvd(this, j, j2);
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this, str);
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
            AbstractC48864udi.ActionBar actionBar = this.EZpvd;
            java.lang.String strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ(this.AEQbTJ);
            Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
            actionBar.EZpvd(strAEQbTJ);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(C48860ude c48860ude, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            C48872udq.AEQbTJ.AEQbTJ(c48860ude.valueOf(), c48860ude.AhwBna());
            this.EZpvd.EZpvd(str);
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.EZpvd.OLrzqt(th);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull AbstractC48864udi.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        C48834udE c48834udE = EZpvd;
        c48834udE.AEQbTJ(str, "requestFileResourceByID called");
        PendingIntent pendingIntent = new PendingIntent(actionBar, str);
        if (!KWHzl.copydefault(str, pendingIntent)) {
            EZpvd(C56402yEa.EZpvd(str), new FragmentManager(str, pendingIntent), new LoaderManager(actionBar));
        } else {
            c48834udE.EZpvd(str, "requestFileResourceByID-> in progress");
        }
    }

    /* JADX INFO: renamed from: o.udq$FragmentManager */
    public static final class FragmentManager implements Function1<java.util.List<? extends C48860ude>, Unit> {
        public final /* synthetic */ PendingIntent KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(java.lang.String str, PendingIntent pendingIntent) {
            this.OLrzqt = str;
            this.KWHzl = pendingIntent;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.util.List<? extends C48860ude> list) {
            EZpvd(list);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.udi.download$default(o.udi, o.ude, o.udi$Application, boolean, int, java.lang.Object):void */
        public final void EZpvd(java.util.List<C48860ude> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C48872udq.EZpvd.AEQbTJ(this.OLrzqt, "requestFileResourceByID onSuccess");
            AbstractC48864udi.download$default(C48872udq.AEQbTJ.OLrzqt(), list.get(0), this.KWHzl, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.udq$LoaderManager */
    public static final class LoaderManager implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ AbstractC48864udi.ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(AbstractC48864udi.ActionBar actionBar) {
            this.copydefault = actionBar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.copydefault.OLrzqt(th);
        }
    }

    public final DynamicResourceUpdateRequestBody EZpvd() {
        java.util.Set<java.lang.String> set = AYXKKw;
        if (set.isEmpty()) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(set, "");
        java.util.List<java.lang.String> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set);
        EZpvd.AEQbTJ(CollectionsKt___CollectionsKt.joinToString$default(listAxsJAYsNCnLh, null, null, null, 0, null, null, 63, null), "getBatchUpdateParams");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.String str : listAxsJAYsNCnLh) {
            C48872udq c48872udq = AEQbTJ;
            Intrinsics.copydefault((java.lang.Object) str);
            java.lang.String strOLrzqt = c48872udq.OLrzqt(str);
            if (strOLrzqt != null) {
                linkedHashMap.put(str, strOLrzqt);
            }
        }
        return new DynamicResourceUpdateRequestBody("", listAxsJAYsNCnLh, linkedHashMap);
    }

    public final void KWHzl(java.util.List<DynamicResourceUpdateResp> list, java.lang.Throwable th) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            Intrinsics.copydefault(list);
            java.util.ArrayList<C48860ude> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AEQbTJ.KWHzl((DynamicResourceUpdateResp) it.next()));
            }
            for (C48860ude c48860ude : arrayList) {
                AbstractC48864udi.download$default(KWHzl, c48860ude, new StateListAnimator(c48860ude), false, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.udq$StateListAnimator */
    public static final class StateListAnimator implements AbstractC48864udi.Application {
        public final /* synthetic */ C48860ude AEQbTJ;

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
        }

        public StateListAnimator(C48860ude c48860ude) {
            this.AEQbTJ = c48860ude;
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            AbstractC48864udi.Application.ActionBar.EZpvd(this, j, j2);
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            AbstractC48864udi.Application.ActionBar.EZpvd(this, th);
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this, str);
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(C48860ude c48860ude, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            C48872udq.AEQbTJ.AEQbTJ(this.AEQbTJ.valueOf(), this.AEQbTJ.AhwBna());
        }
    }

    public final C48860ude KWHzl(DynamicResourceUpdateResp dynamicResourceUpdateResp) {
        return new C48860ude(dynamicResourceUpdateResp.getFileId(), dynamicResourceUpdateResp.getMd5(), dynamicResourceUpdateResp.getVersion(), dynamicResourceUpdateResp.getUrl(), null, 16, null);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.udq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void doRequest$default(C48872udq c48872udq, java.util.List list, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: o.udo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C48872udq.OLrzqt((java.lang.Throwable) obj2);
                }
            };
        }
        c48872udq.EZpvd((java.util.List<java.lang.String>) list, (Function1<? super java.util.List<C48860ude>, Unit>) function1, (Function1<? super java.lang.Throwable, Unit>) function12);
    }

    public final void EZpvd(java.util.List<java.lang.String> list, Function1<? super java.util.List<C48860ude>, Unit> function1, Function1<? super java.lang.Throwable, Unit> function12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.String str : list) {
            java.lang.String strOLrzqt = AEQbTJ.OLrzqt(str);
            if (strOLrzqt != null) {
                linkedHashMap.put(str, strOLrzqt);
            }
        }
        C33024moe.subscribeOnIO$default(InterfaceC48877udv.Companion.OLrzqt(new DynamicResourceUpdateRequestBody("", list, linkedHashMap)), new ActionBar(function12), (Function0) null, new TaskDescription(function1, function12), 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.udq$ActionBar */
    public static final class ActionBar implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ Function1<java.lang.Throwable, Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super java.lang.Throwable, Unit> function1) {
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl.invoke(th);
        }
    }

    /* JADX INFO: renamed from: o.udq$TaskDescription */
    public static final class TaskDescription implements Function1<ResponseData<java.util.List<? extends DynamicResourceUpdateResp>>, Unit> {
        public final /* synthetic */ Function1<java.util.List<C48860ude>, Unit> KWHzl;
        public final /* synthetic */ Function1<java.lang.Throwable, Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<o.ude>, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function1<? super java.util.List<C48860ude>, Unit> function1, Function1<? super java.lang.Throwable, Unit> function12) {
            this.KWHzl = function1;
            this.OLrzqt = function12;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<java.util.List<? extends DynamicResourceUpdateResp>> responseData) {
            AEQbTJ(responseData);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(ResponseData<java.util.List<DynamicResourceUpdateResp>> responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                Function1<java.util.List<C48860ude>, Unit> function1 = this.KWHzl;
                java.util.List<DynamicResourceUpdateResp> data = responseData.getData();
                Intrinsics.copydefault(data);
                java.util.List<DynamicResourceUpdateResp> list = data;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C48872udq.AEQbTJ.KWHzl((DynamicResourceUpdateResp) it.next()));
                }
                function1.invoke(arrayList);
                return;
            }
            this.OLrzqt.invoke(new java.lang.Exception(responseData.getErrorMsg()));
        }
    }

    private final java.util.List<java.io.File> KWHzl(java.lang.String str) {
        java.lang.String strCopydefault = copydefault(str);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            java.io.File[] fileArrListFiles = OLrzqt.copydefault(KWHzl.AEQbTJ(str, (java.lang.String) null)).listFiles();
            if (fileArrListFiles == null) {
                return yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.io.File file : fileArrListFiles) {
                if (file.isDirectory() && C48833udD.copydefault(file.getName(), strCopydefault) < 0) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    @Override // o.C30360lVm.StateListAnimator
    public long OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.Set<java.lang.String> set = AYXKKw;
        Intrinsics.checkNotNullExpressionValue(set, "");
        long jAEQbTJ = 0;
        for (java.lang.String str : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set)) {
            C48872udq c48872udq = AEQbTJ;
            Intrinsics.copydefault((java.lang.Object) str);
            java.util.Iterator<T> it = c48872udq.KWHzl(str).iterator();
            while (it.hasNext()) {
                jAEQbTJ += C30360lVm.KWHzl.AEQbTJ((java.io.File) it.next());
            }
        }
        return jAEQbTJ;
    }

    @Override // o.C30360lVm.StateListAnimator
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.Set<java.lang.String> set = AYXKKw;
        Intrinsics.checkNotNullExpressionValue(set, "");
        for (java.lang.String str : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set)) {
            C48872udq c48872udq = AEQbTJ;
            Intrinsics.copydefault((java.lang.Object) str);
            for (java.io.File file : c48872udq.KWHzl(str)) {
                C48834udE c48834udE = EZpvd;
                java.lang.String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                c48834udE.AEQbTJ("clearCache", absolutePath);
                yFL.AkhnZx(file);
            }
        }
    }

    /* JADX INFO: renamed from: o.udq$Application */
    public static final class Application extends RxBus.TaskDescription {
        public final java.lang.String OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str2;
        }
    }
}
