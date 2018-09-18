package reflex.behavior;

import java.lang.annotation.Annotation;

public class AnnotationBehaviorDescriptor {
    private Annotation annotation;
    private AnnotationBehaviorProcessor behaviorProcessor;

    public AnnotationBehaviorDescriptor(Annotation annotation,
                                        AnnotationBehaviorProcessor behaviorProcessor) {
        this.annotation = annotation;
        this.behaviorProcessor = behaviorProcessor;
    }

    public Annotation getAnnotation() {
        return annotation;
    }

    public AnnotationBehaviorProcessor getBehaviorProcessor() {
        return behaviorProcessor;
    }
}