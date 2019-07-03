package dmodel.pipeline.rt.pipeline.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import dmodel.pipeline.rt.pipeline.AbstractIterativePipelinePart;

@Retention(RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface OutputPort {

	public Class<? extends AbstractIterativePipelinePart<?>> to();

	public String id();

	boolean async();

}
