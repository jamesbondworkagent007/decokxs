package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.model.SupportService;
import com.okinc.okex.debug.adapter.EntrypointListAdapter;
import com.okinc.okex.debug.fragments.ChatbotDBoxFragment$buildChatbotEntryPoints$1$2$1;
import com.okinc.okex.debug.fragments.ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1;
import com.okinc.okex.debug.fragments.ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$2$2$1$1;
import com.okinc.okex.debug.fragments.ChatbotDBoxFragment$onViewCreated$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.spy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45450spy extends AbstractC45451spz {
    public final java.lang.String EZpvd = "Unified Entrance";
    public final int KWHzl = C47315tni.ActionBar.iwGUEr;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.spw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45450spy.copydefault();
        }
    });
    public AbstractC47360toa copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC45451spz
    public java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.spy$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.spy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C45450spy OLrzqt() {
            return new C45450spy();
        }
    }

    public final EntrypointListAdapter KWHzl() {
        return (EntrypointListAdapter) this.OLrzqt.getValue();
    }

    public static final EntrypointListAdapter copydefault() {
        return new EntrypointListAdapter();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47360toa abstractC47360toaOLrzqt = AbstractC47360toa.OLrzqt(layoutInflater, viewGroup, false);
        this.copydefault = abstractC47360toaOLrzqt;
        if (abstractC47360toaOLrzqt == null) {
            Intrinsics.gEmmrt("");
            abstractC47360toaOLrzqt = null;
        }
        return abstractC47360toaOLrzqt.getRoot();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47360toa abstractC47360toa = this.copydefault;
        if (abstractC47360toa == null) {
            Intrinsics.gEmmrt("");
            abstractC47360toa = null;
        }
        abstractC47360toa.KWHzl.setAdapter(KWHzl());
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChatbotDBoxFragment$onViewCreated$1(this, null), 3, null);
        view.post(new java.lang.Runnable() { // from class: o.spE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45450spy.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(C45450spy c45450spy) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45450spy, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00bd -> B:24:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c3 -> B:26:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super java.util.List<? extends EntrypointListAdapter.StateListAnimator>> continuation) throws java.lang.Throwable {
        ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1 chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1;
        C45450spy c45450spy;
        java.util.Collection arrayList;
        java.util.Iterator it;
        final android.content.Context context;
        final C45450spy c45450spy2;
        java.util.Collection collection;
        if (continuation instanceof ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1) {
            chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1 = (ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1) continuation;
            int i = chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.label = i - Integer.MIN_VALUE;
                c45450spy = this;
            } else {
                c45450spy = this;
                chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1 = new ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1(c45450spy, continuation);
            }
        }
        java.lang.Object objAEQbTJ = chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.label;
        java.util.List listDjBIcL = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            android.content.Context context2 = getContext();
            if (context2 != null) {
                java.util.List listEZpvd = C56402yEa.EZpvd(new EntrypointListAdapter.StateListAnimator.ActionBar("Unified Entrance"));
                java.util.List listGEmmrt = yDY.gEmmrt("form", "article", "helpcenter", "email", "chatbot", "blah_fallback_testing_blah");
                arrayList = new java.util.ArrayList();
                it = listGEmmrt.iterator();
                context = context2;
                c45450spy2 = c45450spy;
                collection = listEZpvd;
                if (!it.hasNext()) {
                }
            }
            if (listDjBIcL != null) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str = (java.lang.String) chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$5;
            it = (java.util.Iterator) chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$4;
            arrayList = (java.util.Collection) chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$3;
            collection = (java.util.Collection) chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$2;
            context = (android.content.Context) chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$1;
            c45450spy2 = (C45450spy) chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            SupportService supportService = (SupportService) objAEQbTJ;
            kotlin.Pair pairOLrzqt = supportService != null ? C56390yDp.OLrzqt(supportService, str) : null;
            if (pairOLrzqt != null) {
                arrayList.add(pairOLrzqt);
            }
            if (!it.hasNext()) {
                str = (java.lang.String) it.next();
                C6811aWS c6811aWS = new C6811aWS(str, null, null, null, 14, null);
                InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
                if (interfaceC6804aWL != null) {
                    chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$0 = c45450spy2;
                    chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$1 = context;
                    chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$2 = collection;
                    chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$3 = arrayList;
                    chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$4 = it;
                    chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.L$5 = str;
                    chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1.label = 1;
                    objAEQbTJ = interfaceC6804aWL.AEQbTJ(c6811aWS, chatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    SupportService supportService2 = (SupportService) objAEQbTJ;
                    if (supportService2 != null) {
                    }
                    if (pairOLrzqt != null) {
                    }
                    if (!it.hasNext()) {
                        java.util.List<kotlin.Pair> list = (java.util.List) arrayList;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (kotlin.Pair pair : list) {
                            final SupportService supportService3 = (SupportService) pair.component1();
                            arrayList2.add(new EntrypointListAdapter.StateListAnimator.Activity("[" + ((java.lang.String) pair.component2()) + "]\n" + supportService3.getServiceLabel(), new Function0() { // from class: o.spx
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C45450spy.OLrzqt(this.OLrzqt, supportService3, context);
                                }
                            }));
                        }
                        listDjBIcL = CollectionsKt___CollectionsKt.djBIcL(collection, (java.lang.Iterable) arrayList2);
                        return listDjBIcL != null ? yDY.AhwBna() : listDjBIcL;
                    }
                } else {
                    supportService2 = null;
                    if (supportService2 != null) {
                    }
                    if (pairOLrzqt != null) {
                    }
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }

    public static final Unit OLrzqt(C45450spy c45450spy, SupportService supportService, android.content.Context context) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c45450spy), null, null, new ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$2$2$1$1(supportService, context, null), 3, null);
        return Unit.INSTANCE;
    }

    public final java.util.List<EntrypointListAdapter.StateListAnimator> EZpvd() {
        final android.content.Context context = getContext();
        java.util.List<EntrypointListAdapter.StateListAnimator> listGEmmrt = context != null ? yDY.gEmmrt(new EntrypointListAdapter.StateListAnimator.ActionBar("Chatbots"), new EntrypointListAdapter.StateListAnimator.Activity("Default\n(Run selection logic via service API)", new Function0() { // from class: o.spC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45450spy.KWHzl(context);
            }
        }), new EntrypointListAdapter.StateListAnimator.Activity("OK Assistant\n(ChatbotWebActivity)", new Function0() { // from class: o.spB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45450spy.AEQbTJ(this.EZpvd, context);
            }
        })) : null;
        return listGEmmrt == null ? yDY.AhwBna() : listGEmmrt;
    }

    public static final Unit KWHzl(android.content.Context context) {
        InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
        if (interfaceC6804aWL != null) {
            interfaceC6804aWL.copydefault(context, new ChatBotRequest());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C45450spy c45450spy, android.content.Context context) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c45450spy), null, null, new ChatbotDBoxFragment$buildChatbotEntryPoints$1$2$1(context, null), 3, null);
        return Unit.INSTANCE;
    }
}
