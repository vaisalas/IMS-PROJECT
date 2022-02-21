Coverage: 62%
# Inventory Management System 

This program is an Inventory Management System which can be used to manage Customers, Store items and Orders. This is achieved CRUD functionality.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

To run this program make sure you have these programs installed.

```
Java
Maven
MySQL Workbench
Eclipse
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
1.Clone this project through Git down to your Eclipse Workspace
```

2.Update your own MySQL login detail under DB Properties - where you have Run some data in the schema

```
3.Run the program and follow the instruction on the console
```


## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

This test tests smaller sections of the codes to recognise potential issues. this test can be run as 
JUunit test (Ctrl + Shift + X,T)

```
	@Test
	public void testCreate() {
		final String F_NAME = "barry", L_NAME = "scott";
		final Customer created = new Customer(F_NAME, L_NAME);

		Mockito.when(utils.getString()).thenReturn(F_NAME, L_NAME);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}
```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Vaisala Sivanesakumar** - *Updated Project*
## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

QA LTD Trainers
