package o;

import android.view.View;
import android.view.ViewGroup;
import com.lzf.easyfloat.enums.ShowPattern;
import com.lzf.easyfloat.enums.SidePattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8128awr;
import o.C8048avQ;
import o.C8049avR;
import o.C8114awd;
import o.C8121awk;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8121awk {
    public static float AEQbTJ;
    public static float EZpvd;
    public static AbstractC8128awr KWHzl;
    public static final C8121awk OLrzqt = new C8121awk();
    public static AbstractC8128awr copydefault;
    public static int valueOf;

    private C8121awk() {
    }

    public static /* synthetic */ void registerSwipeAdd$default(C8121awk c8121awk, android.view.MotionEvent motionEvent, InterfaceC8120awj interfaceC8120awj, int i, float f, float f2, float f3, int i2, java.lang.Object obj) throws java.lang.Exception {
        if ((i2 & 2) != 0) {
            interfaceC8120awj = null;
        }
        InterfaceC8120awj interfaceC8120awj2 = interfaceC8120awj;
        if ((i2 & 4) != 0) {
            i = C8049avR.StateListAnimator.EZpvd;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            f = -1.0f;
        }
        float f4 = f;
        if ((i2 & 16) != 0) {
            f2 = 0.1f;
        }
        float f5 = f2;
        if ((i2 & 32) != 0) {
            f3 = 0.5f;
        }
        c8121awk.AEQbTJ(motionEvent, interfaceC8120awj2, i3, f4, f5, f3);
    }

    public final void AEQbTJ(android.view.MotionEvent motionEvent, InterfaceC8120awj interfaceC8120awj, int i, float f, float f2, float f3) throws java.lang.Exception {
        if (motionEvent == null) {
            return;
        }
        if (f != -1.0f) {
            if (f >= f2) {
                AEQbTJ(motionEvent, java.lang.Math.min((f - f2) / (f3 - f2), 1.0f), interfaceC8120awj, i);
                return;
            } else {
                KWHzl();
                return;
            }
        }
        valueOf = C8124awn.EZpvd.copydefault(C8127awq.copydefault.OLrzqt());
        AEQbTJ = motionEvent.getRawX() / valueOf;
        int action = motionEvent.getAction();
        if (action == 0) {
            EZpvd = motionEvent.getRawX();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (EZpvd < valueOf * f2) {
                    float f4 = AEQbTJ;
                    if (f4 >= f2) {
                        AEQbTJ(motionEvent, java.lang.Math.min((f4 - f2) / (f3 - f2), 1.0f), interfaceC8120awj, i);
                        return;
                    }
                }
                KWHzl();
                return;
            }
            if (action != 3) {
                return;
            }
        }
        EZpvd = 0.0f;
        AEQbTJ(motionEvent, AEQbTJ, interfaceC8120awj, i);
    }

    public static /* synthetic */ void setAddView$default(C8121awk c8121awk, android.view.MotionEvent motionEvent, float f, InterfaceC8120awj interfaceC8120awj, int i, int i2, java.lang.Object obj) throws java.lang.Exception {
        if ((i2 & 4) != 0) {
            interfaceC8120awj = null;
        }
        c8121awk.AEQbTJ(motionEvent, f, interfaceC8120awj, i);
    }

    public final void AEQbTJ(android.view.MotionEvent motionEvent, float f, InterfaceC8120awj interfaceC8120awj, int i) throws java.lang.Exception {
        AbstractC8128awr abstractC8128awr = copydefault;
        if (abstractC8128awr != null) {
            abstractC8128awr.setTouchRangeListener(motionEvent, interfaceC8120awj);
            float f2 = 1 - f;
            abstractC8128awr.setTranslationX(abstractC8128awr.getWidth() * f2);
            abstractC8128awr.setTranslationY(abstractC8128awr.getWidth() * f2);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            KWHzl();
        } else {
            KWHzl(i);
        }
    }

    public final void KWHzl(int i) throws java.lang.Exception {
        C8048avQ.ActionBar actionBar = C8048avQ.Companion;
        if (actionBar.AhwBna("ADD_TAG")) {
            return;
        }
        C8048avQ.TaskDescription.setGravity$default(C8048avQ.TaskDescription.setLayout$default(actionBar.copydefault(C8127awq.copydefault.OLrzqt()), i, (InterfaceC8118awh) null, 2, (java.lang.Object) null).KWHzl(ShowPattern.CURRENT_ACTIVITY).copydefault("ADD_TAG").OLrzqt(false).OLrzqt(SidePattern.BOTTOM), 8388693, 0, 0, 6, null).OLrzqt((InterfaceC8115awe) null).AEQbTJ(new Function1<C8114awd.Application, Unit>() { // from class: com.lzf.easyfloat.utils.DragUtils$showAdd$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C8114awd.Application application) {
                invoke2(application);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C8114awd.Application application) {
                Intrinsics.checkNotNullParameter(application, "");
                application.OLrzqt(new yHO<Boolean, String, View, Unit>() { // from class: com.lzf.easyfloat.utils.DragUtils$showAdd$1.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // o.yHO
                    public /* synthetic */ Unit invoke(Boolean bool, String str, View view) {
                        invoke(bool.booleanValue(), str, view);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z, String str, View view) {
                        if (!z || view == null) {
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        if (viewGroup.getChildCount() > 0) {
                            View childAt = viewGroup.getChildAt(0);
                            if (childAt instanceof AbstractC8128awr) {
                                C8121awk c8121awk = C8121awk.OLrzqt;
                                AbstractC8128awr abstractC8128awr = (AbstractC8128awr) childAt;
                                C8121awk.copydefault = abstractC8128awr;
                                abstractC8128awr.setTranslationX(abstractC8128awr.getWidth());
                                abstractC8128awr.setTranslationY(abstractC8128awr.getWidth());
                            }
                        }
                    }
                });
                application.KWHzl(new Function0<Unit>() { // from class: com.lzf.easyfloat.utils.DragUtils$showAdd$1.2
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C8121awk c8121awk = C8121awk.OLrzqt;
                        C8121awk.copydefault = null;
                    }
                });
            }
        }).EZpvd();
    }

    public static /* synthetic */ void registerDragClose$default(C8121awk c8121awk, android.view.MotionEvent motionEvent, InterfaceC8120awj interfaceC8120awj, int i, ShowPattern showPattern, InterfaceC8115awe interfaceC8115awe, int i2, java.lang.Object obj) throws java.lang.Exception {
        if ((i2 & 2) != 0) {
            interfaceC8120awj = null;
        }
        InterfaceC8120awj interfaceC8120awj2 = interfaceC8120awj;
        if ((i2 & 4) != 0) {
            i = C8049avR.StateListAnimator.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            showPattern = ShowPattern.CURRENT_ACTIVITY;
        }
        ShowPattern showPattern2 = showPattern;
        if ((i2 & 16) != 0) {
            interfaceC8115awe = new C8050avS();
        }
        c8121awk.EZpvd(motionEvent, interfaceC8120awj2, i3, showPattern2, interfaceC8115awe);
    }

    public final void EZpvd(@NotNull android.view.MotionEvent motionEvent, InterfaceC8120awj interfaceC8120awj, int i, @NotNull ShowPattern showPattern, InterfaceC8115awe interfaceC8115awe) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(showPattern, "");
        KWHzl(i, showPattern, interfaceC8115awe);
        AbstractC8128awr abstractC8128awr = KWHzl;
        if (abstractC8128awr != null) {
            abstractC8128awr.setTouchRangeListener(motionEvent, interfaceC8120awj);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            EZpvd();
        }
    }

    public final void KWHzl(int i, ShowPattern showPattern, InterfaceC8115awe interfaceC8115awe) throws java.lang.Exception {
        C8048avQ.ActionBar actionBar = C8048avQ.Companion;
        if (actionBar.AhwBna("CLOSE_TAG")) {
            return;
        }
        C8048avQ.TaskDescription.setGravity$default(C8048avQ.TaskDescription.setMatchParent$default(C8048avQ.TaskDescription.setLayout$default(actionBar.copydefault(C8127awq.copydefault.OLrzqt()), i, (InterfaceC8118awh) null, 2, (java.lang.Object) null).KWHzl(showPattern), true, false, 2, null).copydefault("CLOSE_TAG").OLrzqt(SidePattern.BOTTOM), 80, 0, 0, 6, null).OLrzqt(interfaceC8115awe).AEQbTJ(new Function1<C8114awd.Application, Unit>() { // from class: com.lzf.easyfloat.utils.DragUtils$showClose$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C8114awd.Application application) {
                invoke2(application);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C8114awd.Application application) {
                Intrinsics.checkNotNullParameter(application, "");
                application.OLrzqt(new yHO<Boolean, String, View, Unit>() { // from class: com.lzf.easyfloat.utils.DragUtils$showClose$1.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // o.yHO
                    public /* synthetic */ Unit invoke(Boolean bool, String str, View view) {
                        invoke(bool.booleanValue(), str, view);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z, String str, View view) {
                        if (!z || view == null) {
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        if (viewGroup.getChildCount() > 0) {
                            View childAt = viewGroup.getChildAt(0);
                            if (childAt instanceof AbstractC8128awr) {
                                C8121awk c8121awk = C8121awk.OLrzqt;
                                C8121awk.KWHzl = (AbstractC8128awr) childAt;
                            }
                        }
                    }
                });
                application.KWHzl(new Function0<Unit>() { // from class: com.lzf.easyfloat.utils.DragUtils$showClose$1.2
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C8121awk c8121awk = C8121awk.OLrzqt;
                        C8121awk.KWHzl = null;
                    }
                });
            }
        }).EZpvd();
    }

    public final Unit KWHzl() {
        return C8048avQ.ActionBar.dismiss$default(C8048avQ.Companion, "ADD_TAG", false, 2, null);
    }

    public final Unit EZpvd() {
        return C8048avQ.ActionBar.dismiss$default(C8048avQ.Companion, "CLOSE_TAG", false, 2, null);
    }
}
