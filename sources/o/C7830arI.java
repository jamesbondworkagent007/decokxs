package o;

import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.UDStyleString;
import com.immomo.mls.fun.ud.view.UDLabel;
import com.immomo.mls.fun.ud.view.UDLinearLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ud.view.UDViewPager;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import com.immomo.mls.fun.ud.view.recycler.UDRecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.JavaUserdata;

/* JADX INFO: renamed from: o.arI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7830arI {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.arI$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.arI.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void releaseView$default(TaskDescription taskDescription, android.view.View view, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            taskDescription.KWHzl(view, bool);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: android.view.View */
        /* JADX WARN: Multi-variable type inference failed */
        public final void KWHzl(@NotNull android.view.View view, java.lang.Boolean bool) {
            UDStyleString uDStyleStringValueOf;
            UDStyleString uDStyleStringValueOf2;
            C7545alp c7545alpDbNXlk;
            UDViewPager userdata;
            UDBaseRecyclerAdapter uDBaseRecyclerAdapterAYXKKw;
            UDBaseRecyclerLayout uDBaseRecyclerLayoutIsConnected;
            UDBaseRecyclerAdapter uDBaseRecyclerAdapterAYXKKw2;
            UDBaseRecyclerLayout uDBaseRecyclerLayoutIsConnected2;
            UDBaseRecyclerAdapter uDBaseRecyclerAdapterAYXKKw3;
            UDBaseRecyclerAdapter uDBaseRecyclerAdapterAYXKKw4;
            UDBaseRecyclerAdapter uDBaseRecyclerAdapterAYXKKw5;
            UDBaseRecyclerAdapter uDBaseRecyclerAdapterAYXKKw6;
            Intrinsics.checkNotNullParameter(view, "");
            boolean z = view instanceof android.view.ViewGroup;
            C7870arw.KWHzl("logtag", "releaseView:" + view + "," + bool + "-" + z);
            if (!z) {
                if (view instanceof InterfaceC7383aim) {
                    InterfaceC7383aim interfaceC7383aim = (InterfaceC7383aim) view;
                    if (interfaceC7383aim.getUserdata() instanceof C7362aiR) {
                        C7870arw.EZpvd("logtag", "release cell 3");
                    }
                    if (view instanceof android.widget.ImageView) {
                        android.widget.ImageView imageView = (android.widget.ImageView) view;
                        imageView.setImageDrawable(null);
                        imageView.setImageBitmap(null);
                    } else if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (view instanceof C7535alf)) {
                        C7535alf c7535alf = (C7535alf) view;
                        UDLabel userdata2 = c7535alf.getUserdata();
                        if (userdata2 != null && (uDStyleStringValueOf2 = userdata2.valueOf()) != null) {
                            uDStyleStringValueOf2.EZpvd((UDView) null);
                        }
                        UDLabel userdata3 = c7535alf.getUserdata();
                        if (userdata3 != null && (uDStyleStringValueOf = userdata3.valueOf()) != null) {
                            uDStyleStringValueOf.destroy();
                        }
                    }
                    if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                        UDView userdata4 = interfaceC7383aim.getUserdata();
                        if (userdata4 != null) {
                            userdata4.freeJavaUserData();
                        }
                        UDView userdata5 = interfaceC7383aim.getUserdata();
                        if (userdata5 != null) {
                            userdata5.releaseLuaRef();
                        }
                        UDView userdata6 = interfaceC7383aim.getUserdata();
                        if (userdata6 != null) {
                            userdata6.onJavaRecycle();
                        }
                        UDView userdata7 = interfaceC7383aim.getUserdata();
                        if (userdata7 != null) {
                            userdata7.destroy();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                    java.lang.Object tag = view.getTag(C7343ahz.TaskDescription.getNewProxyInstance);
                    if (tag instanceof JavaUserdata) {
                        C7870arw.KWHzl("logtag", "release JavaUserdata: " + tag);
                        JavaUserdata javaUserdata = (JavaUserdata) tag;
                        javaUserdata.freeJavaUserData();
                        javaUserdata.releaseLuaRef();
                        javaUserdata.onJavaRecycle();
                        return;
                    }
                    return;
                }
                return;
            }
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren((android.view.ViewGroup) view).iterator();
            while (it.hasNext()) {
                C7830arI.Companion.KWHzl(it.next(), bool);
            }
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                if (view instanceof C7543aln) {
                    C7543aln c7543aln = (C7543aln) view;
                    UDRecyclerView userdata8 = c7543aln.getUserdata();
                    if (userdata8 != null && (uDBaseRecyclerAdapterAYXKKw6 = userdata8.AYXKKw()) != null) {
                        uDBaseRecyclerAdapterAYXKKw6.AYXKKw();
                    }
                    UDRecyclerView userdata9 = c7543aln.getUserdata();
                    if (userdata9 != null && (uDBaseRecyclerAdapterAYXKKw5 = userdata9.AYXKKw()) != null) {
                        uDBaseRecyclerAdapterAYXKKw5.releaseLuaRef();
                    }
                    UDRecyclerView userdata10 = c7543aln.getUserdata();
                    if (userdata10 != null && (uDBaseRecyclerAdapterAYXKKw4 = userdata10.AYXKKw()) != null) {
                        uDBaseRecyclerAdapterAYXKKw4.freeJavaUserData();
                    }
                    UDRecyclerView userdata11 = c7543aln.getUserdata();
                    if (userdata11 != null && (uDBaseRecyclerAdapterAYXKKw3 = userdata11.AYXKKw()) != null) {
                        uDBaseRecyclerAdapterAYXKKw3.onJavaRecycle();
                    }
                    UDRecyclerView userdata12 = c7543aln.getUserdata();
                    if (userdata12 != null && (uDBaseRecyclerAdapterAYXKKw2 = userdata12.AYXKKw()) != null && (uDBaseRecyclerLayoutIsConnected2 = uDBaseRecyclerAdapterAYXKKw2.isConnected()) != null) {
                        uDBaseRecyclerLayoutIsConnected2.releaseLuaRef();
                    }
                    UDRecyclerView userdata13 = c7543aln.getUserdata();
                    if (userdata13 != null && (uDBaseRecyclerAdapterAYXKKw = userdata13.AYXKKw()) != null && (uDBaseRecyclerLayoutIsConnected = uDBaseRecyclerAdapterAYXKKw.isConnected()) != null) {
                        uDBaseRecyclerLayoutIsConnected.onJavaRecycle();
                    }
                    if (c7543aln.KWHzl().getAdapter() instanceof C7393aiw) {
                        RecyclerView.Adapter adapter = c7543aln.KWHzl().getAdapter();
                        Intrinsics.copydefault(adapter, "");
                        ((C7393aiw) adapter).OLrzqt();
                    }
                    c7543aln.AkhnZx();
                    c7543aln.KWHzl().setAdapter(null);
                }
                if (view instanceof C7546alq) {
                    C7546alq c7546alq = (C7546alq) view;
                    if (c7546alq.getUserdata() instanceof C7362aiR) {
                        C7870arw.copydefault("logtag", "release UDCell");
                        UDViewGroup userdata14 = c7546alq.getUserdata();
                        Intrinsics.copydefault(userdata14, "");
                        ((C7362aiR) userdata14).EZpvd();
                        return;
                    }
                    C7870arw.AEQbTJ("logtag", "release " + c7546alq.getUserdata());
                    UDViewGroup userdata15 = c7546alq.getUserdata();
                    if (userdata15 != null) {
                        userdata15.freeJavaUserData();
                    }
                    UDViewGroup userdata16 = c7546alq.getUserdata();
                    if (userdata16 != null) {
                        userdata16.releaseLuaRef();
                    }
                    UDViewGroup userdata17 = c7546alq.getUserdata();
                    if (userdata17 != null) {
                        userdata17.onJavaRecycle();
                        return;
                    }
                    return;
                }
                if (view instanceof C7541all) {
                    C7541all c7541all = (C7541all) view;
                    C7870arw.EZpvd("logtag", "release LuaLinearLayout " + c7541all.getUserdata());
                    UDLinearLayout userdata18 = c7541all.getUserdata();
                    if (userdata18 != null) {
                        userdata18.freeJavaUserData();
                    }
                    UDLinearLayout userdata19 = c7541all.getUserdata();
                    if (userdata19 != null) {
                        userdata19.releaseLuaRef();
                    }
                    UDLinearLayout userdata20 = c7541all.getUserdata();
                    if (userdata20 != null) {
                        userdata20.onJavaRecycle();
                        return;
                    }
                    return;
                }
                if (view instanceof C7779aqK) {
                    UDViewPager userdata21 = ((C7779aqK) view).getUserdata();
                    if (userdata21 == null || (c7545alpDbNXlk = userdata21.DbNXlk()) == null || (userdata = c7545alpDbNXlk.getUserdata()) == null) {
                        return;
                    }
                    userdata.fFgQHt();
                    return;
                }
                if (view instanceof InterfaceC7383aim) {
                    InterfaceC7383aim interfaceC7383aim2 = (InterfaceC7383aim) view;
                    if (interfaceC7383aim2.getUserdata() instanceof C7362aiR) {
                        C7870arw.EZpvd("logtag", "release cell2");
                    }
                    C7870arw.copydefault("logtag", "release ILView:" + view + "," + interfaceC7383aim2.getUserdata());
                    UDView userdata22 = interfaceC7383aim2.getUserdata();
                    if (userdata22 != null) {
                        userdata22.freeJavaUserData();
                    }
                    UDView userdata23 = interfaceC7383aim2.getUserdata();
                    if (userdata23 != null) {
                        userdata23.releaseLuaRef();
                    }
                    UDView userdata24 = interfaceC7383aim2.getUserdata();
                    if (userdata24 != null) {
                        userdata24.onJavaRecycle();
                        return;
                    }
                    return;
                }
                java.lang.Object tag2 = view.getTag(C7343ahz.TaskDescription.getNewProxyInstance);
                if (tag2 instanceof JavaUserdata) {
                    C7870arw.KWHzl("logtag", "release JavaUserdata: " + tag2);
                    JavaUserdata javaUserdata2 = (JavaUserdata) tag2;
                    javaUserdata2.freeJavaUserData();
                    javaUserdata2.releaseLuaRef();
                    javaUserdata2.onJavaRecycle();
                }
            }
        }
    }
}
