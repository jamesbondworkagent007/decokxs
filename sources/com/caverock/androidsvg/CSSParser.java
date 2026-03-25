package com.caverock.androidsvg;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParser;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SK;

/* JADX INFO: loaded from: classes2.dex */
public class CSSParser {
    public boolean EZpvd;
    public Source KWHzl;
    public MediaType OLrzqt;

    public enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    public enum Source {
        Document,
        RenderOptions
    }

    public interface TaskDescription {
        boolean OLrzqt(SharedElementCallback sharedElementCallback, SVG.AssetManager assetManager);
    }

    public enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map<String, PseudoClassIdents> cache = new HashMap();

        static {
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    cache.put(pseudoClassIdents.name().replace('_', '-'), pseudoClassIdents);
                }
            }
        }

        public static PseudoClassIdents fromString(String str) {
            PseudoClassIdents pseudoClassIdents = cache.get(str);
            return pseudoClassIdents != null ? pseudoClassIdents : UNSUPPORTED;
        }
    }

    public static class Application {
        public final String KWHzl;
        public final AttribOp OLrzqt;
        public final String copydefault;

        public Application(String str, AttribOp attribOp, String str2) {
            this.KWHzl = str;
            this.OLrzqt = attribOp;
            this.copydefault = str2;
        }
    }

    public static class TaskStackBuilder {
        public Combinator AEQbTJ;
        public String EZpvd;
        public List<Application> copydefault = null;
        public List<TaskDescription> KWHzl = null;

        public TaskStackBuilder(Combinator combinator, String str) {
            this.AEQbTJ = null;
            this.EZpvd = null;
            this.AEQbTJ = combinator == null ? Combinator.DESCENDANT : combinator;
            this.EZpvd = str;
        }

        public void AEQbTJ(String str, AttribOp attribOp, String str2) {
            if (this.copydefault == null) {
                this.copydefault = new ArrayList();
            }
            this.copydefault.add(new Application(str, attribOp, str2));
        }

        public void AEQbTJ(TaskDescription taskDescription) {
            if (this.KWHzl == null) {
                this.KWHzl = new ArrayList();
            }
            this.KWHzl.add(taskDescription);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Combinator combinator = this.AEQbTJ;
            if (combinator == Combinator.CHILD) {
                sb.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.EZpvd;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<Application> list = this.copydefault;
            if (list != null) {
                for (Application application : list) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(application.KWHzl);
                    int i = AnonymousClass4.AEQbTJ[application.OLrzqt.ordinal()];
                    if (i == 1) {
                        sb.append('=');
                        sb.append(application.copydefault);
                    } else if (i == 2) {
                        sb.append("~=");
                        sb.append(application.copydefault);
                    } else if (i == 3) {
                        sb.append("|=");
                        sb.append(application.copydefault);
                    }
                    sb.append(AbstractJsonLexerKt.END_LIST);
                }
            }
            List<TaskDescription> list2 = this.KWHzl;
            if (list2 != null) {
                for (TaskDescription taskDescription : list2) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(taskDescription);
                }
            }
            return sb.toString();
        }
    }

    public static class PictureInPictureParams {
        public List<VoiceInteractor> AEQbTJ = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<VoiceInteractor> OLrzqt() {
            return this.AEQbTJ;
        }

        public void OLrzqt(VoiceInteractor voiceInteractor) {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new ArrayList();
            }
            for (int i = 0; i < this.AEQbTJ.size(); i++) {
                if (this.AEQbTJ.get(i).AEQbTJ.copydefault > voiceInteractor.AEQbTJ.copydefault) {
                    this.AEQbTJ.add(i, voiceInteractor);
                    return;
                }
            }
            this.AEQbTJ.add(voiceInteractor);
        }

        public void EZpvd(PictureInPictureParams pictureInPictureParams) {
            if (pictureInPictureParams.AEQbTJ == null) {
                return;
            }
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new ArrayList(pictureInPictureParams.AEQbTJ.size());
            }
            Iterator<VoiceInteractor> it = pictureInPictureParams.AEQbTJ.iterator();
            while (it.hasNext()) {
                OLrzqt(it.next());
            }
        }

        public boolean KWHzl() {
            List<VoiceInteractor> list = this.AEQbTJ;
            return list == null || list.isEmpty();
        }

        public int copydefault() {
            List<VoiceInteractor> list = this.AEQbTJ;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void EZpvd(Source source) {
            List<VoiceInteractor> list = this.AEQbTJ;
            if (list == null) {
                return;
            }
            Iterator<VoiceInteractor> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().KWHzl == source) {
                    it.remove();
                }
            }
        }

        public String toString() {
            if (this.AEQbTJ == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator<VoiceInteractor> it = this.AEQbTJ.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    public static class VoiceInteractor {
        public AssistContent AEQbTJ;
        public Source KWHzl;
        public SVG.Style copydefault;

        public VoiceInteractor(AssistContent assistContent, SVG.Style style, Source source) {
            this.AEQbTJ = assistContent;
            this.copydefault = style;
            this.KWHzl = source;
        }

        public String toString() {
            return String.valueOf(this.AEQbTJ) + " {...} (src=" + this.KWHzl + ")";
        }
    }

    public static class AssistContent {
        public List<TaskStackBuilder> OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ() {
            this.copydefault += 1000000;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl() {
            this.copydefault += 1000;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt() {
            this.copydefault++;
        }

        private AssistContent() {
            this.OLrzqt = null;
            this.copydefault = 0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:318) call: com.caverock.androidsvg.CSSParser.AssistContent.<init>():void type: THIS */
        public /* synthetic */ AssistContent(AnonymousClass4 anonymousClass4) {
            this();
        }

        public void copydefault(TaskStackBuilder taskStackBuilder) {
            if (this.OLrzqt == null) {
                this.OLrzqt = new ArrayList();
            }
            this.OLrzqt.add(taskStackBuilder);
        }

        public int EZpvd() {
            List<TaskStackBuilder> list = this.OLrzqt;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public TaskStackBuilder KWHzl(int i) {
            return this.OLrzqt.get(i);
        }

        public boolean copydefault() {
            List<TaskStackBuilder> list = this.OLrzqt;
            return list == null || list.isEmpty();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator<TaskStackBuilder> it = this.OLrzqt.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(' ');
            }
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.copydefault);
            sb.append(AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }
    }

    public CSSParser() {
        this(MediaType.screen, Source.Document);
    }

    public CSSParser(MediaType mediaType, Source source) {
        this.EZpvd = false;
        this.OLrzqt = mediaType;
        this.KWHzl = source;
    }

    public PictureInPictureParams copydefault(String str) {
        StateListAnimator stateListAnimator = new StateListAnimator(str);
        stateListAnimator.zsXlph();
        return OLrzqt(stateListAnimator);
    }

    public static boolean EZpvd(String str, MediaType mediaType) {
        StateListAnimator stateListAnimator = new StateListAnimator(str);
        stateListAnimator.zsXlph();
        return KWHzl(AEQbTJ(stateListAnimator), mediaType);
    }

    public static void OLrzqt(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static class StateListAnimator extends SVGParser.Dialog {
        public final int OLrzqt(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        public StateListAnimator(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public String AEQbTJ() {
            int iDbNXlk = DbNXlk();
            int i = this.KWHzl;
            if (iDbNXlk == i) {
                return null;
            }
            String strSubstring = this.OLrzqt.substring(i, iDbNXlk);
            this.KWHzl = iDbNXlk;
            return strSubstring;
        }

        public final int DbNXlk() {
            int i;
            if (isConnected()) {
                return this.KWHzl;
            }
            int i2 = this.KWHzl;
            int iCharAt = this.OLrzqt.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = fetchVPNInfo();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iFetchVPNInfo = fetchVPNInfo();
                while (true) {
                    if ((iFetchVPNInfo < 65 || iFetchVPNInfo > 90) && ((iFetchVPNInfo < 97 || iFetchVPNInfo > 122) && !((iFetchVPNInfo >= 48 && iFetchVPNInfo <= 57) || iFetchVPNInfo == 45 || iFetchVPNInfo == 95))) {
                        break;
                    }
                    iFetchVPNInfo = fetchVPNInfo();
                }
                i = this.KWHzl;
            }
            this.KWHzl = i2;
            return i;
        }

        public final List<AssistContent> gEmmrt() throws CSSParseException {
            AnonymousClass4 anonymousClass4 = null;
            if (isConnected()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            AssistContent assistContent = new AssistContent(anonymousClass4);
            while (!isConnected() && OLrzqt(assistContent)) {
                if (AubY()) {
                    arrayList.add(assistContent);
                    assistContent = new AssistContent(anonymousClass4);
                }
            }
            if (!assistContent.copydefault()) {
                arrayList.add(assistContent);
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean OLrzqt(AssistContent assistContent) throws CSSParseException {
            Combinator combinator;
            TaskStackBuilder taskStackBuilder;
            AttribOp attribOp;
            String strOLrzqt;
            if (isConnected()) {
                return false;
            }
            int i = this.KWHzl;
            if (assistContent.copydefault()) {
                combinator = null;
            } else if (KWHzl('>')) {
                combinator = Combinator.CHILD;
                zsXlph();
            } else if (KWHzl('+')) {
                combinator = Combinator.FOLLOWS;
                zsXlph();
            }
            if (KWHzl('*')) {
                taskStackBuilder = new TaskStackBuilder(combinator, null);
            } else {
                String strAEQbTJ = AEQbTJ();
                if (strAEQbTJ != null) {
                    TaskStackBuilder taskStackBuilder2 = new TaskStackBuilder(combinator, strAEQbTJ);
                    assistContent.OLrzqt();
                    taskStackBuilder = taskStackBuilder2;
                } else {
                    taskStackBuilder = null;
                }
            }
            while (!isConnected()) {
                if (KWHzl('.')) {
                    if (taskStackBuilder == null) {
                        taskStackBuilder = new TaskStackBuilder(combinator, null);
                    }
                    String strAEQbTJ2 = AEQbTJ();
                    if (strAEQbTJ2 == null) {
                        throw new CSSParseException("Invalid \".class\" simpleSelectors");
                    }
                    taskStackBuilder.AEQbTJ("class", AttribOp.EQUALS, strAEQbTJ2);
                    assistContent.KWHzl();
                } else if (KWHzl('#')) {
                    if (taskStackBuilder == null) {
                        taskStackBuilder = new TaskStackBuilder(combinator, null);
                    }
                    String strAEQbTJ3 = AEQbTJ();
                    if (strAEQbTJ3 == null) {
                        throw new CSSParseException("Invalid \"#id\" simpleSelectors");
                    }
                    taskStackBuilder.AEQbTJ("id", AttribOp.EQUALS, strAEQbTJ3);
                    assistContent.AEQbTJ();
                } else if (KWHzl(AbstractJsonLexerKt.BEGIN_LIST)) {
                    if (taskStackBuilder == null) {
                        taskStackBuilder = new TaskStackBuilder(combinator, null);
                    }
                    zsXlph();
                    String strAEQbTJ4 = AEQbTJ();
                    if (strAEQbTJ4 == null) {
                        throw new CSSParseException("Invalid attribute simpleSelectors");
                    }
                    zsXlph();
                    if (KWHzl('=')) {
                        attribOp = AttribOp.EQUALS;
                    } else if (copydefault("~=")) {
                        attribOp = AttribOp.INCLUDES;
                    } else {
                        attribOp = copydefault("|=") ? AttribOp.DASHMATCH : null;
                    }
                    if (attribOp != null) {
                        zsXlph();
                        strOLrzqt = OLrzqt();
                        if (strOLrzqt == null) {
                            throw new CSSParseException("Invalid attribute simpleSelectors");
                        }
                        zsXlph();
                    } else {
                        strOLrzqt = null;
                    }
                    if (!KWHzl(AbstractJsonLexerKt.END_LIST)) {
                        throw new CSSParseException("Invalid attribute simpleSelectors");
                    }
                    if (attribOp == null) {
                        attribOp = AttribOp.EXISTS;
                    }
                    taskStackBuilder.AEQbTJ(strAEQbTJ4, attribOp, strOLrzqt);
                    assistContent.KWHzl();
                } else {
                    if (!KWHzl(AbstractJsonLexerKt.COLON)) {
                        break;
                    }
                    if (taskStackBuilder == null) {
                        taskStackBuilder = new TaskStackBuilder(combinator, null);
                    }
                    KWHzl(assistContent, taskStackBuilder);
                }
            }
            if (taskStackBuilder != null) {
                assistContent.copydefault(taskStackBuilder);
                return true;
            }
            this.KWHzl = i;
            return false;
        }

        public static class Application {
            public int EZpvd;
            public int OLrzqt;

            public Application(int i, int i2) {
                this.OLrzqt = i;
                this.EZpvd = i2;
            }
        }

        public final Application KWHzl() throws CSSParseException {
            SK skAEQbTJ;
            Application application;
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            if (!KWHzl('(')) {
                return null;
            }
            zsXlph();
            int i2 = 1;
            if (copydefault("odd")) {
                application = new Application(2, 1);
            } else {
                if (copydefault("even")) {
                    application = new Application(2, 0);
                } else {
                    int i3 = (!KWHzl('+') && KWHzl('-')) ? -1 : 1;
                    SK skAEQbTJ2 = SK.AEQbTJ(this.OLrzqt, this.KWHzl, this.EZpvd, false);
                    if (skAEQbTJ2 != null) {
                        this.KWHzl = skAEQbTJ2.EZpvd();
                    }
                    if (KWHzl('n') || KWHzl('N')) {
                        if (skAEQbTJ2 == null) {
                            skAEQbTJ2 = new SK(1L, this.KWHzl);
                        }
                        zsXlph();
                        boolean zKWHzl = KWHzl('+');
                        if (!zKWHzl && (zKWHzl = KWHzl('-'))) {
                            i2 = -1;
                        }
                        if (zKWHzl) {
                            zsXlph();
                            skAEQbTJ = SK.AEQbTJ(this.OLrzqt, this.KWHzl, this.EZpvd, false);
                            if (skAEQbTJ == null) {
                                this.KWHzl = i;
                                return null;
                            }
                            this.KWHzl = skAEQbTJ.EZpvd();
                        } else {
                            skAEQbTJ = null;
                        }
                        int i4 = i2;
                        i2 = i3;
                        i3 = i4;
                    } else {
                        skAEQbTJ = skAEQbTJ2;
                        skAEQbTJ2 = null;
                    }
                    application = new Application(skAEQbTJ2 == null ? 0 : i2 * skAEQbTJ2.copydefault(), skAEQbTJ != null ? i3 * skAEQbTJ.copydefault() : 0);
                }
            }
            zsXlph();
            if (KWHzl(')')) {
                return application;
            }
            this.KWHzl = i;
            return null;
        }

        public final List<String> EZpvd() throws CSSParseException {
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            if (!KWHzl('(')) {
                return null;
            }
            zsXlph();
            ArrayList arrayList = null;
            do {
                String strAEQbTJ = AEQbTJ();
                if (strAEQbTJ == null) {
                    this.KWHzl = i;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strAEQbTJ);
                zsXlph();
            } while (AubY());
            if (KWHzl(')')) {
                return arrayList;
            }
            this.KWHzl = i;
            return null;
        }

        public final List<AssistContent> djBIcL() throws CSSParseException {
            List<TaskStackBuilder> list;
            List<TaskDescription> list2;
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            if (!KWHzl('(')) {
                return null;
            }
            zsXlph();
            List<AssistContent> listGEmmrt = gEmmrt();
            if (listGEmmrt == null) {
                this.KWHzl = i;
                return null;
            }
            if (!KWHzl(')')) {
                this.KWHzl = i;
                return null;
            }
            Iterator<AssistContent> it = listGEmmrt.iterator();
            while (it.hasNext() && (list = it.next().OLrzqt) != null) {
                Iterator<TaskStackBuilder> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().KWHzl) != null) {
                    Iterator<TaskDescription> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof LoaderManager) {
                            return null;
                        }
                    }
                }
            }
            return listGEmmrt;
        }

        public final void KWHzl(AssistContent assistContent, TaskStackBuilder taskStackBuilder) throws CSSParseException {
            TaskDescription taskDescription;
            TaskDescription taskDescription2;
            String strAEQbTJ = AEQbTJ();
            if (strAEQbTJ == null) {
                throw new CSSParseException("Invalid pseudo class");
            }
            PseudoClassIdents pseudoClassIdentsFromString = PseudoClassIdents.fromString(strAEQbTJ);
            AnonymousClass4 anonymousClass4 = null;
            switch (AnonymousClass4.KWHzl[pseudoClassIdentsFromString.ordinal()]) {
                case 1:
                    TaskDescription activity = new Activity(0, 1, true, false, null);
                    assistContent.KWHzl();
                    taskDescription2 = activity;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 2:
                    TaskDescription activity2 = new Activity(0, 1, false, false, null);
                    assistContent.KWHzl();
                    taskDescription2 = activity2;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 3:
                    TaskDescription pendingIntent = new PendingIntent(false, null);
                    assistContent.KWHzl();
                    taskDescription2 = pendingIntent;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 4:
                    TaskDescription activity3 = new Activity(0, 1, true, true, taskStackBuilder.EZpvd);
                    assistContent.KWHzl();
                    taskDescription2 = activity3;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 5:
                    TaskDescription activity4 = new Activity(0, 1, false, true, taskStackBuilder.EZpvd);
                    assistContent.KWHzl();
                    taskDescription2 = activity4;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 6:
                    TaskDescription pendingIntent2 = new PendingIntent(true, taskStackBuilder.EZpvd);
                    assistContent.KWHzl();
                    taskDescription2 = pendingIntent2;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 7:
                    TaskDescription dialog = new Dialog(anonymousClass4);
                    assistContent.KWHzl();
                    taskDescription2 = dialog;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 8:
                    TaskDescription actionBar = new ActionBar(anonymousClass4);
                    assistContent.KWHzl();
                    taskDescription2 = actionBar;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z = pseudoClassIdentsFromString == PseudoClassIdents.nth_child || pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type;
                    boolean z2 = pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type || pseudoClassIdentsFromString == PseudoClassIdents.nth_last_of_type;
                    Application applicationKWHzl = KWHzl();
                    if (applicationKWHzl == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strAEQbTJ);
                    }
                    TaskDescription activity5 = new Activity(applicationKWHzl.OLrzqt, applicationKWHzl.EZpvd, z, z2, taskStackBuilder.EZpvd);
                    assistContent.KWHzl();
                    taskDescription = activity5;
                    taskDescription2 = taskDescription;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 13:
                    List<AssistContent> listDjBIcL = djBIcL();
                    if (listDjBIcL == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strAEQbTJ);
                    }
                    LoaderManager loaderManager = new LoaderManager(listDjBIcL);
                    assistContent.copydefault = loaderManager.AEQbTJ();
                    taskDescription = loaderManager;
                    taskDescription2 = taskDescription;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 14:
                    TaskDescription fragmentManager = new FragmentManager(anonymousClass4);
                    assistContent.KWHzl();
                    taskDescription2 = fragmentManager;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 15:
                    EZpvd();
                    TaskDescription fragment = new Fragment(strAEQbTJ);
                    assistContent.KWHzl();
                    taskDescription2 = fragment;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    TaskDescription fragment2 = new Fragment(strAEQbTJ);
                    assistContent.KWHzl();
                    taskDescription2 = fragment2;
                    taskStackBuilder.AEQbTJ(taskDescription2);
                    return;
                default:
                    throw new CSSParseException("Unsupported pseudo class: " + strAEQbTJ);
            }
        }

        public final String OLrzqt() {
            if (isConnected()) {
                return null;
            }
            String strIwGUEr = iwGUEr();
            return strIwGUEr != null ? strIwGUEr : AEQbTJ();
        }

        public String AYXKKw() {
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            int iCharAt = this.OLrzqt.charAt(i);
            int i2 = i;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !KWHzl(iCharAt)) {
                if (!copydefault(iCharAt)) {
                    i2 = this.KWHzl + 1;
                }
                iCharAt = fetchVPNInfo();
            }
            if (this.KWHzl > i) {
                return this.OLrzqt.substring(i, i2);
            }
            this.KWHzl = i;
            return null;
        }

        public String copydefault() {
            int iOLrzqt;
            if (isConnected()) {
                return null;
            }
            char cCharAt = this.OLrzqt.charAt(this.KWHzl);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.KWHzl++;
            int iIntValue = ejfBZ().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = ejfBZ().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = ejfBZ().intValue();
                        } else {
                            int iOLrzqt2 = OLrzqt(iIntValue);
                            if (iOLrzqt2 != -1) {
                                for (int i = 1; i <= 5 && (iOLrzqt = OLrzqt((iIntValue = ejfBZ().intValue()))) != -1; i++) {
                                    iOLrzqt2 = (iOLrzqt2 * 16) + iOLrzqt;
                                }
                                sb.append((char) iOLrzqt2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = ejfBZ().intValue();
            }
            return sb.toString();
        }

        public String AhwBna() {
            if (isConnected()) {
                return null;
            }
            int i = this.KWHzl;
            if (!copydefault("url(")) {
                return null;
            }
            zsXlph();
            String strCopydefault = copydefault();
            if (strCopydefault == null) {
                strCopydefault = valueOf();
            }
            if (strCopydefault == null) {
                this.KWHzl = i;
                return null;
            }
            zsXlph();
            if (isConnected() || copydefault(")")) {
                return strCopydefault;
            }
            this.KWHzl = i;
            return null;
        }

        public String valueOf() {
            char cCharAt;
            int iOLrzqt;
            StringBuilder sb = new StringBuilder();
            while (!isConnected() && (cCharAt = this.OLrzqt.charAt(this.KWHzl)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !copydefault(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.KWHzl++;
                if (cCharAt == '\\') {
                    if (!isConnected()) {
                        String str = this.OLrzqt;
                        int i = this.KWHzl;
                        this.KWHzl = i + 1;
                        cCharAt = str.charAt(i);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iOLrzqt2 = OLrzqt(cCharAt);
                            if (iOLrzqt2 != -1) {
                                for (int i2 = 1; i2 <= 5 && !isConnected() && (iOLrzqt = OLrzqt(this.OLrzqt.charAt(this.KWHzl))) != -1; i2++) {
                                    this.KWHzl++;
                                    iOLrzqt2 = (iOLrzqt2 * 16) + iOLrzqt;
                                }
                                sb.append((char) iOLrzqt2);
                            }
                        }
                    }
                }
                sb.append(cCharAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.CSSParser$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[PseudoClassIdents.values().length];
            KWHzl = iArr;
            try {
                iArr[PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KWHzl[PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KWHzl[PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                KWHzl[PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                KWHzl[PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                KWHzl[PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                KWHzl[PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                KWHzl[PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                KWHzl[PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                KWHzl[PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                KWHzl[PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                KWHzl[PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                KWHzl[PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                KWHzl[PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                KWHzl[PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                KWHzl[PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                KWHzl[PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                KWHzl[PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                KWHzl[PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                KWHzl[PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                KWHzl[PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[AttribOp.values().length];
            AEQbTJ = iArr2;
            try {
                iArr2[AttribOp.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                AEQbTJ[AttribOp.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                AEQbTJ[AttribOp.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static boolean KWHzl(List<MediaType> list, MediaType mediaType) {
        for (MediaType mediaType2 : list) {
            if (mediaType2 == MediaType.all || mediaType2 == mediaType) {
                return true;
            }
        }
        return false;
    }

    public static List<MediaType> AEQbTJ(StateListAnimator stateListAnimator) {
        String strHDKMBd;
        ArrayList arrayList = new ArrayList();
        while (!stateListAnimator.isConnected() && (strHDKMBd = stateListAnimator.hDKMBd()) != null) {
            try {
                arrayList.add(MediaType.valueOf(strHDKMBd));
            } catch (IllegalArgumentException unused) {
            }
            if (!stateListAnimator.AubY()) {
                break;
            }
        }
        return arrayList;
    }

    public final void EZpvd(PictureInPictureParams pictureInPictureParams, StateListAnimator stateListAnimator) throws CSSParseException {
        String strAEQbTJ = stateListAnimator.AEQbTJ();
        stateListAnimator.zsXlph();
        if (strAEQbTJ == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        if (!this.EZpvd && strAEQbTJ.equals("media")) {
            List<MediaType> listAEQbTJ = AEQbTJ(stateListAnimator);
            if (!stateListAnimator.KWHzl(AbstractJsonLexerKt.BEGIN_OBJ)) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            stateListAnimator.zsXlph();
            if (KWHzl(listAEQbTJ, this.OLrzqt)) {
                this.EZpvd = true;
                pictureInPictureParams.EZpvd(OLrzqt(stateListAnimator));
                this.EZpvd = false;
            } else {
                OLrzqt(stateListAnimator);
            }
            if (!stateListAnimator.isConnected() && !stateListAnimator.KWHzl(AbstractJsonLexerKt.END_OBJ)) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (!this.EZpvd && strAEQbTJ.equals(Web3SecurityTrackEvent.VALUE_IMPORT)) {
            String strAhwBna = stateListAnimator.AhwBna();
            if (strAhwBna == null) {
                strAhwBna = stateListAnimator.copydefault();
            }
            if (strAhwBna == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            stateListAnimator.zsXlph();
            List<MediaType> listAEQbTJ2 = AEQbTJ(stateListAnimator);
            if (!stateListAnimator.isConnected() && !stateListAnimator.KWHzl(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
            if (SVG.copydefault() != null && KWHzl(listAEQbTJ2, this.OLrzqt)) {
                String strCopydefault = SVG.copydefault().copydefault(strAhwBna);
                if (strCopydefault == null) {
                    return;
                } else {
                    pictureInPictureParams.EZpvd(copydefault(strCopydefault));
                }
            }
        } else {
            OLrzqt("Ignoring @%s rule", strAEQbTJ);
            copydefault(stateListAnimator);
        }
        stateListAnimator.zsXlph();
    }

    public final void copydefault(StateListAnimator stateListAnimator) {
        int i = 0;
        while (!stateListAnimator.isConnected()) {
            int iIntValue = stateListAnimator.ejfBZ().intValue();
            if (iIntValue == 59 && i == 0) {
                return;
            }
            if (iIntValue == 123) {
                i++;
            } else if (iIntValue == 125 && i > 0 && i - 1 == 0) {
                return;
            }
        }
    }

    public final PictureInPictureParams OLrzqt(StateListAnimator stateListAnimator) {
        PictureInPictureParams pictureInPictureParams = new PictureInPictureParams();
        while (!stateListAnimator.isConnected()) {
            try {
                if (!stateListAnimator.copydefault("<!--") && !stateListAnimator.copydefault("-->")) {
                    if (stateListAnimator.KWHzl('@')) {
                        EZpvd(pictureInPictureParams, stateListAnimator);
                    } else if (!copydefault(pictureInPictureParams, stateListAnimator)) {
                        break;
                    }
                }
            } catch (CSSParseException e) {
                e.getMessage();
            }
        }
        return pictureInPictureParams;
    }

    public final boolean copydefault(PictureInPictureParams pictureInPictureParams, StateListAnimator stateListAnimator) throws CSSParseException {
        List listGEmmrt = stateListAnimator.gEmmrt();
        if (listGEmmrt == null || listGEmmrt.isEmpty()) {
            return false;
        }
        if (!stateListAnimator.KWHzl(AbstractJsonLexerKt.BEGIN_OBJ)) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        stateListAnimator.zsXlph();
        SVG.Style styleEZpvd = EZpvd(stateListAnimator);
        stateListAnimator.zsXlph();
        Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            pictureInPictureParams.OLrzqt(new VoiceInteractor((AssistContent) it.next(), styleEZpvd, this.KWHzl));
        }
        return true;
    }

    public final SVG.Style EZpvd(StateListAnimator stateListAnimator) throws CSSParseException {
        SVG.Style style = new SVG.Style();
        do {
            String strAEQbTJ = stateListAnimator.AEQbTJ();
            stateListAnimator.zsXlph();
            if (!stateListAnimator.KWHzl(AbstractJsonLexerKt.COLON)) {
                throw new CSSParseException("Expected ':'");
            }
            stateListAnimator.zsXlph();
            String strAYXKKw = stateListAnimator.AYXKKw();
            if (strAYXKKw == null) {
                throw new CSSParseException("Expected property value");
            }
            stateListAnimator.zsXlph();
            if (stateListAnimator.KWHzl('!')) {
                stateListAnimator.zsXlph();
                if (!stateListAnimator.copydefault("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                stateListAnimator.zsXlph();
            }
            stateListAnimator.KWHzl(';');
            SVGParser.EZpvd(style, strAEQbTJ, strAYXKKw);
            stateListAnimator.zsXlph();
            if (stateListAnimator.isConnected()) {
                break;
            }
        } while (!stateListAnimator.KWHzl(AbstractJsonLexerKt.END_OBJ));
        return style;
    }

    public static List<String> OLrzqt(String str) {
        StateListAnimator stateListAnimator = new StateListAnimator(str);
        ArrayList arrayList = null;
        while (!stateListAnimator.isConnected()) {
            String strUzCIH = stateListAnimator.uzCIH();
            if (strUzCIH != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strUzCIH);
                stateListAnimator.zsXlph();
            }
        }
        return arrayList;
    }

    public static class SharedElementCallback {
        public SVG.AssetManager EZpvd;

        public String toString() {
            SVG.AssetManager assetManager = this.EZpvd;
            return assetManager != null ? String.format("<%s id=\"%s\">", assetManager.EZpvd(), this.EZpvd.fJNWhG) : "";
        }
    }

    public static boolean copydefault(SharedElementCallback sharedElementCallback, AssistContent assistContent, SVG.AssetManager assetManager) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = assetManager.iwGUEr; obj != null; obj = ((SVG.Resources) obj).iwGUEr) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        if (assistContent.EZpvd() == 1) {
            return OLrzqt(sharedElementCallback, assistContent.KWHzl(0), arrayList, size, assetManager);
        }
        return copydefault(sharedElementCallback, assistContent, assistContent.EZpvd() - 1, arrayList, size, assetManager);
    }

    public static boolean copydefault(SharedElementCallback sharedElementCallback, AssistContent assistContent, int i, List<SVG.PackageManager> list, int i2, SVG.AssetManager assetManager) {
        TaskStackBuilder taskStackBuilderKWHzl = assistContent.KWHzl(i);
        if (!OLrzqt(sharedElementCallback, taskStackBuilderKWHzl, list, i2, assetManager)) {
            return false;
        }
        Combinator combinator = taskStackBuilderKWHzl.AEQbTJ;
        if (combinator == Combinator.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 >= 0) {
                if (EZpvd(sharedElementCallback, assistContent, i - 1, list, i2)) {
                    return true;
                }
                i2--;
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return EZpvd(sharedElementCallback, assistContent, i - 1, list, i2);
        }
        int iAEQbTJ = AEQbTJ(list, i2, assetManager);
        if (iAEQbTJ <= 0) {
            return false;
        }
        return copydefault(sharedElementCallback, assistContent, i - 1, list, i2, (SVG.AssetManager) assetManager.iwGUEr.AEQbTJ().get(iAEQbTJ - 1));
    }

    public static boolean EZpvd(SharedElementCallback sharedElementCallback, AssistContent assistContent, int i, List<SVG.PackageManager> list, int i2) {
        TaskStackBuilder taskStackBuilderKWHzl = assistContent.KWHzl(i);
        SVG.AssetManager assetManager = (SVG.AssetManager) list.get(i2);
        if (!OLrzqt(sharedElementCallback, taskStackBuilderKWHzl, list, i2, assetManager)) {
            return false;
        }
        Combinator combinator = taskStackBuilderKWHzl.AEQbTJ;
        if (combinator == Combinator.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 > 0) {
                i2--;
                if (EZpvd(sharedElementCallback, assistContent, i - 1, list, i2)) {
                    return true;
                }
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return EZpvd(sharedElementCallback, assistContent, i - 1, list, i2 - 1);
        }
        int iAEQbTJ = AEQbTJ(list, i2, assetManager);
        if (iAEQbTJ <= 0) {
            return false;
        }
        return copydefault(sharedElementCallback, assistContent, i - 1, list, i2, (SVG.AssetManager) assetManager.iwGUEr.AEQbTJ().get(iAEQbTJ - 1));
    }

    public static int AEQbTJ(List<SVG.PackageManager> list, int i, SVG.AssetManager assetManager) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        SVG.PackageManager packageManager = list.get(i);
        SVG.PackageManager packageManager2 = assetManager.iwGUEr;
        if (packageManager != packageManager2) {
            return -1;
        }
        Iterator<SVG.Resources> it = packageManager2.AEQbTJ().iterator();
        while (it.hasNext()) {
            if (it.next() == assetManager) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static boolean OLrzqt(SharedElementCallback sharedElementCallback, TaskStackBuilder taskStackBuilder, List<SVG.PackageManager> list, int i, SVG.AssetManager assetManager) {
        List<String> list2;
        String str = taskStackBuilder.EZpvd;
        if (str != null && !str.equals(assetManager.EZpvd().toLowerCase(Locale.US))) {
            return false;
        }
        List<Application> list3 = taskStackBuilder.copydefault;
        if (list3 != null) {
            for (Application application : list3) {
                String str2 = application.KWHzl;
                str2.hashCode();
                if (str2.equals("id")) {
                    if (!application.copydefault.equals(assetManager.fJNWhG)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = assetManager.fIwbmz) == null || !list2.contains(application.copydefault)) {
                    return false;
                }
            }
        }
        List<TaskDescription> list4 = taskStackBuilder.KWHzl;
        if (list4 == null) {
            return true;
        }
        Iterator<TaskDescription> it = list4.iterator();
        while (it.hasNext()) {
            if (!it.next().OLrzqt(sharedElementCallback, assetManager)) {
                return false;
            }
        }
        return true;
    }

    public static class Activity implements TaskDescription {
        public boolean AEQbTJ;
        public String EZpvd;
        public int KWHzl;
        public boolean OLrzqt;
        public int copydefault;

        public Activity(int i, int i2, boolean z, boolean z2, String str) {
            this.copydefault = i;
            this.KWHzl = i2;
            this.AEQbTJ = z;
            this.OLrzqt = z2;
            this.EZpvd = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.TaskDescription
        public boolean OLrzqt(SharedElementCallback sharedElementCallback, SVG.AssetManager assetManager) {
            int i;
            int i2;
            String strEZpvd = (this.OLrzqt && this.EZpvd == null) ? assetManager.EZpvd() : this.EZpvd;
            SVG.PackageManager packageManager = assetManager.iwGUEr;
            if (packageManager != null) {
                Iterator<SVG.Resources> it = packageManager.AEQbTJ().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    SVG.AssetManager assetManager2 = (SVG.AssetManager) it.next();
                    if (assetManager2 == assetManager) {
                        i = i2;
                    }
                    if (strEZpvd == null || assetManager2.EZpvd().equals(strEZpvd)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.AEQbTJ ? i + 1 : i2 - i;
            int i4 = this.copydefault;
            if (i4 == 0) {
                return i3 == this.KWHzl;
            }
            int i5 = i3 - this.KWHzl;
            if (i5 % i4 == 0) {
                return Integer.signum(i5) == 0 || Integer.signum(i3 - this.KWHzl) == Integer.signum(this.copydefault);
            }
            return false;
        }

        public String toString() {
            String str = this.AEQbTJ ? "" : "last-";
            if (!this.OLrzqt) {
                return String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.copydefault), Integer.valueOf(this.KWHzl));
            }
            return String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.copydefault), Integer.valueOf(this.KWHzl), this.EZpvd);
        }
    }

    public static class PendingIntent implements TaskDescription {
        public String AEQbTJ;
        public boolean KWHzl;

        public PendingIntent(boolean z, String str) {
            this.KWHzl = z;
            this.AEQbTJ = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.TaskDescription
        public boolean OLrzqt(SharedElementCallback sharedElementCallback, SVG.AssetManager assetManager) {
            String strEZpvd = (this.KWHzl && this.AEQbTJ == null) ? assetManager.EZpvd() : this.AEQbTJ;
            SVG.PackageManager packageManager = assetManager.iwGUEr;
            if (packageManager == null) {
                return true;
            }
            Iterator<SVG.Resources> it = packageManager.AEQbTJ().iterator();
            int i = 0;
            while (it.hasNext()) {
                SVG.AssetManager assetManager2 = (SVG.AssetManager) it.next();
                if (strEZpvd == null || assetManager2.EZpvd().equals(strEZpvd)) {
                    i++;
                }
            }
            return i == 1;
        }

        public String toString() {
            if (this.KWHzl) {
                return String.format("only-of-type <%s>", this.AEQbTJ);
            }
            return String.format("only-child", new Object[0]);
        }
    }

    public static class Dialog implements TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "root";
        }

        private Dialog() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1619) call: com.caverock.androidsvg.CSSParser.Dialog.<init>():void type: THIS */
        public /* synthetic */ Dialog(AnonymousClass4 anonymousClass4) {
            this();
        }

        @Override // com.caverock.androidsvg.CSSParser.TaskDescription
        public boolean OLrzqt(SharedElementCallback sharedElementCallback, SVG.AssetManager assetManager) {
            return assetManager.iwGUEr == null;
        }
    }

    public static class ActionBar implements TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "empty";
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1636) call: com.caverock.androidsvg.CSSParser.ActionBar.<init>():void type: THIS */
        public /* synthetic */ ActionBar(AnonymousClass4 anonymousClass4) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.caverock.androidsvg.SVG$AssetManager */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.TaskDescription
        public boolean OLrzqt(SharedElementCallback sharedElementCallback, SVG.AssetManager assetManager) {
            return !(assetManager instanceof SVG.PackageManager) || ((SVG.PackageManager) assetManager).AEQbTJ().size() == 0;
        }
    }

    public static class LoaderManager implements TaskDescription {
        public List<AssistContent> EZpvd;

        public LoaderManager(List<AssistContent> list) {
            this.EZpvd = list;
        }

        @Override // com.caverock.androidsvg.CSSParser.TaskDescription
        public boolean OLrzqt(SharedElementCallback sharedElementCallback, SVG.AssetManager assetManager) {
            Iterator<AssistContent> it = this.EZpvd.iterator();
            while (it.hasNext()) {
                if (CSSParser.copydefault(sharedElementCallback, it.next(), assetManager)) {
                    return false;
                }
            }
            return true;
        }

        public int AEQbTJ() {
            Iterator<AssistContent> it = this.EZpvd.iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i2 = it.next().copydefault;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }

        public String toString() {
            return "not(" + this.EZpvd + ")";
        }
    }

    public static class FragmentManager implements TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return TypedValues.AttributesType.S_TARGET;
        }

        private FragmentManager() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1702) call: com.caverock.androidsvg.CSSParser.FragmentManager.<init>():void type: THIS */
        public /* synthetic */ FragmentManager(AnonymousClass4 anonymousClass4) {
            this();
        }

        @Override // com.caverock.androidsvg.CSSParser.TaskDescription
        public boolean OLrzqt(SharedElementCallback sharedElementCallback, SVG.AssetManager assetManager) {
            return sharedElementCallback != null && assetManager == sharedElementCallback.EZpvd;
        }
    }

    public static class Fragment implements TaskDescription {
        public String OLrzqt;

        @Override // com.caverock.androidsvg.CSSParser.TaskDescription
        public boolean OLrzqt(SharedElementCallback sharedElementCallback, SVG.AssetManager assetManager) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return this.OLrzqt;
        }

        public Fragment(String str) {
            this.OLrzqt = str;
        }
    }
}
