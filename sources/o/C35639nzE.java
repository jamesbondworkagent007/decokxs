package o;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.im.bean.ContactType;
import com.okinc.im.imui.contacts.SelectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1;
import com.okinc.im.imui.contacts.SelectableContactListFragment$onResume$1;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.ActivityC35548nxT;
import o.C32113mPz;
import o.C35399nuc;
import o.C52761wXj;
import o.InterfaceC43315rmv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C35639nzE extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public android.view.View AEQbTJ;
    public android.widget.EditText AYXKKw;
    public final LoaderManager AhwBna;
    public android.widget.ImageView AkhnZx;
    public oIS DbNXlk;
    public final java.util.ArrayList<java.lang.Object> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C43319rmz djBIcL;
    public android.widget.TextView ejfBZ;
    public final C59534zip fARcdN;
    public C55237xgE fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public RecyclerView fetchVPNInfo;
    public boolean gEmmrt;
    public android.view.View getFieldNames;
    public android.view.View getNewProxyInstance;
    public android.view.ViewGroup isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public final InterfaceC56387yDm valueOf;
    public boolean values;
    public final int EZpvd = C35399nuc.Dialog.fFgQHt;
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.nzF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35639nzE.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.util.List<? extends java.lang.Object> list, java.util.List<? extends java.lang.Object> list2) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.nzE$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final class Application extends AbstractC37675oyM<java.lang.Object> {

        /* JADX INFO: renamed from: o.nzE$Application$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ContactType.values().length];
                try {
                    iArr[ContactType.ALL_FRIEND.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ContactType.BOTH_FRIEND.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ContactType.SINGLE_FRIEND.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX INFO: renamed from: o.nzE$Application$Application, reason: collision with other inner class name */
        public static final class C0898Application implements Flow<java.util.List<? extends java.lang.Object>> {
            public final /* synthetic */ C35639nzE OLrzqt;
            public final /* synthetic */ Flow copydefault;

            /* JADX INFO: renamed from: o.nzE$Application$Application$3, reason: invalid class name */
            public static final class AnonymousClass3<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector AEQbTJ;
                public final /* synthetic */ C35639nzE copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass3(FlowCollector flowCollector, C35639nzE c35639nzE) {
                    this.AEQbTJ = flowCollector;
                    this.copydefault = c35639nzE;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x015a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                    SelectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1 selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1;
                    C35551nxW c35551nxW;
                    FlowCollector flowCollector;
                    boolean zIsBothFriend;
                    FlowCollector flowCollector2;
                    if (continuation instanceof SelectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1) {
                        selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1 = (SelectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1) continuation;
                        int i = selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1 = new SelectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    java.lang.Object objAEQbTJ = selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.result;
                    java.lang.Object objCopydefault = C56442yFn.copydefault();
                    int i2 = selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.label;
                    int i3 = 1;
                    int i4 = 2;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(objAEQbTJ);
                        FlowCollector flowCollector3 = this.AEQbTJ;
                        java.util.List list = (java.util.List) obj;
                        C44124sEe.imLogContact$default("ContactListLiveData > loadOriginal: initial size=" + list.size(), null, 2, null);
                        java.util.List listCopydefault = this.copydefault.copydefault();
                        boolean zDbNXlk = this.copydefault.DbNXlk();
                        c35551nxW = C35551nxW.copydefault;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (T t : list) {
                            RelationInfo relationInfo = (RelationInfo) t;
                            C44124sEe.imLogContact$default("ContactListLiveData > loadOriginal: Filtering on Contact Type: " + this.copydefault.OLrzqt(), null, i4, null);
                            int i5 = TaskDescription.EZpvd[this.copydefault.OLrzqt().ordinal()];
                            if (i5 == 1) {
                                zIsBothFriend = true;
                            } else if (i5 == i4) {
                                zIsBothFriend = relationInfo.isBothFriend();
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!relationInfo.isFriend() || relationInfo.isBothFriend()) {
                                    zIsBothFriend = false;
                                }
                            }
                            C44124sEe.imLogContact$default("ContactListLiveData > loadOriginal: Checking excludedIds (exclusion list size: " + listCopydefault.size() + ")", null, 2, null);
                            boolean zContains = listCopydefault.contains(relationInfo.getContactsId());
                            C44124sEe.imLogContact$default("ContactListLiveData > loadOriginal: Checking self removal", null, 2, null);
                            boolean z = (zDbNXlk && relationInfo.isCurrentUser()) ? false : true;
                            if (zIsBothFriend && (!zContains) && z) {
                                arrayList.add(t);
                            }
                            i3 = 1;
                            i4 = 2;
                        }
                        selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$0 = flowCollector3;
                        selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$1 = c35551nxW;
                        selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.label = i3;
                        java.lang.Object objEZpvd = c35551nxW.EZpvd(arrayList, selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        flowCollector = flowCollector3;
                        objAEQbTJ = objEZpvd;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C56391yDq.AEQbTJ(objAEQbTJ);
                                return Unit.INSTANCE;
                            }
                            FlowCollector flowCollector4 = (FlowCollector) selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$0;
                            C56391yDq.AEQbTJ(objAEQbTJ);
                            flowCollector2 = flowCollector4;
                            selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$0 = null;
                            selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.label = 3;
                            if (flowCollector2.emit(objAEQbTJ, selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                        C35551nxW c35551nxW2 = (C35551nxW) selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$1;
                        FlowCollector flowCollector5 = (FlowCollector) selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$0;
                        C56391yDq.AEQbTJ(objAEQbTJ);
                        c35551nxW = c35551nxW2;
                        flowCollector = flowCollector5;
                    }
                    selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$0 = flowCollector;
                    selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$1 = null;
                    selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.label = 2;
                    objAEQbTJ = c35551nxW.AEQbTJ((java.util.List) objAEQbTJ, selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1);
                    flowCollector2 = flowCollector;
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.L$0 = null;
                    selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1.label = 3;
                    if (flowCollector2.emit(objAEQbTJ, selectableContactListFragment$ContactListLiveData$loadOriginal$$inlined$map$1$2$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public C0898Application(Flow flow, C35639nzE c35639nzE) {
                this.copydefault = flow;
                this.OLrzqt = c35639nzE;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(FlowCollector<? super java.util.List<? extends java.lang.Object>> flowCollector, Continuation continuation) {
                java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector, this.OLrzqt), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        @Override // o.AbstractC37675oyM
        public AbstractC58185ywX<java.util.List<java.lang.Object>> OLrzqt(long j) {
            return RxConvertKt.asFlowable(new C0898Application(C35639nzE.this.gEmmrt().AEQbTJ().AEQbTJ().OLrzqt(), C35639nzE.this), sDN.copydefault.copydefault());
        }

        @Override // o.AbstractC37675oyM
        public java.util.List<java.lang.Object> KWHzl(java.lang.String str, @NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (str == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
                return list;
            }
            C44124sEe.imLogContact$default("ContactListLiveData > onFilter: keyword=" + str, null, 2, null);
            boolean zAEQbTJ = C44157sFk.AEQbTJ();
            java.util.List listOLrzqt = C56404yEc.OLrzqt((java.lang.Iterable<?>) list, RelationInfo.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listOLrzqt) {
                RelationInfo relationInfo = (RelationInfo) obj;
                if ((zAEQbTJ && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) relationInfo.getContactsId(), (java.lang.CharSequence) str, true)) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) relationInfo.getRemarkName(), (java.lang.CharSequence) str, true) || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) C44170sFx.copydefault(relationInfo), (java.lang.CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        @Override // o.AbstractC37675oyM
        public void copydefault(java.lang.String str, @NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C44124sEe.imLogContact$default("ContactListLiveData > onFilterCompleted: keyword=" + str, null, 2, null);
            if (C35639nzE.this.fARcdN()) {
                C35639nzE.this.djBIcL().copydefault();
                C44124sEe.imLogContact$default("ContactListLiveData > onFilterCompleted: mSelectableDelegate.notifyAllItemsChanged()", null, 2, null);
            }
            C35639nzE.this.KWHzl(list.isEmpty());
        }
    }

    public C35639nzE() {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.KWHzl = arrayList;
        this.AhwBna = new LoaderManager(arrayList);
        this.gEmmrt = true;
        this.fARcdN = new C59534zip();
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.nzI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35639nzE.ejfBZ(this.copydefault);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nzH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35639nzE.fIwbmz(this.EZpvd);
            }
        });
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.nzK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35639nzE.fARcdN(this.KWHzl);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nzM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35639nzE.isConnected(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.nzE$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nzE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.nzE$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C35639nzE newInstance$default(Activity activity, SelectableDelegate.Mode mode, boolean z, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z2, ContactType contactType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mode = SelectableDelegate.Mode.NONE;
            }
            boolean z3 = (i & 2) != 0 ? false : z;
            if ((i & 4) != 0) {
                arrayList = new java.util.ArrayList(0);
            }
            java.util.ArrayList arrayList3 = arrayList;
            if ((i & 8) != 0) {
                arrayList2 = new java.util.ArrayList(0);
            }
            java.util.ArrayList arrayList4 = arrayList2;
            boolean z4 = (i & 16) == 0 ? z2 : false;
            if ((i & 32) != 0) {
                contactType = ContactType.ALL_FRIEND;
            }
            return activity.EZpvd(mode, z3, arrayList3, arrayList4, z4, contactType);
        }

        public final C35639nzE EZpvd(@NotNull SelectableDelegate.Mode mode, boolean z, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.ArrayList<java.lang.String> arrayList2, boolean z2, @NotNull ContactType contactType) {
            Intrinsics.checkNotNullParameter(mode, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(contactType, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(OtcExtraKeys.MODE, mode);
            bundle.putBoolean("filterable", z);
            bundle.putBoolean("hide_myself", z2);
            bundle.putStringArrayList("exclude_ids", arrayList);
            bundle.putStringArrayList("selected_ids", arrayList2);
            bundle.putParcelable("user_type", contactType);
            C35639nzE c35639nzE = new C35639nzE();
            c35639nzE.setArguments(bundle);
            return c35639nzE;
        }
    }

    public final InterfaceC35180nqU gEmmrt() {
        return (InterfaceC35180nqU) this.AuCTel.getValue();
    }

    public static final InterfaceC35180nqU EZpvd() {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            return interfaceC35180nqU;
        }
        throw new java.lang.IllegalArgumentException("OKIM Service not available".toString());
    }

    /* JADX INFO: renamed from: o.nzE$LoaderManager */
    public static final class LoaderManager extends AbstractC35896oHs {
        public LoaderManager(java.util.ArrayList<java.lang.Object> arrayList) {
            super(arrayList);
        }

        @Override // o.AbstractC35896oHs
        public java.lang.String OLrzqt(int i) {
            java.util.List<?> items = getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            return C35639nzE.this.OLrzqt(i, CollectionsKt___CollectionsKt.AkhnZx(items, i));
        }
    }

    /* JADX INFO: renamed from: o.nzE$FragmentManager */
    public static final class FragmentManager extends SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> {
        public FragmentManager(SelectableDelegate.Mode mode, LoaderManager loaderManager) {
            super(mode, loaderManager);
        }

        @Override // com.okinc.im.widgets.SelectableDelegate
        public boolean OLrzqt(int i) {
            C35639nzE c35639nzE = C35639nzE.this;
            return c35639nzE.copydefault(i, CollectionsKt___CollectionsKt.AkhnZx(c35639nzE.KWHzl, i));
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(I)Ljava/lang/Object; */
        @Override // com.okinc.im.widgets.SelectableDelegate
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.String copydefault(int i) {
            java.lang.Object obj = C35639nzE.this.KWHzl.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj instanceof RelationInfo ? ((RelationInfo) obj).getContactsId() : "";
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)I */
        @Override // com.okinc.im.widgets.SelectableDelegate
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public int copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int i = 0;
            for (java.lang.Object obj : C35639nzE.this.KWHzl) {
                if ((obj instanceof RelationInfo) && Intrinsics.EZpvd((java.lang.Object) ((RelationInfo) obj).getContactsId(), (java.lang.Object) str)) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        @Override // com.okinc.im.widgets.SelectableDelegate
        public void KWHzl(int i) {
            super.KWHzl(i);
            C35639nzE.this.copydefault(i);
        }

        @Override // com.okinc.im.widgets.SelectableDelegate
        public void EZpvd(SelectableDelegate.Mode mode) {
            Intrinsics.checkNotNullParameter(mode, "");
            C35639nzE.this.copydefault(mode);
        }
    }

    public final FragmentManager djBIcL() {
        return (FragmentManager) this.fJNWhG.getValue();
    }

    public static final FragmentManager ejfBZ(C35639nzE c35639nzE) {
        return c35639nzE.new FragmentManager(c35639nzE.fIwbmz(), c35639nzE.AhwBna);
    }

    public void copydefault(@NotNull SelectableDelegate.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "");
        fetchVPNInfo();
    }

    public void copydefault(int i) {
        fetchVPNInfo();
    }

    public static final Application fIwbmz(C35639nzE c35639nzE) {
        return c35639nzE.new Application();
    }

    public final Application AhwBna() {
        return (Application) this.valueOf.getValue();
    }

    public final boolean DbNXlk() {
        return requireArguments().getBoolean("hide_myself", false);
    }

    private final SelectableDelegate.Mode fIwbmz() {
        return (SelectableDelegate.Mode) this.iwGUEr.getValue();
    }

    public static final SelectableDelegate.Mode fARcdN(C35639nzE c35639nzE) {
        SelectableDelegate.Mode mode;
        if (Build.VERSION.SDK_INT >= 33) {
            mode = (SelectableDelegate.Mode) c35639nzE.requireArguments().getParcelable(OtcExtraKeys.MODE, SelectableDelegate.Mode.class);
        } else {
            mode = (SelectableDelegate.Mode) c35639nzE.requireArguments().getParcelable(OtcExtraKeys.MODE);
        }
        return mode == null ? SelectableDelegate.Mode.NONE : mode;
    }

    public final java.util.List<java.lang.String> copydefault() {
        java.lang.Iterable stringArrayList = requireArguments().getStringArrayList("exclude_ids");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = stringArrayList.iterator();
        while (it.hasNext()) {
            java.lang.String string = ((java.lang.String) it.next()).toString();
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    public final java.util.List<java.lang.String> AYXKKw() {
        java.lang.Iterable stringArrayList = requireArguments().getStringArrayList("selected_ids");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = stringArrayList.iterator();
        while (it.hasNext()) {
            java.lang.String string = ((java.lang.String) it.next()).toString();
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    public final ContactType OLrzqt() {
        return (ContactType) this.OLrzqt.getValue();
    }

    public static final ContactType isConnected(C35639nzE c35639nzE) {
        ContactType contactType;
        if (Build.VERSION.SDK_INT >= 33) {
            contactType = (ContactType) c35639nzE.requireArguments().getParcelable("user_type", ContactType.class);
        } else {
            contactType = (ContactType) c35639nzE.requireArguments().getParcelable("user_type");
        }
        return contactType == null ? ContactType.ALL_FRIEND : contactType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fARcdN() {
        return djBIcL().KWHzl();
    }

    private final boolean values() {
        return requireArguments().getBoolean("filterable");
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.fIwbmz = (C55237xgE) view.findViewById(C35399nuc.StateListAnimator.HrFqwD);
        this.isConnected = (android.view.ViewGroup) view.findViewById(C35399nuc.StateListAnimator.itxZVF);
        this.ejfBZ = (android.widget.TextView) view.findViewById(C35399nuc.StateListAnimator.DjWNei);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(C35399nuc.StateListAnimator.zYHWMc);
        this.AYXKKw = editText;
        RecyclerView recyclerView = null;
        if (editText == null) {
            Intrinsics.gEmmrt("");
            editText = null;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C33606mzd.copydefault(editText, viewLifecycleOwner, new Function1() { // from class: o.nzJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35639nzE.copydefault(this.AEQbTJ, (java.lang.CharSequence) obj);
            }
        });
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(C35399nuc.StateListAnimator.atDTRm);
        this.AkhnZx = imageView;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.nzL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C35639nzE.EZpvd(this.EZpvd, view2);
            }
        });
        android.view.View viewFindViewById = view.findViewById(C35399nuc.StateListAnimator.sSMYrx);
        this.AEQbTJ = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        oIS ois = (oIS) view.findViewById(C35399nuc.StateListAnimator.aappFQ);
        this.DbNXlk = ois;
        if (ois == null) {
            Intrinsics.gEmmrt("");
            ois = null;
        }
        RecyclerView.ItemAnimator itemAnimator = ois.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setChangeDuration(0L);
        }
        oIS ois2 = this.DbNXlk;
        if (ois2 == null) {
            Intrinsics.gEmmrt("");
            ois2 = null;
        }
        ois2.setLayoutManager(C33047mpA.KWHzl(requireContext()));
        KWHzl(this.AhwBna);
        oIS ois3 = this.DbNXlk;
        if (ois3 == null) {
            Intrinsics.gEmmrt("");
            ois3 = null;
        }
        ois3.setAdapter(this.AhwBna);
        oIS ois4 = this.DbNXlk;
        if (ois4 == null) {
            Intrinsics.gEmmrt("");
            ois4 = null;
        }
        ois4.setIndexBarTextColor(C32113mPz.ActionBar.iwGUEr);
        oIS ois5 = this.DbNXlk;
        if (ois5 == null) {
            Intrinsics.gEmmrt("");
            ois5 = null;
        }
        ois5.setIndexBarVisibility(false);
        oIS ois6 = this.DbNXlk;
        if (ois6 == null) {
            Intrinsics.gEmmrt("");
            ois6 = null;
        }
        ois6.setPreviewVisibility(false);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(C35399nuc.StateListAnimator.fAklCm);
        this.fetchVPNInfo = recyclerView2;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView2.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setChangeDuration(0L);
        }
        RecyclerView recyclerView3 = this.fetchVPNInfo;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(C33047mpA.OLrzqt(requireContext()));
        this.fARcdN.register(RelationInfo.class, new ActionBar());
        RecyclerView recyclerView4 = this.fetchVPNInfo;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView = recyclerView4;
        }
        recyclerView.setAdapter(this.fARcdN);
        this.djBIcL = new C43319rmz(this.fARcdN, new StateListAnimator());
        this.getNewProxyInstance = view.findViewById(C35399nuc.StateListAnimator.DUUtXg);
        this.getFieldNames = view.findViewById(C35399nuc.StateListAnimator.jh);
    }

    public static final Unit copydefault(C35639nzE c35639nzE, java.lang.CharSequence charSequence) {
        android.widget.ImageView imageView = c35639nzE.AkhnZx;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setVisibility(C33129mqd.OLrzqt(charSequence) ? 0 : 8);
        oIS ois = c35639nzE.DbNXlk;
        if (ois == null) {
            Intrinsics.gEmmrt("");
            ois = null;
        }
        ois.setIndexBarVisibility(false);
        c35639nzE.values = true;
        c35639nzE.KWHzl(charSequence != null ? charSequence.toString() : null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C35639nzE c35639nzE, android.view.View view) {
        android.widget.EditText editText = c35639nzE.AYXKKw;
        if (editText == null) {
            Intrinsics.gEmmrt("");
            editText = null;
        }
        editText.setText((java.lang.CharSequence) null);
    }

    /* JADX INFO: renamed from: o.nzE$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC43315rmv.Application {
        @Override // o.InterfaceC43315rmv.Application
        public java.lang.Object KWHzl(int i, int i2) {
            return null;
        }

        @Override // o.InterfaceC43315rmv.Application
        public boolean KWHzl(java.lang.Object obj, java.lang.Object obj2) {
            return true;
        }

        @Override // o.InterfaceC43315rmv.Application
        public boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
            if ((obj instanceof RelationInfo) && (obj2 instanceof RelationInfo)) {
                return Intrinsics.EZpvd((java.lang.Object) ((RelationInfo) obj).getContactsId(), (java.lang.Object) ((RelationInfo) obj2).getContactsId());
            }
            return false;
        }
    }

    public final android.widget.TextView valueOf() {
        android.widget.TextView textView = this.ejfBZ;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Application applicationAhwBna = AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C55237xgE c55237xgE = this.fIwbmz;
        if (c55237xgE == null) {
            Intrinsics.gEmmrt("");
            c55237xgE = null;
        }
        applicationAhwBna.observe(viewLifecycleOwner, new Dialog(c55237xgE, AhwBna(), C52761wXj.FragmentManager.fIwbmz));
    }

    /* JADX INFO: renamed from: o.nzE$Dialog */
    public static final class Dialog extends AbstractC32943mnC<java.lang.Object> {
        public Dialog(C55237xgE c55237xgE, Application application, int i) {
            super(c55237xgE, application, i);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32943mnC, o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault */
        public boolean KWHzl(java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return C35639nzE.this.KWHzl(list);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(java.util.List<? extends java.lang.Object> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.AEQbTJ(list, view);
            C44124sEe.imLogContact$default("ContactListLiveData > setupContent (list size: " + list.size(), null, 2, null);
            C35639nzE c35639nzE = C35639nzE.this;
            c35639nzE.copydefault(list, c35639nzE.gEmmrt);
            C35639nzE.this.gEmmrt = false;
            C35639nzE c35639nzE2 = C35639nzE.this;
            c35639nzE2.OLrzqt(list, c35639nzE2.AhwBna().valueOf());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C35639nzE.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, java.util.List<? extends java.lang.Object> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, list, view);
            C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            C35639nzE.this.KWHzl(false);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C35639nzE.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(java.util.List<? extends java.lang.Object> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.copydefault(list, view);
            C35639nzE.this.AEQbTJ(list, view);
            C35639nzE.this.KWHzl(false);
            C35639nzE c35639nzE = C35639nzE.this;
            c35639nzE.OLrzqt(list, c35639nzE.AhwBna().valueOf());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C35639nzE.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public void AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list, android.view.View view) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(list, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPRGtXKC);
        if (view == null || (textView = (android.widget.TextView) view.findViewById(C35399nuc.StateListAnimator.vqBjd)) == null) {
            return;
        }
        textView.setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        textView.setText(C35399nuc.LoaderManager.AxsJAYaxsJAY);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, drawableKWHzl, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    public boolean KWHzl(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!AhwBna().gEmmrt()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof RelationInfo) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void copydefault(java.util.List<? extends java.lang.Object> list, boolean z) {
        this.KWHzl.clear();
        this.KWHzl.addAll(list);
        this.AhwBna.notifyDataSetChanged();
        if (z) {
            EZpvd(AYXKKw());
        }
        fetchVPNInfo();
        if (this.values) {
            android.widget.EditText editText = this.AYXKKw;
            if (editText == null) {
                Intrinsics.gEmmrt("");
                editText = null;
            }
            editText.postDelayed(new java.lang.Runnable() { // from class: o.nzG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C35639nzE.fJNWhG(this.OLrzqt);
                }
            }, 100L);
        }
        this.values = false;
    }

    public static final void fJNWhG(C35639nzE c35639nzE) {
        android.widget.EditText editText = c35639nzE.AYXKKw;
        if (editText == null) {
            Intrinsics.gEmmrt("");
            editText = null;
        }
        editText.requestFocus();
    }

    public final void EZpvd(java.util.List<java.lang.String> list) {
        if (fARcdN()) {
            FragmentManager fragmentManagerDjBIcL = djBIcL();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int iCopydefault = fragmentManagerDjBIcL.copydefault((java.lang.String) it.next());
                if (iCopydefault >= 0) {
                    fragmentManagerDjBIcL.copydefault(iCopydefault, true);
                }
            }
        }
    }

    public final void fetchVPNInfo() {
        final java.util.List<RelationInfo> listIsConnected = isConnected();
        int i = ((listIsConnected.isEmpty() ^ true) && fIwbmz() == SelectableDelegate.Mode.MULTIPLE) ? 0 : 8;
        RecyclerView recyclerView = this.fetchVPNInfo;
        C43319rmz c43319rmz = null;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        if (recyclerView.getVisibility() == i) {
            C43319rmz c43319rmz2 = this.djBIcL;
            if (c43319rmz2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c43319rmz = c43319rmz2;
            }
            c43319rmz.OLrzqt(listIsConnected);
            return;
        }
        android.view.View view = getView();
        Intrinsics.copydefault(view, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (viewGroup.getLayoutTransition() == null) {
            viewGroup.setLayoutTransition(new android.animation.LayoutTransition());
        }
        if (i == 0) {
            RecyclerView recyclerView3 = this.fetchVPNInfo;
            if (recyclerView3 == null) {
                Intrinsics.gEmmrt("");
                recyclerView3 = null;
            }
            recyclerView3.setVisibility(i);
            long duration = viewGroup.getLayoutTransition().getDuration(0);
            RecyclerView recyclerView4 = this.fetchVPNInfo;
            if (recyclerView4 == null) {
                Intrinsics.gEmmrt("");
                recyclerView4 = null;
            }
            recyclerView4.postDelayed(new java.lang.Runnable() { // from class: o.nzN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C35639nzE.KWHzl(this.OLrzqt, listIsConnected);
                }
            }, duration);
        } else {
            RecyclerView recyclerView5 = this.fetchVPNInfo;
            if (recyclerView5 == null) {
                Intrinsics.gEmmrt("");
                recyclerView5 = null;
            }
            recyclerView5.setVisibility(i);
            C43319rmz c43319rmz3 = this.djBIcL;
            if (c43319rmz3 == null) {
                Intrinsics.gEmmrt("");
                c43319rmz3 = null;
            }
            c43319rmz3.OLrzqt(listIsConnected);
        }
        RecyclerView recyclerView6 = this.fetchVPNInfo;
        if (recyclerView6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView2 = recyclerView6;
        }
        recyclerView2.setVisibility(i);
    }

    public static final void KWHzl(C35639nzE c35639nzE, java.util.List list) {
        C43319rmz c43319rmz = c35639nzE.djBIcL;
        if (c43319rmz == null) {
            Intrinsics.gEmmrt("");
            c43319rmz = null;
        }
        c43319rmz.OLrzqt(list);
    }

    public final java.util.List<RelationInfo> isConnected() {
        java.lang.Object next;
        java.util.List<java.lang.Object> listValueOf = AhwBna().valueOf();
        if (listValueOf == null || listValueOf.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.List<java.lang.String> listEZpvd = djBIcL().EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(listEZpvd.size());
        for (java.lang.String str : listEZpvd) {
            java.util.Iterator<T> it = listValueOf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ((next instanceof RelationInfo) && android.text.TextUtils.equals(((RelationInfo) next).getContactsId(), str)) {
                    break;
                }
            }
            if (next != null) {
                arrayList.add((RelationInfo) next);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), sDN.copydefault.copydefault(), null, new SelectableContactListFragment$onResume$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.nzE$Fragment */
    public static final class Fragment extends C33653nAw {
        public Fragment() {
        }

        @Override // o.C33653nAw
        public SelectableDelegate<RecyclerView.ViewHolder, java.lang.String> OLrzqt() {
            return C35639nzE.this.djBIcL();
        }

        @Override // o.C33653nAw
        public java.lang.String AEQbTJ() {
            return C35639nzE.this.AhwBna().AEQbTJ();
        }

        @Override // o.C33653nAw
        public void copydefault(C43312rms<nNW> c43312rms, RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(relationInfo, "");
            C35639nzE.this.OLrzqt(c43312rms, relationInfo);
        }
    }

    public void KWHzl(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        c59534zip.register(RelationInfo.class, new Fragment());
        c59534zip.register(java.lang.String.class, new TaskDescription());
    }

    public java.lang.String OLrzqt(int i, java.lang.Object obj) {
        if (obj instanceof RelationInfo) {
            RelationInfo relationInfo = (RelationInfo) obj;
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) relationInfo.getDisplayAlphabetText())) {
                java.lang.String strSubstring = relationInfo.getDisplayAlphabetText().substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return strSubstring;
            }
        } else if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
    }

    public boolean copydefault(int i, java.lang.Object obj) {
        return obj != null && (obj instanceof RelationInfo);
    }

    /* JADX INFO: renamed from: o.nzE$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final class ActionBar extends C33652nAv {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        @Override // o.C33652nAv
        public void EZpvd(@NotNull C43312rms<nLA> c43312rms, @NotNull RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(relationInfo, "");
            super.EZpvd(c43312rms, relationInfo);
            C35639nzE.this.djBIcL().AEQbTJ(relationInfo.getContactsId(), false);
        }
    }

    public void OLrzqt(@NotNull C43312rms<nNW> c43312rms, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        ActivityC35548nxT.ActionBar actionBar = ActivityC35548nxT.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        startActivity(ActivityC35548nxT.ActionBar.createIntent$default(actionBar, fragmentActivityRequireActivity, "contacts", relationInfo.getContactsId(), null, false, 16, null));
    }

    /* JADX INFO: renamed from: o.nzE$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final class TaskDescription extends AbstractC43310rmq<java.lang.String, AbstractC33940nLm> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C35399nuc.Dialog.UhxbNG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C35342ntX.djBIcL;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }
    }

    private final void KWHzl(java.lang.String str) {
        if (values()) {
            AbstractC37675oyM.performFilter$default(AhwBna(), str, false, 2, null);
        }
    }

    public final android.widget.ImageView KWHzl() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        return nPO.OLrzqt((nPL) fragmentActivityRequireActivity);
    }

    public final android.widget.TextView AkhnZx() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        return nPO.copydefault((nPL) fragmentActivityRequireActivity);
    }

    public final void KWHzl(boolean z) {
        android.view.View view = this.getNewProxyInstance;
        android.view.View view2 = null;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        view.setVisibility(z ? 0 : 8);
        android.view.View view3 = this.getFieldNames;
        if (view3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            view2 = view3;
        }
        view2.setVisibility(z ^ true ? 0 : 8);
    }
}
