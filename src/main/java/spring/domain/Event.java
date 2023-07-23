package spring.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
Создание таблицы
CREATE TABLE event (
   id SERIAL PRIMARY KEY,
   name TEXT NOT NULL,
   city TEXT NOT NULL
);
Посмотреть таблицу
SELECT * FROM event
*/

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer eventId;
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, targetEntity = City.class)
  @JoinColumn(name = "cityId", nullable = false)
  private City city;

}
