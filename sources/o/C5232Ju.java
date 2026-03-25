package o;

import com.amplitude.common.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C5227Jp;
import o.C5231Jt;
import o.InterfaceC5234Jw;
import o.JV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5232Ju {
    public static final C5232Ju OLrzqt = new C5232Ju();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0<Function1<? super Logger, ? extends java.util.List<InterfaceC5234Jw>>>() { // from class: com.amplitude.android.internal.locators.ViewTargetLocators$ALL$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX DEBUG: Return type fixed from 'kotlin.jvm.functions.Function1<com.amplitude.common.Logger, java.util.List<o.Jw>>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Function1<? super Logger, ? extends List<InterfaceC5234Jw>> invoke() {
            return new Function1<Logger, List<InterfaceC5234Jw>>() { // from class: com.amplitude.android.internal.locators.ViewTargetLocators$ALL$2.1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final List<InterfaceC5234Jw> invoke(@NotNull Logger logger) {
                    Intrinsics.checkNotNullParameter(logger, "");
                    ArrayList arrayList = new ArrayList();
                    if (JV.isComposeAvailable$default(JV.OLrzqt, null, 1, null)) {
                        arrayList.add(new C5231Jt(logger));
                    }
                    arrayList.add(new C5227Jp());
                    return arrayList;
                }
            };
        }
    });

    private C5232Ju() {
    }

    public final Function1<Logger, java.util.List<InterfaceC5234Jw>> AEQbTJ() {
        return (Function1) AEQbTJ.getValue();
    }
}
